package com.example.huangxiaoer.home.presenter;


import com.example.huangxiaoer.bean.OffSetZeroBean;
import com.example.huangxiaoer.home.model.OrderModel;
import com.example.huangxiaoer.home.view.OrderView;

/**
 * Created by john on 2018/7/13.
 */

public class OrderPresenterImp implements OrderPresenter{
    private OrderView view;
    private OrderModel model;

    public OrderPresenterImp(OrderView view) {
        this.view = view;
        model=new OrderModel();
    }
public void getRestaurant(){
        model.getRestaurant(this);
}
    @Override
    public void success(OffSetZeroBean bean) {
view.success(bean);
    }
}
