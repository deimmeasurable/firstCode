package chapterFourteen;

import java.util.*;

public class minimumString {
    public static void main(String[] args) {
        solve(null, null);
    }


    public static int solve(String s, String t) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase(Locale.ROOT);
        String[] value = input.split("\\s+");
        String word = "ehyoe";
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if (value[i].charAt(i) == 's') {
                list.add(word);
                System.out.println(word);

            }
            if (value[i].charAt(i) == 't') {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(2).equals("l") && list.get(3).equals("l")) {
                        stringBuilder.append(list);
                        count++;

                    }

                }
                System.out.println(stringBuilder);
                System.out.println(count);

            }

        }
        return count;

    }
}


