public interface priorityQueueADT{
    
    public void push(Node vertex);
    public void update(Node vertex, int updatedPriority);
    public Node pop();
    public Node peek();
    
}