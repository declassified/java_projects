public class LinkedList{

    // Class variables
    private Node head;
    private int number_nodes;

    // Constructors
    LinkedList(){
	this.head = null;
	this.number_nodes = 0;
    }
    LinkedList(Node start_node){
	this.head = start_node;
	this.head.setNeighbour(null);
	this.number_nodes = 1;	
    }
    LinkedList(String value){
	this.head = new Node(value);
	this.number_nodes = 1;
    }

    //Getter
    public int getNumberNodes(){
	return number_nodes;
    }
    
    //Add
    public void addNodeAtHead(Node inputNode){
	inputNode.setNeighbour(head);
	this.head = inputNode;
	this.number_nodes += 1;
    }
    

    //Searching
    public Node findByValue(String searchString){
	Node curNode = this.head;
	while (curNode != null){
	    if ( curNode.getValue().equals(searchString) ){
		break;  // found node!
	    }
	    
	    curNode = curNode.getNeighbour();    
	}
	return curNode;
	

    }

    // Delete
    public void deleteNodeAtHead(){
	if (this.getNumberNodes() > 0){
	    Node tmpNode = this.head.getNeighbour();
	    this.head.setNeighbour(null);	    
	    this.head = tmpNode;
	    this.number_nodes -= 1;
	}

    }


    //Output
    public String toString(){
	String msg = ""; // could change this to StringBuffer
	Node curNode = this.head;

	for (int i = 0; i < this.number_nodes; i++){
	    if ( i != 0){
		msg += "\n" +  curNode.toString();
	    }
	    else{
		msg = curNode.toString() + "*";
	    }
	    curNode = curNode.getNeighbour();
	}

	return msg;
    }

    
}