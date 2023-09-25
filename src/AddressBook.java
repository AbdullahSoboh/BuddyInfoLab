import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buds;

    public AddressBook() {
        this.buds = new ArrayList<>();
    }

    public void addBud(BuddyInfo bud) {
        if (bud != null) {
            buds.add(bud);
        }
    }

    public void testMethod(){

    }

    public boolean removeBuddy(BuddyInfo bud) {
        return buds.remove(bud);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBud(buddy);
        addressBook.removeBuddy(buddy);
    }
}
