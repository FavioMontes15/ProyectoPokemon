package logica;

public class VideojuegoPokemon {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAranazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAranazo();
        charmander.atacarLanzallamas();
        bulbasur.atacarAranazo();
        bulbasur.atacarDrenaje();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();

    }
}
