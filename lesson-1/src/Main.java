public class Main {
    public static void main(String[] args) {
        Team team = new Team("Команда мечты",
                new Human(150,100),
                new Robot(150,200),
                new Cat(20,55));
    Match match = new Match(new Wall(1000), new Treadmill(100));
    match.doit(team);


         }
    }


