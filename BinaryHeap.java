package goit.task3_5;

public class BinaryHeap {
    private int[] heap;
    private int lastHeapElementIndex = -1;

    public BinaryHeap(int size) {
        heap = new int[size];
    }

    private void heapyfy(int i){
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;
        int largestChild = i;

            if (leftChild <= lastHeapElementIndex && heap[leftChild] > heap[largestChild])
                largestChild = leftChild;

            if (rightChild <= lastHeapElementIndex && heap[rightChild] > heap[largestChild])
                largestChild = rightChild;

            if (largestChild != i){
                int tmp = heap[largestChild];
                heap[largestChild] = heap[i];
                heap[i] = tmp;
                heapyfy(largestChild);
            }
    }

    private void heapIncreaseKey(int i) {
        if (heap[i] > heap[i - 1]) {
            while (i >= 1 && heap[i / 2] < heap[i]) {
                int tmp = heap[i/2];
                heap[i/2] = heap[i];
                heap[i] = tmp;
                i = i/2;
            }
        }
    }

    public void insert(int val) {
        if (lastHeapElementIndex+1 < heap.length) {
            lastHeapElementIndex++;
            heap[lastHeapElementIndex] = val;
            if (lastHeapElementIndex > 0)
                heapIncreaseKey(lastHeapElementIndex);
        }
    }

    public int poll() {
        int result = heap[0];
        if (lastHeapElementIndex+1 >= 1) {
            heap[0] = heap[lastHeapElementIndex];
            heap[lastHeapElementIndex] = 0;
            lastHeapElementIndex--;
        }else {return 0;}

        heapyfy(0);

        return result;
    }
}
