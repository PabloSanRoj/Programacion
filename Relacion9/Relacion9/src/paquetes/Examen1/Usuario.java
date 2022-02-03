package paquetes.Examen1;

public class Usuario extends Personas {
  private String numeroTel;

  public Usuario (String n, String c, String num){
    super(n, c);
    this.numeroTel = num;
  }
}
