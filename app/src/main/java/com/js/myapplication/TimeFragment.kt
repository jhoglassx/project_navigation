package com.js.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.js.myapplication.databinding.FragmentTimeBinding
import java.text.SimpleDateFormat
import java.util.*

class TimeFragment : Fragment() {

    private val binding by lazy {
        FragmentTimeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val date = Calendar.getInstance().time

        val dateTime = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        binding.txtSecond.text = dateTime.format(date)
    }
}
