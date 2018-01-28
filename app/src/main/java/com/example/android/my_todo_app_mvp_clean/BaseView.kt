package com.example.android.my_todo_app_mvp_clean

/**
 * Created by VinhTL on 28/01/2018.
 */

interface BaseView<T : BasePresenter> {
    fun start()
}
