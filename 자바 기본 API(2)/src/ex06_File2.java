import java.io.File;

public class ex06_File2 {
    public static void main(String[] args) {
        //디렉토리 정보 객체 생성
        File f2 = new File("a/b/c/target");
        //파일 여부 검사
        System.out.println("isFile: "+f2.isFile());
        //디렉토리 여부 검사 
        System.out.println("isDirectory: "+f2.isDirectory());
        //숨겨져 있는지 확인 
        System.out.println("isHidden: "+f2.isHidden());
        //절대 경로 출력 
        System.out.println("절대경로: "+f2.getAbsolutePath());
        //파일인 디렉토리가 존재하는지 검사사
        System.out.println("존재여부: "+f2.exists());
        //파일 생성성
        f2.mkdirs();
        // 마지막 / 이후 단어를 리턴
        System.out.println(f2.getName());
        // 처음부터 마지막 / 직전까지 리턴
        System.out.println(f2.getParent());

        System.out.println("-----------");
    }
}
