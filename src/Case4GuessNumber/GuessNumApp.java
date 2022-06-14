package Case4GuessNumber;

import java.util.Scanner;

public class GuessNumApp {
    public static void main(String[] args) {
        int totaltime = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("=========猜数字游戏=========");
        System.out.println("请输入大于0的起始数字");
        int start = in.nextInt();
        if (start < 0) {
            System.out.println("非法范围");
        }
        System.out.println("请输入结束数字");
        int end = in.nextInt();
        if (start > end) {
            System.out.println("非法范围");
        }
        double ramdom=Math.random();
        int num = (int) ((end -start)*ramdom + start);
        int guessleft = totaltime-1;
        boolean gameastart = true;
        boolean guesscorrect = false;
        System.out.println("猜数字游戏正式开始，你共有" + totaltime + "次机会");
        GuessNum G =new GuessNum();
        while (true) {
            int guess = in.nextInt();
            if (guess == -1) {
                System.out.println("游戏停止");
                break;
            }
                if (guess <= start || guess >= end) {
                    System.out.println("非法数据范围,请核对");
                    continue;
                }
                if (gameastart) {
                    gameastart = false;
                }
                if(guessleft>=0){
                    System.out.println("剩余"+(guessleft)+"次");

                    if(guesscorrect!=true){
                        guesscorrect=G.guessNum(guess,num,guesscorrect);
                       // guess = in.nextInt();
                        guessleft--;
                    }
                   else break;
                }
                if(guessleft+1==0&&guesscorrect==false){
                    System.out.println("本次生成的数字为"+num+"很可惜");
                    break;
                }

            }

        System.out.println("共进行了"+(totaltime-guessleft-1)+"次");
    }
}
