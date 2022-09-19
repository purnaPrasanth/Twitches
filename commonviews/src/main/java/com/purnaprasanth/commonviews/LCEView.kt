package com.purnaprasanth.commonviews

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ViewAnimator

class LCEView : ViewAnimator {

    lateinit var loadingView: View
    lateinit var contentView: View
    lateinit var errorView: View

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        initialiseView(attributeSet)
    }

    private fun initialiseView(attributeSet: AttributeSet) {
        var attributeArray: TypedArray = context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.LCEView, 0, 0
        )

        val loadingViewId = attributeArray.getResourceId(R.styleable.LCEView_loading_view_id, 0)
        val contentId = attributeArray.getResourceId(R.styleable.LCEView_loading_view_id, 0)
        val errorId = attributeArray.getResourceId(R.styleable.LCEView_loading_view_id, 0)
        val layoutInflater = LayoutInflater.from(context)

        loadingView = layoutInflater.inflate(loadingViewId, this, false)
        contentView = layoutInflater.inflate(contentId, this, false)
        errorView = layoutInflater.inflate(errorId, this, false)

        addView(
            loadingView,
            LOADING_VIEW_INDEX,
            LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        )
        addView(
            contentView,
            CONTENT_VIEW_INDEX,
            LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        )
        addView(
            errorView,
            ERROR_VIEW_INDEX,
            LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        )
    }

    fun showLoading() {
        displayedChild = LOADING_VIEW_INDEX
    }

    fun showContent() {
        displayedChild = CONTENT_VIEW_INDEX
    }

    fun showError() {
        displayedChild = ERROR_VIEW_INDEX
    }

    companion object {
        private const val LOADING_VIEW_INDEX = 0
        private const val CONTENT_VIEW_INDEX = 1
        private const val ERROR_VIEW_INDEX = 2
    }
}