package com.jc.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jc.fragmentbasic_20220218.R
import kotlinx.android.synthetic.main.fragment_my_first.*

class MyFirstFragment : Fragment(){

    val TAG = "MyFirstFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 여기서는 inflate 에 부가 정보를 주어야 한다.
        // attachToRoot 해당 뷰가 root 에도 붙는지
        return inflater.inflate(R.layout.fragment_my_first, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        이 프래그먼트를 들고 있는 액티비티가 완전히 만들어진 시점.
//        이벤트 처리 / 데이터 보여주기 등등의 동작
        btnLog.setOnClickListener {
            Log.d(TAG, "프래그 먼트의 버튼으로 로그찍기")
        }

    }


}