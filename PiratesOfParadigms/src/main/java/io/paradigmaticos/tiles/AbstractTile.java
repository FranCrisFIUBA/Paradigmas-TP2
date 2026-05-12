package io.paradigmaticos.tiles;

abstract class AbstractTile implements ITile {
    private ITileContent content = null;

    @Override
    public ITileContent getContent() {
        return this.content;
    }

    @Override
    public void setContent(ITileContent content) {
        this.content = content;
    }

    @Override
    public boolean isNavigable() {
        return !content.blocksNavigation();
    }
}
