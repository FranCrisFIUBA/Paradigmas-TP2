package io.paradigmaticos.effects.ship;

import io.paradigmaticos.effects.EffectsHandler;
import io.paradigmaticos.ship.Ship;
import io.paradigmaticos.tiles.ITile;

public class ShipEffectsHandler extends EffectsHandler<IShipEffect, Ship> {
    public ShipEffectsHandler(Ship target) {
        super(target);
    }

    void onMove(Ship ship, ITile current, ITile next) {
        getEffects().forEach(effect -> effect.onMove(ship, current, next));
    }
}
