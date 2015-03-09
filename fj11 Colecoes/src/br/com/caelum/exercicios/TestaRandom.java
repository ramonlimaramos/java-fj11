package br.com.caelum.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaRandom {
	public static void main(String[] args) {
		
        List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
        Random random = new Random();

        ContaPoupanca c1 = new ContaPoupanca(random.nextInt(10000) + random.nextDouble());
        c1.setNumero(random.nextInt(10000));
        contas.add(c1);

        ContaPoupanca c2 = new ContaPoupanca(random.nextInt(10000) + random.nextDouble());
        c1.setNumero(random.nextInt(10000));
        contas.add(c2);

        ContaPoupanca c3 = new ContaPoupanca(random.nextInt(10000) + random.nextDouble());
        c1.setNumero(random.nextInt(10000));
        contas.add(c3);

        Collections.sort(contas);

        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
