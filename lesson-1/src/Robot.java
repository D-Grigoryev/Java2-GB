public class Robot implements Actions {
    int MAX_JUMP;
    int MAX_DISTANCE;

    Robot(int MAX_DISTANCE, int MAX_JUMP){
        this.MAX_DISTANCE=MAX_DISTANCE;
        this.MAX_JUMP=MAX_JUMP;
    }
    @Override
    public void run(int MAX_DISTANCE) {
        System.out.println("Робот пробежал: "+ MAX_DISTANCE+" м.");
    }

    @Override
    public void jump(int MAX_JUMP) {
        System.out.println("Робот прыгнул на: "+MAX_JUMP+" м.");

    }

    @Override
    public boolean isOndistance() {
        return false;
    }


}
