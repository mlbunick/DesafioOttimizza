import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {


    public static String metodo(String dataString){
        String[] formatos = {"ddMMyyyy", "MMddyyyy", "yyyy MM dd", "dd/MM/yyyy", "dd MM yyyy"};
        LocalDate data = null;

        for (String formato : formatos) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
                data = LocalDate.parse(dataString, formatter);
                break;
            } catch (Exception e) {
                
            }
        }
        
        return Integer.toString(data.getYear()) + " " + String.format("%02d",data.getMonthValue());
    }
    public static void main(String[] args) throws Exception {
        System.out.println(metodo("2018 05 01"));
        System.out.println(metodo("01/05/2018"));
        System.out.println(metodo("01 05 2018"));
        System.out.println(metodo("01052018"));
    }
}
