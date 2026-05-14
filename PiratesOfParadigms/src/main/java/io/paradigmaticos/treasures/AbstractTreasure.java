package io.paradigmaticos.treasures;

abstract class AbstractTreasure implements ITreasure {
    @Override
    public boolean blocksNavigation() {
        // ningún tesoro puede bloquear la navegación, de otro modo no podrían ser recolectados
        return false;
    }
}
