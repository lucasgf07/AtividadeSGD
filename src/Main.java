import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    /**
     *Instâncias da classe “Random” são objetos geradores de números aleatórios,
     */

    public static Random random = new Random();

    /**
     *Classe geradora de consoantes em ordem aleatória
     */

    public static  char sortearConsoante(){
        String consoantes = "bcdfghjklmnpqrstvxyz";
        char[] consoante = consoantes.toCharArray();

        return consoante[random.nextInt(20)];
    }

    /**
     *Classe geradora de vogais em ordem aleatória
     */

    public static char sortearVogal(){

        String vogais = "aeiou";
        char[] vogal = vogais.toCharArray();

        return vogal[random.nextInt(5)];
    }

    /**
     *Classe geradora de numeros entre 0 e 7 em ordem aleatória
     */


    public static char sortearNumero(){
        String numeros = "01234567";
        char[] numero = numeros.toCharArray();

        return numero[random.nextInt(8)];
    }


    public static void main(String[] args) {


        List<String> palavras = new ArrayList();


        while(palavras.size() < 10000){
            String letra = ("" + sortearConsoante() + sortearVogal() + sortearConsoante() + sortearVogal() +
                    sortearConsoante() + sortearVogal() + sortearNumero() + sortearNumero());
            if(!palavras.contains(letra)){
                System.out.println(letra);
                palavras.add(letra);
            }
        }
    }
}
