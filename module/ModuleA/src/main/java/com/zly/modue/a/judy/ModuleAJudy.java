package com.zly.modue.a.judy;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.zly.judy.api.KeepSource;
import com.zly.judy.api.annontations.JudyBridge;
import com.zly.judy.lib.common.JudyHelper;
import com.zly.judy.lib.common.JudyTest;
import com.zly.judy.lib.common.annontations.ClassAnn;
import com.zly.modue.a.ModuleAFragment;
import com.zly.modue.a.UserCenterActivity;

/**
 * 模块A对外暴露的服务
 * Created by Zhuliya on 2018/8/23
 */
@JudyBridge
@ClassAnn
public class ModuleAJudy implements KeepSource {

    /**
     * 进入个人中心
     *
     * @param context
     */
    public void forwordUserCenter(Context context) {
        if (JudyTest.isLogin()) {
            Intent intent = new Intent(context, UserCenterActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //进入个人中心
            context.startActivity(intent);
        } else {
            //未登录，先进入登录页面
            JudyHelper.getLoginJudyBridge().forwrodLogin(context, UserCenterActivity.class.getName());
        }
    }

    /**
     * 获取模块A Fragment
     *
     * @return
     */
    public Fragment getModuleAFragment() {
        return new ModuleAFragment();
    }
}
