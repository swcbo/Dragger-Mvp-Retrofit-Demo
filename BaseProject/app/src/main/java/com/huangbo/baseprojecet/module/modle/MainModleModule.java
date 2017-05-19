package com.huangbo.baseprojecet.module.modle;

import com.huangbo.baseprojecet.bean.LocationBean;
import com.huangbo.baseprojecet.http.MineService;
import com.huangbo.baseprojecet.imple.MainModleImp;
import com.huangbo.baseprojecet.modle.MainModle;
import com.huangbo.baseprojecet.sconp.MainSconp;
import com.huangbo.baseprojecet.view.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huangb on 2017/5/11.
 */

@Module
public class MainModleModule {


    @MainSconp
    @Provides
    MainModle MainModleModule(MineService mService, MainView<LocationBean> mView) {
        return new MainModle(mService, mView);
    }
}
