import java.util.*;

public class PriorityQueueArrayList <T extends Comparable<T>>
implements PriorityQueue <T> {

    private static final int defaultSize = 20;

    private int numberOfEntries;
    private ArrayList<PriorityQueueEntry<T>> entries;
    private PriorityQueueEntry<T> top;
    private int indexOfTop;

    PriorityQueueArrayList() {
        entries = new ArrayList <PriorityQueueEntry<T>> (defaultSize);
        numberOfEntries = 0;
        top = null;
        indexOfTop = -1;
    } 

    private int findNewTopIndex() {
        int newTopIndex;

        if (numberOfEntries == 0) {
            newTopIndex = -1;
        }
        else {
            newTopIndex = 0;
            for (int i = 1; i < numberOfEntries; i++) {
                if (entries.get(i).value.compareTo(
                                        entries.get(newTopIndex).value) < 0) {
                    newTopIndex = i;
                }
            }
        }

        return newTopIndex;
    }

    public void push(PriorityQueueEntry<T> newEntry) {

        entries.add(newEntry);
        numberOfEntries += 1;

        if (numberOfEntries == 1) {
            top = newEntry;
        }
        else if (newEntry.value.compareTo(top.value) < 0) { //TODO: what if we want
            top = newEntry;                               //to flip the comparison?
            indexOfTop = entries.indexOf(top);
        }
    }

    public PriorityQueueEntry<T> pop() {
        PriorityQueueEntry<T> oldTopEntry = top;
        if (numberOfEntries != 0) {
            entries.remove(indexOfTop);
            numberOfEntries -= 1;
            if (numberOfEntries == 0) {
                indexOfTop = -1;
                top = null;
            }
            else {
                indexOfTop = findNewTopIndex();
                top = entries.get(indexOfTop);
            }
        }

        return oldTopEntry;
    } 

    public PriorityQueueEntry<T> peek() {
        return top;                         //TODO: return a copy for safety?
    }

    public String toString() {
        String outputString = "";
        PriorityQueueEntry<T> nextEntry;
        Iterator<PriorityQueueEntry<T>> pqItr = entries.iterator();
        while (pqItr.hasNext()) {
            nextEntry = pqItr.next();
            outputString += nextEntry.toString();

            if (nextEntry == top) {
                outputString += " <--- top";
            }

            outputString += "\n";
        }

        return outputString;
    }

}
