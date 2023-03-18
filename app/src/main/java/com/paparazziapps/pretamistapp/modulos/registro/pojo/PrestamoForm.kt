package com.paparazziapps.pretamistapp.modulos.registro.pojo

import com.google.firebase.database.PropertyName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PrestamoForm (
    @SerialName("id")
    var id:String?=null,
    @SerialName("nombres")
    var nombres:String? = null,
    @SerialName("apellidos")
    var apellidos: String? = null,
    @SerialName("dni")
    var dni:String? = null,
    @SerialName("celular")
    var celular:String? = null,
    @SerialName("fecha")
    var fecha:String? = null,
    @SerialName("unixtime")
    var unixtime:Long?= null,
    @SerialName("unixtimeRegistered")
    var unixtimeRegistered: Long? = null,
    @SerialName("capital")
    var capital:Int? = null,
    @SerialName("interes")
    var interes:Int? = null,
    @SerialName("plazo_vto")
    var plazo_vto:Int?=null,
    //Calcular dias retrasados y
    @SerialName("dias_restantes_por_pagar")
    var dias_restantes_por_pagar:Int?=null,
    @SerialName("fechaUltimoPago")
    var fechaUltimoPago: String? = null,
    @SerialName("diasPagados")
    var diasPagados: Int? = null,
    @SerialName("montoTotalAPagar")
    var montoTotalAPagar:Double?=null,
    @SerialName("montoDiarioAPagar")
    var montoDiarioAPagar:Double?=null,
    @SerialName("state")
    var state:String?= null, //CERRADO,ABIERTO
    //Sucursal
    @SerialName("sucursalId")
    var sucursalId:Int?=null,
    @SerialName("type")
    var type:Int?=null,
    @SerialName("title")
    var title:String?=null
)

//PrestamoResponse
@Serializable
data class PrestamoResponse (
    val id:String = "",
    val nombres:String = "",
    val apellidos: String = "",
    val dni:String = "",
    val celular:String = "",
    val fecha:String = "",
    val unixtime:Long = 0,
    val unixtimeRegistered: Long = 0,
    val capital:Int = 0,
    val interes:Int = 0,
    val plazo_vto:Int = 0,
    val dias_restantes_por_pagar:Int = 0,
    val fechaUltimoPago: String = "",
    val diasPagados: Int = 0,
    val montoTotalAPagar:Double = 0.0,
    val montoDiarioAPagar:Double = 0.0,
    val state:String = "",
    val sucursalId:Int = -1,
    val type:Int?= -1,
    val title:String?= ""
){
    //default constructor
    constructor():this("","","","","","",0,0,0,0,0,0,"",0,0.0,0.0,"",-1)
}

fun PrestamoResponse.toPrestamoForm(): PrestamoForm {
    return PrestamoForm(
        id = this.id,
        nombres = this.nombres,
        apellidos = this.apellidos,
        dni = this.dni,
        celular = this.celular,
        fecha = this.fecha,
        unixtime = this.unixtime,
        unixtimeRegistered = this.unixtimeRegistered,
        capital = this.capital,
        interes = this.interes,
        plazo_vto = this.plazo_vto,
        dias_restantes_por_pagar = this.dias_restantes_por_pagar,
        fechaUltimoPago = this.fechaUltimoPago,
        diasPagados = this.diasPagados,
        montoTotalAPagar = this.montoTotalAPagar,
        montoDiarioAPagar = this.montoDiarioAPagar,
        state = this.state,
        sucursalId = this.sucursalId
    )
}

enum class TypePrestamo(val value: Int) {
    TITLE(0),
    CARD(1)
}