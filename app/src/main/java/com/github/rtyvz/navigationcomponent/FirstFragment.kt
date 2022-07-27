package com.github.rtyvz.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.rtyvz.navigationcomponent.SecondFragment.Companion.ARGS_EXTRA

class FirstFragment : Fragment() {

    private var navigateButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        navigateButton = view.findViewById(R.id.toSecondFragmentAction)

        navigateButton?.setOnClickListener {
            findNavController().navigate(R.id.toSecondFragment, bundleOf(ARGS_EXTRA to 2))
        }

        return view
    }

    override fun onDestroyView() {
        navigateButton = null

        super.onDestroyView()
    }
}