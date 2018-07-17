package com.example.huangxiaoer.home.model;

import com.example.huangxiaoer.bean.HomeBean;
import com.example.huangxiaoer.utils.RetrofitUtils;
import com.example.huangxiaoer.home.presenter.HomePresenterImp;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by john on 2018/7/9.
 */

public class HomeModel {
    public void getHome(final HomePresenterImp presenterImp){
        RetrofitUtils.getInstance().getHome().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean bean) {

                    presenterImp.success(bean);
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
