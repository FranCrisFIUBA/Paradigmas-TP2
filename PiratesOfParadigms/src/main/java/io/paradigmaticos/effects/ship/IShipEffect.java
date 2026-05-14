package io.paradigmaticos.effects.ship;

import io.paradigmaticos.effects.IEffect;
import io.paradigmaticos.ship.Ship;
import io.paradigmaticos.tiles.ITile;

public interface IShipEffect extends IEffect<Ship> {
    void onMove(Ship ship, ITile tile);
}
