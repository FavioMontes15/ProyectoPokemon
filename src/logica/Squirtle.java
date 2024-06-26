package logica;

public class Squirtle extends Pokemon implements iAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy squirtle este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy squirtle este es mi ataque aranazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy squirtle este es mi ataque mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usa Hidrobomba!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usa Burbuja!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usa Pistola Agua!");
    }
}
