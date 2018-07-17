package com.example.huangxiaoer.home.model;

import com.example.huangxiaoer.bean.LoginBean;
import com.example.huangxiaoer.utils.RetrofitUtils;
import com.example.huangxiaoer.home.presenter.LoginPresenterImp;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by john on 2018/7/10.
 */

public class LoginModel {
    public void getLogin(String mobile, String password, final LoginPresenterImp presenterImp){
        RetrofitUtils.getInstance().getLogin(mobile,password).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean bean) {
                    presenterImp.loginSuccess(bean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
