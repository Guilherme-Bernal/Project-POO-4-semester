/* 
    Programação Orientada a Objetos
    Professor : Luciano Freire
 -------------------------- Trabalho AC1 ( Desafio Robo fazendeiro ) -  TIN 1 --------------------------
 #  Aluno 1 : Douglas Braz Machado  - RA : 210034;
 #  Aluno 2 : Guilherme Savassa Bernal - RA : 210029;
 #  Aluno 3 : Gustavo Luciano Rossi Teixeira - RA : 210333.
  
  
  
*/

import java.util.Scanner;

public class robo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt(); // G Rossi - O velho
        int pos = 1;
        int local = 0;

        for (int i = 0; i < y; ++i) {
            if (pos == z) {
                local++;
            }

            pos += in.nextInt(); // Douglas - O pegador de casada

            if (pos > x) {
                pos = 1;
            } else if (pos == 0) {
                pos = x;
            }
        }
        if (pos == z) {
            local++;
        }

        System.out.println(local);
        in.close(); // Guilherme - Pegador de Fuzil
    }
}
