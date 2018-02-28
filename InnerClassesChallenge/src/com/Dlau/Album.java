package com.Dlau;

import java.util.*;

/**
 * Created by Daniel on 27/08/2017.
 */
public class Album {
    private String name;
    private String artist;
    private SongList album;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.album = new SongList();
    }

    public boolean addSong(String name, double duration ) {
        return this.album.add(new Song(name, duration));
    }



    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.album.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = album.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> album;

        public SongList() {
            this.album = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if(album.contains(song)) {
                return false;
            }
            this.album.add(song);
            return true;
        }

        private Song findSong(String name) {
            for(Song checkedSong: this.album) {
                if(checkedSong.getName().equals(name)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if((index > 0) && (index<album.size())) {
                return album.get(index);
            }
            return null;
        }
    }
}
