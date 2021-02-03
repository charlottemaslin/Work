package uk.ac.kent.el334.digimediastore;

public class MusicAlbum extends Medialtem {

    private String singer;


    public MusicAlbum(String title, String singer) {
        super(title);
        this.singer = singer;
    }


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void printDetails() {
        System.out.print("[Book] ");
        System.out.print("Title: " + title);
        System.out.print("Singer: " + singer);
        System.out.format(", Rating: %.1f/5", getAvgRating());
        System.out.format(" (price £%.2f)", price);
        System.out.println();
    }
}
