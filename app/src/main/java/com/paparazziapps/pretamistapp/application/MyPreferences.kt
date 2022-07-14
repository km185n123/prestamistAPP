package com.paparazziteam.yakulap.helper.applicacion

import android.graphics.Color
import com.paparazziapps.pretamistapp.helper.INT_DEFAULT

class MyPreferences {

    val prefs = CacheData()

    //PREFERENCES STRING
    var email_login: String
        get()      = prefs.getString("email_login", "")
        set(value) = prefs.setString("email_login", value)

    var sucursalName: String
        get()      = prefs.getString("sucursalName", "")
        set(value) = prefs.setString("sucursalName", value)


    //PREFERENCES BOOLEAN
    var isLogin: Boolean
        get()      = prefs.getBoolean("isLogin", false)
        set(value) = prefs.setBoolean("isLogin", value)

    ////Logica de datos de registro de datos
    var isAdmin: Boolean
        get()      = prefs.getBoolean("isAdmin", false)
        set(value) = prefs.setBoolean("isAdmin", value)

    var isSuperAdmin: Boolean
        get()      = prefs.getBoolean("isSuperAdmin", false)
        set(value) = prefs.setBoolean("isSuperAdmin", value)

    var isActiveUser: Boolean
        get()      = prefs.getBoolean("isActiveUser", false)
        set(value) = prefs.setBoolean("isActiveUser", value)


    //PREFERENCES INTEGER
    var color: Int
        get() = prefs.getInt("color",  Color.parseColor("#ff0066"))
        set(value) = prefs.setInt("color", value)

    var sucursalId: Int
        get()      = prefs.getInt("sucursalId", INT_DEFAULT)
        set(value) = prefs.setInt("sucursalId", value)
}