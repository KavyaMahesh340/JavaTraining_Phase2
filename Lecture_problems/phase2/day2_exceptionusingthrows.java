package phase2;
class play {
    String gamename;
    int jerseynumber;
    int total;
    int team = 5;
    play(String g, int j, int t) {
        gamename = g;
        jerseynumber = j;
        total = t;
    }
    void strength() throws RuntimeException {
        if (total < team) {
            System.out.println("Team is allowed to play");
        } else {
            int a = 10 / 0;
        }
    }
}
public class day2_exceptionusingthrows {
    public static void main(String[] args) {
        play p = new play("tennis", 2, 6);
        p.strength();
    }
}