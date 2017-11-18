package adapter.pattern

class Mp4Player : AdvanceMediaPlayer {
    override fun playMp4(fileName: String) {
        println("Playing mp4 file. Name: $fileName")

    }

    override fun playVlc(fileName: String) {
        println("Only support mp4 type")
    }
}