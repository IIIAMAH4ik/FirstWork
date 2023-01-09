import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String ticketPrc = reader.readLine();

        int ticket = Integer.parseInt(ticketPrc);
        int miles = ticket / 20;

        System.out.println("Кол-во милей - " + miles);

    }
}