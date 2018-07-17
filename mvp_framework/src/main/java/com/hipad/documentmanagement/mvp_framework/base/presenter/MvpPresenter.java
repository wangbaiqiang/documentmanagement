package com.hipad.documentmanagement.mvp_framework.base.presenter;


import com.hipad.documentmanagement.mvp_framework.base.view.MvpView;

/**
 * 抽象为接口
 */
public interface MvpPresenter<V extends MvpView> {

	/**
	 * 绑定视图
	 * 
	 * @param view
	 */
	public void attachView(V view);

	/**
	 * 解除绑定
	 */
	public void dettachView();
	
}
