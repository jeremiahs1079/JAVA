
public class TestDoublyLinkedList 
{
	public static void main(String args[])
	{
		//testing no argunment constructor
		DoublyLinkedListDummy dll1 = new DoublyLinkedListDummy();
		
		dll1.addEnd(20);
		System.out.println(dll1.toString());
		
		//testing add to end and toString
		System.out.println("Testing addEnd method to add 30");
		System.out.println("Values in list before addEnd Method");
		System.out.println(dll1.toString());
		dll1.addEnd(30);
		System.out.println("Values in list after addEnd Method");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Testing addEnd method to add 40");
		System.out.println("Values in list before addEnd Method");
		System.out.println(dll1.toString());
		dll1.addEnd(40);
		System.out.println("Values in list after addEnd Method");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Testing addEnd method to add 50");
		System.out.println("Values in list before addEnd Method");
		System.out.println(dll1.toString());
		dll1.addEnd(50);
		System.out.println("Values in list after addEnd Method");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Testing addEnd method to add 60");
		System.out.println("Values in list before addEnd Method");
		System.out.println(dll1.toString());
		dll1.addEnd(60);
		System.out.println("Values in list after addEnd Method");
		System.out.println(dll1.toString());
		System.out.println();
		
		//testing subList method
		DoublyLinkedListDummy dll2 = dll1.subList(2, 4);
		System.out.println("Testing sublist method by creating a new DoublyLinkedList dll2 that is a subList of dll1 index 2 to 4.");
		System.out.println("Values stored in dll1.");
		System.out.println(dll1.toString());
		System.out.println("Values in dll2.");
		System.out.println(dll2.toString());
		System.out.println();
		
		//testing removeFromHead method
		System.out.println("Testing removeFromHead method");
		System.out.println("Values in  list before removeFromHead method");
		System.out.println(dll1.toString());
		dll1.removeFromHead();
		System.out.println("Values in list after removeFromHead method");
		System.out.println(dll1.toString());
		System.out.println();
		
		//testing countOccurrences method
		System.out.println("Testing countOccurrences method");
		System.out.println("Counting occurrences of 30 in dll1");
		System.out.println("There are " + dll1.coutOccurrences(30) + " occurrences of 30 in dll1");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Counting occurrences of 50 in dll1");
		System.out.println("There are " + dll1.coutOccurrences(50) + " occurrences of 50 in dll1");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Counting occurrences of 60 in dll1");
		System.out.println("There are " + dll1.coutOccurrences(60) + " occurrences of 60 in dll1");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Counting occurrences of 90 in dll1");
		System.out.println("There are " + dll1.coutOccurrences(90) + " occurrences of 90 in dll1");
		System.out.println(dll1.toString());
		System.out.println();
		
		System.out.println("Added 40 to the list to crete a duplicate for countOccurences Method");
		dll1.addEnd(40);
		System.out.println("Counting occurrences of 40 in dll1");
		System.out.println("There are " + dll1.coutOccurrences(40) + " occurrences of 40 in dll1");
		System.out.println(dll1.toString());
		System.out.println();
		
		
		System.out.println("Testing remove all method on dll1");
		System.out.println("Beiofre removing all instances of 40 in dll1 the vaulues stored in the list are");
		System.out.println(dll1.toString());
		System.out.println("There are currently " + dll1.coutOccurrences(40) + " occurrences of 40 in dll1");
		System.out.println("Removing all occurrences of 40 in dll1");
		dll1.removeAll(40);
		System.out.println("After removing all instances of 40 in dll1 the vaulues stored in the list are");
		System.out.println(dll1.toString());
		System.out.println("There are " + dll1.coutOccurrences(40) + " occurrences of 40 in dll1");
		System.out.println();
		
		
		
	}
}
