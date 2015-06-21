public class Driver {

    public static void main(String args[]) {

        PriorityQueueEntry<Integer> entryA = new PriorityQueueEntry<Integer>("A", 42);
        PriorityQueueEntry<Integer> entryB = new PriorityQueueEntry<Integer>("B", 48);
        PriorityQueueEntry<Integer> entryC = new PriorityQueueEntry<Integer>("C", 33);
        PriorityQueueEntry<Integer> entryD = new PriorityQueueEntry<Integer>("D", 45);
        PriorityQueueEntry<Integer> entryE = new PriorityQueueEntry<Integer>("E", -19);
        PriorityQueueEntry<Integer> entryF = new PriorityQueueEntry<Integer>("F", 11);
        PriorityQueueEntry<Integer> entryG = new PriorityQueueEntry<Integer>("G", 3535);
        PriorityQueueEntry<Integer> entryH = new PriorityQueueEntry<Integer>("H", -43);
        PriorityQueueEntry<Integer> entryI = new PriorityQueueEntry<Integer>("I", 0);
        PriorityQueueEntry<Integer> entryJ = new PriorityQueueEntry<Integer>("J", -2);
        PriorityQueueEntry<Integer> entryK = new PriorityQueueEntry<Integer>("K", 898);
        PriorityQueueEntry<Integer> entryL = new PriorityQueueEntry<Integer>("L", 11);

        //System.out.println(entryA); 
        //System.out.println(entryB); 
        //System.out.println(entryC); 
        //System.out.println(entryD); 
        //System.out.println(entryE); 
        //System.out.println(entryF); 

        PriorityQueue<Integer> intPQ = new MinHeap<Integer>(20);

        intPQ.push(entryA);
        intPQ.push(entryB);
        intPQ.push(entryC);
        intPQ.push(entryD);
        intPQ.push(entryE);
        intPQ.push(entryF);
        intPQ.push(entryG);
        intPQ.push(entryH);
        intPQ.push(entryI);
        intPQ.push(entryJ);
        intPQ.push(entryK);
        intPQ.push(entryL);

        //System.out.println(intPQ);

        //PriorityQueueEntry<Integer> poppedEntry = intPQ.pop();
        //poppedEntry = intPQ.pop();
        //poppedEntry = intPQ.pop();
        //poppedEntry = intPQ.pop();
        //poppedEntry = intPQ.pop();
        //poppedEntry = intPQ.pop();



        System.out.println(intPQ);










    }
}
