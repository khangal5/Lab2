package main;

public class Movie {
    private String title;
    private int score;

    public Movie(String title, int score) {
        this.title = title;
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nMovie{" +
                "title='" + title + '\'' +
                ", score=" + score +
                '}';
    }
    public String getTitle() {
    	return title;
    }
    
    public int getScore() {
        return score;
    }

}
