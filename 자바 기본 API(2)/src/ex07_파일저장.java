import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class ex07_파일저장 {
    public static void main(String[] args) {
        String filepath="./test.txt"; //저장한 파일 경로 
        String content = "안녕하세요. 자바"; //파일에 저장할 내용 
       
        byte[]buffer=null;//저장할 내용을 스트림(byte 배열 -->이진수모음)으로 변환 
        try {
            buffer = content.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) { //UTF-8이 지원안하면 예외 
            e.printStackTrace();
        }
        
        OutputStream os = null;
        try {
            os = new FileOutputStream(filepath); //파일 출력 스트림 생성
            os.write(buffer); // 바이트 배열을 파일에 씀 
        } catch (FileNotFoundException e) { //파일을 찾을 수 없을 때 
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("-------------");
          
        }catch (IOException e) { //입출력 중 문제 발생 
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("-------------");
        }catch(Exception e){ //위에서 처리하지 못한 나머지 모든 예외 
            System.err.println("[ERROR]"+e.getMessage());
            System.err.println("-------------");
        }finally{
            if(os!=null){ //비어있지 않았다면 
                try{
                    os.close();  //닫기 
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
