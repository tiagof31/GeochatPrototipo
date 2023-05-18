package com.tiagosapplication.app.modules.chatscreen.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.base.BaseFragment
import com.tiagosapplication.app.databinding.FragmentChatScreenBinding
import com.tiagosapplication.app.modules.chatscreen.`data`.model.ChatScreenRowModel
import com.tiagosapplication.app.modules.chatscreen.`data`.viewmodel.ChatScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatScreenFragment : BaseFragment<FragmentChatScreenBinding>(R.layout.fragment_chat_screen) {
  private val viewModel: ChatScreenVM by viewModels<ChatScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val chatScreenAdapter = ChatScreenAdapter(viewModel.chatScreenList.value?:mutableListOf())
    binding.recyclerChatScreen.adapter = chatScreenAdapter
    chatScreenAdapter.setOnItemClickListener(
    object : ChatScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatScreenRowModel) {
        onClickRecyclerChatScreen(view, position, item)
      }
    }
    )
    viewModel.chatScreenList.observe(requireActivity()) {
      chatScreenAdapter.updateData(it)
    }
    binding.chatScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerChatScreen(
    view: View,
    position: Int,
    item: ChatScreenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHAT_SCREEN_FRAGMENT"


    fun getInstance(bundle: Bundle?): ChatScreenFragment {
      val fragment = ChatScreenFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
