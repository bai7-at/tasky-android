package com.comscore.android.util.jni;

import android.app.Application;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.comscore.BuildConfig;
import com.comscore.android.CommonUtils;
import com.comscore.android.ConnectivityType;
import com.comscore.android.HostApplicationState;
import com.comscore.android.id.CrossPublisherId;
import com.comscore.android.id.DeviceId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.comscore.android.util.BackgroundManager;
import com.comscore.android.util.Permissions;
import com.comscore.android.util.update.UpdateFrom5_4_x;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.TcfDataLoader;
import com.comscore.util.crashreport.CrashReportDecorator;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class AndroidJniHelper extends JniComScoreHelper {
    public static final String KEY_PACKAGE_MANAGER = "packageManager";
    private Context a;
    private BackgroundManager b;
    private UpdateFrom5_4_x c;
    private int d = -1;
    private int e = -1;
    private AndroidTcfDataLoader f = new AndroidTcfDataLoader();

    private int a(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected CrashReportDecorator createCrashReportDecorator() {
        return new AndroidCrashReportDecorator(this);
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getAppDataDir() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return context.getFilesDir().getAbsolutePath();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getApplicationId() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getApplicationName() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return CommonUtils.getApplicationName(context);
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getApplicationVersion() {
        return CommonUtils.getApplicationVersion(this.a);
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getArchitecture() {
        return CommonUtils.getDeviceArchitecture();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected int getConnectivityType() {
        Context context = this.a;
        return context == null ? ConnectivityType.UNKNOWN : CommonUtils.getConnectivityType(context);
    }

    public Context getContext() {
        return this.a;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected String getCrossPublisherUniqueDeviceId() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        CrossPublisherId crossPublisherDeviceId = IdHelperAndroid.getCrossPublisherDeviceId(context);
        StringBuilder sb = new StringBuilder();
        String str = crossPublisherDeviceId.crossPublisherId;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(crossPublisherDeviceId.source);
        return sb.toString();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected int getCurrentHostApplicationState() {
        int state = HostApplicationState.getState(this.a);
        if (state == -1) {
            state = 1;
        }
        if (this.d == -1) {
            this.d = state != 0 ? 2 : 1;
        }
        return state;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String[] getDeviceIds() {
        DeviceId deviceId = IdHelperAndroid.getDeviceId(this.a);
        return new String[]{deviceId.getId() + " " + deviceId.getCommonness() + "" + deviceId.getPersistency() + " true " + deviceId.getSource() + " " + a(deviceId.getSource())};
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getDeviceModel() {
        return CommonUtils.getDeviceModel();
    }

    public int getFirstHostState() {
        return this.d;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected String[] getInvalidIds() {
        return IdHelperAndroid.INVALID_ID_VALUES;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected String getLanguage() {
        return CommonUtils.getLanguage();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getOsName() {
        return "android";
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getOsVersion() {
        return CommonUtils.getOsVersion();
    }

    public String getPackageManagerName() {
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        Context context = this.a;
        if (context == null) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(this.a.getPackageName());
                installerPackageName = installSourceInfo.getInitiatingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(this.a.getPackageName());
            }
            return !TextUtils.isEmpty(installerPackageName) ? installerPackageName : DatasetUtils.UNKNOWN_IDENTITY_ID;
        } catch (PackageManager.NameNotFoundException unused) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getPlatformEnvironmentProperties() {
        return String.format(Locale.getDefault(), "%d-%d-%d%d%d-%d-%d", Integer.valueOf(IdHelperAndroid.getCrossPublisherDeviceId(this.a).source), Integer.valueOf(IdHelperAndroid.getDeviceId(this.a).getSource()), Integer.valueOf(Permissions.check(this.a, "android.permission.INTERNET").booleanValue() ? 1 : 0), Integer.valueOf(Permissions.check(this.a, "android.permission.ACCESS_NETWORK_STATE").booleanValue() ? 1 : 0), Integer.valueOf(Permissions.check(this.a, "android.permission.ACCESS_WIFI_STATE").booleanValue() ? 1 : 0), Integer.valueOf(isLibraryInstalledUsingMaven() ? 1 : 0), Integer.valueOf(this.d));
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected Map<String, String> getPlatformLabels(Map<String, String> map) {
        if (this.a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i = IdHelperAndroid.getCrossPublisherDeviceId(this.a).source;
        hashMap.put("ns_ap_res", CommonUtils.getApplicationResolution(this.a));
        if (i == 1 && !TextUtils.isEmpty(map.get("ns_ak"))) {
            String mD5CrossPublisherDeviceId = CrossPublisherIdUtil.getMD5CrossPublisherDeviceId();
            if (!TextUtils.isEmpty(mD5CrossPublisherDeviceId)) {
                hashMap.put("ns_ap_i3", mD5CrossPublisherDeviceId);
            }
        }
        if (TextUtils.isEmpty(map.get("ns_ap_an"))) {
            hashMap.put("ns_ap_an", getApplicationName());
        }
        if (TextUtils.isEmpty(map.get("ns_ap_ver"))) {
            hashMap.put("ns_ap_ver", getApplicationVersion());
        }
        if (TextUtils.isEmpty(map.get("ns_ap_bi"))) {
            hashMap.put("ns_ap_bi", getApplicationId());
        }
        hashMap.put("ns_ap_ais", getPackageManagerName());
        return hashMap;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getRuntimeName() {
        return "android";
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public String getRuntimeVersion() {
        return getOsVersion();
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected int getScreenHeight() {
        Context context = this.a;
        if (context == null) {
            return 0;
        }
        return CommonUtils.getDisplaySize(context).y;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected int getScreenWidth() {
        Context context = this.a;
        if (context == null) {
            return 0;
        }
        return CommonUtils.getDisplaySize(context).x;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected TcfDataLoader getTcfDataLoader() {
        return this.f;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected boolean isJailBroken() {
        return CommonUtils.isDeviceRooted();
    }

    public boolean isLibraryInstalledUsingMaven() {
        if (this.e == -1) {
            try {
                this.e = ((String) BuildConfig.class.getField("FLAVOR").get(null)).startsWith(BuildConfig.FLAVOR) ? 1 : 0;
            } catch (Exception unused) {
                this.e = 0;
            }
        }
        return this.e == 1;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected boolean libraryPostUpdate(String str, String str2, Map<String, String> map, ArrayList<String> arrayList) {
        UpdateFrom5_4_x updateFrom5_4_x = this.c;
        if (updateFrom5_4_x == null) {
            return false;
        }
        updateFrom5_4_x.libraryPostUpdate(map, arrayList);
        return true;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    protected boolean libraryUpdate(String str, String str2, Map<String, String> map) {
        if ((str != null && str.length() != 0) || map.containsKey("updated_from_versions")) {
            return false;
        }
        UpdateFrom5_4_x updateFrom5_4_x = new UpdateFrom5_4_x(this.a);
        this.c = updateFrom5_4_x;
        updateFrom5_4_x.libraryUpdate(map);
        return true;
    }

    public void setContext(Context context) {
        if (context == null) {
            throw new NullPointerException("The Context parameter provided cannot be null.");
        }
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            throw new NullPointerException("The Context provided by context.getApplicationContext() cannot be null.");
        }
        this.f.setContext(applicationContext);
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public boolean subscribeToForegroundNotification() {
        Context context = this.a;
        if (!(context instanceof Application)) {
            Logger.w("Unable to detect automatically if the application is in the foreground or in the background.");
            return false;
        }
        BackgroundManager backgroundManager = new BackgroundManager((Application) context);
        this.b = backgroundManager;
        backgroundManager.register();
        return true;
    }

    @Override // com.comscore.util.jni.JniComScoreHelper
    public boolean unsubscribeFromForegroundNotification() {
        BackgroundManager backgroundManager = this.b;
        if (backgroundManager == null) {
            return false;
        }
        backgroundManager.unregister();
        return true;
    }
}
