package json_read_write;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) throws IOException, ParseException {

        System.out.println("1.Check balance");
        System.out.println("2.Withdraw balance");
        int a;
        //int b;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        switch(a){
            case 1:
                System.out.println("Enter your pin");
                int c =scanner.nextInt();
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(new FileReader("atm.json"));
                JSONObject jsobj = (JSONObject) obj;
                long b= (long) jsobj.get("pin");
                //System.out.println(b);


                if(c==b){
                    jsonParser = new JSONParser();
                    Object obj1 = jsonParser.parse(new FileReader("atm.json"));
                    JSONObject jsobj1 = (JSONObject) obj;
                    long amt= (long) jsobj.get("balance");
                    System.out.println("Your Balance is "+ amt+ "Tk");
                }
                else{
                    System.out.println("Wrong Pin Inserted, Please try again");
                    for(int i=1;i<4;i++){
                        c =scanner.nextInt();
                        if(c!=b){
                            System.out.println("Wrong Pin Inserted, Please try again");
                            if(i==3){
                                System.out.println("You have inserted wrong pin more then 3 times. Your card is blocked");
                            }
                        }
                        else if(c==b){
                            jsonParser = new JSONParser();
                            Object obj1 = jsonParser.parse(new FileReader("atm.json"));
                            JSONObject jsobj1 = (JSONObject) obj;
                            long amt= (long) jsobj.get("balance");
                            System.out.println("Your Balance is "+ amt+ "Tk");
                            break;
                        }



                    }
                }
                break;
            case 2 :

                boolean flag=true;
                System.out.println("Enter your pin");

                int d =scanner.nextInt();
                jsonParser = new JSONParser();
                Object obj1 = jsonParser.parse(new FileReader("atm.json"));
                JSONObject jsobj1 = (JSONObject) obj1;
                b= (long) jsobj1.get("pin");
                //System.out.println(b);
                if(d==b){
                    System.out.println("Input amount that is multiply by 500");
                    int amount = scanner.nextInt();
                    if(amount%500==0){
                        jsonParser = new JSONParser();
                        Object obj2 = jsonParser.parse(new FileReader("atm.json"));
                        JSONObject jsobj2 = (JSONObject) obj2;
                        long amt= (long) jsobj2.get("balance");
                        //System.out.println("Your Balance is "+ amt+ "Tk");
                        if(amount<=amt){
                            System.out.println("Withdraw Successful. Your Current balance is "+ (amt-amount)+ " Tk");
                            JSONObject jsobjadd = new JSONObject();
                            jsobjadd.put("balance",amt-amount);
                            jsobjadd.put("pin",12345);
                            FileWriter fw = new FileWriter("atm.json");
                            fw.write(jsobjadd.toJSONString());
                            fw.flush();
                            fw.close();
                        }
                        if(amount>amt){
                            System.out.println("Not enough balance. Please input valid amount.");

                        }
                    }
                    else{

                        System.out.println("Balance Is not multiply by 500. Please try another amount. ");


                    }
                }
                else{
                    System.out.println("Wrong Pin Inserted, Please try again");
                    for(int i=1;i<4;i++){
                        c =scanner.nextInt();
                        if(c!=b){
                            System.out.println("Wrong Pin Inserted, Please try again");
                            if(i==3){
                                System.out.println("You have inserted wrong pin more then 3 times. Your card is blocked");
                            }
                        }
                        else if(c==b){
                            System.out.println("Input amount that is multiply by 500");
                            int amount = scanner.nextInt();
                            if(amount%500==0){
                                jsonParser = new JSONParser();
                                Object obj2 = jsonParser.parse(new FileReader("atm.json"));
                                JSONObject jsobj2 = (JSONObject) obj2;
                                long amt= (long) jsobj2.get("balance");
                                if(amount<=amt){
                                    System.out.println("Withdraw Successful. Your Current balance is "+ (amt-amount)+ " Tk");
                                    JSONObject jsobjadd = new JSONObject();
                                    jsobjadd.put("balance",amt-amount);
                                    jsobjadd.put("pin",12345);
                                    FileWriter fw = new FileWriter("atm.json");
                                    fw.write(jsobjadd.toJSONString());
                                    fw.flush();
                                    fw.close();
                                    break;
                                }
                                if(amount>4000){
                                    System.out.println("Not enough balance. Please input valid amount.");

                                }
                            }
                            else{

                                System.out.println("Input amount that is multiply by 500.");

                                if(amount%500==0){
                                    jsonParser = new JSONParser();
                                    Object obj2 = jsonParser.parse(new FileReader("atm.json"));
                                    JSONObject jsobj2 = (JSONObject) obj2;
                                    long amt= (long) jsobj2.get("balance");
                                    if(amount<=amt){
                                        System.out.println("Withdraw Successful. Your Current balance is "+ (amt-amount)+ " Tk");
                                        JSONObject jsobjadd = new JSONObject();
                                        jsobjadd.put("balance",amt-amount);
                                        jsobjadd.put("pin",12345);
                                        FileWriter fw = new FileWriter("atm.json");
                                        fw.write(jsobjadd.toJSONString());
                                        fw.flush();
                                        fw.close();
                                        break;
                                    }

                                    if(amount>amt){
                                        System.out.println("Not enough balance. Please input valid amount.");

                                    }
                                }
                            }

                        }



                    }
                }
                break;
        }

    }
}
