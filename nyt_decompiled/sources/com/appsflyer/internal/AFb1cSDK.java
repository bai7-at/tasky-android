package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
public final class AFb1cSDK implements AFd1pSDK {
    private final SharedPreferences AFInAppEventParameterName;

    public AFb1cSDK(SharedPreferences sharedPreferences) {
        this.AFInAppEventParameterName = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.AFInAppEventParameterName.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFInAppEventType(String str, long j) {
        this.AFInAppEventParameterName.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final String valueOf(String str, String str2) {
        try {
            return this.AFInAppEventParameterName.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final int values(String str) {
        try {
            return this.AFInAppEventParameterName.getInt(str, 0);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFInAppEventParameterName(String str, boolean z) {
        this.AFInAppEventParameterName.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFInAppEventType(String str, int i) {
        this.AFInAppEventParameterName.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final long AFInAppEventParameterName(String str) {
        try {
            return this.AFInAppEventParameterName.getLong(str, 0L);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0L;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFInAppEventType(String str) {
        this.AFInAppEventParameterName.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean valueOf(String str) {
        try {
            return this.AFInAppEventParameterName.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }
}
