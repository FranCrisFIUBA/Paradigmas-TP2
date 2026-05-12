package io.paradigmaticos.treasures;

import io.paradigmaticos.ship.Ship;
import io.paradigmaticos.tiles.ITileContent;

public interface ITreasure extends ITileContent {
    void onCollect(Ship ship);
}
