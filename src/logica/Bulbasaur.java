package logica;

public class Bulbasaur extends Pokemon implements iPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy bulbasur este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy bulbasur este es mi ataque aranazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy bulbasur este es mi ataque mordisco");

    }

@Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usa Ataque Drenaje!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usa Ataque Paralizar!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur usa Ataque Hoja Afilada!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur usa Ataque Látigo Cepa!");
        
    }
    
}
