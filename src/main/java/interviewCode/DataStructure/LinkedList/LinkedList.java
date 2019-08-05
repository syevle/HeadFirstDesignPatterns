//http://www.opendatastructures.org/ods-java/3_1_SLList_Singly_Linked_Li.html
package interviewCode.DataStructure.LinkedList;



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

    public void append(int val) {
        Node lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node(val);
        } else {
            lastNode.next = new Node(val);
        }
    }

    // This function will find middle element in linkedlist
    public static Node findMiddleNode(Node head)
    {
        // step 1
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer;
    }
    public Node deleteMid(Node head)
    {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null)
        {
            return null;
        }

        // step 1
        Node slowPointer, fastPointer,prevPointer;
        slowPointer = fastPointer = head;
        prevPointer = null;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                prevPointer = slowPointer;
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        //Delete the middle node
        prevPointer.next = slowPointer.next;

        return head;
    }

    public Node nthFromLastNode(Node head,int n)
    {
        Node firstPtr=head;
        Node secondPtr=head;

        for (int i = 0; i < n; i++) {
            firstPtr=firstPtr.next;

        }

        while(firstPtr!=null)
        {
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }

        return secondPtr;
    }

    public boolean ifLoopExists() {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr)
                return true;

        }
        return false;
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

    public static Node reverseLinkedList(Node currentNode)
    {
        // For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
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