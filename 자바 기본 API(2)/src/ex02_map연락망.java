import java.util.Map;
import java.util.HashMap;

public class ex02_map연락망 {
    public static void main(String[] args) {
        Map<String,Member> map = new HashMap<String,Member>();

        Member mem1=new Member("010-1234-5667","naver.com");
        map.put("철수",mem1);
        // 이름이 key       new부터 뒤에가 value 값
        map.put("수현",new Member("010-2324-5646","kakao.com"));
        map.put("석훈",new Member("010-2525-5675","gmail.com"));
        map.put("민영",new Member("010-2899-5607","hanmail.com"));
        map.put("호영",new Member("010-1345-7675","icloud.com"));

        Member output=map.get("호영");
        System.out.println(output.toString());
    }
    
}
