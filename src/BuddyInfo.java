public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo () {
        this.name = "Default Name";
        this.address = "Default Address";
        this.phoneNumber = 0;
    }
    public BuddyInfo(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.phoneNumber = number;
    }

    public BuddyInfo(String name, String address) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Budder", "My Moms Street", 613777898);
        System.out.println(buddy.getName() + " Hello world! ");
    }

    public String getName() {
        return name;
    }
}