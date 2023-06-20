package bt3;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        int size = (int) (Math.random() * 10) + 1; // Số lượng phần tử từ 1 đến 10
        for (int i = 0; i < size; i++) {
            int randomNum = (int) (Math.random() * 100); // Giới hạn số ngẫu nhiên từ 0 đến 99
            list.add(randomNum);


        }
        System.out.println(list);
        for (int i=0; i< list.size()-1;i++){
            for (int j=i;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    int a=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,a);
                }
            }
        }
        System.out.println(list);
    }
}
