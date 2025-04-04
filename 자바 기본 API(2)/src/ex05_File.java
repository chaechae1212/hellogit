import java.io.File;

public class ex05_File {
    //절대경로는 C:/ 상대경로는 ..
    public static void main(String[] args) {
        File f1=new File("./test.txt");
        //전달된 경로가 파일인지 검사 -->존재 하지 않을 시는 무조건 false
        boolean is_file = f1.isFile();
        System.out.println("isFile="+is_file);
        //전달된 경로가 디렉토리인지 검사 -->존재 하지 않는 디렉토리일시 false
        boolean is_dir = f1.isDirectory();
        System.out.println("isDirectory="+is_dir);
        //전달된 경로가 숨김형태인지 검사 --> 존재 하지 않는 파일 시는 false
        boolean is_hidden = f1.isHidden();
        System.out.println("isHidden="+is_hidden);
        //절대 경로 값을 추출출
        String abs = f1.getAbsolutePath();
        System.out.println("절대경로:"+abs);
        //생성자에 전달된 파일이나 디렉토리가 물리적으로 존재하는지를 검사사
        boolean is_exist = f1.exists();
        System.out.println("존재여부:"+is_exist);
    }
    
}
