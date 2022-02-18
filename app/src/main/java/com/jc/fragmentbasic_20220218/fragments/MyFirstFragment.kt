package com.jc.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jc.fragmentbasic_20220218.R

class MyFirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 여기서는 inflate 에 부가 정보를 주어야 한다.
        // attachToRoot 해당 뷰가 root 에도 붙는지
        return inflater.inflate(R.layout.fragment_my_first, container, false)

    }

}