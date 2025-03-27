package enumExamples;

public class Main {
    enum Weeks{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // every member is public, static and final
        // since every member is final i can not create child of it
    }

    public static void main(String[] args) {
        Weeks week;
        week = Weeks.Monday;
//        for(Weeks day : Weeks.values()){
//            System.out.println(day);
//        }
        System.out.println(week);
    }
}
