public class Team {
    String nameteam;
    Actions [] players;

    public Team (String nameteam, Actions... players){
        this.nameteam=nameteam;
        this.players=players;
    }



    Actions[] getPlayers() {
        return players;
    }

}
