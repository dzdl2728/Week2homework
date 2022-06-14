package Case4GuessNumber;

public class GuessNum {

    public boolean guessNum(int guess,int num,boolean guesscorrect){
        if(guess >num){
            System.out.println("大了");
            return false;
        }
        else if(guess < num){
            System.out.println("小了");
            return false;
        }
        else System.out.println("答对了");
        return true;
    }




}
