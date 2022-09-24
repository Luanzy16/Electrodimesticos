public class App {
  public static void main(String[] args) {
    // creacion de televisores
    Televisor Lg1 = new Televisor(7896, 100000, "azul",'b', 40, 70, true);
    Televisor Lg2 = new Televisor(1236, 150000, "rojo", 'e', 50, 25, false);

    System.out.println(Lg1.toString()+"\n PrecioFinal: "+Lg1.preciofinal());
    System.out.println(Lg2.toString()+"\n PrecioFinal: "+Lg2.preciofinal());

    // creacion lavadoras
    Lavadora lavadora1 = new Lavadora(7896, 700000, "negra", 'e', 50, 78);
    Lavadora lavadora2 = new Lavadora(1236, 410000, "blanca", 'f', 48, 40);

    System.out.println(lavadora1.toString()+"\n PrecioFinal: "+ lavadora1.preciofinal());
    System.out.println(lavadora2.toString()+"\n PrecioFinal: "+ lavadora2.preciofinal());

    if (lavadora1.preciofinal() > lavadora2.preciofinal()){
      System.out.println("La labadora 1 es mas cara");
    }
    else System.out.println("La lavadora 2 es más cara");

  } 
}
