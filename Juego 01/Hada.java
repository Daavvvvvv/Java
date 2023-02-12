public class Hada extends Personaje {
    public Hada(String n, int a, int s) {
        super(n, a, s);
    }

    @Override
    public void atacar(Personaje p1) {
        this.setSalud(this.getSalud() - p1.getAtaque() * 2);
    }

}
