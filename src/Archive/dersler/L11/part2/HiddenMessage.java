package Archive.dersler.L11.part2;

public class HiddenMessage {
    String hidden = "JAVAISFUN";


    public void forFun(int hiddenKey){
        if (hiddenKey >= 0 && hiddenKey < hidden.length()) {
            char character = hidden.charAt(hiddenKey);
            System.out.println("Qeyd olunan açar altında gizli hərif " + hiddenKey + ": " + character);
        } else {
            System.out.println("Qeyd olunan reqem qeyd olunan intervarla olmalıdır: 0 və " + (hidden.length() - 1));
        }
    }

}
