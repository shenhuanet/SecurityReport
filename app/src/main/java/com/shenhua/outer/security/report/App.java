package com.shenhua.outer.security.report;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by shenhua on 2017-09-26-0026.
 * Email shenhuanet@126.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this, "6842d8b3bd", false);
    }
}
