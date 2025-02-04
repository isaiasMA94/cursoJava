public class Funciones {
    /*private funcion que se puede usar solo en esta clase, protected se puede usar en varias clases
    funcion VOID no devuelve nada
     */
    public static void main(String[] args) {

        String isaiasInfromation = buildPersonInformation("isaias", 30);
        String miguelInformation = buildPersonInformation("miguel", 20);
        System.out.println(isaiasInfromation);
        System.out.println(miguelInformation);
    }

//determinar nombre correcto de la fucnión. Se ingresa dos datos de personas en una sola función.

    public static String buildPersonInformation(String personName, int personAge) {
        return "hola estoy imprimiendo una funcion y me llamo: " + personName + " y tengo " + personAge + " años ";
    }
}
