package com.tiagosapplication.app.modules.mapscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MapScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_89)

)
