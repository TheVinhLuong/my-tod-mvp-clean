package com.example.android.my_todo_app_mvp_clean.tasks

import com.example.android.my_todo_app_mvp_clean.BasePresenter
import com.example.android.my_todo_app_mvp_clean.BaseView
import com.example.android.my_todo_app_mvp_clean.tasks.domain.model.Task

/**
 * Created by VinhTL on 28/01/2018.
 */
interface TasksContract {
    interface View : BaseView<Presenter> {
        fun setLoadingIndicator(active: Boolean?)
        fun showTasks(tasks: List<Task?>?)
        fun showAddTask()
        fun showTaskDetailsUi(taskId: String?)
        fun showTaskMarkedComplete()
        fun showTaskMarkedActive()
        fun showCompletedTasksCleared()
        fun showLoadingTasksError()
        fun showNoTasks()
        fun showActiveFilterLabel()
        fun showCompletedFilterLabel()
        fun showAllFilterLabel()
        fun showNoActiveTasks()
        fun showNoCompletedTasks()
        fun showSuccessfullySavedMessage()
        fun isActive(): Boolean
        fun showFilteringPopUpMenu()
    }

    interface Presenter : BasePresenter {
        fun result(requestCode: Int, resultCode: Int)
        fun loadTasks(forceUpdate: Boolean)
        fun addNewTasks()
        fun openTaskDetail(requestedTasks: Task)
        fun completeTask(completedTask: Task)
        fun activateTask(activeTask: Task)
        fun clearCompletedTasks()
        fun setFiltering(requestType: TasksFilterType)
        fun getFiltering(): TasksFilterType
    }
}