package com.neeraj.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_send.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SendFragment : Fragment(R.layout.fragment_send)
{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        back_to_home.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.homeFragment)
        })
    }
}