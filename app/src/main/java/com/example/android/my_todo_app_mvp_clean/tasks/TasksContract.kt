package com.example.android.my_todo_app_mvp_clean.tasks

import com.example.android.my_todo_app_mvp_clean.BasePresenter
import com.example.android.my_todo_app_mvp_clean.BaseView

/**
 * Created by VinhTL on 28/01/2018.
 */
interface TasksContract {
    interface View : BaseView<Presenter>{
        
    }
    
    interface Presenter : BasePresenter{
        fun result(requestCode: Int, resultCode: Int)
        fun loadTasks(forceUpdate: Boolean)
        fun addNewTasks()
        fun openTaskDetail(requestedTasks: Task)
    }
}