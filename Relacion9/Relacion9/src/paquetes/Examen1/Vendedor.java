package paquetes.Examen1;

public class Vendedor extends Personas{

  private String cargo;

  public Vendedor (String n, String c, String ca){
    super(n, c);
    this.cargo = ca;

  }
}
