package com.neeraj.navigationcomponent

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment(R.layout.fragment_home)
{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click_btn.setOnClickListener(View.OnClickListener {

            val action=HomeFragmentDirections.actionHomeFragmentToSendFragment()

            val navOptions=NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_in_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build();

          //Navigate With id
        //findNavController().navigate(R.id.sendFragment);

            //Navigate with actionId
      //  findNavController().navigate(R.id.action_homeFragment_to_sendFragment)

            //Navigate with action
           // findNavController().navigate(action)

            findNavController().navigate(R.id.sendFragment,null,navOptions)
        })
    }
}