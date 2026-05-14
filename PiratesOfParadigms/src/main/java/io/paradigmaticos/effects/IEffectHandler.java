package io.paradigmaticos.effects;

import java.util.List;

public interface IEffectHandler<Effect extends IEffect<Target>, Target> {
    Target getTarget();
    List<Effect> getEffects();
    void clearEffects();
    boolean applyEffect(Effect effect);
    boolean removeEffect(Effect effect);
    void turnStart();
    void turnEnd();
}
