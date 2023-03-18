package com.paparazziapps.pretamistapp.modulos.dashboard.interfaces

import com.paparazziapps.pretamistapp.modulos.registro.pojo.PrestamoForm

interface setOnClickedPrestamo {

    fun actualizarPagoPrestamo(prestamoForm:PrestamoForm, needUpdate: Boolean, montoTotalAPagar:Double, adapterPosition:Int, diasRestrasado:String)
    fun openDialogoActualizarPrestamo(prestamoForm:PrestamoForm, montoTotalAPagar:Double, adapterPosition:Int, diasRestantesPorPagar:Int, diasPagados:Int, isClosed:Boolean)
}