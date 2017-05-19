package com.huangbo.baseprojecet.persenter;

import com.huangbo.baseprojecet.base.BasePersenter;
import com.huangbo.baseprojecet.bean.LocationBean;
import com.huangbo.baseprojecet.http.MineService;
import com.huangbo.baseprojecet.imple.TestModleImple;
import com.huangbo.baseprojecet.modle.TestModle;
import com.huangbo.baseprojecet.view.TestView;

import javax.inject.Inject;

/**
 * Created by huangb on 2017/5/10.
 */

public class TestPersenter extends BasePersenter<TestView<LocationBean>, TestModle> {

    @Inject
    public TestPersenter(MineService mService, TestView<LocationBean> mView, TestModle mModuleImpl) {
        super(mService, mView, mModuleImpl);
    }


    public void mai() {
        mMoudle.getIpInfo("116.228.89.150");

    }
}
