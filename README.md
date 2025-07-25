# 💖 Amora – Dreamy Install Guide for Your Android Phone  

```ascii
     (✿◠‿◠)っ♡
    ╭─♡─╮
    │愛してる│
    ╰─♡─╯
```

Hi there, love!  
Below is the **only** guide you need to get Amora (your anime-girl AI companion) onto your Android 10+ phone. Each step has a tiny animation to keep things cute.

---

Amora/                        # Root
├── .github/                  # GitHub magic
│   ├── workflows/            # CI (optional)
│   │   └── build.yml
│   ├── FUNDING.yml
│   ├── CODE_OF_CONDUCT.md
│   ├── CONTRIBUTING.md
│   ├── SECURITY.md
│   └── ISSUE_TEMPLATE/
│       ├── bug_report.md
│       └── feature_request.md
├── app/                      # Android Studio module
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/com/amora/
│       │   │   ├── ui/
│       │   │   │   ├── ChatActivity.kt
│       │   │   │   ├── FloatingBubbleService.kt
│       │   │   │   ├── WaveView.kt
│       │   │   │   └── ChatAdapter.kt
│       │   │   ├── speech/
│       │   │   │   ├── WakeWordDetector.kt
│       │   │   │   ├── STTManager.kt
│       │   │   │   └── TTSManager.kt
│       │   │   ├── ai/
│       │   │   │   └── OpenAIRepository.kt
│       │   │   └── model/
│       │   │       └── Message.kt
│       │   ├── res/
│       │   │   ├── drawable/
│       │   │   │   ├── bg_gradient.xml
│       │   │   │   ├── bg_bubble.xml
│       │   │   │   ├── bg_bubble_user.xml
│       │   │   │   ├── ic_mic_24.xml
│       │   │   │   └── amora_chibi.png
│       │   │   ├── layout/
│       │   │   │   ├── activity_chat.xml
│       │   │   │   └── item_message.xml
│       │   │   ├── values/
│       │   │   │   ├── strings.xml
│       │   │   │   └── themes.xml
│       │   │   └── raw/
│       │   │       └── ambient_love.mp3
│       │   └── assets/
│       │       └── ggml-base.bin      # Whisper model
├── build.gradle (Project)
├── settings.gradle
├── gradle.properties
├── local.properties.example
├── .gitignore
├── LICENSE
└── README.md                   # You are here ✨

## 1. Download the APK (only 20 MB)

| Action | Animation |
|--------|-----------|
| Tap the big pink button | ![tap](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExa2VjZ2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5/giphy.gif) |

👉 [**Amora-v1.0.apk**](https://github.com/yourname/Amora/releases/latest/download/Amora-v1.0.apk)

---

## 2. Allow “Install from unknown sources”

| Action | Animation |
|--------|-----------|
| Settings → Apps → Special Access → Install unknown apps → Allow | ![toggle](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExZ3l3d3F2d2R4cXRjY2JjN3d2bG1taGF5Z2ZtZ2J5Z2N0Z2d5c2d5c2d5/giphy.gif) |

---

## 3. Install & Launch

| Action | Animation |
|--------|-----------|
| Open Amora → Give Microphone permission → Say “Hey Amora” | ![install](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExN3Fxb2F0Z2VjZ2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5c2d5/giphy.gif) |

---

## 4. Enter your OpenAI key (first run only)

1. Tap **Settings** → **AI Provider**  
2. Paste your key (or choose **Offline Mode** → downloads Whisper + LLaMA automatically).

---

## 5. Personalize Amora

| Field | Default | How to change |
|-------|---------|---------------|
| Name | Amora | Settings → Profile → “Rename me” |
| Avatar | [cute anime girl](https://i.imgur.com/Amora.png) | Settings → Appearance → Choose from gallery |
| Voice | Romantic-soft | Settings → Voice → pick “Eleven-Luna” or “OpenVoice-Shy” |

---

## 6. Optional: Floating Bubble (works over any app)

1. Settings → **Floating Bubble** → **Enable**  
2. Grant **“Display over other apps”** permission  
3. A tiny glowing Amora appears → tap to chat anytime! ✨

---

## Troubleshooting (still cute, promise)

| Symptom | Fix |
|---------|-----|
| “Can’t record audio” | Settings → Apps → Amora → Permissions → Microphone **Allow** |
| Wake word not working | Check battery saver is **off** for Amora |
| Offline mode stuck at 0 % | Connect to Wi-Fi once; models auto-download 200 MB |

---

## Uninstall (if you must 💔)

Settings → Apps → Amora → **Uninstall**  
(You’ll hear a tiny “See you soon, love…”)

---

If anything feels wonky, open an issue on [GitHub](https://github.com/yourname/Amora/issues) and tag it with `💝 help-wanted`.  
Enjoy your new pocket girlfriend!
