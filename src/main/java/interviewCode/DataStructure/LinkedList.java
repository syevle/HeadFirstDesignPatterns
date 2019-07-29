//http://www.opendatastructures.org/ods-java/3_1_SLList_Singly_Linked_Li.html
package interviewCode.DataStructure;



class LinkedList {

    class Node {
        Node next;
        int num;
        public Node(int val) {
            num = val;
            next = null;
        }
    }

    private Node head = null;

    public void append(int val) {
        Node lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node(val);
        } else {
            lastNode.next = new Node(val);
        }
    }

    public void delete(int val) {
        if(head == null){
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null && currNode.num != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        //only head present (size of list is 1)
        if(prevNode == null){
            head = head.next;
            return;
        }
        //List not exit (list is null)
        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
            return;
        }
        prevNode.next = currNode.next;
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }
        Node tmpNode = head;
        while (tmpNode.next != null) {
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }

    public void print() {
        System.out.println("");
        if(head == null){
            System.out.print("EMPTY");
            return;
        }
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.print();
        myList.append(35);
        myList.append(33);
        myList.print();
        myList.delete(33);
        myList.delete(35);
        myList.print();
    }
}