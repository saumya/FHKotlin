package com.saumya.findhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class FindHealthWeb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_health_web)

        var sURL = "https://findhealth.today"
        var sView = intent.getStringExtra("view")

        val fhWebView = findViewById<WebView>(R.id.fhWeb)
        fhWebView.settings.javaScriptEnabled = true
        fhWebView.settings.allowContentAccess = true
        fhWebView.settings.allowFileAccess = true
        fhWebView.webViewClient = WebViewClient() // InApp Browser
        //fhWebView.webChromeClient = WebChromeClient() // Browser Window
        //fhWebView.loadUrl("https://findhealth.today/apps")

        if (sView == "fht"){
            sURL = "https://findhealth.today"
        }else if (sView == "fht_clinic"){
            sURL = "https://clinic.findhealth.today"
        }else if (sView == "fht_doctor"){
            sURL = "https://doctor.findhealth.today"
        }else if(sView == "fht_patient"){
            sURL = "https://letme.findhealth.today"
        }

        fhWebView.loadUrl(sURL)
    }
}