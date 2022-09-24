import java.util.Scanner;

public abstract class Electrodomestico {
  protected int codigoProducto;
  protected int precioBase;
  protected String color;
  protected char consumo;
  protected int peso;
  
  public Electrodomestico(int codigoProducto, int precioBase, String color, char consumo, int peso) {
    this.codigoProducto = codigoProducto;
    this.precioBase = precioBase;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }

  public abstract double preciofinal();
  
  public char comprobarConsumo(char consumo){
    Scanner Leer = new Scanner(System.in);
    System.out.println("Ingresa la letra que representa el consumo");
    char letra = Leer.next().charAt(0);
    Leer.close();

    if(consumo != letra){
      return 'A';
    }
    else{
      return letra;
    }
  }

  public int getCodigoProducto() {
    return codigoProducto;
  }

  public void setCodigoProducto(int codigoProducto) {
    this.codigoProducto = codigoProducto;
  }

  public int getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(int precioBase) {
    this.precioBase = precioBase;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public char getConsumo() {
    return consumo;
  }

  public void setConsumo(char consumo) {
    this.consumo = consumo;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Electrodomestico [codigoProducto=" + codigoProducto + ", color=" + color + ", consumo=" + consumo
        + ", peso=" + peso + ", precioBase=" + precioBase + "]";
  }

  

  
}
