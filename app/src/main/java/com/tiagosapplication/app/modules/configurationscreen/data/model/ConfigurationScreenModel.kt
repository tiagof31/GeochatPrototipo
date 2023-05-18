package com.tiagosapplication.app.modules.configurationscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConfigurationScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.msg_dist_ncia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_tags)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesativado: String? = MyApp.getInstance().resources.getString(R.string.lbl_desativado)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPesquisar: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesquisar)

)
