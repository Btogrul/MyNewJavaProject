package Archive.dersler.thirteen_to_20.L15.CardGame;

public class Card {
    String[] card_types = {"♥","♦","♣","♠"};

    String[] cards ={"Ace","Jack","Queen", "King" };


    int total_score;


    int point;


    int cards_inner= (int) (Math.random() * 10) + 2;
    int cards_inner_1= (int) (Math.random() * 10) + 2;
    int cards_inner_2= (int) (Math.random() * 10) + 2;


    int randomize= (int) (Math.random() * 3);
    int randomize_1 = (int) (Math.random() * 3);
    int randomize_2 = (int) (Math.random() * 3);
    int randomize_3 = (int) (Math.random() * 3);
    int randomize_4 = (int) (Math.random() * 3);
    int randomize_5 = (int) (Math.random() * 3);

    public String card_call(){
        if(cards[randomize_3].equals("Ace")){
            point = 11;
        } else {
            point =10;
        }



        if (card_types[randomize].equals(card_types[randomize_1])){

            total_score =  cards_inner + cards_inner_1;

        } else if (card_types[randomize].equals(card_types[randomize_2])){

            total_score = cards_inner + point;

        } else if (card_types[randomize_1].equals(card_types[randomize_2])) {
            total_score= cards_inner_1 + point;
        } else{

            if (cards_inner> cards_inner_1 && cards_inner> point){
                total_score = cards_inner;
            } else if (cards_inner< cards_inner_1 && cards_inner_1> point) {
                total_score = cards_inner_1;
            }else{
               total_score = point;
            }

        }



        return "Kartlar : || " + card_types[randomize]  + cards_inner +
                " " +  card_types[randomize_1]  + cards_inner_1 +
                " " + card_types[randomize_2 ]  +  cards[randomize_3] + " || \n Toplam xalın - > " + total_score
        ;





    }

    public String card_call_2(){

        if(cards[randomize_4].equals("Ace") || cards[randomize_1].equals("Ace") || cards[randomize_3].equals("Ace") ){
            point = 11;
        } else {
            point =10;
        }



        if (card_types[randomize].equals(card_types[randomize_2]) ||
                card_types[randomize_2].equals(card_types[randomize_5])||
                card_types[randomize].equals(card_types[randomize_5])){


            if (cards[randomize_1].equals("Ace") &&
                    cards[randomize_4].equals("Ace") &&
                    cards[randomize_3].equals("Ace") ){

                total_score= 33;

            }else {
                total_score =  point+point;
            }

        } else{

            total_score=point;


        }

        return "Kartlar : || " + card_types[randomize] +  cards[randomize_1] + " "
                + card_types[randomize_2]  +  cards[randomize_4] + " "
                + card_types[randomize_5]  +  cards[randomize_3]  + " || \n Toplam xalın - > " + total_score
        ;

    }

    public String card_call_3(){


        if (card_types[randomize_1].equals(card_types[randomize_2])){

            total_score =  cards_inner_2 + cards_inner_1;

        } else if (card_types[randomize_1].equals(card_types[randomize_3])){

            total_score = cards_inner + cards_inner_2;

        } else if (card_types[randomize_2].equals(card_types[randomize_3])) {

            total_score= cards_inner_1 + cards_inner;
        }  else{


            if (cards_inner> cards_inner_1 && cards_inner> point){
                total_score = cards_inner;
            } else if (cards_inner< cards_inner_1 && cards_inner_1> point) {
                total_score = cards_inner_1;
            }else{

                if (cards_inner_2> cards_inner_1 && cards_inner_2> cards_inner){
                    total_score = cards_inner_2;
                } else if (cards_inner_2< cards_inner_1 && cards_inner_1> cards_inner) {
                    total_score = cards_inner_1;
                } else if (cards_inner_2 == 6 && cards_inner_1 ==6 && cards_inner == 6) {
                    total_score= 36;
                } else{
                    total_score = cards_inner;
                }
            }

        }


        return  "Kartlar : || " + card_types[randomize_1] +  cards_inner_2 + " "
                + card_types[randomize_2]  +  cards_inner_1 + " "
                + card_types[randomize_3]  +  cards_inner  + " || \n Toplam xalın - > " + total_score
        ;

    }





}
