package singleLL;

public class singleLL {
    private Node head;
    private  Node tail;
    private int size;
    public singleLL(){
        this.size=0;
    }
public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
         head=node;
        if(tail==null){
            tail=head;
        }
        size++;
}
    public int findLength(Node head) {
        int length = 0; // Initialize the length counter to 0
        Node current = head; // Start from the head of the list

        // Traverse the list while counting nodes
        while (current != null) {
            length++; // Increment the length for each node encountered
            current = current.next; // Move to the next node
        }

        return length; // Return the length of the list
    }
    public void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
public void insert(int val,int index){
        try{
            if(index==0){
            insertFirst(val);
            return;
            }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
    for (int i = 1; i < index; i++) {
        temp=temp.next;
    }
    Node node=new Node(val,temp.next);
    temp.next=node;
    size++;
        } catch (Exception e){
            System.out.println(e);
              }
      }
      public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val= prev.next.value;
        prev.next=prev.next.next;
        return val;
      }

      public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
      }
      public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
      }
public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
    System.out.println("Null");
}
    public Node find(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            if(node.value== head.value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertRec(int index,int val){
        head=insertRec(val,index,head);
    }
    public Node insertRec(int val,int index,Node node){
        if (index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
//      node.next=  insertRec(val,index--,node.next);
        node.next=insertRec(val,index-1,node.next);
        return node;
    }

public Node get(int index){
        Node node=head;
    for (int i = 0; i < index; i++) {
        node=node.next;
    }
    return node;
}

public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
}

    public void deleteNode() {

    }

    private class Node{
       private int value;
      private   Node next;
      public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
