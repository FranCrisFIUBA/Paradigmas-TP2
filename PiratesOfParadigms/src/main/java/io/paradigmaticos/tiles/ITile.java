package io.paradigmaticos.tiles;

public interface ITile {
    ITileContent getContent();
    void setContent(ITileContent content);
    boolean isNavigable();
    void onShipEnter();
    void onShipExit();
}
