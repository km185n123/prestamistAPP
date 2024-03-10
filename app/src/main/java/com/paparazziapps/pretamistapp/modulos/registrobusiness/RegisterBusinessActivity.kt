package com.paparazziapps.pretamistapp.modulos.registrobusiness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paparazziapps.pretamistapp.R
import com.paparazziapps.pretamistapp.databinding.ActivityRegisterBusinessBinding
import com.paparazziapps.pretamistapp.utils.BaseActivity

class RegisterBusinessActivity : BaseActivity<ActivityRegisterBusinessBinding>(ActivityRegisterBusinessBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}