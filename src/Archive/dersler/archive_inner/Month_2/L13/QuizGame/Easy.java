package Archive.dersler.archive_inner.Month_2.L13.QuizGame;

public class Easy extends Questions {


    String new_easy_question_1 = questionText = "Ərazisinə görə ən böyük ölkə hansıdır ? ";
    String [] new_easy_question_choices_1 = choices = new String[]{"a) Vyetnam", " b) Çin", "c) Russia", "d) USA"};
    int new_easy_question_answer_1 = correctAnswerIndex = 2;

//    --------------------- sual bitdi ----------------------------
    String new_easy_question_2 = questionText = "Afrikada ən böyük gölün adı nədir ? ";
    String [] new_easy_question_choices_2 = choices = new String[]{"a) Ağnohur gölü", "b) Nyasa gölü", "c) Tanqanika gölü", "d) Viktoriya gölü"};
    int new_easy_question_answer_2 = correctAnswerIndex = 3;

    //Qeyd : Tanqanika gölü ən dərin göldür amma Viktoriya ən böyükdür

//    --------------------- sual bitdi ----------------------------

    String new_easy_question_3 = questionText = "Yer kürəsində ən uzun çay hansıdır ? ";
    String [] new_easy_question_choices_3 = choices = new String[]{"a) Amazonka çayı", "b) Şirin çay", "c) Qəbələ çayı", "d) Xuanxe çayı"};
    int new_easy_question_answer_3 = correctAnswerIndex = 0;



//    --------------------- sual bitdi ----------------------------


    public void showQuestion(){
        int ran_number = (int)Math.random()*3;

        switch (ran_number){
            case 0:
                System.out.println(new_easy_question_1);
                System.out.println();
                for (String choice : new_easy_question_choices_1) {
                    System.out.print(choice + "    ");
                }

                break;
            case 1:
                System.out.println(new_easy_question_2);
                System.out.println();
                for (String choice : new_easy_question_choices_2) {
                    System.out.println(choice);
                }
                break;
            case 2:
                System.out.println(new_easy_question_3);
                System.out.println();
                for (String choice : new_easy_question_choices_3) {
                    System.out.println(choice);
                }
                break;
            default:
                System.out.println(" woops >_<  sual yoxdur !!! ");
        }

    }





}
