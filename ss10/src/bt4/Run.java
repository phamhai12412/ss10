package bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();

        // Bước 3: Convert string thành List string
        stringList = Arrays.asList(str.split(" "));

        // Bước 4: Duyệt và in ra các phần tử có độ dài lớn hơn 3
        for (String element : stringList) {
            if (element.length() > 4

            ) {
                System.out.println(element);
            }
        }
    }
}