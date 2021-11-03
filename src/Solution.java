import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;




/*  Amb les noves tarifes de transport metropolità han quedat les següents Targetes: - T-usual: viatges il·limitats, 30 dies, personal i intransferible, 40 euros. - T-jove: menors de 25 anys, viatges il·limitats, 90 dies, personal i intransferible, 80 euros. - T-16: de 4 a 16 anys, viatges il·limitats, personal i intransferible, gratuïta. - Targeta Rosa: persones majors de 60 anys o persones amb discapacitat, gratuïta o amb tarifa reduïda.

Principals bitllets d'ús esporàdic - T-casual: 10 viatges, unipersonal, 11,35 euros. - Bitllet senzill: 2,40 euros.

Fes un programa on introdueixis la teva edat i el nombre de viatges que fas al mes i calcula quina és la tarifa que millor et va i escriu-ne el nom.

Input Format

Introdueix un enter amb l'edat i un altre enter amb el nombre de viatges mensuals

Constraints

No hi ha restriccions

Output Format

Has d'imprimir el nom de la tarifa de l'enunciat que millor et va a les teves condicions de transport.

Sample Input 0

25 1
Sample Output 0

Bitllet senzill
Sample Input 1

23 80
Sample Output 1

T-jove
Sample Input 2

67 50
Sample Output 2

Targeta Rosa

 */







public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();
        int ViaMen = sc.nextInt();

        if (edad <= 16){
            System.out.println("T-16");
        }
        if (edad >=60){
            System.out.println("Targeta Rosa");
        }
        if (edad <=25 && edad > 16 && ViaMen > 20){
            System.out.println("T-jove");
        }
        if (edad >25 && edad < 60 && ViaMen > 20){
            System.out.println("T-usual");
        }
        if (edad > 16 && edad <60 && ViaMen <= 20 && ViaMen >= 5){
            System.out.println("T-casual");
        }
        if (edad >= 16 && edad <= 60 && ViaMen <=5){
            System.out.println("Bitllet senzill");

        }
    }
}
