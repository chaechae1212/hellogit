package kr.hossam.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
    private static FileHelper current =null;
    public static FileHelper getInstance(){
        if (current == null){
            current = new FileHelper();
        }
        return current;
    }
    public static void freeInstance(){
        current = null;
    }
    private FileHelper(){
        super();
    }
    public void write(String filePath, byte[] data) throws Exception{
        OutputStream os = null;
        try {
            os = new FileOutputStream(filePath); //파일 출력 스트림 생성
            os.write(data); // 바이트 배열을 파일에 씀 
        } catch (FileNotFoundException e) { //파일을 찾을 수 없을 때 
            e.printStackTrace();
            throw e;
        }catch (IOException e) { //입출력 중 문제 발생 
            e.printStackTrace();
            throw e;
        }catch(Exception e){ //위에서 처리하지 못한 나머지 모든 예외 
            e.printStackTrace();
            throw e;
        }finally{
            if(os!=null){ //비어있지 않았다면 
                try{
                    os.close();  //닫기 
                }catch(IOException e){
                    e.printStackTrace();
                }
            } }
        
        }
    public byte[] read(String filePath) throws Exception{
        byte[] data =null;
        InputStream is=null;
         try {
            //파일 입력 스트림 생성(파일 열기기)
            is = new FileInputStream(filePath);
            //읽어올 수 있는 바이트 수 만큼 배열 생성 
            data = new byte[is.available()];
            //파일 내용을 버퍼에 읽어오기기
            is.read(data);
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
        return data;
        
    }
    public void writeString(String filePath,String content) throws Exception{
        try {
            this.write(filePath,content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw e;
            // TODO: handle exception
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }

        public String readString(String filePath) throws Exception{
            String content = null;
            try{
                byte[] data = read(filePath);
                content = new String(data,"utf-8");
            }catch(Exception e){
                e.printStackTrace();
                throw e;
                        }
            return content;
            

        }

    }

   


