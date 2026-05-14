package io.paradigmaticos.user;

public class User {
    private final String name;

    public User(String name) {
        this.name = name; // TODO: Validar el nombre
    }

    public String getName() {
        return name;
    }
}
