public class ex06_사용자정의예외 {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("헬로월드");

        try{
            s.setKor(-123);
        }catch(MyKorException e){
            System.err.println("[MyKorException] >>"+e.getMessage());
        }
        try{
            s.setKor(123);
        }catch(MyKorException e){
            System.err.println("[MyKorException] >>"+e.getMessage());
        }try{
            s.setMath(-1);
        }catch(MyMathException e){
            System.err.println("[MyMathException] >>"+e.getMessage());
        } try{
            s.setMath(101);
        }catch(MyMathException e){
            System.err.println("[MyMathException] >>"+e.getMessage());
        }
        System.out.println(s.toString());
    }
    
}
