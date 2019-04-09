public class ContactsManager {
	
	// Fields:
	Contact [] myFriends;
		int friendsCount;

	// Constructor:
	ContactsManager() {
	    friendsCount = 0;
	    myFriends = new Contact[500];
	   }

	// Methods:
	void addContact(Contact contact) {
	    myFriends[friendsCount] = contact;
	    friendsCount++;
	   }

	Contact searchContact(String searchName) {
	    for(int i=0; i<friendsCount; i++) {
	    	if(myFriends[i].name.equals(searchName)) {
	            return myFriends[i];
	         }
	      }
	    return null;
	   }
	   
	 // Main method:
	public static void main(String args[]) {
		
		// Create a ContactsManager object
		ContactsManager myContactsManager = new ContactsManager();
		
		// Create Contact objects for friends
		
		Contact f1 = new Contact();
		
		f1.name = "Alan";
		f1.email = "alan@gmail.com";
		f1.phoneNumber = "01";
		
		Contact f2 = new Contact();
		
		f2.name = "Bob";
		f2.email = "bob@gmail.com";
		f2.phoneNumber = "02";
		
		Contact f3 = new Contact();
		
		f3.name = "Jaime";
		f3.email = "jaime@gmail.com";
		f3.phoneNumber = "03";
		
		// Add the contacts
		myContactsManager.addContact(f1);
		myContactsManager.addContact(f2);
		
		// Search for a contact
		Contact output = myContactsManager.searchContact("Alan");
		
		System.out.printf("%s %s\n", output.email, output.phoneNumber);
		
	}
	   	
	   
	   
	   

}
