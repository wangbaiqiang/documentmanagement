package com.hipad.documentmanagement.mvp_framework.support.delegate.view;

import android.content.Context;
import android.os.Parcelable;

import com.hipad.documentmanagement.mvp_framework.base.presenter.MvpPresenter;
import com.hipad.documentmanagement.mvp_framework.base.view.MvpView;
import com.hipad.documentmanagement.mvp_framework.support.delegate.MvpDelegateCallback;


/**
 * 针对ViewGroup集成MVP代理 目标接口
 * 
 *
 * @param <V>
 * @param <P>
 */
public interface ViewMvpDelegateCallback<V extends MvpView, P extends MvpPresenter<V>>
		extends MvpDelegateCallback<V, P> {
	/**
	 * 保存布局实例状态（这里是指布局相关数据）
	 * 
	 * @return
	 */
	public Parcelable superOnSaveInstanceState();

	/**
	 * 恢复布局实例状态
	 * 
	 * @param state
	 */
	public void superOnRestoreInstanceState(Parcelable state);
	
	public Context getSuperContext();
}
