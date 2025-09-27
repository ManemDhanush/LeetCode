class LRUCache {

    class DoublyLL {
        int key;
        int value;
        DoublyLL next, prev;
        DoublyLL(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    DoublyLL head;
    DoublyLL tail;
    HashMap<Integer, DoublyLL> map;
    int capacity;

    void add(DoublyLL node){
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    void remove(DoublyLL node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
    }

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new DoublyLL(-1, -1);
        tail = new DoublyLL(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DoublyLL x = map.getOrDefault(key, null);
        if(x==null) return -1;
        remove(x);
        add(x);
        return x.value;
    }
    
    public void put(int key, int value) {
        DoublyLL x = map.get(key);
        if (x != null) {
            x.value = value;
            remove(x);
            add(x);
            return;
        }

        DoublyLL fresh = new DoublyLL(key, value);
        add(fresh);
        map.put(key, fresh);

        if (map.size() > capacity) {
            DoublyLL lru = head.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */