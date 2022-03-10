package Iterator;

import java.util.ArrayList;

public class SongsOfSpotify implements SongIterator{
    private int position = 0;
    ArrayList<SongInfo> bestSongs;

    public SongsOfSpotify(ArrayList<SongInfo> songs) {
        this.bestSongs = songs;
    }
    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }

    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
    }

    @Override
    public boolean hasNext() {
        return position < bestSongs.size();
    }

    @Override
    public SongInfo getNext() {
        if (!hasNext()){
            return null;
        }
        else {
            SongInfo song = bestSongs.get(position);
            position++;
            return song;
        }
    }
}