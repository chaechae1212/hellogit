import java.util.List;
import java.util.ArrayList;

public class ex03_List {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();
        //map은 Map<String,Member> map = new HashMap<String,Member>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(60);
        numberList.add(70);
        numberList.add(80);
        numberList.add(90);

        int count = numberList.size();
        System.out.println("데이터 크기:"+count);

        int value = numberList.get(4);
        System.out.println("4번째 요소의 값:"+value);

        numberList.remove(4);

        count = numberList.size();
        System.out.println("데이터 크기: "+count);
        
        value=numberList.get(4);
        System.out.println("4번째 요소의 값:"+value); 

        numberList.add(4,123);
        value = numberList.get(4);
        System.out.println("데이터 크기:"+count);

        for(int i=0;i<numberList.size();i++){
            Integer number = numberList.get(i); //제너릭으로 선언한 클래스는 객체로로
            System.out.printf("%d번째 데이터>>%d\n",i,number);
        }
        numberList.clear();
        count=numberList.size();
        System.out.println("데이터 크기:"+count);
       
    }
    
}
