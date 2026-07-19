
public class NumberLinkedList {

	public static void main(String[] args) {

		LinkedList numbers = new LinkedList();
		LinkedList greeline = new LinkedList();

		numbers.insert(0, 37);
		numbers.insert(0, 7);
		numbers.insert(0, 4);
		numbers.insert(0, 16);
		System.out.println("All elements               = " + numbers.traversal());

		numbers.insert(2,20);
		System.out.println("Insert 20 to index 2       = " + numbers.traversal());

		numbers.insert(25);
		System.out.println("Append 25 into list        = " + numbers.traversal());

		numbers.remove(0);
		System.out.println("Deleted the first          = " + numbers.traversal());

		numbers.remove(2);
		System.out.println("Deleted element index 2    = " + numbers.traversal());

		numbers.removeLastElement();
		System.out.println("Deleted the last element   = " + numbers.traversal());

		//8 method length for size
		System.out.println("\nLength of elements in List = " + numbers.length());

		//9
		System.out.println("Element in index 1         = " + numbers.get(1));

		//10
		numbers.set(1,100);
		System.out.println("Updated index 1 to 100     = " + numbers.traversal());

		//11
		numbers.clear();
		System.out.println("Clear Linked List          = " + numbers.traversal());

		//12
		//12.1
		System.out.println();
		System.out.println();

		greeline.insert("Mo-chit");
		//12.2
		greeline.insert("Ari");
		//12.3
		greeline.insert("Sanam-Pao");
		//12.4
		System.out.println("All Station   : " + greeline.traversal());
		//12.5
		greeline.insert(2,"Rachakru");
		//12.6
		System.out.println("All Station   : " + greeline.traversal());
		//12.7
		System.out.println("Total Station : " + greeline.length());
		//12.8
		System.out.println("First Station : " + greeline.get(0));
		//12.9
		greeline.set(0,"Mo-chit (Central Ladprao)");
		//12.10
		System.out.println("All Station   : " + greeline.traversal());
		//12.11
		greeline.remove(2);
		//12.12
		System.out.println("All Station   : " + greeline.traversal());
		//12.13
		greeline.removeLastElement();
		//12.14
		System.out.println("All Station   : " + greeline.traversal());
		//12.15
		greeline.clear();
		//12.16
		System.out.println("Total Station : " + greeline.length());
		//12.17
		System.out.println("All Station   : " + greeline.traversal());

	}

}
