public class Questao2 {


    public static String metodo(String[] palavras){
        String resultado = "";
        for(int i = 0;i < palavras.length;i++){
            resultado += palavras[i].trim() + " ";    
        };
        return resultado;    
    }
    public static void main(String[] args) throws Exception {
        String[] palavras = {"CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"};
        System.out.println(metodo(palavras));    
    }
}
