package com.example.spotifytemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cancion1= Cancion("Should've Known Better","Richard Marx" )
        val cancion2= Cancion("Dont't Mean Nothing","Richard Marx" )
        val cancion3= Cancion("EndlessSummer Nights","Richard Marx" )
        val cancion4= Cancion("Lonely Heart","Richard Marx" )
        val cancion5= Cancion("Hold On To The Nights","Richard Marx" )
        val cancion6= Cancion("Have Mercy","Richard Marx" )
        val cancion7= Cancion("Remember Manhattan","Richard Marx" )
        val cancion8= Cancion("The Flame Of Love","Richard Marx" )
        val cancion9= Cancion("Rhythm Of Life","Richard Marx" )
        val cancion10= Cancion("Heaven Only Knows","Richard Marx" )

        val listaCanciones = listOf(cancion1,cancion2,cancion3,cancion4,cancion5,cancion6,cancion7,cancion8,cancion9,cancion10)

        val adapter = CancionesAdapter(this, listaCanciones)

        canciones.adapter = adapter
    }
}
