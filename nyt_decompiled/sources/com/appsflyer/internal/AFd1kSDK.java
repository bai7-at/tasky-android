package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1mSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class AFd1kSDK {
    Map<String, Object> AFInAppEventParameterName;
    public volatile String AFInAppEventType;

    @NonNull
    private final AFd1mSDK afInfoLog;

    @NonNull
    public final AFb1fSDK valueOf;

    @Nullable
    public volatile String values;
    private boolean afDebugLog = false;
    public volatile boolean AFKeystoreWrapper = false;

    public AFd1kSDK(@NonNull AFb1fSDK aFb1fSDK, @NonNull AFd1mSDK aFd1mSDK) {
        this.valueOf = aFb1fSDK;
        this.afInfoLog = aFd1mSDK;
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFInAppEventParameterName;
        return (map == null || map.isEmpty()) ? false : true;
    }

    @Nullable
    public final String AFInAppEventParameterName(AFd1pSDK aFd1pSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String valueOf = aFd1pSDK.valueOf("imeiCached", null);
        if (z && AFb1nSDK.AFInAppEventType(this.values)) {
            Context context = this.valueOf.AFKeystoreWrapper;
            if (context != null && AFInAppEventParameterName(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                } catch (InvocationTargetException e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
                if (str == null) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    str = valueOf;
                }
            }
            str = null;
        } else {
            if (this.values != null) {
                str = this.values;
            }
            str = null;
        }
        if (AFb1nSDK.AFInAppEventType(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFd1pSDK.AFInAppEventParameterName("imeiCached", str);
        return str;
    }

    public final boolean AFKeystoreWrapper() {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            Context context = this.valueOf.AFKeystoreWrapper;
            AFd1mSDK.AFa1wSDK aFa1wSDK = new AFd1mSDK.AFa1wSDK() { // from class: com.appsflyer.internal.AFd1kSDK.1
                @Override // com.appsflyer.internal.AFd1mSDK.AFa1wSDK
                public final void valueOf(@NonNull String str, @NonNull String str2) {
                    AFd1kSDK.this.AFInAppEventParameterName = new ConcurrentHashMap();
                    AFd1kSDK.this.AFInAppEventParameterName.put("signedData", str);
                    AFd1kSDK.this.AFInAppEventParameterName.put("signature", str2);
                    AFd1kSDK.this.AFInAppEventParameterName.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                @Override // com.appsflyer.internal.AFd1mSDK.AFa1wSDK
                public final void values(String str, Exception exc) {
                    AFd1kSDK.this.AFInAppEventParameterName = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = DatasetUtils.UNKNOWN_IDENTITY_ID;
                    }
                    AFd1kSDK.this.AFInAppEventParameterName.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }
            };
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                        Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                        cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFd1mSDK.3
                            AnonymousClass3() {
                            }

                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method, Object[] objArr) {
                                if (method.getName().equals("onLvlResult")) {
                                    Object obj2 = objArr[0];
                                    String str = obj2 != null ? (String) obj2 : null;
                                    Object obj3 = objArr[1];
                                    String str2 = obj3 != null ? (String) obj3 : null;
                                    AFa1wSDK aFa1wSDK2 = AFa1wSDK.this;
                                    if (aFa1wSDK2 == null) {
                                        AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                                    } else if (str != null && str2 != null) {
                                        aFa1wSDK2.valueOf(str, str2);
                                    } else if (str2 == null) {
                                        aFa1wSDK2.values("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                    } else {
                                        aFa1wSDK2.values("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                    }
                                } else if (method.getName().equals("onLvlFailure")) {
                                    AFa1wSDK aFa1wSDK3 = AFa1wSDK.this;
                                    if (aFa1wSDK3 != null) {
                                        Object obj4 = objArr[0];
                                        if (obj4 != null) {
                                            aFa1wSDK3.values("onLvlFailure with exception", (Exception) obj4);
                                        } else {
                                            aFa1wSDK3.values("onLvlFailure", new Exception(DatasetUtils.UNKNOWN_IDENTITY_ID));
                                        }
                                    } else {
                                        AFLogger.afDebugLog("onLvlFailure: listener is null");
                                    }
                                } else {
                                    AFa1wSDK aFa1wSDK4 = AFa1wSDK.this;
                                    if (aFa1wSDK4 != null) {
                                        aFa1wSDK4.values("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                    }
                                }
                                return null;
                            }
                        }));
                    } catch (InvocationTargetException e) {
                        aFa1wSDK.values(e.getClass().getSimpleName(), e);
                    }
                } catch (IllegalAccessException e2) {
                    aFa1wSDK.values(e2.getClass().getSimpleName(), e2);
                }
            } catch (ClassNotFoundException e3) {
                aFa1wSDK.values(e3.getClass().getSimpleName(), e3);
            } catch (NoSuchMethodException e4) {
                aFa1wSDK.values(e4.getClass().getSimpleName(), e4);
            }
            this.afDebugLog = true;
        } catch (ClassNotFoundException unused) {
            this.afDebugLog = false;
        }
        return this.afDebugLog;
    }

    @NonNull
    public final Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventType()) {
            hashMap.put("lvl", this.AFInAppEventParameterName);
        } else if (this.afDebugLog) {
            HashMap hashMap2 = new HashMap();
            this.AFInAppEventParameterName = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.AFInAppEventParameterName);
        }
        return hashMap;
    }

    public final boolean values() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFInAppEventParameterName() {
        return this.afDebugLog && !AFInAppEventType();
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1aSDK.values();
        return !AFa1aSDK.AFKeystoreWrapper(context);
    }
}
