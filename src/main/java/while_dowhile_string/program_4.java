package while_dowhile_string;
//4. 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression.
public class program_4 {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        //System.out.println(str);
        double sharee_quantity=Double.parseDouble(arr[0]);
        double sharee_price=Double.parseDouble(arr[1]);
        double shirt_quantity=Double.parseDouble(arr[2]);
        double shirt_price=Double.parseDouble(arr[3]);
        double pant_quantity=Double.parseDouble(arr[4]);
        double pant_price=Double.parseDouble(arr[5]);
        double total_quantity=sharee_quantity+shirt_quantity+pant_quantity;
        double total_price=(sharee_quantity*sharee_price)+(shirt_quantity*shirt_price)+(pant_quantity*pant_price);
        System.out.println("Total price "+total_price +" Tk " +"and Total quantity "+  total_quantity);

    }
}
