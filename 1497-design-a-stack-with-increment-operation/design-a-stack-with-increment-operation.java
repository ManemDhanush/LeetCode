class CustomStack {

    // private Stack<Integer> stack = new Stack<Integer>();
    private int maxSize;
    private int[] arr;
    private int currSize;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        this.maxSize = maxSize;
        this.currSize = 0;
    }
    
    public void push(int x) {
        if(currSize < maxSize) arr[currSize++] = x;
        // System.out.println(Arrays.toString(arr) + " " + currSize);
    }
    
    public int pop() {
        if(currSize == 0) return -1;
        // System.out.println(Arrays.toString(arr) + " " + currSize);
        // arr[currSize] = -1;
        return arr[--currSize];
        // return 0;
    }
    
    public void increment(int k, int val) {
        k = Math.min(k, currSize);
        for (int i = 0; i < k; i++) {
            arr[i] += val;
        }
        // System.out.println(Arrays.toString(arr) + " " + currSize);
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */