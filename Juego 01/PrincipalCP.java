public class PrincipalCP {
    public static void main(String[] args) {
        Personaje[] personajes = new Personaje[4];
        Hada h1 = new Hada("Hadita1", 10, 10);
        Hada h2 = new Hada("Hadita2", 20, 20);
        Elfo e1 = new Elfo("Elfo1", 10, 10);
        Elfo e2 = new Elfo("Elfo2", 20, 20);
        personajes[0] = h1;
        personajes[1] = h2;
        personajes[2] = e1;
        personajes[3] = e2;

        Personaje.mostrarPersonajes(personajes);
    }

}
