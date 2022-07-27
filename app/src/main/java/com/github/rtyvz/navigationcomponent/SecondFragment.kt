package com.github.rtyvz.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    companion object {
        const val ARGS_EXTRA = "ARGS"
    }

    private var navigateButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        navigateButton = view.findViewById(R.id.toFirstFragmentAction)
        val args = arguments?.get(ARGS_EXTRA)
        navigateButton?.text = String.format(getString(R.string.to_first_fragment), args)
        navigateButton?.setOnClickListener {
            findNavController().navigate(R.id.toFirstFragment)
        }

        return view
    }

    override fun onDestroyView() {
        navigateButton = null

        super.onDestroyView()
    }
}