public class Driver {
    
    public static void main(String args[]) {

        PriorityQueueEntry<Integer> entryA = new PriorityQueueEntry<Integer>("A", 42);
        PriorityQueueEntry<Integer> entryB = new PriorityQueueEntry<Integer>("B", 48);
        PriorityQueueEntry<Integer> entryC = new PriorityQueueEntry<Integer>("C", 33);
        PriorityQueueEntry<Integer> entryD = new PriorityQueueEntry<Integer>("D", 45);
        PriorityQueueEntry<Integer> entryE = new PriorityQueueEntry<Integer>("E", -19);
        PriorityQueueEntry<Integer> entryF = new PriorityQueueEntry<Integer>("F", 11);

        System.out.println(entryA); 
        System.out.println(entryB); 
        System.out.println(entryC); 
        System.out.println(entryD); 
        System.out.println(entryE); 
        System.out.println(entryF); 

        PriorityQueue<Integer> intPQ = new PriorityQueueArrayList<Integer>();

        intPQ.push(entryA);
        intPQ.push(entryB);
        intPQ.push(entryC);
        intPQ.push(entryD);
        intPQ.push(entryE);

        System.out.println(intPQ);










    }
}
