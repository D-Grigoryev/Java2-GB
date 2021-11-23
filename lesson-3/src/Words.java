import java.util.*;

public class Words  {
//     1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать сколько раз встречается каждое слово.

    String [] words;

    Words (String [] words){
        this.words=words;
    }

    public void getWords() {
        int cout = 0;
        String name = "";
        ArrayList<String> sw = new ArrayList<>(Arrays.asList(words));
        Set<String> hw = new HashSet<>(Arrays.asList(words));
        Map <String,Integer> counter= new HashMap<>();
        System.out.println("Список слов находящихся в массиве: " + sw);
        System.out.println("Список уникальных слов находящихся в массиве:" + hw);
        for (String o: sw) {
            Integer count = counter.get(o);
            if (count==null){
                count=0;
            }
            counter.put(o,++count);
        }
        System.out.println("Список слов и количестов повторений: "+counter);
        }
    }


