package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFa1aSDK;

/* loaded from: classes2.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            str = null;
        }
        if (str != null && AFa1aSDK.AFInAppEventType(context).getString("referrer", null) != null) {
            AFa1aSDK.values().valueOf(context, str);
            return;
        }
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFa1aSDK.values().AFInAppEventParameterName(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                sb.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                AFLogger.afInfoLog(sb.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th2) {
                    StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                    sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afErrorLog(sb2.toString(), th2);
                }
            }
        }
    }
}
