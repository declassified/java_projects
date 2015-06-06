public class TestLinkedList{

    
    

    public static void main(String[] args){
	/// create a Node and see if we can print out
	Node N2 = new Node("Hello");
	System.out.println(N2);


	// Create value/nbr Node
	Node N1 = new Node("Goodbye", N2);
	System.out.println(N1);
	System.out.println(N1.getNeighbour());


	//Create LinkedList with just N2
	LinkedList L2 = new LinkedList(N2);
	System.out.println(L2);

	//Create LinkedList with N1 (which points to N2)
	LinkedList L1 = new LinkedList(N1);
	L1.addNodeAtHead(N2);
	System.out.println(L1);

	//Delete a Node (N1);
	L1.deleteNodeAtHead();
	System.out.println(L1);
	L1.deleteNodeAtHead();
	System.out.println(L1);

	
    }

}