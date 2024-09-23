import java.sql.Array;
import java.util.ArrayList;

public class AdressBook {

    private ArrayList<BuddyInfo> myBuddies;
    public AdressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if ( aBuddy !=  null){
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main (String[] args){
        BuddyInfo buddy = new BuddyInfo(613,"Tom",  "Carleton");
        AdressBook adressBook = new AdressBook();
        adressBook.addBuddy(buddy);
        adressBook.removeBuddy(0 );
    }
}
