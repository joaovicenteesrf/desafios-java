package Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) {

        List<Integer> listaDeInteiros = new ArrayList<>();

        for (Integer i = 1; i <= 10; i++) {
            listaDeInteiros.add(i);
        }

        System.out.println(listaDeInteiros.toString());

        Integer somaPares = listaDeInteiros
                .stream()
                .filter(b -> b % 2 == 0)
                .collect(Collectors.summingInt(value -> value));

        System.out.println("Soma dos pares: " + somaPares);

    }
}
