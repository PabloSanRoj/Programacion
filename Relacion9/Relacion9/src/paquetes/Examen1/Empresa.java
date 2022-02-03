package paquetes.Examen1;

public class Empresa implements Cliente{
  
  private String CIF;
  private String nombre;
  private String telef;

  public Empresa (String c, String n, String t){
    this.CIF = c;
    this.nombre = n;
    this.telef = t;
  }

  public void compra(Vendedor n, Articulo a){
    
  }
}
