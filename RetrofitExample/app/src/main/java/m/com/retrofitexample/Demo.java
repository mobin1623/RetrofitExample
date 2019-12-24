package m.com.retrofitexample;

public class Demo {
    String gender;
    String first;
    String last;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    String picture;

    public Demo(String gender, String first, String last, String picture) {
        this.gender = gender;
        this.first = first;
        this.last = last;
        this.picture = picture;
    }
}
