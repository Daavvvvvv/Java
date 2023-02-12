public class PrincipalPrueba {
    public static void main(String[] args) {
        Personaje[] personajes = new Personaje[3];
        personajes[0] = new Elfo("Bartolo", 10, 10);
        personajes[1] = new Elfo("Jorgito", 20, 20);
        personajes[2] = new Hada("Campanita", 20, 20);

        Personaje.mostrarPersonajes(personajes);

        personajes[0].atacar(personajes[2]);
        personajes[2].atacar(personajes[0]);

        Personaje.mostrarPersonajes(personajes);

    }
}
