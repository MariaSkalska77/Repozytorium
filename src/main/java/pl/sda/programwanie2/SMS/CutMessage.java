package pl.sda.programwanie2.SMS;


import java.util.Scanner;

public class CutMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sms = scanner.nextLine();

        String [] cuttedsms = null;
        cuttedsms =sms.split(" ");

        for (int i = 0; i< cuttedsms.length; i++){
            if(!sms.isEmpty()){
            cuttedsms[i].substring(0);
            cuttedsms[i].toUpperCase();
            System.out.print(cuttedsms[i].substring(0,1).toUpperCase() + cuttedsms [i].toLowerCase().substring(1));
        }}
       int parsedsms = sms.length();
        System.out.println("Dlugosc sms: " + parsedsms);

        if (parsedsms <= 160){
            System.out.println("1 sms - 1,5zl");
        }
        if(parsedsms > 160 && parsedsms < 320){
            System.out.println("Zaplacisz za dwa sms - 3zl");

        }

    }

}
