
package poly.ex2;
public class AnimalSoundMain2 {
    public static void main(String[] args) {

        //        Animal[] animalArr = {dog, cat, caw};
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};
        
        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
