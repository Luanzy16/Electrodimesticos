public class Lavadora extends Electrodomestico {
  public int carga;

  public Lavadora(int codigoProducto, int precioBase, String color, char consumo, int peso, int carga) {
    super(codigoProducto, precioBase, color, consumo, peso);
    this.carga = carga;
  }

  @Override
  public double preciofinal() {
    if(peso > 30){
      return precioBase + 50000;
    }
    else return precioBase;
    
  }

  public int getCarga() {
    return carga;
  }

  public void setCarga(int carga) {
    this.carga = carga;
  }

  @Override
  public String toString() {
    return super.toString()+"Lavadora [carga=" + carga + "]";
  }

  

  
  
}
