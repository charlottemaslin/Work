package uk.ac.kent.el334.digimediastore;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Medialtem> items;

    public Catalogue() {
        items = new ArrayList<Medialtem>();
        loadBooks();
        loadGames();
        loadMusic();
    }

    public void addItem(Medialtem item){
        items.add(item);
    }
    public ArrayList<Medialtem> getItem(int position){
        return items;

    }


    public void printCatalogue() {
        System.out.println("- CATALOGUE --------------------------------------------------------------------------------");

        int itemCount = 1;
        for (Medialtem bk : items) {
            System.out.print("["+itemCount + "] ");
            itemCount++;
            bk.printDetails();
        }
        System.out.println("--------------------------------------------------------------------------------------------");

    }

    private void loadGames() {
        Game game;
        game = new Game("Civilization VI", "Sid Meier");
        game.addRating(5);
        game.addRating(5);
        game.addRating(4);
        game.addRating(4);
        game.setPrice(22.00);
        addItem(game);
        game = new Game("Resident Evil 2", "Capcom");
        game.setPrice(22.00);
        game.addRating(5);
        game.addRating(5);
        game.addRating(5);
        game.addRating(4);
        addItem(game);
    }

    private void loadBooks() {
        Book book;
        book = new Book("Brave New World", "A Huxley");
        book.setPages(343);
        book.setPrice(9.99);
        book.addRating(3);
        book.addRating(5);
        book.addRating(5);
        book.addRating(4);
        book.addRating(4);
        addItem(book);

        book = new Book("1984", "G Orwell");
        book.setPages(343);
        book.setPrice(12.99);
        book.addRating(4);
        book.addRating(5);
        book.addRating(5);
        book.addRating(4);
        book.addRating(4);
        addItem(book);

        book = new Book("Foundation", "I Assimov");
        book.setPages(343);
        book.setPrice(8.99);
        book.addRating(3);
        book.addRating(5);
        book.addRating(5);
        book.addRating(3);
        book.addRating(4);
        addItem(book);


    }

    private void loadMusic() {
        MusicAlbum album;
        album = new MusicAlbum("21","Adele");
        album.addRating(5);
        album.addRating(5);
        album.addRating(4);
        album.addRating(2);
        album.setPrice(15.00);
        addItem(album);
        album = new MusicAlbum("Graduation", "Kanye West");
        album.setPrice(5.00);
        album.addRating(1);
        album.addRating(1);
        album.addRating(5);
        album.addRating(4);
        addItem(album);

    }
}
