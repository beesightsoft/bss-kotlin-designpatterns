package adapter.pattern

class VlcPlayer : AdvanceMediaPlayer {
    override fun playMp4(fileName: String) {
        println("Only support vlc type")
    }

    override fun playVlc(fileName: String) {
        println("Playing vlc file. Name: $fileName")
    }
}