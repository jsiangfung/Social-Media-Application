/**
 * Hash Table class that represents a data structure(hash table) containing registered users in a social media application.
 * Changes to the database can be made using its methods.
 */
public class HashTable {
    People[] people;

    /**
     * Constructor for the hash table data structure representing a database of users a social media application.
     */
    public HashTable() {
        people = new People[10];
        for(int i=0; i< people.length; i++){
            people[i] = new People();
        }
    }

    /**
     * Inserts a new person into the hash table (new account)
     * @param ht the global hash table of users
     * @param name the name of the new person to insert into the hash table
     */
    public void chainedHashInsert(HashTable ht, String name){
        Person newUser = new Person(name);
        ht.getPeople()[ht.hash(name)].add(newUser);//Inserts the user to an index in our hash table based on his/her name using the hash function
    }

    /**
     * Removes a person from the hash table (delete account)
     * Also deletes the user from their friend's friends list since the account will no longer exist.
     * @param ht the global hash table of users
     * @param name the name of the person to delete from the hash table
     */
    public void chainedHashDelete(HashTable ht, String name){
        sop("Deleting account from database...");
        Person person = chainedHashSearch(ht, name).getPerson();
        //When someone deletes their account from Facebook, it makes sense to delete them from everyone else's friends list
        People.Node currNode = person.getFriends().getHead();
        while(currNode != null){ //traverses the deleted friend's friends linked list
            //Deletes the user personally from their friend's friends list because we don't want to delete from the linked list we're traversing through with unfriend method
            currNode.getPerson().getFriends().delete(person);
            currNode = currNode.next;
        }
        ht.getPeople()[ht.hash(name)].delete(person); //Deletes the person from the global hash table
    }

    /**
     * Searches for a person with the given name in the hash table
     * @param ht the global hash table of users
     * @param name the name of the person to search for
     * @return a Node containing the person with the given name, returns null if not in the hash table
     */
    public People.Node chainedHashSearch(HashTable ht, String name){
        //search element with key k in list T[h(k)]
        return ht.getPeople()[ht.hash(name)].search(name);
    }

    /**
     * Searches for a user of a given name in our global hash table and prints their list of friends in alphabetical order
     * @param ht the global hash table of users
     * @param name the name of the user we want to list friends for
     * @return the binary tree for the Person with the given name's friends, returns null if the person not in the hash table
     */
    public void listFriends(HashTable ht, String name){
        People.Node personNode = ht.chainedHashSearch(ht, name);
        if(personNode == null) return;
        sop(name + "'s friends...");
        System.out.print("");
        BST tree = new BST(personNode.getPerson().getFriends());
        tree.BSTSort(tree);
    }

    /**
     * Prints 'Yes' if the people with the given names are friends, Prints 'No' if not
     * @param ht the global hash table of users
     * @param name1 the name of the first person
     * @param name2 the name of the second person
     */
    public void isFriend(HashTable ht, String name1, String name2){
        //Searches for the name of person2 in person1's friends list
        if(ht.chainedHashSearch(ht, name1).getPerson().getFriends().search(name2) != null){
            System.out.println("Yes");
        } else System.out.println("No");
    }


    //hash function for the table using division method:
    //for ex if the digits for the key is 5, h(k) = (ascii of letter at digit)*128^4 + (ascii of letter)*128^3 + ... + (ascii of letter)*128^0 then mod 10
    public int hash(String name){
        double toNum = 0;
        for(int i=0; i<name.length(); i++){
            toNum += (name.charAt(i)*Math.pow(128,name.length()-i-1));
        }
        toNum %= 10;
        return (int)toNum;
    }


    /**
     * Prints all the registered users in the hash table
     */
    public void printHashTable(){
        sop("Printing hash table...");
        for(int i=0; i<people.length;i++){
            sop("Index: " + i);
            System.out.print("   ");
            people[i].printPeople();
        }
    }

    /**
     * Returns the hash table
     * @return the hash table
     */
    public People[] getPeople(){
        return people;
    }

    /**
     * Prints a given object. Short-hand for System.out.println(s);
     * @param s the given object
     */
    public void sop(Object s){
        System.out.println(s);
    }
}
