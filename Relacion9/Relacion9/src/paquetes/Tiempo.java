package paquetes;

public class Tiempo {
  
  int horas;
  int minutos;
  int segundos;

  public Tiempo (int h, int m, int s){
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  public static int hora = 0;
  public static int minuto = 0;
  public static int segundo = 0;

  public void suma (){
    
    segundo += segundos;
    if (segundo > 59){
      segundo -= 60;
      minuto++;
    }
    minuto += minutos;
    if (minuto > 59){
      minuto -= 60;
      hora++;
    }
    hora += horas;
    
  }

  public void resta (){
    
    segundo -= segundos;
    if (segundo < 0){
      segundo += 60;
      minuto--;
    }
    minuto -= minutos;
    if (minuto < 0){
      minuto += 60;
      hora--;
    }
    hora -= horas;
    
  }

  public String toString(){
    String resultado = "";
    if (hora > 0){
    resultado += hora + "h " + minuto + "m " + segundo + "s\n"; 
    } else if (minuto > 0){
      resultado += minuto + "m " + segundo + "s\n";
    } else {
      resultado += segundo + "s\n";
    }
    return resultado;
  }

}
