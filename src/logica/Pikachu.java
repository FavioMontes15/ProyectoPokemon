package logica;

public class Pikachu extends Pokemon implements iElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy pikachu este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy pikachu este es mi ataque aranazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy pikachu este es mi ataque mordisco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usa Impactrueno!");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Pikachu usa Puño Trueno!");
    }
}
