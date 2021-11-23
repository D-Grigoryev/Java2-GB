public class Cat implements Actions{
    int MAX_JUMP;
    int MAX_DISTANCE;

   Cat (int MAX_DISTANCE, int MAX_JUMP){
        this.MAX_DISTANCE=MAX_DISTANCE;
        this.MAX_JUMP=MAX_JUMP;
    }
    @Override
    public void run(int distance) {
        if (MAX_DISTANCE<distance){
            System.out.println("Кот не смог пробежать дистанцию");
        }
        System.out.println("Кот пробежал: "+ MAX_DISTANCE+" м.");
    }

    @Override
    public void jump(int height) {
        if (MAX_JUMP<height){
            System.out.println("Кот не смог перепрыгнуть препятсвие");
        }
        System.out.println("Кот прыгнул на: "+MAX_JUMP+" м.");

    }

    @Override
    public boolean isOndistance() {
        return false;
    }


}
