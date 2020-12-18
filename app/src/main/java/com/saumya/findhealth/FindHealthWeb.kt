package com.saumya.findhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient

class FindHealthWeb : AppCompatActivity() {

    private lateinit var fhWebView:WebView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_health_web)

        //Log.v("RAY", "FindHealthWeb : ----------------")
        this.fhWebView = findViewById<WebView>(R.id.fhWeb)
        setWebview()
    }

    // Making the Android Back Button to take a web browser go back in the history
    // Ref: https://www.youtube.com/watch?v=v6TVbKbfopk
    //
    override fun onBackPressed() {
        //super.onBackPressed()
        //Log.v("RAY", "onBackPressed : --------------------")
        if( fhWebView.canGoBack() ){
            fhWebView.goBack()
        }else{
            super.onBackPressed()
        }
    }


    private fun setWebview(){

        //val fhWebView: WebView = findViewById<WebView>(R.id.fhWeb)
        //var sURL = "https://findhealth.today"
        var sURL = "https://www.google.com"
        var sView = intent.getStringExtra("view")

        //val fhWebView = findViewById<WebView>(R.id.fhWeb)
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

