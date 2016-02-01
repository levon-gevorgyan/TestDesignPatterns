package adapter.pattern;

/**
 * Created by Levon on 2/1/2016, 9:16 PM
 * 3.Create adapter class implementing the MediaPlayer interface.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer=new VlcPlayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer=new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer.playVlc("vlc: "+fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMp4("mp4: "+fileName);
    }
}
