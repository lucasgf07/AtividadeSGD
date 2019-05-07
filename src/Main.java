import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static Random random = new Random();


    public static char sortearVogal(){

        String vogais = "aeiou";
        char[] vogal = vogais.toCharArray();

        return vogal[random.nextInt(5)];

    }

    public static char sortearConssoante(){
        String conssoantes = "bcdfghjklmnpqrstwxyz";
        char[] conssoante = conssoantes.toCharArray();

        return conssoante[random.nextInt(10)];
    }

    public static char sortearNumero(){
        String numeros = "01234567";
        char[] numero = numeros.toCharArray();

        return numero[random.nextInt(8)];
    }


    public static void main(String[] args) {


        List<String> palavras = new ArrayList();

        System.out.println("OUTPUT : ");
        while(palavras.size() < 100){
            String letra = ("" + sortearConssoante() + sortearVogal() + sortearConssoante() + sortearVogal() + sortearConssoante() + sortearVogal() + sortearNumero() + sortearNumero());
            if(!palavras.contains(letra)){
                System.out.println(letra);
                palavras.add(letra);
            }
        }
    }
}
