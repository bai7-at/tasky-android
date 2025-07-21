package io.embrace.android.embracesdk.capture.metadata;

import android.content.Context;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.payload.AppInfo;
import io.embrace.android.embracesdk.payload.DeviceInfo;
import io.embrace.android.embracesdk.payload.DiskUsage;

/* loaded from: classes5.dex */
public interface MetadataService {

    public static final class DefaultImpls {
        public static /* synthetic */ void setReactNativeBundleId$default(MetadataService metadataService, Context context, String str, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReactNativeBundleId");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            metadataService.setReactNativeBundleId(context, str, bool);
        }
    }

    Embrace.AppFramework getAppFramework();

    String getAppId();

    AppInfo getAppInfo();

    String getAppState();

    String getAppVersionCode();

    String getAppVersionName();

    String getCpuName();

    String getDeviceId();

    DeviceInfo getDeviceInfo();

    DiskUsage getDiskUsage();

    String getEgl();

    AppInfo getLightweightAppInfo();

    DeviceInfo getLightweightDeviceInfo();

    String getPackageName();

    String getReactNativeBundleId();

    String getScreenResolution();

    boolean isAppUpdated();

    Boolean isJailbroken();

    boolean isOsUpdated();

    void precomputeValues();

    void setReactNativeBundleId(Context context, String str, Boolean bool);
}
