package com.huangbo.baseprojecet.modle;

import android.widget.Toast;

import com.huangbo.baseprojecet.App;
import com.huangbo.baseprojecet.base.BaseModle;
import com.huangbo.baseprojecet.bean.LocationBean;
import com.huangbo.baseprojecet.http.MineService;
import com.huangbo.baseprojecet.imple.TestModleImple;
import com.huangbo.baseprojecet.view.TestView;

import javax.inject.Inject;

import rx.Subscriber;

/**
 * Created by huangb on 2017/5/11.
 */

public class TestModle extends BaseModle<TestView<LocationBean>> implements TestModleImple {

    @Inject
    public TestModle(MineService mService, TestView mView) {
        super(mService, mView);
    }

    @Override
    public void getIpInfo(String ip) {
        addSubscription(mService.getIPInfo(ip), new Subscriber<LocationBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.success(new LocationBean());
            }

            @Override
            public void onNext(LocationBean taobaoIPLocationInfo) {
                mView.success(taobaoIPLocationInfo);
                Toast.makeText(App.get(), taobaoIPLocationInfo.getData().toString(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}