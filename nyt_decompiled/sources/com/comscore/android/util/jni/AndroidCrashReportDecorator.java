package com.comscore.android.util.jni;

import android.content.Context;
import android.os.Looper;
import com.comscore.android.id.CrossPublisherId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.android.util.Permissions;
import com.comscore.util.crashreport.CrashReport;
import com.comscore.util.crashreport.CrashReportDecorator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AndroidCrashReportDecorator extends CrashReportDecorator {
    AndroidJniHelper f;

    AndroidCrashReportDecorator(AndroidJniHelper androidJniHelper) {
        super(androidJniHelper);
        this.f = androidJniHelper;
    }

    @Override // com.comscore.util.crashreport.CrashReportDecorator
    public void fillCrashReport(CrashReport crashReport) {
        CrossPublisherId crossPublisherDeviceId;
        String str;
        super.fillCrashReport(crashReport);
        crashReport.getExtras().put("ns_ap_ais", this.f.getPackageManagerName());
        Context context = this.f.getContext();
        if (context != null) {
            crashReport.getExtras().put("ns_ap_env", String.format(Locale.getDefault(), "%d-%d-%d%d%d-%d-%d", Integer.valueOf(IdHelperAndroid.getCrossPublisherDeviceId(context).source), Integer.valueOf(IdHelperAndroid.getDeviceId(context).getSource()), Integer.valueOf(Permissions.check(context, "android.permission.INTERNET").booleanValue() ? 1 : 0), Integer.valueOf(Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue() ? 1 : 0), Integer.valueOf(Permissions.check(context, "android.permission.ACCESS_WIFI_STATE").booleanValue() ? 1 : 0), Integer.valueOf(this.f.isLibraryInstalledUsingMaven() ? 1 : 0), Integer.valueOf(this.f.getFirstHostState())));
            if (Looper.myLooper() == Looper.getMainLooper() || !IdHelperAndroid.isAdvertisingIdEnabled(context) || (crossPublisherDeviceId = IdHelperAndroid.getCrossPublisherDeviceId(context)) == null || (str = crossPublisherDeviceId.crossPublisherId) == null || str.length() <= 0) {
                return;
            }
            crashReport.getExtras().put("ns_ap_i7", sha1(crossPublisherDeviceId.crossPublisherId));
        }
    }
}
