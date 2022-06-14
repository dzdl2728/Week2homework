package Case3AI;

import java.util.Scanner;

public class AIapp {
    public static void main(String[] args) {
        AI ai=new AI();
        Scanner in =new Scanner(System.in);
        while(true){
            String input = in.next();
            if("exit".equals(in)){
                System.out.println("GoodBye!!!!");
                break;
            }
           String ans = ai.ans(input);
            System.out.println(ans);
        }
    }
}
