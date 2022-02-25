package com.uniteinc.a7minutesworkout

import android.app.Application

class WorkOutApp:Application() {

    val db by lazy {
       HistoryDatabase.getINSTANCE(this)
    }

}