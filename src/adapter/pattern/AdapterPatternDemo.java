package adapter.pattern;

/**
 * Created by Levon on 2/1/2016, 9:30 PM
 * 5.Use the AudioPlayer to play different types of audio formats.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","1");
        audioPlayer.play("mp4","2");
        audioPlayer.play("vlc","3");
        audioPlayer.play("mov","4");
    }
}
