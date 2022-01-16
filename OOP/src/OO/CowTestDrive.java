package OO;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow1 = new Cow("beef",129,"male","Brown");
        cow1.name();
        cow1.canNang();
        cow1.giong();
        cow1.mau();
        Cow cow2 = new Cow("Dairy cow",128,"female", "Black");
        cow2.name();
        cow2.canNang();
        cow2.giong();
        cow2.mau();
        
    }
}
