/**
 * Class representing a linked list data structure
 */
public class People{
    Node head = null;

    /**
     * Node class to be used in People linked list and BST data structure
     */
    static class Node {
        //Used for Linked List
        Person person;
        Node next;
        Node prev;
        //Used for BST
        Node left;
        Node right;
        Node p;

        /**
         * Node representing the given Person object
         * @param person the Person object representing this node
         */
        Node(Person person){
            this.person = person;
            next = null;
            prev = null;
            left = null;
            right = null;
            p = null;
        }

        /**
         * Returns the Person object associated with this node
         * @return the Person object associated with this node
         */
        Person getPerson(){
            return person;
        }
    }

    /**
     * Adds a node containing the given Person object to the end of the linked list
     * @param person the Person object to add to the list
     */
    public void add(Person person){
         Node newNode = new Node(person);
         if(this.head == null) head = newNode;//case where the linked list is empty
         else{
             Node currNode = head;
             //Traverses to the end of the linked list to add the new Person object
             while(currNode.next != null){
                 currNode = currNode.next;
             }
             //we add the new person at the end of the linked list
             currNode.next = newNode;
             newNode.prev = currNode; //newNode.next is already null from initialization
         }
    }

    /**
     * Deletes a node containing the given Person object from the linked list
     * @param person the given Person object to delete
     */
    public void delete(Person person){
        Node currNode = search(person.getName()); //finds the node we want to delete
        if(this.head == null); //Case 1: list is empty so we do nothing
        else if(head.person == person){
            head = head.next; //Case 2: the node deleted is the head
        } else if(currNode.next == null){
            currNode.prev.next = null; //Case 3: the node deleted is at the end
        } else{ //every other case
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
        }
    }

    /**
     * Searches for a Node containing a Person object with the given name within the linked list
     * @param name the given name to search for
     * @return the node containing a Person object with the given name, return null otherwise
     */
    public Node search(String name){
        Node currNode = this.head;
        if(currNode == null) return null;  //case if list is empty
        while(currNode != null ){ //traverses linked list
            if(currNode.person.getName() == name){
                return currNode; //if we find a match, return the node
            }
            currNode = currNode.next;
        }
        return null;
    }


    /**
     * Prints the name of every Node containing a Person object in the linked list
     */
    public void printPeople(){
        Node currNode = this.head;
        while(currNode != null){
            System.out.print(currNode.person.getName() + " ");
            currNode = currNode.next;
        }
        sop("");
    }

    /**
     * Returns the head of the linked list
     * @return the head of the linked list
     */
    public Node getHead(){
        return head;
    }


    /**
     * Prints a given object. Short-hand for System.out.println(s);
     * @param s the given object
     */
    public void sop(Object s){
        System.out.println(s);
    }
}
