public class Questao3 {


    public static int metodo(int[] numeros){
        Double numeroMaior = Double.NEGATIVE_INFINITY;
        for(double numero : numeros){
            if(numero > numeroMaior){
                numeroMaior = numero;
            }
        }
        
        return numeroMaior.intValue();

    }
    public static void main(String[] args) throws Exception {
        int[] numeros = {334, 555, 100000, 50100};
        System.out.println(metodo(numeros));    
    }
}
