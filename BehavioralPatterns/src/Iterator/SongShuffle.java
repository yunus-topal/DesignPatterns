package Iterator;

public class SongShuffle {

    SongIterator songsSpotify;
    SongIterator songsYoutube;

    public SongShuffle(SongIterator songsSpotify, SongIterator songsYoutube) {
        this.songsSpotify = songsSpotify;
        this.songsYoutube = songsYoutube;

    }

    public void showTheSongs(){
        while (songsSpotify.hasNext()){
            printTheSongs(songsSpotify.getNext());
        }
        while (songsYoutube.hasNext()){
            printTheSongs(songsYoutube.getNext());
        }

    }

    public void printTheSongs(SongInfo songInfo){
        System.out.println(songInfo.getSongName());
        System.out.println(songInfo.getBandName());
        System.out.println(songInfo.getYearReleased() + "\n");
    }

}