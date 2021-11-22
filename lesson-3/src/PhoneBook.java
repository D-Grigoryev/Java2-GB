import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
//     2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи.
//    С помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны.
//    Желательно как можно меньше добавлять своего, чего нет в задании
//    (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
//    делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать
//    (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().

    private String name;
    private Integer phone;
    private List<PhoneBook> listbook = new ArrayList<>();
    PhoneBook (){
    }
    PhoneBook (String name, Integer phone){
    this.name=name;
    this.phone=phone;
    }
    public void add(String name, Integer phone) {
    listbook.add(new PhoneBook(name, phone));
    }
    public void get(String name) {
        List <Integer> listph = new ArrayList<>();
        for (PhoneBook p: listbook) {
        if (name.equals(p.name)){
            listph.add(p.phone);
        }

        }
        System.out.println("По фамилии: "+ name+" есть следующие номера: "+listph);
    }
}
