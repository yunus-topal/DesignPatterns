package Iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfYoutube implements SongIterator{
    private int position = 0;
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int hashKey = 0;

    public SongsOfYoutube(ArrayList<SongInfo> songs) {
        for (SongInfo song: songs) {
            bestSongs.put(hashKey,song);
            hashKey++;

        }

    }

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.put(hashKey, songInfo);

        hashKey++;

    }

    public Hashtable<Integer, SongInfo> getBestSongs(){

        return bestSongs;

    }

    @Override
    public boolean hasNext() {
        return position < hashKey;
    }

    @Override
    public SongInfo getNext() {
        if (!hasNext()){
            return null;
        }
        else{
            SongInfo song = bestSongs.get(position);
            position++;
            return song;
        }
    }
}