package com.namcobandaigames.spmoja01

import android.content.Context
import com.namcobandaigames.spmoja01.Constants.CAMP1
import com.namcobandaigames.spmoja01.Constants.DEEP1

import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class JsoupFun (val context: Context) {

    private var jsoup: String? = "null"
    private val hawk : String? = Hawk.get(CAMP1)
    private val hawkAppLink: String? = Hawk.get(DEEP1)

    private var forJsoupSetNaming: String = Constants.fLink + Constants.subber1 + hawk
    private var forJsoupSetAppLnk: String = Constants.fLink + Constants.subber1 + hawkAppLink

    suspend fun getDocSecretKey(): String?{
        withContext(Dispatchers.IO){
            if(hawk!=null) {
                val doc = Jsoup.connect(forJsoupSetNaming).get()
                jsoup = doc.text().toString()
            } else {
                val doc = Jsoup.connect(forJsoupSetAppLnk).get()
                jsoup = doc.text().toString()
            }
        }
        return jsoup
    }
}