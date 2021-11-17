import java.util.LinkedList;

/**
 * Class representing a Person object. A person has a name and list of friends, and is stored in a hash table for a social media application.
 */
public class Person {
    private String name;
//    private People friends;
    private People friends;

    /**
     * Constructure for a person that takes in a name and creates an initially empty friends list (linked list)
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
        //friends = new People();
        friends = new People();
    }

    /**
     * Retrieves a person from our hash table based on given name and adds them to our friends list (also adds the user to their friends list)
     * @param ht the global hash table of users
     * @param name the name of the person we want to add to our friends list
     */
    public void addFriend(HashTable ht, String name){
        sop("Attempting to friend " + name + "...");
        if(ht.chainedHashSearch(ht, name) != null){ //Checks if the person even exists in the hash table
            if(ht.chainedHashSearch(ht, name).getPerson().getFriends().search(name) == null) { //checks if person already exists in user's friends list
                friends.add(ht.chainedHashSearch(ht, name).getPerson());
                ht.chainedHashSearch(ht, name).getPerson().getFriends().add(this);
                sop(name + " successfully added to your friends list!");
            } else{
                sop("Error: " + name + " is already in your friend's list.");
            }
        } else{
            sop("Error: " + name + " does not have an account. Please create one for them before adding.");
        }
    }

    /**
     * Retrieves a person from our hash table based on given name and deletes them from our friends list (also deletes us from their friends list)
     * @param ht the global hash table of users
     * @param name the name of the person we want to delete from our friends list
     */
    public void removeFriend(HashTable ht, String name){
        sop("Attempting to unfriend " + name + "...");
        if(ht.chainedHashSearch(ht, name) != null){ //Checks if the person even exists in the hash table
            if(ht.chainedHashSearch(ht, name) != null) { //Checks if a friend with the given name is even in the person's friends list to delete
                friends.delete(ht.chainedHashSearch(ht, name).getPerson());//deletes the person with the given name from our friends list
                ht.chainedHashSearch(ht, name).getPerson().getFriends().delete(this); //deletes us from the person with the given name's friends list
                sop(name + " has been deleted from your friends list");
            } else{
                sop("Error: " +  name + " is not in your friends list.");
            }
        } else{
            sop("Error: " + name + " does not have an account. No action is needed.");
        }
    }


    /**
     * Returns the name of the user
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the linked list of friends of the user
     * @return the linked list of friends of the user
     */
    public People getFriends() {
        return friends;
    }

    /**
     * Prints a given object. Short-hand for System.out.println(s);
     * @param s the given object
     */
    public void sop(Object s) {
        System.out.println(s);
    }
}
