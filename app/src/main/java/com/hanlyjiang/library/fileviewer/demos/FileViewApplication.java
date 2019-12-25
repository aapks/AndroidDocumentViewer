package com.hanlyjiang.library.fileviewer.demos;

import android.app.Application;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

/**
 *
 */
public class FileViewApplication extends Application {

    public static String FILE_DIR = "/sdcard/aaaa/";
    public static final String TAG = "TBSInit";

    @Override
    public void onCreate() {
        super.onCreate();
        initX5Web();
//        FILE_DIR = new File(getFilesDir(), "test").getAbsolutePath() + File.separator;
//        try {
//            FileUtils.copyAssetsDir(this, "test", FILE_DIR);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    private void initX5Web() {
        Log.i(TAG, "QbSdk.initX5Environment");
        QbSdk.initX5Environment(getApplicationContext(), new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.d(TAG, "onCoreInitFinished");
            }

            @Override
            public void onViewInitFinished(boolean initResult) {
                Log.e(TAG, "onViewInitFinished" + initResult);
            }
        });
    }


}
