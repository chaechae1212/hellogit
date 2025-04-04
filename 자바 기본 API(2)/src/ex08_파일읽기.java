import java.io.FileInputStream;// 파일을 바이트 단위로 읽기기
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class ex08_파일읽기 {
    public static void main(String[] args) {
        String filePath = "./test.txt";//읽어올 파일의 경로 저장장
        //파일 내용을 저장할 byte배열과 문자열 변수 선언언
        byte[] buffer = null;
        String content = null;
        //파일 입력 스트림 객체 선언언
        InputStream is =null;
        
        try {
            //파일 입력 스트림 생성(파일 열기기)
            is = new FileInputStream(filePath);
            //읽어올 수 있는 바이트 수 만큼 배열 생성 
            buffer = new byte[is.available()];
            //파일 내용을 버퍼에 읽어오기기
            is.read(buffer);
        } catch (FileNotFoundException e) {
            //파일 존재 x시에 실행행
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("------------");
            e.printStackTrace();
        } catch (IOException e) {
            //파일 읽기 중 오류 발생 시 실행행
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("------------");
            e.printStackTrace();
        }catch (Exception e){
            //그 외 모든 예외 처리리
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("------------");
            e.printStackTrace();
        } finally{
            //파일 열었다면 닫기기
            if(is!=null){
                try{
                    is.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        if(buffer!=null){
            //buffer가 null아닐 때만 문자열로 변환환
            try {
                content = new String(buffer,"utf-8"); //바이트 배열을 문자열로 변환 UTF-8인코딩으로 해석석
                System.out.println(content);
            } catch (UnsupportedEncodingException e) {
                //만약 UTF-8인코딩 지원 x시에 에러발생
                System.out.println("[ERROR] 인코딩 지정 에러");
                e.printStackTrace();
            }
        }
    }
    
}
