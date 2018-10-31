package com.java.baselibrary.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;

import java.util.Stack;

/**
 * Created by Pan on 2018/10/30.
 */

public class AppManager {


    private Stack<Activity> activityStack = new Stack<>();

    private AppManager() {
    }

    private static class AppManagerHolder {
        private static final AppManager instance = new AppManager();
    }

    public static AppManager getInstance() {
        return AppManagerHolder.instance;
    }

    public void addActivity(Activity activity) {
        activityStack.add(activity);
    }

    public void finishActivity(Activity activity) {
        activity.finish();
        activityStack.remove(activity);
    }


    public Activity currentActivity() {
        return activityStack.lastElement();
    }

    public void finishAllActivity() {
        for (Activity activity : activityStack) {
            activity.finish();
        }
        activityStack.clear();
    }

    public void exitApp(Context context) {
        finishAllActivity();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        activityManager.killBackgroundProcesses(context.getPackageName());
        System.exit(0);
    }
}
