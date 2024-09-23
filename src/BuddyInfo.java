public class BuddyInfo {
    public String name;
    public String adress;
    public int num;
    public String getName() {
        return name;
    }

    public BuddyInfo(int num, String name , String adress) {
        this.num = num;
        this.name = name;
        this.adress = adress;
    }
    public BuddyInfo() {
        name = "steve";
        adress = "430 godstone";
        num = 6708 ;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
