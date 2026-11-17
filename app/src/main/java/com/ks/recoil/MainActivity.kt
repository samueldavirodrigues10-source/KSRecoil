package com.ks.recoil

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color

class MainActivity : AppCompatActivity() {

    private lateinit var dotOverlay: View
    private lateinit var dotAccess: View
    private lateinit var tvOverlayStatus: TextView
    private lateinit var tvAccessStatus: TextView
    private lateinit var tvActiveWeapon: TextView
    private lateinit var btnStart: Button
    private lateinit var rowAR: LinearLayout
    private lateinit var rowSMG: LinearLayout
    private lateinit var rowLMG: LinearLayout

    private val chipViews = mutableMapOf<String, TextView>()
    private var selectedProfile: WeaponProfile? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dotOverlay     = findViewById(R.id.dotOverlay)
        dotAccess      = findViewById(R.id.dotAccess)
        tvOverlayStatus = findViewById(R.id.tvOverlayStatus)
        tvAccessStatus  = findViewById(R.id.tvAccessStatus)
        tvActiveWeapon  = findViewById(R.id.tvActiveWeapon)
        btnStart        = findViewById(R.id.btnStart)
        rowAR           = findViewById(R.id.rowAR)
        rowSMG          = findViewById(R.id.rowSMG)
        rowLMG          = findViewById(R.id.rowLMG)

        findViewById<Button>(R.id.btnOverlay).setOnClickListener { requestOverlayPermission() }
