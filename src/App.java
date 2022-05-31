import java.util.*;

public class App {
    public static void main(String[] args) {

        int n = 1_000_000;  //number of iterations

        int[] count3 = {0, 0, 0, 0, 0, 0};
        int[] count4 = {0, 0, 0, 0, 0, 0};
        int[] count5 = {0, 0, 0, 0, 0, 0};

        Zar z1 = new Zar();
        Zar z2 = new Zar();
        Zar z3 = new Zar();
        Zar z4 = new Zar();
        Zar z5 = new Zar();

        int roll1;
        int roll2;
        int roll3;
        int roll4;
        int roll5;

        List<String> myDices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            myDices.clear();
            z1.rollDice(z1.getFaces());
            myDices.add(z1.get(0));
            z2.rollDice(z2.getFaces());
            myDices.add(z2.get(0));
            z3.rollDice(z3.getFaces());
            myDices.add(z3.get(0));
            z4.rollDice(z4.getFaces());
            myDices.add(z4.get(0));
            z5.rollDice(z5.getFaces());
            myDices.add(z5.get(0));
            myDices.sort(String::compareTo);
            roll1 = Integer.parseInt(myDices.get(0));
            roll2 = Integer.parseInt(myDices.get(1));
            roll3 = Integer.parseInt(myDices.get(2));
            roll4 = Integer.parseInt(myDices.get(3));
            roll5 = Integer.parseInt(myDices.get(4));

            if (roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5) {
                count5[roll3 - 1]++;
                continue;
            }
            if (roll1 == roll2 && roll2 == roll3 && roll3 == roll4) {
                count4[roll3 - 1]++;
                continue;
            }
            if (roll2 == roll3 && roll3 == roll4 && roll4 == roll5) {
                count4[roll3 - 1]++;
                continue;
            }
            if (roll1 == roll2 && roll2 == roll3 ||
                    roll2 == roll3 && roll3 == roll4 ||
                    roll3 == roll4 && roll4 == roll5) {
                count3[roll3 - 1]++;
            }

        }

        System.out.println("RESULTS for " + n + " iterations:");
        System.out.println("1 of 3 times : " + count3[0]);
        System.out.println("2 of 3 times : " + count3[1]);
        System.out.println("3 of 3 times : " + count3[2]);
        System.out.println("4 of 3 times : " + count3[3]);
        System.out.println("5 of 3 times : " + count3[4]);
        System.out.println("6 of 3 times : " + count3[5]);
        System.out.println("1 of 4 times : " + count4[0]);
        System.out.println("2 of 4 times : " + count4[1]);
        System.out.println("3 of 4 times : " + count4[2]);
        System.out.println("4 of 4 times : " + count4[3]);
        System.out.println("5 of 4 times : " + count4[4]);
        System.out.println("6 of 4 times : " + count4[5]);
        System.out.println("1 of 5 times : " + count5[0]);
        System.out.println("2 of 5 times : " + count5[1]);
        System.out.println("3 of 5 times : " + count5[2]);
        System.out.println("4 of 5 times : " + count5[3]);
        System.out.println("5 of 5 times : " + count5[4]);
        System.out.println("6 of 5 times : " + count5[5]);
    }

}
