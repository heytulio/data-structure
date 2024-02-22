package application;

import structure.List;

public class Program {

	public static void main(String[] args) {
		
		List list = new List();
		
		System.out.println(list.isEmpty());
		System.out.println(list.length());
		list.insert(0);
		System.out.println(list.length());
		list.print();
		
		for (int i = 0; i<6; i++) {
			list.insert(i);
		}
		list.print();
		
		System.out.println(list.find(0));
		System.out.println(list.length());
		System.out.println(list.remove(3));
		System.out.println(list.length());
		
		//list.print();
		//System.out.println(list.remove(18));
		list.append(55);
		list.print();
		System.out.println("Chegou aqui");
		list.insertInto(24, 4);
		list.print();
		System.out.println(list.count(0));
		
	}

}
