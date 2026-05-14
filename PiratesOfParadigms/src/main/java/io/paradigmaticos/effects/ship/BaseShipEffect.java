package io.paradigmaticos.effects.ship;

import io.paradigmaticos.effects.BaseEffect;
import io.paradigmaticos.ship.Ship;
import io.paradigmaticos.tiles.ITile;

/**
 * Efecto vacio a una nave.
 * Realiza las mismas validaciones que BaseEffect y una extra para onMove, no hace nada más
 */
public abstract class BaseShipEffect extends BaseEffect<Ship> implements IShipEffect {
    public BaseShipEffect(String name) {
        super(name);
    }

    @Override
    public void onMove(Ship ship, ITile tile) {
        if (ship == null)
            throw new NullPointerException("Ship cannot be null");

        if (tile == null)
            throw new NullPointerException("Tile cannot be null");
    }
}
