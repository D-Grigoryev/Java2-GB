import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
public Main(){
    setTitle("TestWindow");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setBounds(300,300,400,400);
//    JButton button1= new JButton("Button1");
//    JButton button2 = new JButton("Button2");
//    add (button1, BorderLayout.NORTH);
//    add (button2, BorderLayout.SOUTH);
//  Компановщик BoxLayout
//    setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//    for (int i = 1; i<=10; i++){
//        add(new JButton("#"+i));
//    }
// Компановщик FlowLayout
//    setLayout(new FlowLayout());
//    for (int i = 1; i<=10; i++){
//        add(new JButton("#"+i));
//    }
// Копановщик  GridLayout
//    setLayout(new GridLayout(3,3));
//    for (int i = 0; i<9; i++){
//        add(new JButton(String.valueOf(i+1)));
//    }
// Ручная расстановка элементов
//    setLayout(null);
//    JTextField field = new JTextField();
//    field.setBounds(20,20,120,32);
//    add(field);
//    JButton button = new JButton("Кнопка");
//    button.setBounds(20,60,120,32);
//    add(button);
// Добавление обработчиков событий
//      JButton button = new JButton("Кнопка");
//      add(button, BorderLayout.CENTER);
//      button.addActionListener(new ActionListener() {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              button.setText("Нажал");
//          }
//      });
//Обработка нажатия кнопки Enter в текстовом поле
//    JTextField textField = new JTextField();
//    add(textField, BorderLayout.CENTER);
//    textField.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println(textField.getText());
//        }
//    });
// Отслеживание момента закрытия окна
    addWindowListener(new WindowAdapter() {

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Окно закрывается");
        }


    });
    setVisible(true);
}

    public static void main(String[] args) {
        new Main();
    }
}
