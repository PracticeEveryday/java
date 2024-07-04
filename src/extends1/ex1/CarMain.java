package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        /**
         * 전기차와 가솔린차는 상위에 `자동차`라는 추상적인 개념이 존재한다.
         * 자동차는 Move << 움직인다는 공통된 기능이 존재한다!!
         */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
