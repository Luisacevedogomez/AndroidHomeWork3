package com.example.spotifytemplate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_cancion.view.*

class CancionesAdapter(private val gContext: Context, private val listaCanciones: List<Cancion>): ArrayAdapter<Cancion>(gContext, 0,listaCanciones) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(gContext).inflate(R.layout.item_cancion, parent,false )
        val cancion = listaCanciones[position]
        layout.title.text=cancion.nombre
        layout.album.text=cancion.album
        return layout
    }
}