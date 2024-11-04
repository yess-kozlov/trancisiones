package com.example.trancisiones

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button = view.findViewById(R.id.button_to_fragment_b)
        button.setOnClickListener {
            (activity as MainActivity).navigateToFragmentB()
        }

        val imageView: ImageView = view.findViewById(R.id.image_view)
        val textView: TextView = view.findViewById(R.id.text_view)

        button.setOnClickListener {
            TransitionManager.beginDelayedTransition(view as ViewGroup, ChangeBounds())
            val params = imageView.layoutParams
            params.height += 100
            params.width += 100
            imageView.layoutParams = params
            textView.text = "¡Imagen expandida!"
        }
    }
}
