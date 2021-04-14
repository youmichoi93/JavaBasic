public class VanExam {

    public static void main(String[] args){
        Car c = new Van(); //암묵적형변환, 자식을 부모에게 담음.
        c.run();
        // c.bang(); //(1)오류발생 , 형변환 후 부모클래스의 메소드만 사용가능.
        Van van = (Van)c; //(2)강제형변환.
        van.bang();//(3)자식메소드, 부모메소드 정상 작동
        van.run();
        
        //강제형변환정리: 클래스끼리도 형변환가능. 이유: 부모가 자식을 가리킬 수 있으나 부모가 가리키고 있을 때는 부모가 알고 있는 메서드까지만 접근할 수 있기 때문. 따라서 형변환으로 객체가 가진 모든 부분을 사용.




//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ//

        // Van van = new Van();
        // van.run();

        //오버라이딩:car를 상속받은 van의 객체 생성후 함수를 호출했을때 car에서 가져왔고, 두번째로 van에 같은 함수를 입력했을때 자식인 van의 함수를 실행함.
       // 오버라이딩 해도 부모 클래스의 메서드는 사라지지 않음, 다만, 자식 클래스에서 super로 불러줘야함
    }
    
}
