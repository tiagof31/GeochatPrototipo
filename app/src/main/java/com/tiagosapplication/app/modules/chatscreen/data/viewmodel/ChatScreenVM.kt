package com.tiagosapplication.app.modules.chatscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiagosapplication.app.modules.chatscreen.`data`.model.ChatScreenModel
import com.tiagosapplication.app.modules.chatscreen.`data`.model.ChatScreenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatScreenVM : ViewModel(), KoinComponent {
  val chatScreenModel: MutableLiveData<ChatScreenModel> = MutableLiveData(ChatScreenModel())

  var navArguments: Bundle? = null

  val chatScreenList: MutableLiveData<MutableList<ChatScreenRowModel>> =
      MutableLiveData(mutableListOf())
}
