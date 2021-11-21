public class Human implements Actions {
    int MAX_JUMP;
    int MAX_DISTANCE;

    Human (int MAX_DISTANCE, int MAX_JUMP){
        this.MAX_DISTANCE=MAX_DISTANCE;
        this.MAX_JUMP=MAX_JUMP;
    }

    @Override
    public void run(int distance) {
        if (MAX_DISTANCE<distance){
            System.out.println("Человек не смог пробежать дистанцию");
        }
        System.out.println("Человек пробежал: "+ MAX_DISTANCE+" м.");
    }

    @Override
    public void jump(int height) {
        if (MAX_JUMP<height){
            System.out.println("Человек смог не перепрыгнуть препятсвие");
        }

        System.out.println("Человек прыгнул на: "+MAX_JUMP+" м.");

    }

    @Override
    public boolean isOndistance() {

        return false;
    }


}
