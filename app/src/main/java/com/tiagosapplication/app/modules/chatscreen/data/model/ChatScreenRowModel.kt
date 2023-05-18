package com.tiagosapplication.app.modules.chatscreen.`data`.model

import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatScreenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtZephyerLennox: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_zephyer_lennox)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLovecraftdesc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lovecraft_desc)

)
