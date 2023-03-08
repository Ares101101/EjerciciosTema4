public class Main {
    public static void main(String[] args) {
        int numerolf = 0;

        if (numerolf > 0) {
            System.out.println("es positivo");
        } else {System.out.println("es negativo");}

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);


        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        };



        for (int numeroFor = 0; numeroFor<=3;numeroFor++ ){
            System.out.println(numeroFor);
        }

        var  estacion = "VERANO";
        switch (estacion){
            case  "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
            case "PRIMAVERA":
                System.out.println("PRIMAVERA");
            case "INVIERNO":
                System.out.println("INVIERNO");
            default:System.out.println("NO ES UNA ESTACION");
        }
    }
}