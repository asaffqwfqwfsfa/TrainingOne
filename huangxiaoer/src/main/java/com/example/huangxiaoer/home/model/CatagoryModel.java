package com.example.huangxiaoer.home.model;

import com.example.huangxiaoer.bean.CatagoryBean;
import com.example.huangxiaoer.home.presenter.CatagoryPresenterImp;
import com.example.huangxiaoer.utils.RetrofitUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by john on 2018/7/10.
 */

public class CatagoryModel {
    public void getCatagory(final CatagoryPresenterImp presenterImp){
        RetrofitUtils.getInstance().getCatagory().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CatagoryBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CatagoryBean bean) {
                    presenterImp.catagorySuccess(bean);
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
