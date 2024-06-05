package com.tech.delegation

class FileDownloader(private val file : String) :Downloader{
    override fun download() {
        println("$file downloaded")
    }
}

class FilePlayer(private val file: String): Player{
    override fun play() {
        println("$file played")
    }
}

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
): Downloader by downloader,Player by player
//Instead of this we can use 'by' keyword to delegate responsibility
/*{
    override fun download() {
        downloader.download()
    }
    override fun play() {
        player.play()
    }
}*/

fun main() {
    val file = "File.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
}