class LRUCache {
    class DoublyLL{
        int key;
        int val;
        DoublyLL next, prev;

        DoublyLL(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Deque<Integer> q;
    HashMap<Integer, DoublyLL> map;
    int capacity;
    DoublyLL head;
    DoublyLL tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new DoublyLL(-1,-1);
        tail = new DoublyLL(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            DoublyLL node = map.get(key);
            remove(node);
            add(node);
            return node.val;
        } else return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        DoublyLL node = new DoublyLL(key, value);
        map.put(key, node);
        add(node);

        if(map.size() > capacity){
            map.remove(head.next.key);
            remove(head.next);
        }
    }

    void add(DoublyLL node){
        DoublyLL prev = tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next = tail;
        tail.prev = node;
    }

    void remove(DoublyLL node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */