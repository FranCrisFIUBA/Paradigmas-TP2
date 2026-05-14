package io.paradigmaticos.fleet;

import io.paradigmaticos.ship.Ship;
import io.paradigmaticos.user.User;

import java.util.List;

public class Fleet {
    private final String name;
    private final User commander;
    private List<Ship> ships;

    public Fleet(String name, User commander) {
        this.name = name; // TODO: Validar el nombre de la flota
        this.commander = commander; // TODO: Validar el comandante de la flota
    }

    public String getName() {
        return name;
    }

    public User getCommander() {
        return commander;
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
}
