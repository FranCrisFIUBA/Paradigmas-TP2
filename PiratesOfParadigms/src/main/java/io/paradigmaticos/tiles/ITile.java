package io.paradigmaticos.tiles;

public interface ITile {
    ITileContent getContent();
    void setContent(ITileContent content);
    boolean isNavigable();
    boolean setNavigable(boolean navigable);
    void onShipEnter();
    void onShipExit();
}
