public class Robot implements Actions {
    int MAX_JUMP;
    int MAX_DISTANCE;

    Robot(int MAX_DISTANCE, int MAX_JUMP){
        this.MAX_DISTANCE=MAX_DISTANCE;
        this.MAX_JUMP=MAX_JUMP;
    }
    @Override
    public void run(int distance) {
        if (MAX_DISTANCE<distance){
            System.out.println("Робот не смог пробежать дистанцию");
        }
        System.out.println("Робот пробежал: "+ MAX_DISTANCE+" м.");
    }

    @Override
    public void jump(int height) {
        if (MAX_JUMP<height){
            System.out.println("Робот не смог перепрыгнуть препятсвие");
        }
        System.out.println("Робот прыгнул на: "+MAX_JUMP+" м.");

    }

    @Override
    public boolean isOndistance() {
        return false;
    }


}
