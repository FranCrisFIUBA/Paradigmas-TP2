package io.paradigmaticos.fleet;

import io.paradigmaticos.ship.Ship;

import java.util.List;

public class Fleet {
    // TODO: Agregar el propietario de la flota
    //private User owner;

    private final String name;
    private List<Ship> ships;

    public Fleet(String name/*, User owner*/) {
        this.name = name; // TODO: Validar el nombre de la flota
    }

    public String getName() {
        return name;
    }

    public List<Ship> getShips() {
        return List.copyOf(ships);
    }

    public boolean addShip(Ship ship) {
        return ships.add(ship);
    }

    public boolean removeShip(Ship ship) {
        return ships.remove(ship);
    }

    /*
    public User getOwner() {
        return owner;
    }
     */
}
