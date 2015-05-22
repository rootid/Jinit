import java.util.List;


class Queue<Item> {
    
    private Item mFront;
    private Item mBack;
    private Item mCapacity;
    private List<Item> mContainer ;
    
    Queue (Item aCapacity) {
        this.mCapacity = aCapacity;
        this.mContainer= new ArrayList(this.mCapacity);
    }

    

    //3 2 1
    public void enqueue(Item ele) throws InterruptedException {
        while (mContainer.size() == capacity ) {
            wait();
        }

        mContainer.add(ele);
        notify();
    }

    public Item dequeue() {
        return 0;
    }

    public Item pop () {
        return 0;
    }


    public static void main (String args[]) {

    }

    
}
