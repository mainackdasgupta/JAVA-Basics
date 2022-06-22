

public class LinkedList {
    Node head;
    //private int size;
   
   /*  LinkedList(){
        size = 0;
    } */
     class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            //size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("empty list, nothing to add at the end.");
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("empty list, nothing to remove from start.");
            return;
        }
        head = head.next;                             // this single line will remove the node if it exists by shifting the head(which is always constant
    }                                                 //  at first position and if removed from first position then the garbage collector will take the first node with it.)


    public void printList(){
        Node lastNode = head;
        while(lastNode != null){
            System.out.print(lastNode.data + "->");
            lastNode = lastNode.next;
        }
        System.out.println("Null"); 
    }

    public void removeLast(){
        if(head == null){
            System.out.println("empty list, nothing to remove from end.");
            return;
        }
        if(head.next == null) {      // if there exist only one node then delete that. 
            head = null;
            return;
        }
        Node SecondLastNode = head;          
        Node LastNode = head.next;
        while(LastNode.next != null){              //if ther exist more than one node then do this.
            SecondLastNode = SecondLastNode.next;
            LastNode = LastNode.next;
        }
        SecondLastNode.next = null;
    }



    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.addFirst("a");        
        list.addFirst("is");        
        list.addFirst("this");       
        list.printList(); 
        list.removeFirst();
        list.addFirst("this");
        list.printList();
        list.addLast("Node");
        list.printList();
        list.addLast("of data");
        list.printList();
        list.removeLast();
        list.printList();


    }
}
