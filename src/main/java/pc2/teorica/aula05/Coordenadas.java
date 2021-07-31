package pc2.teorica.aula05;

public class Coordenadas {
    int x;
    int y;
    int z;

    public static void main(String[] args) {
        Coordenadas coord1 = new Coordenadas();
        coord1.x = 5;

        System.out.println(coord1.x);

        Coordenadas coord2 = new Coordenadas();
        Coordenadas coord3 = coord2;
        coord2.x = 10;

        coord2 = coord1;
        coord2.x = 10;
    }
}
