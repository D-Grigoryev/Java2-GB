public class Treadmill extends Obstacles{
    int distance;

    Treadmill(int distance){
        this.distance=distance;
    }

    @Override
    public void Doit(Actions actions) {
        actions.run(distance);
    }

}
