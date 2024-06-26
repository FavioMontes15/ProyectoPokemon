package logica;

public class Charmander extends Pokemon implements iFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy charmander este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy charmander este es mi ataque aranazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy charmander este es mi ataque mordisco");

    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Charmander usa Puño Fuego!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander usa Lanzallamas!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usa Ascuas!");
    }
}
