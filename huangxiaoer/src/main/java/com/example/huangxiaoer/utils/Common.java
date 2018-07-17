package com.example.huangxiaoer.utils;


import com.example.huangxiaoer.bean.OffSetZeroBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by john on 2018/7/14.
 */

public interface Common {
    String THREE_URL="http://www.wanandroid.com/tools/mockapi/6523/";
    @GET("restaurants_offset_0_limit_4")
    Observable<OffSetZeroBean> getZero();
}
