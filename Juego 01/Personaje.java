public class Personaje {
    private String nombre;
    private int ataque;
    private int salud;

    public Personaje() {
    }

    public Personaje(String n, int a, int s) {
        this.nombre = n;
        this.ataque = a;
        this.salud = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getSalud() {
        return salud;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque * 2;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String toString() {
        return "NOMBRE = " + this.nombre + "\n" + "SALUD = " + this.salud + "\n" + "VALOR ATAQUE = " + this.ataque
                + "\n";
    }

    public void atacar(Personaje p1) {
        this.setSalud(this.getSalud() - p1.getAtaque());
    }

    public static void mostrarPersonajes(Personaje[] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i].toString());
        }
    }

}
