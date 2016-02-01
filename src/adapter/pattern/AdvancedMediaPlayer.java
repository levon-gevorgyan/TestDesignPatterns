package adapter.pattern;

/**
 * Created by Levon on 2/1/2016, 9:11 PM
 * 1.Create interfaces for Media Player and Advanced Media Player.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
