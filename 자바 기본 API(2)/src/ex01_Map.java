import java.util.Map;
import java.util.HashMap;

public class ex01_Map {
    // <key,value>형식으로 명시 하는 것이 제너릭이라고 함
    //안에 있는 자료형를 사용하고 싶으면 WrapperClass로 선언언
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<String,Integer>();
        map.put("나이",21); //나이 21 이 들어감감
        map.put("키",175);
        map.put("몸무게",80);

        System.out.printf("저장된 데이터의 수: %d\n",map.size());

        System.out.printf("AGE: %d\n",map.get("나이")); //key나이에 있는 value 값 가져오기기
        System.out.printf("HEIGHT: %d\n",map.get("키"));
        System.out.printf("WEIGHT: %d\n",map.get("몸무게"));
    }
    
}
