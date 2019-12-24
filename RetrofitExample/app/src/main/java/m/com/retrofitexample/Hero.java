package m.com.retrofitexample;

public class Hero {

    private   String name;
    private   String realname;
    private   String team;

    public Hero(String name, String realname, String team) {
        this.name = name;
        this.realname = realname;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
