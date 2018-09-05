package com.walkud.modue.a.judy;

import android.app.Activity;
import android.content.Intent;

import com.walkud.judy.api.annontations.JudyBridge;
import com.walkud.judy.lib.common.JudyHelper;
import com.walkud.modue.a.UserCenterActivity;

/**
 * 模块A对外暴露的Api
 * Created by Zhuliya on 2018/8/23
 */
@JudyBridge
public class ModuleAJudy {

    /**
     * 进入个人中心
     *
     * @param activity
     */
    public void forwordUserCenter(Activity activity) {
        if (JudyHelper.getLoginJudyBridge().isLogin()) {
            //进入个人中心
            activity.startActivity(new Intent(activity, UserCenterActivity.class));
        } else {
            //未登录，进入登录页面
            JudyHelper.getLoginJudyBridge().forwrodLogin(activity);
        }
    }
}
