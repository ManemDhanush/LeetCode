class LRUCache {

    class Node {
        Node next;
        Node prev;
        int val;
        int key;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private Node head;
    private Node tail;
    private HashMap<Integer, Node> map;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public void add(Node node){
        Node nextNode = head.next;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
        head.next = node;
    }

    public void remove(Node node){
        node.prev.next = node.next; 
        node.next.prev = node.prev;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            add(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        } else if(map.size() == capacity){
            Node last = tail.prev;
            remove(last);
            map.remove(last.key);
        }
        Node node = new Node(key, value);
        add(node);
        map.put(key, node);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */