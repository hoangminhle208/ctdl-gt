package LinkedList;
public class LinkedList{

    public static void IsEmpty(Node head){
        if(head==null)
            System.out.println("List is empty");
    }
    public static void PrintList(Node head){
        IsEmpty(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            temp=temp.next;
            if(temp!=null){
                System.out.print("->");
            }
            else{
                System.out.println();
            }
        }
    }
    public static void addFirst(Node head,int value){
        Node newNode = new Node(value);
        if(head==null){
            ;
        }
    }
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);

        node1.next=node2;
        node2.next=node3;
        
        PrintList(node1);
    }
}
