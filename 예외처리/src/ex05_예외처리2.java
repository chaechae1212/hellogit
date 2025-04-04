import java.util.Scanner;

public class ex05_예외처리2 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);

        System.out.print("x를 입력하세요:");
        int x =reader.nextInt();

        System.out.print("y를 입력하세요:");
        int y =reader.nextInt();

        reader.close();
        
        Calc c=Calc.getInstance();

        int z= c.divide(x,y);
        System.out.printf("[divide] %d 나누기 %d는 %d입니다.\n",x,y,z);
        System.out.println("----------");

        int a=0;

        try{
            a=c.divideEx(x,y);
        }catch(Exception e){
            System.out.println("[divide 에러] 0으로 나눌 수 없습니다.");
        }
        System.out.printf("[divideEx] %d 나누기 %d는 %d 입니다.\n",x,y,a);


    }
    
}
