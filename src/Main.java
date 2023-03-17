public class Main {
    public static void main(String[] args) {
        System.out.println(Dice.sidesOfDice);

        Dice myFistDice = new Dice();
        Dice mySecondDice = new Dice();



        System.out.println();

        for (int i = 0; i<10; i++){
            System.out.println("First Dice: " + myFistDice.roll());
            System.out.println("Second Dice: " + mySecondDice.roll());
        }

        System.out.println();

        System.out.println("1st Face: " + myFistDice.getFaceValue());
        System.out.println("Other face: " + mySecondDice.getFaceValue());
    }


}