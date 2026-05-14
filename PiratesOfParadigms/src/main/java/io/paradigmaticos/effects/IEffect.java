package io.paradigmaticos.effects;

public interface IEffect<Target> {
    String getName();
    boolean applied();
    boolean expired();
    void onApply(Target target);
    void onRemove(Target target);
    void onTurnStart(Target target);
    void onTurnEnd(Target target);
}
