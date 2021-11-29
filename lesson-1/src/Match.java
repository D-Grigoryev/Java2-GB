public class Match {
Obstacles [] obstacles;

   public Match(Obstacles... obstacles) {
       this.obstacles=obstacles;
   }
    public void doit(Team team){
        for (Actions a: team.getPlayers()) {
            for (Obstacles o: obstacles) {
                o.Doit(a);
               // if(!a.isOndistance());
            }
                 }
    }

}


