public class switchBetweenString {
    public static void main(String[] args) {
       String to="alex",from="cairo";

       String temp="";

        temp = to;
        to=from;
        from=temp;


        System.out.println("****************");
        System.out.println(to+" <> "+from);
    }
}
