package com.example.android.my_todo_app_mvp_clean.tasks

import java.util.ArrayList

/**
 * Created by VinhTL on 28/01/2018.
 */

interface A {
    fun setup(re: Int)
    fun <V : ArrayList<String>> notifyResponse(response: V)
}
