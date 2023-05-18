package com.tiagosapplication.app.modules.configurationscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tiagosapplication.app.R
import com.tiagosapplication.app.databinding.RowListfutebolBinding
import com.tiagosapplication.app.modules.configurationscreen.`data`.model.ListfutebolRowModel
import kotlin.Int
import kotlin.collections.List

class ListfutebolAdapter(
  var list: List<ListfutebolRowModel>
) : RecyclerView.Adapter<ListfutebolAdapter.RowListfutebolVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfutebolVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfutebol,parent,false)
    return RowListfutebolVH(view)
  }

  override fun onBindViewHolder(holder: RowListfutebolVH, position: Int) {
    val listfutebolRowModel = ListfutebolRowModel()
    // TODO uncomment following line after integration with data source
    // val listfutebolRowModel = list[position]
    holder.binding.listfutebolRowModel = listfutebolRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfutebolRowModel>) {
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
      item: ListfutebolRowModel
    ) {
    }
  }

  inner class RowListfutebolVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfutebolBinding = RowListfutebolBinding.bind(itemView)
  }
}
