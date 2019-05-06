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

    public static char sortearNumero(){
        
    }

    public static void main(String[] args) {


        List<String> palavras = new ArrayList();

        while(palavras.size() < 5){
            String letra = ("" + sortearVogal());
            if(!palavras.contains(letra)){
                System.out.println(letra);
                palavras.add(letra);
            }
        }
    }
}
