public class Main {
    public static void main(String[] args) {
        int numerolf = 25;
        if (numerolf > 0 || numerolf < 0 || numerolf == 0);

        int numeroWhile = 0;
        // WHILE
        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        };
        // DO WHILE
        do {
            System.out.println(numeroWhile);
        } while(numeroWhile < 0);

        //FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        // SWITCH
        var estacion = "Otoño";

        switch(estacion) {
            case "Otoño":
                System.out.println("es otoño");
                break;
            case "Invierno":
                System.out.println("es invierno");
                break;
            case "Primavera":
                System.out.println("es primavera");
                break;
            case "Verano":
                System.out.println("es verano");
                break;
            default:
                System.out.println("el valor no es ninguna estación");

        }
    }


}
