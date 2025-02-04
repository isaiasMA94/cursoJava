public class bucles {
//no conocemos el numero de veces que se ejecutara algo
    public static void main(String[] args) {

        double vehicleSpeed = 0.0;
        double speedLimit = 100.0;

        while(vehicleSpeed < speedLimit) {
            vehicleSpeed += 12.5;
            System.out.println("the speed of the vehicle is :"+vehicleSpeed);
        }
    }

}
