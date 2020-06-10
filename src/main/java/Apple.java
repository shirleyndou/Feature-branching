public class Apple {

    static int bites =0;

    public void takeBite(){
        bites++;
    }

    public static void main(String[] args) {
        Apple macintosh = new Apple();
        Apple grannySmith = new Apple();

        macintosh.takeBite();
        grannySmith.takeBite();

        System.out.println("The macintosh apple has " + macintosh.bites + " bites out of it");
        System.out.println("The GRanny Smithh apple has " + grannySmith.bites + " bites out of it");
    }
}
