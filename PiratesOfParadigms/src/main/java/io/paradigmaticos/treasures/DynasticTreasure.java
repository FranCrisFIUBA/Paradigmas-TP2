package io.paradigmaticos.treasures;

import io.paradigmaticos.fleet.Fleet;
import io.paradigmaticos.ship.Ship;

// TODO: Implementar DynasticTreasure
public class DynasticTreasure extends AbstractTreasure {
    private final Fleet fleet;

    public DynasticTreasure(Fleet fleet)
    {
        if (fleet == null)
            throw new NullPointerException("fleet is null");

        this.fleet = fleet;
    }

    @Override
    public void onCollect(Ship ship) {

    }

    @Override
    public String getName() {
        return "";
    }
}
