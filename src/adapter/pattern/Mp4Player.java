package adapter.pattern;

/**
 * Created by Levon on 2/1/2016, 9:15 PM
 * 2.Create concrete classes implementing the AdvancedMediaPlayer interface.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println(fileName);
    }
}
