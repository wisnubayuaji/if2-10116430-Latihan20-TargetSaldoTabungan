import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        int saldo = 3500000;
        double bunga = 0.08;
        int saldoTarget = 6000000;
        int i = 1;

        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        while (saldo <= saldoTarget) {
            
            saldo = (int) (saldo + (saldo * bunga));

            kursIndo.setDecimalFormatSymbols(formatRp);

            System.out.println("Saldo di bulan ke-" + i + " " + kursIndo.format(saldo));

            i++;
        }
    }
}
