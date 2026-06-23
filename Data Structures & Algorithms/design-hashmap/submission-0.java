class MyHashMap {

     class Node{
        Node next;
        int key;
        int value;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private  static int BUCKET_SIZE=1000;

    Node[] buckets ;

    MyHashMap(){
        buckets = new Node[BUCKET_SIZE];
    }

    public int hash(int key){
      return  key%BUCKET_SIZE;
    }

    public  void put(int key,int value){
        int hash = hash(key);
        if(buckets[hash] == null){
            buckets[hash]=new Node(key,value);

        } else {
            Node cur = buckets[hash];
            while(true){
            if(cur.key==key){
                cur.value=value;
                return;
            }
            if(cur.next==null) break;
            cur=cur.next;
            }
            cur.next=new Node(key,value);
        }
    }

    public  int get(int key){
        int index=hash(key);
        Node cur = buckets[index];
        while(cur!=null){
            if(cur.key==key) return cur.value;
            cur=cur.next;
        }
        return -1;
    }

    public void  remove(int key){
        if(buckets.length==0){
            return;
        }
        int index=hash(key);
        Node curr = buckets[index], prev = null;
        while(curr!=null){
            if (curr.key == key) {
                if (prev == null) buckets[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
       }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */