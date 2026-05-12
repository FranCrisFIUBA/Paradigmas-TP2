package io.paradigmaticos.ship;

import io.paradigmaticos.tiles.ITileContent;

public class Ship implements ITileContent {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean blocksNavigation() {
        return true;
    }
}
