package io.paradigmaticos.effects;

/**
 * Un efecto que no hace nada, solo valida si ya fue aplicado o expiró y agrega un setter para el nombre.
 * @param <Target>
 */
public class BaseEffect<Target> implements IEffect<Target> {
    private String name;
    private boolean applied = false;
    protected boolean expired = false;


    public BaseEffect(String name) {
        setName(name);
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean applied() {
        return applied;
    }

    @Override
    public boolean expired() {
        return expired;
    }

    @Override
    public void onApply(Target target) {
        if (target == null) {
            throw new NullPointerException("Target is null");
        }

        if (applied) {
            throw new IllegalStateException("Effect already applied");
        }

        this.applied = true;
    }

    @Override
    public void onRemove(Target target) {
        if (target == null) {
            throw new NullPointerException("Target is null");
        }

        if (!applied) {
            throw new IllegalStateException("Effect not applied");
        }

        this.expired = true;
    }

    @Override
    public void onTurnStart(Target target) {
        if (target == null) {
            throw new NullPointerException("Target is null");
        }

        if (!applied) {
            throw new IllegalStateException("Effect not applied");
        }

        if (expired) {
            throw new IllegalStateException("Effect expired");
        }
    }

    @Override
    public void onTurnEnd(Target target) {
        if (target == null) {
            throw new NullPointerException("Target is null");
        }

        if (!applied) {
            throw new IllegalStateException("Effect not applied");
        }

        if (expired) {
            throw new IllegalStateException("Effect expired");
        }
    }
}
