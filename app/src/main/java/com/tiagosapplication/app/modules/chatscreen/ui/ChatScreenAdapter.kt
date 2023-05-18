package com.tiagosapplication.app.modules.chatscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tiagosapplication.app.R
import com.tiagosapplication.app.databinding.RowChatScreenBinding
import com.tiagosapplication.app.modules.chatscreen.`data`.model.ChatScreenRowModel
import kotlin.Int
import kotlin.collections.List

class ChatScreenAdapter(
  var list: List<ChatScreenRowModel>
) : RecyclerView.Adapter<ChatScreenAdapter.RowChatScreenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChatScreenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chat_screen,parent,false)
    return RowChatScreenVH(view)
  }

  override fun onBindViewHolder(holder: RowChatScreenVH, position: Int) {
    val chatScreenRowModel = ChatScreenRowModel()
    // TODO uncomment following line after integration with data source
    // val chatScreenRowModel = list[position]
    holder.binding.chatScreenRowModel = chatScreenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChatScreenRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ChatScreenRowModel
    ) {
    }
  }

  inner class RowChatScreenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChatScreenBinding = RowChatScreenBinding.bind(itemView)
  }
}
