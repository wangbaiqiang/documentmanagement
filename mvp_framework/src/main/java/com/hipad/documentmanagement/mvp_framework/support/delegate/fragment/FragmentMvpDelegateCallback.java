package com.hipad.documentmanagement.mvp_framework.support.delegate.fragment;


import com.hipad.documentmanagement.mvp_framework.base.presenter.MvpPresenter;
import com.hipad.documentmanagement.mvp_framework.base.view.MvpView;
import com.hipad.documentmanagement.mvp_framework.support.delegate.MvpDelegateCallback;

/**
 * 扩展目标接口 针对不同的模块，目标接口有差异
 * 
 */
public interface FragmentMvpDelegateCallback<V extends MvpView, P extends MvpPresenter<V>>
		extends MvpDelegateCallback<V, P> {
	
}
