public class Wall extends Obstacles{
    int height;

    Wall(int height){
        this.height=height;
    }

    @Override
    public void Doit(Actions actions) {
    actions.jump(height);
    }
}
