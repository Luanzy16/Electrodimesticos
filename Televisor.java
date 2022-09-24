public class Televisor extends Electrodomestico{
  private int resolucion;
  private boolean sintomizador;
  
  public Televisor(int codigoProducto, int precioBase, String color, char consumo, int peso, int resolucion,
      boolean sintomizador) {
    super(codigoProducto, precioBase, color, consumo, peso);
    this.resolucion = resolucion;
    this.sintomizador = sintomizador;
  }

  @Override
  public double preciofinal() {
    if(resolucion > 40){
      return  (precioBase + (precioBase*0.4));
    }
    if(sintomizador == true){
      return precioBase + 50000;
    }
    if(resolucion > 40 || sintomizador == true){
      return (precioBase + (precioBase*0.4))+50000;
    }
    else return precioBase;

    
    
  }

  public int getResolucion() {
    return resolucion;
  }

  public void setResolucion(int resolucion) {
    this.resolucion = resolucion;
  }

  public boolean isSintomizador() {
    return sintomizador;
  }

  public void setSintomizador(boolean sintomizador) {
    this.sintomizador = sintomizador;
  }

  @Override
  public String toString() {
    return super.toString()+"Televisor [resolucion=" + resolucion + ", sintomizador=" + sintomizador + "]";
  }
  
}
