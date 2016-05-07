package goit.task3_5;


public class BinaryHeap{
    int[] heap;
    int lastIndex = 0;

    public BinaryHeap(int size) {
        heap = new int[size];
    }

    public void insert(int val) {
        if (lastIndex < heap.length) {
            heap[lastIndex] = val;
            int i = lastIndex;
            int parent = (i - 1) / 2;

            while (i > 0 && heap[parent] < heap[i]) {
                int temp = heap[i];
                heap[i] = heap[parent];
                heap[parent] = temp;

                i = parent;
                parent = (i - 1) / 2;
            }
        }
        lastIndex++;
    }

    public int poll() {
        int result = heap[0];
        int[] heapWithoutMax = new int[heap.length-1];
        heap[0] = heap[heap.length - 1];
        System.arraycopy(heap, 0, heapWithoutMax, 0, heapWithoutMax.length);
        heap = heapWithoutMax;

        int i = 0;
        while (true)
        {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            int largestChild = i;

            if (leftChild < heap.length && heap[leftChild] > heap[largestChild])
            {
                largestChild = leftChild;
            }

            if (rightChild < heap.length && heap[rightChild] > heap[largestChild])
            {
                largestChild = rightChild;
            }

            if (largestChild == i)
            {
                break;
            }

            int temp = heap[i];
            heap[i] = heap[largestChild];
            heap[largestChild] = temp;
            i = largestChild;
        }

        return result;
    }
}
