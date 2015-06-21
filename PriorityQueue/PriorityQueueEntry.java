public class PriorityQueueEntry<T extends Comparable<T>> {

	PriorityQueueEntry(String key, T value) {
		this.key = key;
		this.value = value;
	}
	
	public String key;
	public T value;

    public int compareTo(PriorityQueueEntry<T> otherEntry) {
        return this.value.compareTo(otherEntry.value);
    }
	
    public String toString() {
        return key + ": " + value.toString();
    }
}
