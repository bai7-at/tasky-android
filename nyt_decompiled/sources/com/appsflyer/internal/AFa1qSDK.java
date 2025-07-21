package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AFa1qSDK {

    @Nullable
    Map<String, Object> AFInAppEventParameterName;

    @Nullable
    public Application AFInAppEventType;

    @Nullable
    String AFKeystoreWrapper;
    public String AFLogger;
    String afDebugLog;
    public String afErrorLog;
    String afInfoLog;
    public int afRDLog;
    private byte[] afWarnLog;
    private final boolean init;

    @Nullable
    public AppsFlyerRequestListener valueOf;
    public final Map<String, Object> values;

    public AFa1qSDK() {
        this(null, null, null, null);
    }

    public final AFa1qSDK AFInAppEventParameterName(byte[] bArr) {
        this.afWarnLog = bArr;
        return this;
    }

    public abstract AFc1jSDK AFInAppEventParameterName();

    public AFa1qSDK AFInAppEventType(String str) {
        this.afErrorLog = str;
        return this;
    }

    public final boolean AFKeystoreWrapper() {
        return this.init;
    }

    public boolean AFLogger() {
        return true;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public final Map<String, Object> valueOf() {
        return this.values;
    }

    public final AFa1qSDK values(String str, Object obj) {
        synchronized (this.values) {
            this.values.put(str, obj);
        }
        return this;
    }

    public AFa1qSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Context context) {
        this.values = new HashMap();
        this.afInfoLog = str;
        this.afErrorLog = str2;
        this.init = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.AFInAppEventType = (Application) context.getApplicationContext();
        }
    }

    public final boolean AFInAppEventType() {
        return this.afInfoLog == null && this.AFLogger == null;
    }

    @NonNull
    protected final String AFKeystoreWrapper(String str) {
        String values = AFa1aSDK.values().values(this.AFInAppEventType);
        return values != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, values).build().toString() : str;
    }

    public final AFa1qSDK valueOf(int i) {
        this.afRDLog = i;
        synchronized (this.values) {
            try {
                if (this.values.containsKey("counter")) {
                    this.values.put("counter", Integer.toString(i));
                }
                if (this.values.containsKey("launch_counter")) {
                    this.values.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final AFa1qSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.values.putAll(map);
        }
        return this;
    }

    public final byte[] values() {
        return this.afWarnLog;
    }
}
