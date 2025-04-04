import kr.hossam.helpers.FileHelper;
public class ex03_개안정보테스트 {
    public static void main(String[] args) {

        String name="한영채";
        String phone="010-1234-5678";
        String age="22";
        String height="160";
        String content="이름:"+name+"\n"+"연락처:"+phone+"\n"+"나이:"+age+"\n"+
        "키:"+height;
        
        String filePath="./info.txt";
        try {
            FileHelper.getInstance().writeString(filePath,content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String read = FileHelper.getInstance().readString(filePath);
            System.out.println(read);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
