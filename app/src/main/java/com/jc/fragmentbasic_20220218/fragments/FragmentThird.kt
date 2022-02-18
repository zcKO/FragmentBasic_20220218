package com.jc.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jc.fragmentbasic_20220218.R
import kotlinx.android.synthetic.main.fragment_third.*

class FragmentThird : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnTest.setOnClickListener {

            Log.d("세 번째 프래그먼트", "onActivityCreated: test")

        }

    }

}