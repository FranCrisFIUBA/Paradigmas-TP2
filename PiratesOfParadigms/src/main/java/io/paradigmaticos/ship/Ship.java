package io.paradigmaticos.ship;

import io.paradigmaticos.tiles.ITileContent;

public class Ship implements ITileContent {
    private final ShipAttribute healthAttribute = new ShipAttribute();
    private final ShipAttribute attackAttribute = new ShipAttribute();
    private final ShipAttribute defenseAttribute = new ShipAttribute();
    private final ShipAttribute movesAttribute = new ShipAttribute();
    private final ShipAttribute rangeAttribute = new ShipAttribute();

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean blocksNavigation() {
        return true;
    }

    public ShipAttribute getHealthAttribute() {
        return healthAttribute;
    }

    public ShipAttribute getAttackAttribute() {
        return attackAttribute;
    }

    public ShipAttribute getDefenseAttribute() {
        return defenseAttribute;
    }

    public ShipAttribute getMovesAttribute() {
        return movesAttribute;
    }

    public ShipAttribute getRangeAttribute() {
        return rangeAttribute;
    }
}
