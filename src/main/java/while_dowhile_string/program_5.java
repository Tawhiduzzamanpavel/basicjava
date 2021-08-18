package while_dowhile_string;
//5. <html>
//<body>
//<div>
//<p>Transaction Successful</p>
//<p>Trnx ID: TXN5164870</p>
//</div>
//
//
//</body>
//</html>
//
//
//Extract only transaction ID from the HTML
public class program_5 {
    public static void main(String[] args) {
        String html ="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        System.out.println(html.substring(53,72));
        System.out.println("Only Transaction ID = " +html.substring(62,72));

    }
}
