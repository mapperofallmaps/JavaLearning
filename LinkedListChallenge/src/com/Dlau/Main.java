package com.Dlau;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Burn", "Ellie Goulding");
        album.addSong("Burn", 4.6);
        album.addSong("High for this", 2.4);
        album.addSong("Outside", 3.4);
        album.addSong("Love me like you do", 3.6);
        album.addSong("How long will I love you", 3.15);
        album.addSong("On my mind", 2.54);
        album.addSong("Something in the way you move", 4.3);
        album.addSong("I need your love", 4.2);
        albums.add(album);

        album = new Album("X", "Ed Sheeran");
        album.addSong("Shape of you", 2.7);
        album.addSong("Castle on the hill", 3.2);
        album.addSong("Galway girl", 3.8);
        album.addSong("Thinking out loud", 2.9);
        album.addSong("Photogrpah", 4.6);
        album.addSong("I see fire", 3.14);
        album.addSong("Lego house", 2.5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList(3, playList);
        albums.get(0).addToPlaylist("Burn", playList);
        albums.get(0).addToPlaylist("High for this", playList);
        albums.get(0).addToPlaylist("love", playList);

        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(43, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the ned of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previious song\n" +
            "3 - to replay the current song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print available actions\n" +
            "6 - to remove current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("====================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================");
    }
}
