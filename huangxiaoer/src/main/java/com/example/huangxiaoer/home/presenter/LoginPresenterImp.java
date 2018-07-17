package com.example.huangxiaoer.home.presenter;

import com.example.huangxiaoer.bean.LoginBean;
import com.example.huangxiaoer.home.model.LoginModel;
import com.example.huangxiaoer.home.view.LoginView;

/**
 * Created by john on 2018/7/10.
 */

public class LoginPresenterImp implements LoginPresenter{
    private LoginView view;
    private LoginModel model;

    public LoginPresenterImp(LoginView view) {
        this.view = view;
        model=new LoginModel();
    }
public void getLogin(String mobile,String password){
        model.getLogin(mobile,password,this);

}
    @Override
    public void loginSuccess(LoginBean bean) {
view.loginSuccess(bean);
    }
}
