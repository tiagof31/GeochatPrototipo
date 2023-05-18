package com.tiagosapplication.app.modules.mapscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiagosapplication.app.modules.mapscreen.`data`.model.MapScreenModel
import org.koin.core.KoinComponent

class MapScreenVM : ViewModel(), KoinComponent {
  val mapScreenModel: MutableLiveData<MapScreenModel> = MutableLiveData(MapScreenModel())

  var navArguments: Bundle? = null
}
