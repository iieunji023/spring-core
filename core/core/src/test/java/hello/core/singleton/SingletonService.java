package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();    // 클래스 레벨에 올라가기 때문에 딱 하나만 존재함

    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new SingletonService(); 생성을 막기 위해
    // 싱글톤 생성자를 계속 생성하면 싱글톤을 쓰는 의미가 없기 때문
    private SingletonService() {
        
    }
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
