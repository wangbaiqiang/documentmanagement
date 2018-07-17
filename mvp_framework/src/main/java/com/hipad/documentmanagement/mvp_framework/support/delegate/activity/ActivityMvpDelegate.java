package com.hipad.documentmanagement.mvp_framework.support.delegate.activity;

import android.os.Bundle;

import com.hipad.documentmanagement.mvp_framework.base.presenter.MvpPresenter;
import com.hipad.documentmanagement.mvp_framework.base.view.MvpView;


/**
 * 代理模式－静态代理：定义Activity目标接口
 * 
 * 监听Activity生命周期的方法
 * 
 *
 * @param <V>
 * @param <P>
 */
public interface ActivityMvpDelegate<V extends MvpView, P extends MvpPresenter<V>> {
	public void onCreate(Bundle savedInstanceState);

	public void onStart();

	public void onPause();

	public void onResume();

	public void onRestart();

	public void onStop();

	public void onDestroy();

	public void onContentChanged();

	public void onSaveInstanceState(Bundle outState);

	public void onAttachedToWindow();
	
	public Object onRetainCustomNonConfigurationInstance();
	
	public Object getLastCustomNonConfigurationInstance();

}
