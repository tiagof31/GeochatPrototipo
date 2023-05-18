package com.tiagosapplication.app.modules.splashscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGeochat: String? = MyApp.getInstance().resources.getString(R.string.lbl_geochat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotLogin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_esqueci_a_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUserCredValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordCredValue: String? = null
)
