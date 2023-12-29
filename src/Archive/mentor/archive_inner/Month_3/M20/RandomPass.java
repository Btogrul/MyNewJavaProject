package Archive.mentor.archive_inner.Month_3.M20;

public class RandomPass {
    int pass_num;
    String pass_char;
    StringBuilder full_pass;
    String[] my_chars;

    public void pass_generator() {
        full_pass = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int range_3 = (int) (Math.random() * 3);
            switch (range_3) {
                case 0 -> {
                    pass_num = (int) (Math.random() * 8 + 1);
                    full_pass.append(pass_num);
                }
                case 1 -> {
                    my_chars = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                    pass_char = my_chars[(int) (Math.random() * 26)];
                    full_pass.append(pass_char);
                }
                case 2 -> {
                    my_chars = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                    pass_char = my_chars[(int) (Math.random() * 26)];
                    full_pass.append(pass_char);
                }
                default -> throw new IllegalStateException("xetamiz var :  " + range_3);
            }
        }

        System.out.println("full pass " + full_pass);
    }
}