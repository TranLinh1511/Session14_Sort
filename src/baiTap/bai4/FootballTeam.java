package baiTap.bai4;

public class FootballTeam {
    // FootballTeam id: int; Name: String; numerOfPlayer: int score: int; getter(), setter()
    private int id, numerOfPlayer,score;
    private String name;

    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", numerOfPlayer=" + numerOfPlayer +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public FootballTeam() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerOfPlayer() {
        return numerOfPlayer;
    }

    public void setNumerOfPlayer(int numerOfPlayer) {
        this.numerOfPlayer = numerOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
