package com.example.huangxiaoer.home.presenter;

import com.example.huangxiaoer.bean.VersionBean;
import com.example.huangxiaoer.home.model.VersionModel;
import com.example.huangxiaoer.home.view.VersionView;

/**
 * Created by john on 2018/7/12.
 */

public class VersionPresenterImp implements VersionPresenter{
    private VersionView versionView;
    private VersionModel model;

    public VersionPresenterImp(VersionView versionView) {
        this.versionView = versionView;
        model=new VersionModel();
    }
public void getVersion(String type){
        model.getVersion(type,this);
}
    @Override
    public void success(VersionBean bean) {
        versionView.success(bean);
    }
}
