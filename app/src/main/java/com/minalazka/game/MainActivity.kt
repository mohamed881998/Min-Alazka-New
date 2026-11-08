package com.minalazka.game
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
class MainActivity: Activity() {
 private lateinit var web: WebView
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
  web=WebView(this); web.settings.javaScriptEnabled=true; web.settings.domStorageEnabled=true
  web.webViewClient=WebViewClient(); web.webChromeClient=WebChromeClient()
  web.loadUrl("file:///android_asset/index.html"); setContentView(web)
 }
 override fun onBackPressed() { if(web.canGoBack()) web.goBack() else super.onBackPressed() }
}