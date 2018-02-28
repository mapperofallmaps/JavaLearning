package com.Dlau;

import java.util.*;

/**
 * Created by Daniel on 27/08/2017.
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> album = new ArrayList<Song>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.album = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration ) {
        Song song = new Song(name, duration);
        if(findSong(name) == null) {
            this.album.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String name) {
        for(Song checkedSong: this.album) {
            if(checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = (trackNumber -1);
        if((index >=0) && (index <= this.album.size())) {
            playList.add(this.album.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
