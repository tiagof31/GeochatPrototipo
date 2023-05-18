package com.tiagosapplication.app.modules.mapscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.base.BaseActivity
import com.tiagosapplication.app.databinding.ActivityMapScreenBinding
import com.tiagosapplication.app.modules.chatscreencontainer.ui.ChatScreenContainerActivity
import com.tiagosapplication.app.modules.mapscreen.`data`.viewmodel.MapScreenVM
import kotlin.String
import kotlin.Unit

class MapScreenActivity : BaseActivity<ActivityMapScreenBinding>(R.layout.activity_map_screen) {
  private val viewModel: MapScreenVM by viewModels<MapScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mapScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGlobeOne.setOnClickListener {
      val destIntent = ChatScreenContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MAP_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MapScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
