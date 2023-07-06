package Desafio3;

import java.util.ArrayList;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {

        String word1 = "azul";

        String word2 = "jornal";

        String concatenada = "";

        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                concatenada += word1.charAt(i);
            }
            if (i < word2.length()) {
                concatenada += word2.charAt(i);
            }

        }

        System.out.println(concatenada);


    }
}
