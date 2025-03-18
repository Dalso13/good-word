package com.jdw.good_word

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jdw.good_word.adapter.SentenceAdapter

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)
        val sentenceList = mutableListOf(
            "삶이 있는 한 희망은 있다 -키케로",
            "산다는것 그것은 치열한 전투이다 -로망로랑",
            "하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다 -사무엘존슨",
            "언제나 현재에 집중할수 있다면 행복할것이다 -파울로 코엘료",
            "진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해 -찰리 채플린",
            "직업에서 행복을 찾아라아니면 행복이 무엇인지 절대 모를 것이다 -엘버트 허버드",
        )

        val listview = findViewById<ListView>(R.id.sentenceListView)

        val adapter = SentenceAdapter(sentenceList)

        listview.adapter = adapter

    }
}