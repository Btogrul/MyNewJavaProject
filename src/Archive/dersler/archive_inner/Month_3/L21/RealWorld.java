package Archive.dersler.archive_inner.Month_3.L21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RealWorld {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String user_answer;
        Boolean play =false;
        int counter= 0;
        int score =0;
        System.out.println("Real - World oyununa xosh geldiniz !");
        HashMap<String,Integer> r_w = new HashMap<>();

        System.out.println("""
                    0-6 arası intervalında yerləşən rəqəmlərdən 
                    istifadə edərək hansı əməliyyatları etsək, yəni 
                    (* / - +) istifadə edərək
                    bizə nəticə olaraq 4 verər ?
                    
                    misal olaraq: 2*3-2
                    Qeyd: bitişik yazın
                    
                    başlayaq? he/yox
                    """
        );
        String player_ready = sc.nextLine();
        if (player_ready.equals("he")){
            play = true;
        }

        r_w.put("2*3-2",123);
        while(play){
            System.out.println("stop deyərək bitir.");
            System.out.println("bashladiq! yaza bilersiz artiq : ");
            user_answer = sc.next();

            if (user_answer.equals("stop")){
                play =false;
            }else {
                if(user_answer.equals("2*3-2")){
                    System.out.println("Onu men qeyd etmishdim, bashqasini qeyd et");
                    break;
                } else if (!r_w.containsKey(user_answer)) {
                    score++;
                    System.out.println("Təbriklər ! xalın -> " + score);
                    r_w.put(user_answer,counter);
                } else if (r_w.containsKey(user_answer)) {
                    score--;
                    System.out.println("onu artiq elave etmishdin " + score);
                    break;
                }else{
                    System.out.println("buralari yazmamisham");
                    play=false;
                }
            }
            
            counter++;

        }

        System.out.println("Netice olaraq");
        for (Map.Entry<String, Integer> x : r_w.entrySet()) {
            System.out.println(x.getKey() + "   :   " + x.getValue());
        }


    }
}
