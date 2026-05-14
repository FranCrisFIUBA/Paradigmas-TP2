package io.paradigmaticos.effects;

import java.util.LinkedList;
import java.util.List;

public class BasicEffectHandler<Effect extends IEffect<Target>, Target> implements IEffectHandler<Effect, Target> {
    private final Target target;
    private final List<Effect> effects = new LinkedList<>();

    public BasicEffectHandler(Target target) {
        if (target == null) {
            throw new IllegalArgumentException("Target object cannot be null");
        }

        this.target = target;
    }

    @Override
    public Target getTarget() {
        return target;
    }

    @Override
    public List<Effect> getEffects() {
        return List.copyOf(effects);
    }

    @Override
    public void clearEffects() {
        effects.forEach(effect -> effect.onRemove(target));
        effects.clear();
    }

    @Override
    public boolean applyEffect(Effect effect) {
        if (effect == null) {
            throw new IllegalArgumentException("Effect object cannot be null");
        }

        if (effect.applied()) {
            return false;
        }

        effect.onApply(target);
        return effects.add(effect);
    }

    @Override
    public boolean removeEffect(Effect effect) {
        if (effect == null) {
            throw new IllegalArgumentException("Effect object cannot be null");
        }

        if (!effects.remove(effect)) {
            return false;
        }

        effect.onRemove(target);
        return true;
    }

    @Override
    public void turnStart() {
        effects.forEach(Effect -> Effect.onTurnStart(target));
        effects.removeIf(IEffect::expired);
    }

    @Override
    public void turnEnd() {
        effects.forEach(Effect -> Effect.onTurnEnd(target));
        effects.removeIf(IEffect::expired);
    }
}
