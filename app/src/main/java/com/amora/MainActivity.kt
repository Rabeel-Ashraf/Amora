package com.amora.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.amora.ai.OpenAIRepository
import com.amora.databinding.ActivityChatBinding
import com.amora.speech.*

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding
    private val stt by lazy { STTManager(this) }
    private val tts by lazy { TTSManager(this, voice = "eleven-luna") }
    private val wake by lazy { WakeWordDetector(this, keyword = "Hey Amora") }
    private val aiRepo = OpenAIRepository(apiKey = BuildConfig.OPENAI_KEY)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Pretty wave animation while listening
        binding.waveView.startListeningAnim()

        // Listen loop
        wake.onWakeWordDetected = {
            stt.startListening { text ->
                aiRepo.chat(text) { reply ->
                    tts.speak(reply)
                    binding.chatList.add(Message(text, reply))
                }
            }
        }
    }
}
