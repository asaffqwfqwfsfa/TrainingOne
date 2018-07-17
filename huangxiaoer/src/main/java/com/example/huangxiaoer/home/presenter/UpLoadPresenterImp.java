package com.example.huangxiaoer.home.presenter;


import com.example.huangxiaoer.bean.UploadBean;
import com.example.huangxiaoer.home.model.UpLoadModel;
import com.example.huangxiaoer.home.view.UpLoadView;

import okhttp3.MultipartBody;

/**
 * Created by john on 2018/7/10.
 */

public class UpLoadPresenterImp implements UpLoadPresenter{
    private UpLoadView view;
    private UpLoadModel model;

    public UpLoadPresenterImp(UpLoadView view) {
        this.view = view;
        model=new UpLoadModel();
    }
    public void upLoad(MultipartBody.Part uid,MultipartBody.Part file){
        model.upLoad(uid,file,this);
    }

    @Override
    public void success(UploadBean bean) {
        view.success(bean);
    }
}
