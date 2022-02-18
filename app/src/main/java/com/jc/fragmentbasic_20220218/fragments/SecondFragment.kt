package com.jc.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jc.fragmentbasic_20220218.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment: Fragment() {

//    1. 어떤 xml 을 쓸 것인지 - onCreateView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

//    2. 어떤 동작을 할 것인지. - onActivityCreated
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {
            // 프래그먼트는 부품이라 화면의 기능을 할 수 없다.
            Toast.makeText(requireContext(), "프래그먼트에서 띄우는 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}