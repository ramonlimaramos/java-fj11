package br.com.caelum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.caelum.modelo.Conta;

public class TestaColecoesInterfaceList {
	public static void main(String[] args) {
		
		/*A importancia de usar a interface List é a usabilidade
		* de manutenção quando necessário alterar o tipo de lista
		*/
		
		List<String> listaDeNomes = new ArrayList<String>();
		listaDeNomes.add("Ramon");
		listaDeNomes.add("Ramon");
		
		System.out.println("ArrayList aceita duplicados");
		System.out.println(listaDeNomes.get(0));
		System.out.println(listaDeNomes.get(1));
		
		/*
		 * As duas Listas ArrayList assim como LinkedList permitem duplicação de valores
		 * */
		
		List<String> listaDeNomes2 = new LinkedList<String>();
		listaDeNomes2.add("Ramos");
		listaDeNomes2.add("Ramos");
		
		System.out.println("\nLinkedList aceita duplicados");
		System.out.println(listaDeNomes2.get(0));
		System.out.println(listaDeNomes2.get(1));
		
		/*
		 * Listas que implementam a interface Set não aceitam dados duplicados
		 * a Interface Set implementa a interface Collection
		 * */
		
		Set<String> listaNaoDuplicada = new HashSet<String>();
		listaNaoDuplicada.add("Ramon");
		listaNaoDuplicada.add("Ramon");
		listaNaoDuplicada.add("Alinne");
		
		System.out.println("\nHashSet Lista não duplicada");
		for (String string : listaNaoDuplicada) {
			System.out.println(string);
		}
		
		Collection<Conta> listaContaNaoDuplicado = new HashSet<Conta>();
		Conta c1 = new Conta(200.00);
		Conta c2 = new Conta(500.00);
		Conta c3 = new Conta(800.00);
		
		c1.setNumero(123);
		c2.setNumero(456);
		c3.setNumero(258);
		
		listaContaNaoDuplicado.add(c1);
		listaContaNaoDuplicado.add(c1);
		listaContaNaoDuplicado.add(c2);
		
		System.out.println("\nLista não duplicada implementando método hasCode()");
		System.out.println(listaContaNaoDuplicado.size());
		
		/*
		 * Map interface que implementa a interface Serializable
		 * As listas que implementam estas interfaces utilizam chave nos dados
		 * */
		
		Map<String, Conta> listaComChave = new HashMap<String, Conta>();
		listaComChave.put("diretor", c1);
		listaComChave.put("gerente", c2);
		
		System.out.println(listaComChave.get("diretor").getNumero());
		System.out.println(listaComChave.size());
		
	}
}
