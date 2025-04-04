import java.util.List;
import java.util.ArrayList;

public class ex04_List주소록 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<Member>();

        list.add(new Member("철수","010-2234-1324"));
        list.add(new Member("수현","010-2344-6775"));
        list.add(new Member("석훈","010-5677-3453"));
        list.add(new Member("민영","010-2343-1345"));
        list.add(new Member("호영","010-8797-6877"));

        for(int i=0;i<list.size();i++){
            Member item=list.get(i);
            System.out.println(item.toString());
        }
    }
    
}
