package zendesk.support;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.zendesk.logger.Logger;
import defpackage.r48;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
class SupportSdkMetadata {
    private final ActivityManager activityManager;
    private final Context context;

    SupportSdkMetadata(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    private String getManufacturer() {
        String str = Build.MANUFACTURER;
        return (DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str) || r48.d(str)) ? "" : str;
    }

    private String getModel() {
        String str = Build.MODEL;
        boolean z = true;
        boolean z2 = DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str) || r48.d(str);
        String str2 = Build.DEVICE;
        if (!DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str2) && !r48.d(str2)) {
            z = false;
        }
        return (z2 && z) ? "" : str.equals(str2) ? str : String.format(Locale.US, "%s/%s", str, str2);
    }

    private String getModelDeviceName() {
        return Build.DEVICE;
    }

    @TargetApi(16)
    private long getTotalMemory() {
        Logger.b("SupportSdkMetadata", "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    @TargetApi(16)
    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    private int getVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    private String getVersionName() {
        return Build.VERSION.RELEASE;
    }

    private boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    Map<String, String> getDeviceInfoAsMapForMetaData() {
        HashMap hashMap = new HashMap();
        hashMap.put("device_os", getVersionName());
        hashMap.put("device_api", String.valueOf(getVersionCode()));
        hashMap.put("device_model", getModel());
        hashMap.put("device_name", getModelDeviceName());
        hashMap.put("device_manufacturer", getManufacturer());
        hashMap.put("device_total_memory", getBytesInMb(getTotalMemory()));
        hashMap.put("device_used_memory", getBytesInMb(getUsedMemory()));
        hashMap.put("device_low_memory", String.valueOf(isLowMemory()));
        hashMap.put("device_battery", String.valueOf(getBatteryLevel()));
        return hashMap;
    }
}
