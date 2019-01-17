public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    boolean isAlive = true;


    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); //convert user guess to an int
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
            isAlive = false;
        }
        System.out.println(result);
        return result;

    }

}