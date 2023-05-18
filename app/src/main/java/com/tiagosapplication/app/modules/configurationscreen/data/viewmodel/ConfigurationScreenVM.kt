package com.tiagosapplication.app.modules.configurationscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiagosapplication.app.modules.configurationscreen.`data`.model.ConfigurationScreenModel
import com.tiagosapplication.app.modules.configurationscreen.`data`.model.ListfutebolRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConfigurationScreenVM : ViewModel(), KoinComponent {
  val configurationScreenModel: MutableLiveData<ConfigurationScreenModel> =
      MutableLiveData(ConfigurationScreenModel())

  var navArguments: Bundle? = null

  val listfutebolList: MutableLiveData<MutableList<ListfutebolRowModel>> =
      MutableLiveData(mutableListOf())
}
