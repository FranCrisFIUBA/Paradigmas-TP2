package io.paradigmaticos.treasures;

import io.paradigmaticos.tiles.ITileContent;

// TODO: Implementar Resource
public class Resource implements ITileContent {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean blocksNavigation() {
        return false;
    }
}
