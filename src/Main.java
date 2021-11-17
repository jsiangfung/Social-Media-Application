import java.util.Scanner;

//Main class that runs the social media application
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Inserting persons into hash table
        HashTable ht = new HashTable();
        sop("Booting JiaBook...");
        sop("Loading all existing users into database...");
//        Adding all males to hash table
        ht.chainedHashInsert(ht, "Liam");
        ht.chainedHashInsert(ht,"Noah");
        ht.chainedHashInsert(ht,"William");
        ht.chainedHashInsert(ht,"James");
        ht.chainedHashInsert(ht,"Logan");
        ht.chainedHashInsert(ht,"Benjamin");
        ht.chainedHashInsert(ht,"Mason");
        ht.chainedHashInsert(ht,"Elijah");
        ht.chainedHashInsert(ht,"Oliver");
        ht.chainedHashInsert(ht,"Jacob");
        ht.chainedHashInsert(ht,"Lucas");
        ht.chainedHashInsert(ht,"Michael");
        ht.chainedHashInsert(ht,"Alexander");
        ht.chainedHashInsert(ht,"Ethan");
        ht.chainedHashInsert(ht,"Daniel");
        ht.chainedHashInsert(ht,"Matthew");
        ht.chainedHashInsert(ht,"Aiden");
        ht.chainedHashInsert(ht,"Henry");
        ht.chainedHashInsert(ht,"Joseph");
        ht.chainedHashInsert(ht,"Jackson");
        ht.chainedHashInsert(ht,"Samuel");
        ht.chainedHashInsert(ht,"Sebastian");
        ht.chainedHashInsert(ht,"David");
        ht.chainedHashInsert(ht,"Carter");
        ht.chainedHashInsert(ht,"Wyatt");
        //Adding all females to hash table
        ht.chainedHashInsert(ht,"Emma");
        ht.chainedHashInsert(ht,"Olivia");
        ht.chainedHashInsert(ht,"Ava");
        ht.chainedHashInsert(ht,"Isabella");
        ht.chainedHashInsert(ht,"Sophia");
        ht.chainedHashInsert(ht,"Mia");
        ht.chainedHashInsert(ht,"Charlotte");
        ht.chainedHashInsert(ht,"Amelia");
        ht.chainedHashInsert(ht,"Evelyn");
        ht.chainedHashInsert(ht,"Abigail");
        ht.chainedHashInsert(ht,"Harper");
        ht.chainedHashInsert(ht,"Emily");
        ht.chainedHashInsert(ht,"Elizabeth");
        ht.chainedHashInsert(ht,"Avery");
        ht.chainedHashInsert(ht,"Sofia");
        ht.chainedHashInsert(ht,"Ella");
        ht.chainedHashInsert(ht,"Madison");
        ht.chainedHashInsert(ht,"Scarlett");
        ht.chainedHashInsert(ht,"Victoria");
        ht.chainedHashInsert(ht,"Aria");
        ht.chainedHashInsert(ht,"Grace");
        ht.chainedHashInsert(ht,"Chloe");
        ht.chainedHashInsert(ht,"Camila");
        ht.chainedHashInsert(ht,"Penelope");
        ht.chainedHashInsert(ht,"Riley");
        ht.printHashTable();
        sop("");
        sop("Now loading up friends lists for each user...");
        //Adding friends to Liam's friends list
        ht.chainedHashSearch(ht, "Liam").getPerson().addFriend(ht, "Noah");
        ht.chainedHashSearch(ht, "Liam").getPerson().addFriend(ht, "William");
        ht.chainedHashSearch(ht, "Liam").getPerson().addFriend(ht, "Riley");

        //Adding friends to James's friends list
        ht.chainedHashSearch(ht, "James").getPerson().addFriend(ht, "Benjamin");
        ht.chainedHashSearch(ht, "James").getPerson().addFriend(ht, "Mason");
        ht.chainedHashSearch(ht, "James").getPerson().addFriend(ht, "Aria");
        ht.chainedHashSearch(ht, "James").getPerson().addFriend(ht, "Camila");

        //Adding friends to Sophia's friends list
        ht.chainedHashSearch(ht, "Sophia").getPerson().addFriend(ht, "Mia");
        ht.chainedHashSearch(ht, "Sophia").getPerson().addFriend(ht, "Charlotte");
        ht.chainedHashSearch(ht, "Sophia").getPerson().addFriend(ht, "Chloe");
        ht.chainedHashSearch(ht, "Sophia").getPerson().addFriend(ht, "Camila");
        ht.chainedHashSearch(ht, "Sophia").getPerson().addFriend(ht, "Riley");

        //Adding friends to Harper's friends list
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Jacob");
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Lucas");
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Michael");
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Samuel");
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Sebastian");
        ht.chainedHashSearch(ht, "Harper").getPerson().addFriend(ht, "Samuel");

        //Adding friends to Wyatt's friends list
        ht.chainedHashSearch(ht, "Wyatt").getPerson().addFriend(ht, "Mia");
        ht.chainedHashSearch(ht, "Wyatt").getPerson().addFriend(ht, "Henry");
        ht.chainedHashSearch(ht, "Wyatt").getPerson().addFriend(ht, "Joseph");
        ht.chainedHashSearch(ht, "Wyatt").getPerson().addFriend(ht, "Madison");

        //Adding friends to Madison's friends list
        ht.chainedHashSearch(ht, "Madison").getPerson().addFriend(ht, "Evelyn");
        ht.chainedHashSearch(ht, "Madison").getPerson().addFriend(ht, "Abigail");
        ht.chainedHashSearch(ht, "Madison").getPerson().addFriend(ht, "Emily");
        ht.chainedHashSearch(ht, "Madison").getPerson().addFriend(ht, "Elizabeth");
        ht.chainedHashSearch(ht, "Madison").getPerson().addFriend(ht, "Camila");

        //Adding friends to Alexander's friends list
        ht.chainedHashSearch(ht, "Alexander").getPerson().addFriend(ht, "Samuel");
        ht.chainedHashSearch(ht, "Alexander").getPerson().addFriend(ht, "Mason");
        ht.chainedHashSearch(ht, "Alexander").getPerson().addFriend(ht, "Grace");
        ht.chainedHashSearch(ht, "Alexander").getPerson().addFriend(ht, "Penelope");
        ht.chainedHashSearch(ht, "Alexander").getPerson().addFriend(ht, "Carter");

        //Adding friends to Carter's friends list
        ht.chainedHashSearch(ht, "Carter").getPerson().addFriend(ht, "Aria");
        ht.chainedHashSearch(ht, "Carter").getPerson().addFriend(ht, "Ethan");
        ht.chainedHashSearch(ht, "Carter").getPerson().addFriend(ht, "Aiden");
        ht.chainedHashSearch(ht, "Carter").getPerson().addFriend(ht, "Henry");
        ht.chainedHashSearch(ht, "Carter").getPerson().addFriend(ht, "Riley");

        //Adding friends to Elijah's friends list
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Abigail");
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Jackson");
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Penelope");
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Samuel");
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Oliver");
        ht.chainedHashSearch(ht, "Elijah").getPerson().addFriend(ht, "Benjamin");
        sop("");
        sop("Friends successfully loaded...");
        sop("");
        sop("New user detected. Opening new account...");
        sop("Please type in a new username...(that isn't already in the database)");
        //User's name
        Person user;
        user  = new Person(s.nextLine());
        //Adding the user's name to hash table
        ht.chainedHashInsert(ht, user.getName());
        sop(user.getName() + " successfully added and now you are logged in.");
        sop("The following commands are now available. Type 'commands' to show them again.");
        commands();

        String input = "";
        while(input != "quit") {
            input = s.nextLine();
            Scanner newScanner = new Scanner(System.in);
            String name1 = "";
            if (input.equals("switch")) {
                sop("Enter the name of the account you want to log into...");
                name1 = s.nextLine();
                sop("name1 = " + name1);
                if (ht.chainedHashSearch(ht, name1) != null) {
                    People.Node node = ht.chainedHashSearch(ht, name1);
                    user = node.getPerson();
                    sop("User successfully changed to " + name1);
                }
            } else if (input.equals("commands")) {
                commands();
            } else if (input.equals("insert")) {
                sop("Please enter the name of the new person you want to register...");
                name1 = s.nextLine();
                ht.chainedHashInsert(ht, name1);
                while (input != "Yes") {
                    sop("This user doesn't have any friends. Would you like to add them to your friends list? Please enter Yes or No.");
                    input = s.nextLine();
                    if (input.equals("Yes")) {
                        user.addFriend(ht, name1);
                    } else if (input.equals("No")) {
                        input = "Yes";
                        sop("User will not be added");
                    } else {
                        sop("Invalid response. Please try again.");
                    }
                }
            } else if (input.equals("delete")) {
                sop("Please enter the name of the person you want to remove from the hash table...");
                name1 = s.nextLine();
                if (ht.chainedHashSearch(ht, name1) == null) {
                    sop("The user is not in the hash table");
                    ht.chainedHashDelete(ht, name1);
                } else sop("Account successfully deleted.");
            } else if (input.equals("search")) {
                sop("Please enter the name of the user you want to search and list friends for...");
                name1 = s.nextLine();
                ht.chainedHashSearch(ht, name1).getPerson().getFriends().printPeople();
            } else if (input.equals("isfriend")) { //fix
                sop("Please enter the name of the first person...");
                name1 = s.nextLine();
                sop("Please enter the name of the second person...");
                String name2 = s.nextLine();
                ht.isFriend(ht, name1, name2);
            } else if (input.equals("print users")) {
                ht.printHashTable();
            } else if (input.equals("switch")) { //fix
                name1 = s.nextLine();
                user = ht.chainedHashSearch(ht, name1).getPerson();
                if (user != null) sop("Account successfully switched. You are now under " + name1);

            } else if (input.equals("quit")) {
            } else if (input.equals("friend")) { //
                sop("Who would you like to add? Please enter a name registered in the hash table...");
                name1 = s.nextLine();
                user.addFriend(ht, name1);
            } else if (input.equals("unfriend")) {
                sop("Who would you like to unfriend? Please enter a name from your friends list...");
                ht.listFriends(ht, user.getName());
                name1 = s.nextLine();
                user.removeFriend(ht, name1);
            } else if (input.equals("list in order")) {
                sop("Please enter the person's name you want to look up...");
                name1 = s.nextLine();
                ht.listFriends(ht, name1);
            } else {
                if (input == "") {
                } else sop("An invalid command was issued. Please try again.");
            }
        }

    }


    /**
     * Prints a given object. Short-hand for System.out.println(s);
     * @param s the given object
     */
    static void sop(Object s){
        System.out.println(s);
    }

    static void commands(){
        sop("List of available commands");
        sop("insert - add a new user to our database");
        sop("delete - delete an existing user from our database");
        sop("search - search for an existing user in our database and list their friends");
        sop("isfriend - checks if two registered users are friends");
        sop("print users - prints all users registered in our database");
        sop("switch - allows you to login to another existing user's account");
        sop("friend - add someone to your friends list");
        sop("unfriend - remove someone from your friends list");
        sop("list in order - list someone's friends list in alphabetical order(Note: only use this once per person. Using more than once person will cause the application to crash");
        sop("quit - exits the application");
    }
}
