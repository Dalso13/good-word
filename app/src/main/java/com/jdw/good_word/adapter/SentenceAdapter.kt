package com.jdw.good_word.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.jdw.good_word.R

class SentenceAdapter(val list : MutableList<String>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var conver = convertView

        if (convertView == null) {
            // 리스트뷰 아이템 가져오기
            conver = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        // 리스트에 내용 텍스트뷰에 적용
        val title = conver!!.findViewById<TextView>(R.id.listViewTextArea)
        title.text = list[position]



        // 리스트뷰아이템이 담긴 객체 리턴
        return conver!!
    }
}