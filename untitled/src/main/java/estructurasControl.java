public class estructurasControl {

//switch
    public static void main(String[] args) {

        String productType = "alcohol";

        switch (productType) {
            case "salud":
                System.out.println("el impuesto es de 5%");
                break;
            case "belleza":
                System.out.println("el impuesto es de 10%");
                break;
            case "alcohol":
                System.out.println("el impuesto es de 20%");
                break;
                default:
                    System.out.println("el tipo de producto es desconocido");
        }
    }
}
