package com.tiagosapplication.app.modules.chatscreencontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiagosapplication.app.modules.chatscreencontainer.`data`.model.ChatScreenContainerModel
import org.koin.core.KoinComponent

class ChatScreenContainerVM : ViewModel(), KoinComponent {
  val chatScreenContainerModel: MutableLiveData<ChatScreenContainerModel> =
      MutableLiveData(ChatScreenContainerModel())

  var navArguments: Bundle? = null
}
