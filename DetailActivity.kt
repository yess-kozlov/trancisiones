package com.example.trancisiones

import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionInflater
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Configurar la transición
        val transition: Transition = TransitionInflater.from(this).inflateTransition(R.transition.image_transition)
        window.sharedElementEnterTransition = transition

        // Obtener la imagen
        val imageView: ImageView = findViewById(R.id.image_view_detail)
        imageView.setImageResource(R.drawable.img)
    }
}
