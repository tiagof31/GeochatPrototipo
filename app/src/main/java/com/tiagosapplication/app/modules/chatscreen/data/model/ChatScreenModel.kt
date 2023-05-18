package com.tiagosapplication.app.modules.chatscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPalmerBriar: String? = MyApp.getInstance().resources.getString(R.string.lbl_palmer_briar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJosephnaverda: String? =
      MyApp.getInstance().resources.getString(R.string.msg_joseph_na_verda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTruFinnley: String? = MyApp.getInstance().resources.getString(R.string.lbl_tru_finnley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendobemsince: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sendo_bem_since)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRioHollis: String? = MyApp.getInstance().resources.getString(R.string.lbl_rio_hollis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDanesefaoo: String? = MyApp.getInstance().resources.getString(R.string.msg_dane_se_fa_o_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkyKobi: String? = MyApp.getInstance().resources.getString(R.string.lbl_sky_kobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComodiminuia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_como_diminui_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShayBowie: String? = MyApp.getInstance().resources.getString(R.string.lbl_shay_bowie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLasqueiabios: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lasquei_a_bios)

)
