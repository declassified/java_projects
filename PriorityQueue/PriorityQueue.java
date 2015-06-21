public interface PriorityQueue <T extends Comparable<T>> {

	public void push(PriorityQueueEntry<T> newEntry);
	public PriorityQueueEntry<T> pop();
	public PriorityQueueEntry<T> peek();
	
}
