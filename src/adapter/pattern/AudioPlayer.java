package adapter.pattern;

/**
 * Created by Levon on 2/1/2016, 9:22 PM
 * 4.Create concrete class implementing the MediaPlayer interface.
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3: "+fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else
            System.out.println("Invalid media");

    }
}
