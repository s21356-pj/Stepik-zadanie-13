import java.util.ArrayList;
import java.util.Collections;

class Test {
    public static void main(String[] args) {
        Circle k1 = new Circle(2, "red");
        Circle k2= new Circle (5,"blue");
        Circle k3= new Circle (7,"orange");
        Circle k4= new Circle (1,"green");

        ArrayList<Circle> lista = new ArrayList<>();
        lista.add(k1);
        lista.add(k2);
        lista.add(k3);
        lista.add(k4);

        Collections.sort(lista);
        for (Circle a:lista) {
            System.out.println(a.getColor() + ": Pole powierzchni: " + a.getArea());
        }
    }
}