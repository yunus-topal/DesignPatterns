package Iterator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<SongInfo> songsArray = new ArrayList<>();
        songsArray.add(new SongInfo("Imagine", "John Lennon", 1971));
        songsArray.add(new SongInfo("American Pie", "Don McLean", 1971));
        songsArray.add(new SongInfo("I Will Survive", "Gloria Gaynor", 1979));

        ArrayList<SongInfo> songsArray2 = new ArrayList<>();
        songsArray2.add(new SongInfo("Losing My Religion", "REM", 1991));
        songsArray2.add(new SongInfo("Creep", "Radiohead", 1993));
        songsArray2.add(new SongInfo("Walk on the Ocean", "Toad The Wet Sprocket", 1991));

        SongsOfSpotify songs70s = new SongsOfSpotify(songsArray);
        SongsOfYoutube songs90s = new SongsOfYoutube(songsArray2);

        SongShuffle shuffle = new SongShuffle(songs70s, songs90s);
        shuffle.showTheSongs();

    }

}