import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MinHeap<T extends Comparable<T>> implements PriorityQueue<T>{

    private List<PriorityQueueEntry<T>> tree;
    private int count;
    private int maxSize;

    MinHeap(){
        //what do we do if they don't specify the size?
    }

    MinHeap(int size) throws IllegalArgumentException{
        if (size < 1 )
            throw new IllegalArgumentException();

        //should check to make sure that "size" makes sense
        this.tree = new ArrayList<PriorityQueueEntry<T>>(size+1);
        this.maxSize=size;
        System.out.println(size); //TODO delete this
        this.tree.add(0, null);
        this.count = 0;
    }

    public int  getCount(){
        return this.count;
    }

    public boolean isFull(){
        if (this.getCount() == this.maxSize){
            return true;
        }
        return false;
    }


    public void push(PriorityQueueEntry<T> newEntry){
        if (isFull()) {
            return;
        }
        this.count ++;
        this.tree.add(count, newEntry);	

        percolate(count);


    }

    private void percolate(int index){
        int curIndex = index;
        int parIndex = curIndex / 2;
        PriorityQueueEntry<T> curEntry = this.tree.get(curIndex);
        PriorityQueueEntry<T> parEntry;

        while ( (curIndex/2) >= 1){
            parIndex = curIndex/2;
            parEntry = this.tree.get(parIndex);

            // is the currentNode.value smaller than its parent's?
            // if it is, then we need to swap (since we want minimum element at top of heap)
            if (curEntry.value.compareTo( parEntry.value) < 1){
                //swap with parent
                PriorityQueueEntry<T> tmp = parEntry;
                this.tree.set(parIndex,   curEntry);
                this.tree.set(curIndex, tmp);
                tmp = null;
            }	    
            curEntry = parEntry;
            curIndex = parIndex;
        }
    }


    public PriorityQueueEntry<T> pop(){
        if (count < 1){
            return null;
        }

        /// only 1 element left to return
        if (count == 1){
            count -= 1;
            return this.tree.get(1);
        }


        /// swap last element and minimum
        PriorityQueueEntry<T> tmp = this.tree.get(count);
        this.tree.set(count,   this.tree.get(1));
        this.tree.set(1, tmp);

        //extract element at idx = count (which is the minimum element -- because of swap above)
        PriorityQueueEntry<T> minNode = this.tree.remove(count);
        count -= 1;  // we have 1 less element on the tree...

        //we need to percolate down (from the root), to restore heap property
        percolateDown(1);

        return minNode;
    }
    private void percolateDown(int idxRoot){

        int minChildIdx; // idx of the child with the minimum value (as compared to the other child)
        PriorityQueueEntry<T> root;

        // any children to compare with (at least 1...)?
        while ( idxRoot*2 <= count){
            root =  this.tree.get(idxRoot);


            minChildIdx = idxRoot*2;
            if (idxRoot*2 < count){
                PriorityQueueEntry<T> leftChild = this.tree.get(minChildIdx);
                if ( leftChild.value.compareTo( this.tree.get(minChildIdx+1).value) < 0){
                    minChildIdx = minChildIdx+1;
                }

            }

            /// is the child less than the current (root) node?
            PriorityQueueEntry<T> minChild = this.tree.get(minChildIdx);       
            if ( root.value.compareTo(minChild.value) > 0){
                //swap with child
                PriorityQueueEntry<T> tmp = root;
                this.tree.set(idxRoot,   minChild);
                this.tree.set(minChildIdx, root);
                tmp = null;		
            }
            else{
                return;  // no more comparison needed!!! short circuit
            }

            //update pointers
            idxRoot = minChildIdx;

        }

    }


    public PriorityQueueEntry<T> peek(){	
        if (count >= 1){
            return this.tree.get(1);
        }
        return null;
    }

    public String toString() {
        String outputString = "PQ MinHeap:\n";
        PriorityQueueEntry<T> nextEntry;
        Iterator<PriorityQueueEntry<T>> pqItr = tree.iterator();
        while (pqItr.hasNext()) {
            nextEntry = pqItr.next();
            if (nextEntry != null) {
                outputString += nextEntry.toString();
                outputString += "\n";
            }
        }

        return outputString;
    }

}
