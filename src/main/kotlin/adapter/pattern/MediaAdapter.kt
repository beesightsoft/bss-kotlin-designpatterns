package adapter.pattern

open class MediaAdapter : MediaPlayer {
    private var advancedMusicPlayer: AdvanceMediaPlayer? = null

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", true)) {
            if (advancedMusicPlayer == null) {
                advancedMusicPlayer = VlcPlayer()
            }
            advancedMusicPlayer?.playVlc(fileName)

        } else if (audioType.equals("mp4", true)) {
            if (advancedMusicPlayer == null) {
                advancedMusicPlayer = Mp4Player()
            }
            advancedMusicPlayer?.playMp4(fileName)

        }

    }
}