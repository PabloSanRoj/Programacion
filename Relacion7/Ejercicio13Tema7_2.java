/* Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).

Ejemplo:

                                                     MED MIN MAX
   España: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
    Rusia: 179 189 208 167 186 174 152 192 173 179 | 179 152 179
    Japón: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191*/

public class Ejercicio13Tema7_2 {
  public static void main(String[] args) {
    
    String [] pais = new String [4];
    int [][] num = new int [4][10];
    int [] max = new int [4];
    int [] min = {210, 210, 210, 210};
    int [] med = new int [4];

    pais[0] = "España";
    pais[1] = "Rusia";
    pais[2] = "Japón";
    pais[3] = "Australia";

    for (int i = 0; i < 4 ; i++){
      for (int j = 0; j < 10 ; j++){
        num[i][j] = (int)((Math.random()*71)+140);
      }
    }

    for (int i = 0; i < 4 ; i++){
      for (int j = 0; j < 10 ; j++){
        if (num[i][j] > max[i]){
          max[i] = num[i][j];
        }
      }
    }
    for (int i = 0; i < 4 ; i++){
      for (int j = 0; j < 10 ; j++){
        if (num[i][j] < min[i]){
          min[i] = num[i][j];
        }
      }
    }
    for (int i = 0; i < 4 ; i++){
      for (int j = 0; j < 10 ; j++){
        med[i] = med[i] + num[i][j];
      }
      med[i] /= 10;
    }

    for (int i = 0 ; i < 4 ; i++){
      System.out.print(pais[i] + ": ");
      for (int j = 0 ; j < 10 ; j++){
        System.out.print(num[i][j] + " ");
      }
      System.out.print("| " + med[i] + " " + max[i] + " " + min[i]);
      System.out.println();
    }
  }
}
