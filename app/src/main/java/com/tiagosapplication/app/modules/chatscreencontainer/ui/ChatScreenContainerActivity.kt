package com.tiagosapplication.app.modules.chatscreencontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.base.BaseActivity
import com.tiagosapplication.app.databinding.ActivityChatScreenContainerBinding
import com.tiagosapplication.app.extensions.loadFragment
import com.tiagosapplication.app.modules.chatscreen.ui.ChatScreenFragment
import com.tiagosapplication.app.modules.chatscreencontainer.`data`.viewmodel.ChatScreenContainerVM
import com.tiagosapplication.app.modules.configurationscreen.ui.ConfigurationScreenFragment
import com.tiagosapplication.app.modules.mapscreen.ui.MapScreenActivity
import kotlin.String
import kotlin.Unit

class ChatScreenContainerActivity :
    BaseActivity<ActivityChatScreenContainerBinding>(R.layout.activity_chat_screen_container) {
  private val viewModel: ChatScreenContainerVM by viewModels<ChatScreenContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatScreenContainerVM = viewModel
    val destFragment = ChatScreenFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = ChatScreenFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      val destFragment = ConfigurationScreenFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ConfigurationScreenFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.viewRectangleSix.setOnClickListener {
      val destFragment = ChatScreenFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ChatScreenFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageLocation.setOnClickListener {
      val destIntent = MapScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHAT_SCREEN_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatScreenContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
