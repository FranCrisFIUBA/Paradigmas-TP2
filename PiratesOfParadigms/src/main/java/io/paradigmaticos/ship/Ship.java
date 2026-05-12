package io.paradigmaticos.ship;

import io.paradigmaticos.tiles.ITileContent;

public class Ship implements ITileContent {
    private String shipName;
    private final String kind;

    private final ShipAttribute healthAttribute;
    private final ShipAttribute attackAttribute;
    private final ShipAttribute defenseAttribute;
    private final ShipAttribute movesAttribute;
    private final ShipAttribute rangeAttribute;

    public Ship(
            String shipName,
            String kind,
            ShipAttribute health,
            ShipAttribute attack,
            ShipAttribute defense,
            ShipAttribute moves,
            ShipAttribute range) {

        setShipName(shipName);
        this.kind = kind; // TODO: Validar kind

        /* No es necesario implementar getters y setters o validar valores mínimos y máximos, ya que esa tarea queda a cargo de ShipAttribute */

        this.healthAttribute = health;
        this.attackAttribute = attack;
        this.defenseAttribute = defense;
        this.movesAttribute = moves;
        this.rangeAttribute = range;
    }

    @Override
    public String getName() {
        return kind + " \"" + shipName + "\"";
    }

    @Override
    public boolean blocksNavigation() {
        return true;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName; //TODO: Validar shipName
    }

    public String getKind() {
        return kind;
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
