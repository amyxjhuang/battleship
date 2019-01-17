public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;
        int startLoc = (int)(Math.random() * 5); //generates random int between 0 and 4
        int[] loc = {startLoc, startLoc+1, startLoc +2};
        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocationCells(loc);

        while (dot.isAlive == true){
            String guess = helper.getUserInput("enter a number ");
            dot.checkYourself(guess);
            numOfGuesses++;
        }
        System.out.println("You took " + numOfGuesses + " guesses");
    }
}