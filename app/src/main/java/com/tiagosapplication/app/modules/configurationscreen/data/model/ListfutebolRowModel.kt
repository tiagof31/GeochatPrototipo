package com.tiagosapplication.app.modules.configurationscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListfutebolRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFutebol: String? = MyApp.getInstance().resources.getString(R.string.lbl_futebol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcademia: String? = MyApp.getInstance().resources.getString(R.string.lbl_academia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_13)

)
