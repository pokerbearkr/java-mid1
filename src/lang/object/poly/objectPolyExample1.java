package lang.object.poly;

public class objectPolyExample1 {
    public static void main(String[] args) {
        dog dog = new dog();
        car car = new car();

        action(dog);
        action(car);
    }
    private static void action(Object obj){
        //obj.sound(); //컴파일 오류 Object에는 sound가 없음
        //객체에 맞는 다운캐스팅이 필요

        if (obj instanceof dog dog){
            dog.sound();
        } else if(obj instanceof car car){
            car.move();
        }
    }
}
