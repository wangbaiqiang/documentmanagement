package com.hipad.documentmanagement.mvp_framework.support.view.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckBox;

import com.hipad.documentmanagement.mvp_framework.base.presenter.MvpPresenter;
import com.hipad.documentmanagement.mvp_framework.base.view.MvpView;
import com.hipad.documentmanagement.mvp_framework.support.delegate.viewgroup.ViewGroupMvpDelegateCallback;
import com.hipad.documentmanagement.mvp_framework.support.delegate.viewgroup.ViewGroupMvpDelegateImpl;


public abstract class MvpCheckBox<V extends MvpView, P extends MvpPresenter<V>>
		extends android.support.v7.widget.AppCompatCheckBox implements ViewGroupMvpDelegateCallback<V, P>,
		MvpView {

	private ViewGroupMvpDelegateImpl<V, P> mvpDelegateImpl;

	private P presenter;

	private boolean isRetainInstance;

	public MvpCheckBox(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MvpCheckBox(Context context) {
		super(context);
	}

	private ViewGroupMvpDelegateImpl<V, P> getMvpDelegate() {
		if (mvpDelegateImpl == null) {
			mvpDelegateImpl = new ViewGroupMvpDelegateImpl<V, P>(this);
		}
		return mvpDelegateImpl;
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		getMvpDelegate().onAttachedToWindow();
	}

	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		getMvpDelegate().onDetachedFromWindow();
	}

	@Override
	public Parcelable onSaveInstanceState() {
		super.onSaveInstanceState();
		return getMvpDelegate().onSaveInstanceState();
	}

	@Override
	public void onRestoreInstanceState(Parcelable state) {
		super.onRestoreInstanceState(state);
		getMvpDelegate().onRestoreInstanceState(state);
	}

	@Override
	public P getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(P presenter) {
		this.presenter = presenter;
	}

	@Override
	public V getMvpView() {
		return (V) this;
	}

	@Override
	public void setRetainInstance(boolean retaionInstance) {
		this.isRetainInstance = retaionInstance;
	}

	@Override
	public boolean isRetainInstance() {
		return this.isRetainInstance;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		return this.isRetainInstance;
	}

	@Override
	public Parcelable superOnSaveInstanceState() {
		return super.onSaveInstanceState();
	}

	@Override
	public void superOnRestoreInstanceState(Parcelable state) {
		super.onRestoreInstanceState(state);
	}

	@Override
	public Context getSuperContext() {
		return getContext();
	}

}
