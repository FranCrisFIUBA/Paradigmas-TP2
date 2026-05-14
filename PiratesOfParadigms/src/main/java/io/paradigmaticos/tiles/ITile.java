package io.paradigmaticos.tiles;

import io.paradigmaticos.ship.Ship;

public interface ITile {
    ITileContent getContent();
    void setContent(ITileContent content);
    boolean isNavigable();
    void onShipEnter(Ship ship);
    void onShipExit(Ship ship);
}
