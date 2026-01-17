// Node class
class Node {
    int data;
    Node prev, next;

   public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}    
class doublyll{
    private Node head =null;
    private Node temp;
    public void create(int data){
        Node newnode = new Node(data);
        if(head==null){
         temp=head = newnode;
        }
        else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    public void print(){
        if (head == null) {
            System.out.println("The list is empty!");
        } 
        else{
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    }
}

public class studydll {
    public static void main(String args[]){
        doublyll dll =new doublyll();
        dll.create(10);
        dll.create(20);
        dll.create(30);
        dll.create(40);
        dll.print();
    }
}
