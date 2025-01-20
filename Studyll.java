class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    private Node head=null;
    private Node temp;
    public void Create(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            temp= head = newnode;
        } else {
            
            temp.next = newnode;
            temp = newnode;
        }
    }

    public void insertatp(int data,int pos){
        Node newnode = new Node(data);
        if (pos == 1){
            newnode.next=head;
            head=newnode;
        }
        else{
            temp = head;
            int count = 1;
            while (temp != null && count < pos - 1) {
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Invalid position!");
            } else {
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }

    }
    public void deleteatp(int pos){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(pos == 1){
            head=head.next;
        }
        else{
            temp=head;
            int count=1;
            while(temp!=null && count < pos - 1){
                temp=temp.next;
                count++;
            }
            if(temp==null || temp.next==null){
                System.out.println("invalid position");
            }
            else{
                temp.next=temp.next.next;
            }
        }
    }

    public void Print() {
         temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Studyll {
    public static void main(String args[]) {
        Linkedlist list = new Linkedlist();
        list.Create(10);
        list.Create(20);
        list.Create(30);
        list.Create(40);
        list.Print();
        list.insertatp(15, 2);
        list.Print();
        list.deleteatp(1);
        list.Print();
        list.deleteatp(4);
        list.Print();
        list.insertatp(35, 4);
        list.Print();
    }
}
