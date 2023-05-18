package com.tiagosapplication.app.modules.configurationscreen.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.tiagosapplication.app.R
import com.tiagosapplication.app.appcomponents.base.BaseFragment
import com.tiagosapplication.app.databinding.FragmentConfigurationScreenBinding
import com.tiagosapplication.app.modules.configurationscreen.`data`.model.ListfutebolRowModel
import com.tiagosapplication.app.modules.configurationscreen.`data`.viewmodel.ConfigurationScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ConfigurationScreenFragment :
    BaseFragment<FragmentConfigurationScreenBinding>(R.layout.fragment_configuration_screen) {
  private val viewModel: ConfigurationScreenVM by viewModels<ConfigurationScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listfutebolAdapter =
    ListfutebolAdapter(viewModel.listfutebolList.value?:mutableListOf())
    binding.recyclerListfutebol.adapter = listfutebolAdapter
    listfutebolAdapter.setOnItemClickListener(
    object : ListfutebolAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfutebolRowModel) {
        onClickRecyclerListfutebol(view, position, item)
      }
    }
    )
    viewModel.listfutebolList.observe(requireActivity()) {
      listfutebolAdapter.updateData(it)
    }
    binding.configurationScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfutebol(
    view: View,
    position: Int,
    item: ListfutebolRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CONFIGURATION_SCREEN_FRAGMENT"


    fun getInstance(bundle: Bundle?): ConfigurationScreenFragment {
      val fragment = ConfigurationScreenFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
