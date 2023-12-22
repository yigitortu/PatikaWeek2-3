
public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Jason", 10, 120, 100, 0, 50);
        Fighter f2 = new Fighter("Alex", 20, 85, 85, 0,50);

        Match match = new Match(f1, f2, 85, 100);


        match.run();


    }
}