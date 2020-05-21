package arb.test.media.player

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var play = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer = MediaPlayer.create(this ,R.raw.music )
//        online
//        val mediaPlayer = MediaPlayer()
//        mediaPlayer.setDataSource("link")
//        mediaPlayer.prepare()

        btn_main_play.setOnClickListener {

            play = if (play) {
                mediaPlayer.start()
                btn_main_play.setBackgroundResource(R.drawable.style_pause)
                false
            }else{
                mediaPlayer.pause()
                btn_main_play.setBackgroundResource(R.drawable.style_play)
                true
            }
        }

        btn_main_nex.setOnClickListener {
            mediaPlayer.seekTo(mediaPlayer.currentPosition + 10000)
        }

        btn_main_back.setOnClickListener {
            mediaPlayer.seekTo(mediaPlayer.currentPosition - 5000)
        }

    }
}
