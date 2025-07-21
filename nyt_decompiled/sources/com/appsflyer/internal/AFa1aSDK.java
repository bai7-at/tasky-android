package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentType;
import com.facebook.AccessToken;
import com.google.android.gms.common.GoogleApiAvailability;
import defpackage.mm;
import defpackage.w92;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFa1aSDK extends AppsFlyerLib {
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    private static final String AFLogger;

    @VisibleForTesting
    private static String AFLogger$LogLevel = null;

    @VisibleForTesting
    private static AFa1aSDK AFVersionDeclaration = null;
    private static char AppsFlyerConversionListener = 0;
    private static char AppsFlyerInAppPurchaseValidatorListener = 0;
    private static String afDebugLog = null;
    private static String afInfoLog = null;
    private static String afWarnLog = null;
    private static String getLevel = null;
    private static String init = null;
    private static char onValidateInApp = 0;
    private static char onValidateInAppFailure = 0;
    private static int stop = 1;
    private static int updateServerUninstallToken;
    public static volatile AppsFlyerConversionListener valueOf;
    public static final String values;

    @NonNull
    private final AFb1aSDK AppsFlyerLib;
    String afErrorLog;
    public AFa1eSDK afRDLog;
    private Map<String, Object> onAttributionFailure;
    private String onAttributionFailureNative;
    private Application onConversionDataFail;
    private String onDeepLinking;
    private boolean onDeepLinkingNative;
    private Map<Long, String> onInstallConversionDataLoadedNative;
    private SharedPreferences onResponse;
    private AFb1gSDK onResponseError;
    private boolean onResponseNative;
    private long onInstallConversionFailureNative = -1;
    private long AppsFlyer2dXConversionCallback = -1;
    private long onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(5);
    private final AFb1uSDK onConversionDataSuccess = new AFb1uSDK();
    private boolean onResponseErrorNative = false;
    private boolean onAppOpenAttribution = false;

    /* renamed from: com.appsflyer.internal.AFa1aSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AFInAppEventType() {
            try {
                AFe1zSDK aFe1zSDK = new AFe1zSDK();
                Application valueOf = AFa1aSDK.valueOf(AFa1aSDK.this);
                if (valueOf != null) {
                    aFe1zSDK.AFInAppEventType = (Application) valueOf.getApplicationContext();
                }
                AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                if (AFa1aSDK.AFInAppEventParameterName(aFa1aSDK, aFe1zSDK, AFa1aSDK.AFInAppEventType(AFa1aSDK.valueOf(aFa1aSDK)))) {
                    AFa1aSDK.valueOf(AFa1aSDK.this, aFe1zSDK);
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1aSDK.AFInAppEventParameterName(AFa1aSDK.AFInAppEventType(AFa1aSDK.this).AFInAppEventType(), new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1aSDK.AnonymousClass2.this.AFInAppEventType();
                }
            }, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1aSDK$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1vSDK implements Runnable {
        private final AFa1qSDK values;

        /* synthetic */ AFa1vSDK(AFa1aSDK aFa1aSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1uSDK aFd1uSDK;
            if (this.values.AFInAppEventType()) {
                AFd1tSDK aFd1tSDK = new AFd1tSDK(this.values, AFa1aSDK.this.AFInAppEventParameterName());
                aFd1tSDK.AFVersionDeclaration = AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this);
                aFd1uSDK = aFd1tSDK;
            } else {
                aFd1uSDK = new AFd1uSDK(this.values, AFa1aSDK.this.AFInAppEventParameterName());
            }
            AFc1lSDK afRDLog = AFa1aSDK.this.AFInAppEventParameterName().afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1uSDK));
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }
    }

    class AFa1wSDK implements AFc1qSDK {
        private AFa1wSDK() {
        }

        @Override // com.appsflyer.internal.AFc1qSDK
        public final void AFInAppEventType(AFc1nSDK<?> aFc1nSDK) {
        }

        @Override // com.appsflyer.internal.AFc1qSDK
        public final void values(AFc1nSDK<?> aFc1nSDK) {
            if (aFc1nSDK instanceof AFd1tSDK) {
                AFa1aSDK.this.AFInAppEventParameterName().afInfoLog().values(((AFd1uSDK) aFc1nSDK).afRDLog.afRDLog);
            }
        }

        /* synthetic */ AFa1wSDK(AFa1aSDK aFa1aSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFc1qSDK
        public final void AFInAppEventType(AFc1nSDK<?> aFc1nSDK, AFc1rSDK aFc1rSDK) {
            JSONObject values;
            AFb1tSDK AFInAppEventParameterName;
            if (!(aFc1nSDK instanceof AFd1uSDK)) {
                if (!(aFc1nSDK instanceof AFd1hSDK) || aFc1rSDK == AFc1rSDK.SUCCESS) {
                    return;
                }
                AFd1gSDK aFd1gSDK = new AFd1gSDK(AFa1aSDK.AFInAppEventType(AFa1aSDK.this));
                AFc1lSDK afRDLog = AFa1aSDK.AFInAppEventType(AFa1aSDK.this).afRDLog();
                afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1gSDK));
                return;
            }
            AFd1uSDK aFd1uSDK = (AFd1uSDK) aFc1nSDK;
            boolean z = aFc1nSDK instanceof AFd1tSDK;
            if (z) {
                AFd1tSDK aFd1tSDK = (AFd1tSDK) aFc1nSDK;
                if (aFd1tSDK.AFInAppEventType == AFc1rSDK.SUCCESS || aFd1tSDK.AFKeystoreWrapper == 1) {
                    Context context = AFa1aSDK.AFInAppEventType(AFa1aSDK.this).AFInAppEventParameterName.AFKeystoreWrapper;
                    if (context == null) {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                    AFd1hSDK aFd1hSDK = new AFd1hSDK(aFd1tSDK, new AFb1cSDK(AFa1aSDK.AFInAppEventType(context)));
                    AFc1lSDK afRDLog2 = AFa1aSDK.AFInAppEventType(AFa1aSDK.this).afRDLog();
                    afRDLog2.AFKeystoreWrapper.execute(afRDLog2.new AnonymousClass4(aFd1hSDK));
                }
            }
            if (aFc1rSDK == AFc1rSDK.SUCCESS) {
                AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                aFa1aSDK.valueOf(AFa1aSDK.valueOf(aFa1aSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                if (!(aFc1nSDK instanceof AFd1vSDK) && (AFInAppEventParameterName = new AFd1lSDK(AFa1aSDK.valueOf(AFa1aSDK.this)).AFInAppEventParameterName()) != null && AFInAppEventParameterName.AFInAppEventParameterName()) {
                    String str = AFInAppEventParameterName.values;
                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1lSDK.AFInAppEventType(str);
                }
                ResponseNetwork responseNetwork = aFd1uSDK.afInfoLog;
                if (responseNetwork != null && (values = AFb1qSDK.values((String) responseNetwork.getBody())) != null) {
                    AFa1aSDK.AFInAppEventType(AFa1aSDK.this, values.optBoolean("send_background", false));
                }
                if (z) {
                    AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this, System.currentTimeMillis());
                }
            }
        }
    }

    class AFa1zSDK implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;

        /* synthetic */ AFa1zSDK(AFa1aSDK aFa1aSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1aSDK.valueOf(AFa1aSDK.this, this.AFInAppEventParameterName);
        }

        private AFa1zSDK(AFa1qSDK aFa1qSDK) {
            this.AFInAppEventParameterName = aFa1qSDK;
        }
    }

    static {
        valueOf();
        AFInAppEventType = "207";
        String substring = "6.8.2".substring(0, "6.8.2".lastIndexOf(AFInAppEventParameterName("ᖊ騾", TextUtils.getOffsetBefore("", 0) + 1).intern()));
        AFKeystoreWrapper = substring;
        afDebugLog = "https://%sstats.%s/stats";
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.8.2&app_id=");
        values = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(substring);
        sb2.append("/android?buildnumber=6.8.2&app_id=");
        afInfoLog = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        AFLogger = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        init = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        afWarnLog = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        getLevel = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        AFLogger$LogLevel = sb7.toString();
        AFInAppEventParameterName = null;
        valueOf = null;
        AFVersionDeclaration = new AFa1aSDK();
        int i = updateServerUninstallToken + 79;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @VisibleForTesting
    public AFa1aSDK() {
        Executors.newSingleThreadExecutor();
        AFVersionDeclaration.init();
        AFb1aSDK aFb1aSDK = new AFb1aSDK();
        this.AppsFlyerLib = aFb1aSDK;
        AFc1lSDK afRDLog = aFb1aSDK.afRDLog();
        afRDLog.AFInAppEventParameterName.add(new AFa1wSDK(this, (byte) 0));
    }

    static /* synthetic */ void AFInAppEventParameterName(ScheduledExecutorService scheduledExecutorService, Runnable runnable, TimeUnit timeUnit) {
        updateServerUninstallToken = (stop + 3) % 128;
        AFKeystoreWrapper(scheduledExecutorService, runnable, 0L, timeUnit);
        updateServerUninstallToken = (stop + 79) % 128;
    }

    static /* synthetic */ AFb1aSDK AFInAppEventType(AFa1aSDK aFa1aSDK) {
        int i = stop + 107;
        updateServerUninstallToken = i % 128;
        int i2 = i % 2;
        AFb1aSDK aFb1aSDK = aFa1aSDK.AppsFlyerLib;
        if (i2 == 0) {
            return aFb1aSDK;
        }
        throw null;
    }

    static /* synthetic */ long AFKeystoreWrapper(AFa1aSDK aFa1aSDK, long j) {
        int i = updateServerUninstallToken;
        int i2 = i + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND;
        stop = i2 % 128;
        int i3 = i2 % 2;
        aFa1aSDK.AppsFlyer2dXConversionCallback = j;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 7;
        stop = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static void AFLogger(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) == 0) {
                    AFLogger.valueOf("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    updateServerUninstallToken = (stop + 19) % 128;
                    return;
                }
                int i = stop + 99;
                updateServerUninstallToken = i % 128;
                if (i % 2 != 0) {
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                }
            }
        } catch (Exception e) {
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    private String AFLogger$LogLevel(Context context) {
        String str;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String AFKeystoreWrapper2 = AFKeystoreWrapper("preInstallName");
        if (AFKeystoreWrapper2 != null) {
            int i = updateServerUninstallToken + 69;
            stop = i % 128;
            if (i % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            throw null;
        }
        if (AFInAppEventType2.contains("preInstallName")) {
            str = AFInAppEventType2.getString("preInstallName", null);
            stop = (updateServerUninstallToken + 101) % 128;
        } else {
            if (afInfoLog(context) && (AFKeystoreWrapper2 = init(context)) == null) {
                AFKeystoreWrapper2 = AFInAppEventType(context, "AF_PRE_INSTALL_NAME");
            }
            if (AFKeystoreWrapper2 != null) {
                valueOf(context).AFInAppEventParameterName("preInstallName", AFKeystoreWrapper2);
            }
            str = AFKeystoreWrapper2;
        }
        if (str != null) {
            AFInAppEventParameterName("preInstallName", str);
        }
        return str;
    }

    private String AFVersionDeclaration(Context context) {
        String str;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        if (AFInAppEventType2.contains("INSTALL_STORE")) {
            return AFInAppEventType2.getString("INSTALL_STORE", null);
        }
        if (afInfoLog(context)) {
            int i = updateServerUninstallToken + 101;
            stop = i % 128;
            if (i % 2 == 0) {
                afWarnLog(context);
                throw null;
            }
            str = afWarnLog(context);
        } else {
            str = null;
        }
        valueOf(context).AFInAppEventParameterName("INSTALL_STORE", str);
        int i2 = updateServerUninstallToken + 17;
        stop = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static String afDebugLog() {
        int i = stop + 47;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFKeystoreWrapper(AppsFlyerProperties.APP_ID);
            throw null;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AppsFlyerProperties.APP_ID);
        updateServerUninstallToken = (stop + 7) % 128;
        return AFKeystoreWrapper2;
    }

    private void afErrorLog(Context context) {
        this.onAttributionFailure = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1mSDK.AFa1vSDK aFa1vSDK = new AFa1mSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1aSDK.4
            @Override // com.appsflyer.internal.AFa1mSDK.AFa1vSDK
            public final void AFInAppEventType(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("link", str);
                    if (str2 != null) {
                        AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("link", "");
                }
                AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // com.appsflyer.internal.AFa1mSDK.AFa1vSDK
            public final void AFInAppEventType(String str) {
                AFa1aSDK.AFKeystoreWrapper(AFa1aSDK.this).put("error", str);
            }
        };
        try {
            w92 w92Var = w92.a;
            w92.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<mm> cls = mm.class;
            int i = mm.h;
            Method method = mm.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, mm.b.class);
            Object newProxyInstance = Proxy.newProxyInstance(mm.b.class.getClassLoader(), new Class[]{mm.b.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1mSDK.5
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        AFa1vSDK aFa1vSDK2 = aFa1vSDK;
                        if (aFa1vSDK2 != null) {
                            aFa1vSDK2.AFInAppEventType("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                        if (bundle2 != null) {
                            str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                            str3 = bundle2.getString("target_url");
                            Bundle bundle3 = bundle2.getBundle("extras");
                            str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        AFa1vSDK aFa1vSDK3 = aFa1vSDK;
                        if (aFa1vSDK3 != null) {
                            aFa1vSDK3.AFInAppEventType(str2, str3, str);
                        }
                    } else {
                        AFa1vSDK aFa1vSDK4 = aFa1vSDK;
                        if (aFa1vSDK4 != null) {
                            aFa1vSDK4.AFInAppEventType(null, null, null);
                        }
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                stop = (updateServerUninstallToken + 11) % 128;
                aFa1vSDK.AFInAppEventType("Facebook app id not defined in resources");
                return;
            }
            method.invoke(null, context, string, newProxyInstance);
            int i2 = updateServerUninstallToken + 67;
            stop = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (ClassNotFoundException e) {
            aFa1vSDK.AFInAppEventType(e.toString());
        } catch (IllegalAccessException e2) {
            aFa1vSDK.AFInAppEventType(e2.toString());
        } catch (NoSuchMethodException e3) {
            aFa1vSDK.AFInAppEventType(e3.toString());
        } catch (InvocationTargetException e4) {
            aFa1vSDK.AFInAppEventType(e4.toString());
        }
    }

    private static boolean afInfoLog(Context context) {
        updateServerUninstallToken = (stop + 43) % 128;
        if (AFInAppEventType(context).contains("appsFlyerCount")) {
            return false;
        }
        int i = updateServerUninstallToken;
        stop = (i + 17) % 128;
        stop = (i + 53) % 128;
        return true;
    }

    private static void afRDLog(Context context) {
        int i;
        if (AFb1wSDK.AFKeystoreWrapper()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < i || valueOf(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(i2);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(i2);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (aFKeystoreWrapper.valueOf()) {
            String AFInAppEventType2 = aFKeystoreWrapper.AFInAppEventType();
            synchronized (aFKeystoreWrapper.values) {
                aFKeystoreWrapper.AFKeystoreWrapper++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventType2)));
                try {
                    synchronized (aFKeystoreWrapper.values) {
                        aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFInAppEventType2);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e);
                }
            }
            aFKeystoreWrapper.AFInAppEventType(aFKeystoreWrapper.AFInAppEventType());
        } else {
            aFKeystoreWrapper.valueOf = AFb1rSDK.AFInAppEventParameterName(new WeakReference(context));
            aFKeystoreWrapper.AFKeystoreWrapper = 0;
            aFKeystoreWrapper.AFInAppEventType(aFKeystoreWrapper.AFInAppEventType());
        }
        AFInAppEventParameterName("KSAppsFlyerId", aFKeystoreWrapper.values());
        AFInAppEventParameterName("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventParameterName()));
    }

    private String afWarnLog(Context context) {
        stop = (updateServerUninstallToken + 85) % 128;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string == null) {
            return AFInAppEventType(context, "AF_STORE");
        }
        updateServerUninstallToken = (stop + 117) % 128;
        return string;
    }

    private long getLevel(Context context) {
        long j;
        long j2;
        int i = stop + 71;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            j = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
            j2 = System.currentTimeMillis();
            valueOf(context).AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", j2);
            if (j <= 1) {
                return -1L;
            }
        } else {
            long j3 = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            valueOf(context).AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
            if (j3 <= 0) {
                return -1L;
            }
            j = j3;
            j2 = currentTimeMillis;
        }
        long j4 = j2 - j;
        int i2 = stop + ContentType.LIVE;
        updateServerUninstallToken = i2 % 128;
        return i2 % 2 != 0 ? j4 * 1000 : j4 / 1000;
    }

    private static float onAppOpenAttributionNative(Context context) {
        float f;
        int intExtra;
        int intExtra2;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver.getIntExtra("level", -1);
            intExtra2 = registerReceiver.getIntExtra("scale", -1);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            f = 1.0f;
        }
        if (intExtra == -1) {
            return 50.0f;
        }
        updateServerUninstallToken = (stop + 17) % 128;
        if (intExtra2 == -1) {
            return 50.0f;
        }
        f = (intExtra / intExtra2) * 100.0f;
        stop = (updateServerUninstallToken + 109) % 128;
        return f;
    }

    private static boolean onInstallConversionDataLoadedNative(Context context) {
        ConnectivityManager connectivityManager;
        Network[] allNetworks;
        int length;
        int i;
        if (context != null) {
            stop = (updateServerUninstallToken + 125) % 128;
            int i2 = stop + 89;
            updateServerUninstallToken = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    allNetworks = connectivityManager.getAllNetworks();
                    length = allNetworks.length;
                    i = 1;
                } else {
                    connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    allNetworks = connectivityManager.getAllNetworks();
                    length = allNetworks.length;
                    i = 0;
                }
                while (i < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities.hasTransport(4)) {
                        updateServerUninstallToken = (stop + 17) % 128;
                        if (!networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    i++;
                }
                return false;
            } catch (Exception e) {
                AFLogger.afErrorLog("Failed collecting ivc data", e);
            }
        }
        return false;
    }

    static void valueOf() {
        AppsFlyerConversionListener = (char) 54882;
        onValidateInAppFailure = (char) 39700;
        onValidateInApp = (char) 24542;
        AppsFlyerInAppPurchaseValidatorListener = (char) 12536;
    }

    static /* synthetic */ void values(AFa1aSDK aFa1aSDK) {
        updateServerUninstallToken = (stop + 61) % 128;
        aFa1aSDK.afErrorLog();
        int i = stop + 59;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = stop + ContentType.LIVE;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFa1tSDK.AFKeystoreWrapper().afDebugLog.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFa1tSDK.AFKeystoreWrapper().afDebugLog;
        if (list.contains(asList)) {
            return;
        }
        list.add(asList);
        stop = (updateServerUninstallToken + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        stop = (updateServerUninstallToken + 61) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        updateServerUninstallToken = (stop + 119) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = updateServerUninstallToken + 35;
        stop = i % 128;
        if (i % 2 == 0) {
            AFa1tSDK AFKeystoreWrapper2 = AFa1tSDK.AFKeystoreWrapper();
            AFKeystoreWrapper2.AFKeystoreWrapper = str;
            AFKeystoreWrapper2.afInfoLog = map;
            int i2 = 8 / 0;
        } else {
            AFa1tSDK AFKeystoreWrapper3 = AFa1tSDK.AFKeystoreWrapper();
            AFKeystoreWrapper3.AFKeystoreWrapper = str;
            AFKeystoreWrapper3.afInfoLog = map;
        }
        stop = (updateServerUninstallToken + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = updateServerUninstallToken;
        int i2 = i + 107;
        stop = i2 % 128;
        int i3 = i2 % 2;
        this.onAppOpenAttribution = z;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 5;
        stop = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        stop = (updateServerUninstallToken + 85) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        if (context == null) {
            return null;
        }
        AFb1fSDK aFb1fSDK = this.AppsFlyerLib.AFInAppEventParameterName;
        stop = (updateServerUninstallToken + 67) % 128;
        aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
        String AFInAppEventParameterName2 = AFb1rSDK.AFInAppEventParameterName(new WeakReference(this.AppsFlyerLib.values().AFInAppEventType.AFKeystoreWrapper));
        int i = stop + 85;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventType2 = new AFb1zSDK(context, AFInAppEventParameterName()).AFInAppEventType();
            int i = stop + 45;
            updateServerUninstallToken = i % 128;
            if (i % 2 != 0) {
                int i2 = 24 / 0;
            }
            return AFInAppEventType2;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        String AFKeystoreWrapper2 = AFKeystoreWrapper("custom_host");
        if (AFKeystoreWrapper2 == null) {
            updateServerUninstallToken = (stop + 21) % 128;
            return "appsflyer.com";
        }
        int i = stop + 107;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        String AFKeystoreWrapper2 = AFKeystoreWrapper("custom_host_prefix");
        if (AFKeystoreWrapper2 == null) {
            return "";
        }
        int i = stop + 81;
        int i2 = i % 128;
        updateServerUninstallToken = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 81;
        stop = i3 % 128;
        if (i3 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        stop = (updateServerUninstallToken + 85) % 128;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String AFInAppEventType2 = AFInAppEventType(context, "AF_STORE");
        if (AFInAppEventType2 == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i = stop + 101;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        stop = (updateServerUninstallToken + 37) % 128;
        AFc1xSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.afWarnLog().AFKeystoreWrapper("getSdkVersion", new String[0]);
        AFInAppEventParameterName2.values();
        String AFInAppEventType2 = AFb1dSDK.AFInAppEventType();
        int i = stop + 77;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a6, code lost:
    
        if (r0.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b0, code lost:
    
        r3 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        r5 = r0.next().providerInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d2, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
        com.appsflyer.internal.AFa1aSDK.stop = (com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
    
        r3.add(new com.appsflyer.internal.AFe1nSDK(r5, r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
    
        if (r3.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        r10.valueOf.addAll(r3);
        r0 = new java.lang.StringBuilder("[Preinstall]: Detected ");
        r0.append(r3.size());
        r0.append(" valid preinstall provider(s)");
        com.appsflyer.AFLogger.afDebugLog(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r0.isEmpty() != false) goto L27;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.AppsFlyerLib init(@android.support.annotation.NonNull java.lang.String r8, com.appsflyer.AppsFlyerConversionListener r9, @android.support.annotation.NonNull android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.init(java.lang.String, com.appsflyer.AppsFlyerConversionListener, android.content.Context):com.appsflyer.AppsFlyerLib");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        updateServerUninstallToken = (stop + 89) % 128;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        stop = (updateServerUninstallToken + 115) % 128;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        stop = (updateServerUninstallToken + 101) % 128;
        boolean values2 = this.AppsFlyerLib.AFLogger$LogLevel().values();
        int i = stop + 53;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
        return values2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        updateServerUninstallToken = (stop + 25) % 128;
        logEvent(context, str, map, null);
        int i = stop + 39;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFKeystoreWrapper(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i = updateServerUninstallToken + 5;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = stop + 97;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("logSession", new String[1]);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("logSession", new String[0]);
        }
        AFb1oSDK.AFInAppEventType().afErrorLog();
        AFKeystoreWrapper(context, AFd1bSDK.logSession);
        AFKeystoreWrapper(context, null, null);
        stop = (updateServerUninstallToken + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = updateServerUninstallToken + 47;
        stop = i % 128;
        if (i % 2 == 0) {
            AFb1xSDK.AFa1zSDK aFa1zSDK = AFb1xSDK.AFInAppEventParameterName;
            throw null;
        }
        AFb1xSDK.AFa1zSDK aFa1zSDK2 = AFb1xSDK.AFInAppEventParameterName;
        if (aFa1zSDK2 != null) {
            int i2 = updateServerUninstallToken + 49;
            stop = i2 % 128;
            int i3 = i2 % 2;
            aFa1zSDK2.AFInAppEventType(context);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i = updateServerUninstallToken;
        stop = (i + 53) % 128;
        if (uri != null) {
            int i2 = i + 125;
            stop = i2 % 128;
            if (i2 % 2 == 0) {
                uri.toString().isEmpty();
                throw null;
            }
            if (!uri.toString().isEmpty()) {
                if (context != null) {
                    AFa1tSDK.AFKeystoreWrapper();
                    AFa1tSDK.AFKeystoreWrapper(context, new HashMap(), Uri.parse(uri.toString()));
                    return;
                }
                StringBuilder sb = new StringBuilder("Context is \"");
                sb.append(context);
                sb.append("\"");
                AFb1lSDK.AFInAppEventType(sb.toString(), DeepLinkResult.Error.NETWORK);
                int i3 = stop + 53;
                updateServerUninstallToken = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 10 / 0;
                    return;
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        AFb1lSDK.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        if (intent == null) {
            AFb1lSDK.AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            updateServerUninstallToken = (stop + 23) % 128;
            return;
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
            if (applicationContext != null) {
                aFb1aSDK.AFInAppEventParameterName.AFKeystoreWrapper = applicationContext.getApplicationContext();
            }
            this.AppsFlyerLib.valueOf().execute(new Runnable() { // from class: v
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1aSDK.this.AFKeystoreWrapper(applicationContext, intent);
                }
            });
            return;
        }
        int i = stop + 89;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1lSDK.AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i2 = 84 / 0;
        } else {
            AFb1lSDK.AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        }
        stop = (updateServerUninstallToken + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        stop = (updateServerUninstallToken + 89) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[0]);
        valueOf(appsFlyerConversionListener);
        int i = stop + 57;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        stop = (updateServerUninstallToken + 43) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFInAppEventParameterName = appsFlyerInAppPurchaseValidatorListener;
        } else {
            stop = (updateServerUninstallToken + 43) % 128;
            AFLogger.afDebugLog("registerValidatorListener null listener");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r0 = r0.AFInAppEventParameterName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r3 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0.AFKeystoreWrapper = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendAdRevenue(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L15
            com.appsflyer.internal.AFb1aSDK r0 = r2.AppsFlyerLib
            r1 = 17
            int r1 = r1 / 0
            if (r3 == 0) goto L23
            goto L19
        L15:
            com.appsflyer.internal.AFb1aSDK r0 = r2.AppsFlyerLib
            if (r3 == 0) goto L23
        L19:
            com.appsflyer.internal.AFb1fSDK r0 = r0.AFInAppEventParameterName
            if (r3 == 0) goto L23
            android.content.Context r1 = r3.getApplicationContext()
            r0.AFKeystoreWrapper = r1
        L23:
            com.appsflyer.internal.AFd1aSDK r0 = new com.appsflyer.internal.AFd1aSDK
            r0.<init>()
            if (r3 == 0) goto L3a
            int r1 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r1 = r1 + 49
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r1
            android.content.Context r3 = r3.getApplicationContext()
            android.app.Application r3 = (android.app.Application) r3
            r0.AFInAppEventType = r3
        L3a:
            r0.AFInAppEventParameterName = r4
            r2.AFInAppEventParameterName(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.sendAdRevenue(android.content.Context, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        stop = (updateServerUninstallToken + ContentType.LIVE) % 128;
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            int i = updateServerUninstallToken + 99;
            int i2 = i % 128;
            stop = i2;
            if (i % 2 == 0) {
                AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
                throw null;
            }
            AFb1fSDK aFb1fSDK2 = aFb1aSDK.AFInAppEventParameterName;
            if (applicationContext != null) {
                int i3 = i2 + 7;
                updateServerUninstallToken = i3 % 128;
                if (i3 % 2 != 0) {
                    aFb1fSDK2.AFKeystoreWrapper = applicationContext.getApplicationContext();
                    throw null;
                }
                aFb1fSDK2.AFKeystoreWrapper = applicationContext.getApplicationContext();
            }
        }
        PurchaseHandler afDebugLog2 = AFInAppEventParameterName().afDebugLog();
        if (afDebugLog2.AFInAppEventParameterName(map, purchaseValidationCallback, "purchases")) {
            AFc1cSDK aFc1cSDK = new AFc1cSDK(map, purchaseValidationCallback, afDebugLog2.valueOf);
            AFc1lSDK aFc1lSDK = afDebugLog2.values;
            aFc1lSDK.AFKeystoreWrapper.execute(aFc1lSDK.new AnonymousClass4(aFc1cSDK));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            stop = (updateServerUninstallToken + 103) % 128;
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (applicationContext != null) {
                aFb1fSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
            }
        }
        PurchaseHandler afDebugLog2 = AFInAppEventParameterName().afDebugLog();
        if (afDebugLog2.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFc1dSDK aFc1dSDK = new AFc1dSDK(map, purchaseValidationCallback, afDebugLog2.valueOf);
            AFc1lSDK aFc1lSDK = afDebugLog2.values;
            aFc1lSDK.AFKeystoreWrapper.execute(aFc1lSDK.new AnonymousClass4(aFc1dSDK));
            updateServerUninstallToken = (stop + 5) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r17 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006a, code lost:
    
        com.appsflyer.internal.AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("sendPushNotificationData", r17.getLocalClassName(), "activity_intent_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007a, code lost:
    
        com.appsflyer.internal.AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("sendPushNotificationData", "activity_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r17 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x001f, code lost:
    
        if (r17.getIntent() == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0021, code lost:
    
        r2 = com.appsflyer.internal.AFb1oSDK.AFInAppEventType();
        r4 = r17.getLocalClassName();
        r6 = new java.lang.StringBuilder("activity_intent_");
        r6.append(r17.getIntent().toString());
        r2.AFKeystoreWrapper("sendPushNotificationData", r4, r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0019, code lost:
    
        if (r17 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        r2 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken + 27;
        com.appsflyer.internal.AFa1aSDK.stop = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        r2 = com.appsflyer.internal.AFb1oSDK.AFInAppEventType();
        r7 = new java.lang.String[4];
        r7[0] = r17.getLocalClassName();
        r7[1] = "activity_intent_null";
        r2.AFKeystoreWrapper("sendPushNotificationData", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0193  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(@android.support.annotation.NonNull android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = updateServerUninstallToken + 93;
        stop = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
            if (map == null) {
                return;
            }
        } else if (map == null) {
            return;
        }
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setAdditionalData", map.toString());
        AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        stop = (updateServerUninstallToken + 83) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = updateServerUninstallToken + 11;
        stop = i % 128;
        if (i % 2 == 0) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFInAppEventType2.AFKeystoreWrapper("setAndroidIdData", strArr);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        }
        this.afErrorLog = str;
        int i2 = updateServerUninstallToken + 7;
        stop = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        stop = (updateServerUninstallToken + 43) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setAppId", str);
        AFInAppEventParameterName(AppsFlyerProperties.APP_ID, str);
        updateServerUninstallToken = (stop + 29) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if ((!r3.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID))) != true) goto L8;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r3) {
        /*
            r2 = this;
            int r2 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r2 = r2 + 113
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r2
            com.appsflyer.internal.AFb1oSDK r2 = com.appsflyer.internal.AFb1oSDK.AFInAppEventType()
            java.lang.String r0 = "setAppInviteOneLink"
            java.lang.String[] r1 = new java.lang.String[]{r3}
            r2.AFKeystoreWrapper(r0, r1)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "setAppInviteOneLink = "
            java.lang.String r2 = r0.concat(r2)
            com.appsflyer.AFLogger.afInfoLog(r2)
            java.lang.String r2 = "oneLinkSlug"
            if (r3 == 0) goto L3f
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 29
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r0
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r2)
            boolean r0 = r3.equals(r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L3f
            goto L5a
        L3f:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkDomain"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkVersion"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkScheme"
            r0.remove(r1)
        L5a:
            AFInAppEventParameterName(r2, r3)
            int r2 = com.appsflyer.internal.AFa1aSDK.stop
            int r2 = r2 + 73
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L6d
            r2 = 11
            int r2 = r2 / 0
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = updateServerUninstallToken + 63;
        stop = i % 128;
        if (i % 2 == 0) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectAndroidID", strArr);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        }
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        stop = (updateServerUninstallToken + 107) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = stop + 27;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectIMEI", strArr);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        }
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        updateServerUninstallToken = (stop + 27) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i = stop + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        updateServerUninstallToken = (stop + 39) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i = updateServerUninstallToken + 83;
        stop = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        int i = updateServerUninstallToken + 37;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (context != null) {
            if (!AFKeystoreWrapper()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            AFKeystoreWrapper(context, AFd1bSDK.setCustomerIdAndLogSession);
            String str2 = this.AppsFlyerLib.AFLogger$LogLevel().AFInAppEventType;
            if (referrer == null) {
                referrer = "";
            }
            String str3 = referrer;
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                updateServerUninstallToken = (stop + ContentType.SHORT_FORM_ON_DEMAND) % 128;
            }
            AFKeystoreWrapper(context, null, null, str3, null);
            updateServerUninstallToken = (stop + 59) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        stop = (updateServerUninstallToken + 107) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID, str);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i = stop + 95;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        updateServerUninstallToken = (stop + 115) % 128;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            updateServerUninstallToken = (stop + 7) % 128;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = stop + 5;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            throw null;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        boolean z2 = true;
        if (!(!z)) {
            updateServerUninstallToken = (stop + 79) % 128;
            z2 = false;
        }
        AFb1ySDK.AFInAppEventType = Boolean.valueOf(z2);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        updateServerUninstallToken = (stop + 39) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        updateServerUninstallToken = (stop + 67) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = stop + 9;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventType2.AFKeystoreWrapper("setExtension", strArr);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        if (str != null) {
            stop = (updateServerUninstallToken + 103) % 128;
            AFInAppEventParameterName("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
            return;
        }
        stop = (updateServerUninstallToken + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
        AFInAppEventParameterName("custom_host", str2);
        stop = (updateServerUninstallToken + 107) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        updateServerUninstallToken = (stop + 29) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setImeiData", str);
        this.AppsFlyerLib.AFLogger$LogLevel().values = str;
        updateServerUninstallToken = (stop + 11) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        stop = (updateServerUninstallToken + 81) % 128;
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i = updateServerUninstallToken + 99;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setLogLevel(@android.support.annotation.NonNull com.appsflyer.AFLogger.LogLevel r4) {
        /*
            r3 = this;
            int r0 = r4.getLevel()
            com.appsflyer.AFLogger$LogLevel r1 = com.appsflyer.AFLogger.LogLevel.NONE
            int r1 = r1.getLevel()
            r2 = 0
            if (r0 <= r1) goto L1c
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 79
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            com.appsflyer.internal.AFb1aSDK r3 = r3.AppsFlyerLib
            com.appsflyer.internal.AFb1oSDK r3 = r3.afWarnLog()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = "log"
            r3.AFKeystoreWrapper(r1, r0)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "logLevel"
            int r4 = r4.getLevel()
            r3.set(r0, r4)
            int r3 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r3 = r3 + 7
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L4c
            r3 = 76
            int r3 = r3 / r2
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.setLogLevel(com.appsflyer.AFLogger$LogLevel):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = updateServerUninstallToken + 95;
        stop = i2 % 128;
        if (i2 % 2 != 0) {
            this.onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(i);
        } else {
            this.onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(i);
            int i3 = 84 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = stop + 3;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[1] = str;
            AFInAppEventType2.AFKeystoreWrapper("setOaidData", strArr);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setOaidData", str);
        }
        AFb1ySDK.AFInAppEventParameterName = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String format;
        int i = stop + 11;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[0] = Arrays.toString(strArr);
            format = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            format = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        AFa1tSDK.AFInAppEventType = strArr;
        updateServerUninstallToken = (stop + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.valueOf("Cannot set setOutOfStore with null");
            updateServerUninstallToken = (stop + 69) % 128;
        } else {
            stop = (updateServerUninstallToken + ContentType.USER_GENERATED_LIVE) % 128;
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        if (this.onResponseError == null) {
            this.onResponseError = new AFb1gSDK();
        }
        AFb1gSDK aFb1gSDK = this.onResponseError;
        if (str != null) {
            int i = stop + 115;
            updateServerUninstallToken = i % 128;
            if (i % 2 != 0) {
                str.isEmpty();
                throw null;
            }
            if (!str.isEmpty()) {
                if (map != null) {
                    stop = (updateServerUninstallToken + 5) % 128;
                    if (!map.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Setting partner data for ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(map);
                        AFLogger.afDebugLog(sb.toString());
                        int length = new JSONObject(map).toString().length();
                        if (length <= 1000) {
                            aFb1gSDK.AFInAppEventType.put(str, map);
                            aFb1gSDK.valueOf.remove(str);
                            return;
                        } else {
                            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                            HashMap hashMap = new HashMap();
                            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                            aFb1gSDK.valueOf.put(str, hashMap);
                            return;
                        }
                    }
                }
                AFLogger.afWarnLog(aFb1gSDK.AFInAppEventType.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(String.valueOf(str)));
                int i2 = updateServerUninstallToken + 41;
                stop = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        stop = (updateServerUninstallToken + 65) % 128;
        this.onDeepLinking = AFb1sSDK.values(str);
        int i = updateServerUninstallToken + 27;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                stop = (updateServerUninstallToken + 95) % 128;
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            stop = (updateServerUninstallToken + 81) % 128;
            jSONObject.put(QueryKeys.TIME_ON_VIEW_IN_MINUTES, str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (!(!jSONObject.has("pid"))) {
            AFInAppEventParameterName("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        String format;
        int i = updateServerUninstallToken + 1;
        stop = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            format = String.format("setResolveDeepLinkURLs %s", objArr);
        } else {
            format = String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        List<String> list = AFa1tSDK.values;
        list.clear();
        list.addAll(Arrays.asList(strArr));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i = stop + 85;
        updateServerUninstallToken = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners(strArr);
        if (i2 != 0) {
            throw null;
        }
        int i3 = stop + 37;
        updateServerUninstallToken = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        stop = (updateServerUninstallToken + 77) % 128;
        setSharingFilterForPartners("all");
        updateServerUninstallToken = (stop + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afRDLog = new AFa1eSDK(strArr);
        int i = stop + 3;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = stop + 85;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i2 = updateServerUninstallToken + 45;
        stop = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        stop = (updateServerUninstallToken + 1) % 128;
        start(context, null);
        int i = stop + 45;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (context != null) {
                updateServerUninstallToken = (stop + ContentType.USER_GENERATED_LIVE) % 128;
                aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        this.AppsFlyerLib.AFLogger$LogLevel().AFKeystoreWrapper = z;
        try {
            File file = new File(this.AppsFlyerLib.getLevel().AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                        sb.append(file2.getName());
                        AFLogger.afInfoLog(sb.toString());
                        StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                        sb2.append(file2.getName());
                        sb2.append(" from cache");
                        AFLogger.afInfoLog(sb2.toString());
                        file2.delete();
                    }
                }
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
        if (!z) {
            return;
        }
        stop = (updateServerUninstallToken + 11) % 128;
        valueOf(context).AFInAppEventParameterName("is_stop_tracking_used", true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i = updateServerUninstallToken + ContentType.LIVE;
        stop = i % 128;
        if (i % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i2 = 40 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = updateServerUninstallToken + 125;
        stop = i % 128;
        if (i % 2 == 0) {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        } else {
            AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        }
        valueOf = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            aFb1aSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFd1lSDK aFd1lSDK = new AFd1lSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
        AFb1tSDK AFInAppEventParameterName2 = aFd1lSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName2 == null || !str.equals(AFInAppEventParameterName2.values)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = AFInAppEventParameterName2 == null || currentTimeMillis - AFInAppEventParameterName2.valueOf > TimeUnit.SECONDS.toMillis(2L);
            AFb1tSDK aFb1tSDK = new AFb1tSDK(str, currentTimeMillis, !z);
            aFd1lSDK.AFInAppEventType.AFInAppEventParameterName("afUninstallToken", aFb1tSDK.values);
            aFd1lSDK.AFInAppEventType.AFInAppEventType("afUninstallToken_received_time", aFb1tSDK.valueOf);
            aFd1lSDK.AFInAppEventType.AFInAppEventParameterName("afUninstallToken_queued", aFb1tSDK.AFInAppEventParameterName());
            if (z) {
                AFd1lSDK.AFInAppEventType(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String str6 = this.AppsFlyerLib.AFLogger$LogLevel().AFInAppEventType;
        if (context instanceof Activity) {
            ((Activity) context).getIntent();
        }
        new Thread(new AFa1cSDK(applicationContext, str6, str, str2, str3, str4, str5, map)).start();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        updateServerUninstallToken = (stop + 75) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i = stop + 43;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    static /* synthetic */ boolean AFInAppEventParameterName(AFa1aSDK aFa1aSDK, AFa1qSDK aFa1qSDK, SharedPreferences sharedPreferences) {
        updateServerUninstallToken = (stop + ContentType.SHORT_FORM_ON_DEMAND) % 128;
        boolean AFKeystoreWrapper2 = aFa1aSDK.AFKeystoreWrapper(aFa1qSDK, sharedPreferences);
        int i = stop + 17;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
        return AFKeystoreWrapper2;
    }

    static /* synthetic */ boolean AFInAppEventType(AFa1aSDK aFa1aSDK, boolean z) {
        int i = updateServerUninstallToken;
        stop = (i + 15) % 128;
        aFa1aSDK.onResponseErrorNative = z;
        stop = (i + 93) % 128;
        return z;
    }

    static /* synthetic */ Map AFKeystoreWrapper(AFa1aSDK aFa1aSDK) {
        int i = (updateServerUninstallToken + 79) % 128;
        stop = i;
        Map<String, Object> map = aFa1aSDK.onAttributionFailure;
        updateServerUninstallToken = (i + 67) % 128;
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean afDebugLog(android.content.Context r4) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 1
            if (r0 != 0) goto L25
            int r0 = com.appsflyer.internal.AFa1aSDK.stop
            int r0 = r0 + 45
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r0
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L29
            goto L37
        L29:
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 125
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r0
            boolean r4 = AFKeystoreWrapper(r4)
            if (r4 != 0) goto L38
        L37:
            return r1
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.afDebugLog(android.content.Context):boolean");
    }

    static /* synthetic */ Application valueOf(AFa1aSDK aFa1aSDK) {
        int i = stop;
        int i2 = i + 103;
        updateServerUninstallToken = i2 % 128;
        int i3 = i2 % 2;
        Application application = aFa1aSDK.onConversionDataFail;
        if (i3 != 0) {
            throw null;
        }
        updateServerUninstallToken = (i + 39) % 128;
        return application;
    }

    public static AFa1aSDK values() {
        int i = (updateServerUninstallToken + 27) % 128;
        stop = i;
        AFa1aSDK aFa1aSDK = AFVersionDeclaration;
        int i2 = i + 53;
        updateServerUninstallToken = i2 % 128;
        if (i2 % 2 == 0) {
            return aFa1aSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            aFb1aSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFe1vSDK aFe1vSDK = new AFe1vSDK();
        if (context != null) {
            aFe1vSDK.AFInAppEventType = (Application) context.getApplicationContext();
        }
        aFe1vSDK.afInfoLog = str;
        aFe1vSDK.valueOf = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put(QueryKeys.SCROLL_POSITION_TOP, Float.valueOf(motionEvent.getX()));
                hashMap3.put(QueryKeys.CONTENT_HEIGHT, Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.valueOf("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1vSDK.AFInAppEventType(singletonMap);
        }
        aFe1vSDK.AFInAppEventParameterName = hashMap;
        AFb1oSDK afWarnLog2 = AFInAppEventParameterName().afWarnLog();
        Map map2 = aFe1vSDK.AFInAppEventParameterName;
        if (map2 == null) {
            map2 = new HashMap();
        }
        afWarnLog2.AFKeystoreWrapper("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            AFKeystoreWrapper(context, AFd1bSDK.logEvent);
        }
        AFKeystoreWrapper(aFe1vSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i = stop + 63;
        updateServerUninstallToken = i % 128;
        int i2 = i % 2;
        start(context, str, null);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        updateServerUninstallToken = (stop + 75) % 128;
        AFa1tSDK.AFKeystoreWrapper().AFInAppEventParameterName = deepLinkListener;
        AFb1pSDK.getLevel = j;
        int i = updateServerUninstallToken + 29;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static String AFInAppEventType() {
        int i = updateServerUninstallToken + 15;
        stop = i % 128;
        if (i % 2 == 0) {
            AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID);
            throw null;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID);
        int i2 = stop + 73;
        updateServerUninstallToken = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return AFKeystoreWrapper2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Context context, Intent intent) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            aFb1aSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFa1tSDK.AFKeystoreWrapper();
        Context context2 = this.AppsFlyerLib.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context2 != null) {
            AFb1cSDK aFb1cSDK = new AFb1cSDK(AFInAppEventType(context2));
            Uri valueOf2 = AFa1tSDK.valueOf(intent);
            boolean z = (valueOf2 == null || valueOf2.toString().isEmpty()) ? false : true;
            if (aFb1cSDK.valueOf("ddl_sent") && !z) {
                AFb1lSDK.AFInAppEventType("No direct deep link", null);
                return;
            } else {
                AFa1tSDK.AFKeystoreWrapper().valueOf(new HashMap(), intent, context);
                return;
            }
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    static /* synthetic */ void valueOf(AFa1aSDK aFa1aSDK, AFa1qSDK aFa1qSDK) {
        updateServerUninstallToken = (stop + 19) % 128;
        aFa1aSDK.AFInAppEventType(aFa1qSDK);
        stop = (updateServerUninstallToken + 119) % 128;
    }

    private static void values(Map<String, Object> map) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if (string != null) {
            stop = (updateServerUninstallToken + 89) % 128;
            map.put("onelink_id", string);
            updateServerUninstallToken = (stop + 75) % 128;
        }
        if (string2 != null) {
            stop = (updateServerUninstallToken + 31) % 128;
            map.put("onelink_ver", string2);
        }
        int i = stop + 39;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final AFc1xSDK AFInAppEventParameterName() {
        int i = stop;
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        updateServerUninstallToken = (i + 9) % 128;
        return aFb1aSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7.onError(com.appsflyer.attribution.RequestError.NO_DEV_KEY, com.appsflyer.internal.AFb1eSDK.values);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6 == null) goto L14;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(@android.support.annotation.NonNull android.content.Context r5, java.lang.String r6, final com.appsflyer.attribution.AppsFlyerRequestListener r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.start(android.content.Context, java.lang.String, com.appsflyer.attribution.AppsFlyerRequestListener):void");
    }

    public static String AFInAppEventType(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        updateServerUninstallToken = (stop + 71) % 128;
        return format;
    }

    @NonNull
    private AFe1lSDK[] afInfoLog() {
        updateServerUninstallToken = (stop + 21) % 128;
        AFe1lSDK[] values2 = AFInAppEventParameterName().AFVersionDeclaration().values();
        int i = updateServerUninstallToken + 59;
        stop = i % 128;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
        }
        return values2;
    }

    public final void AFInAppEventParameterName(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            stop = (updateServerUninstallToken + 95) % 128;
            values(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            int i = stop + 45;
            updateServerUninstallToken = i % 128;
            if (i % 2 != 0) {
                valueOf(context).AFInAppEventParameterName("referrer", stringExtra);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", stringExtra);
                appsFlyerProperties.AFInAppEventParameterName = stringExtra;
                int i2 = 43 / 0;
                if (!AppsFlyerProperties.getInstance().values()) {
                    return;
                }
            } else {
                valueOf(context).AFInAppEventParameterName("referrer", stringExtra);
                AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
                appsFlyerProperties2.set("AF_REFERRER", stringExtra);
                appsFlyerProperties2.AFInAppEventParameterName = stringExtra;
                if (!AppsFlyerProperties.getInstance().values()) {
                    return;
                }
            }
            AFLogger.afInfoLog("onReceive: isLaunchCalled");
            AFKeystoreWrapper(context, AFd1bSDK.onReceive);
            AFKeystoreWrapper(context, stringExtra);
        }
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = stop + 51;
        updateServerUninstallToken = i % 128;
        try {
            try {
                if (i % 2 == 0) {
                    AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                    long currentTimeMillis = System.currentTimeMillis();
                    String string = AFInAppEventType(context).getString("extraReferrers", null);
                    if (string == null) {
                        jSONObject = new JSONObject();
                        jSONArray2 = new JSONArray();
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string);
                        if (jSONObject2.has(str)) {
                            jSONArray = new JSONArray((String) jSONObject2.get(str));
                        } else {
                            jSONArray = new JSONArray();
                        }
                        jSONArray2 = jSONArray;
                        jSONObject = jSONObject2;
                    }
                    if (jSONArray2.length() < 5) {
                        jSONArray2.put(currentTimeMillis);
                    }
                    if (jSONObject.length() >= 4) {
                        updateServerUninstallToken = (stop + 81) % 128;
                        AFInAppEventParameterName(jSONObject);
                    }
                    jSONObject.put(str, jSONArray2.toString());
                    valueOf(context).AFInAppEventParameterName("extraReferrers", jSONObject.toString());
                    return;
                }
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                System.currentTimeMillis();
                AFInAppEventType(context).getString("extraReferrers", null);
                throw null;
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
                sb.append(str);
                sb.append(": ");
                AFLogger.afErrorLog(sb.toString(), th);
            }
        } catch (JSONException unused) {
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        String format;
        long j;
        int i = updateServerUninstallToken;
        stop = (i + 83) % 128;
        Application application = aFa1qSDK.AFInAppEventType;
        if (application == null) {
            stop = (i + 117) % 128;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences AFInAppEventType2 = AFInAppEventType(application);
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        if (!this.AppsFlyerLib.AFLogger$LogLevel().values()) {
            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(application.getClass().getName());
            AFLogger.afInfoLog(sb.toString());
        }
        boolean AFInAppEventType3 = aFa1qSDK.AFInAppEventType();
        boolean z = aFa1qSDK instanceof AFe1uSDK;
        boolean z2 = aFa1qSDK instanceof AFe1zSDK;
        Map<String, ?> AFKeystoreWrapper2 = AFKeystoreWrapper(aFa1qSDK);
        String str = (String) AFKeystoreWrapper2.get("appsflyerKey");
        if (str != null && str.length() != 0) {
            if (!isStopped()) {
                AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
            }
            byte b = 0;
            int AFInAppEventType4 = AFInAppEventType(AFInAppEventType2, false);
            if (z2 || z) {
                format = String.format(AFLogger$LogLevel, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName());
            } else if (!AFInAppEventType3) {
                format = String.format(getLevel, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName());
            } else {
                int i2 = stop + 101;
                updateServerUninstallToken = i2 % 128;
                if (i2 % 2 == 0 ? AFInAppEventType4 < 2 : AFInAppEventType4 < 2) {
                    format = String.format(init, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName());
                } else {
                    format = String.format(afWarnLog, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(application.getPackageName());
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("&buildnumber=6.8.2");
            String obj2 = sb3.toString();
            String values2 = values(application);
            if (values2 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append("&channel=");
                sb4.append(values2);
                obj2 = sb4.toString();
            }
            valueOf(AFKeystoreWrapper2);
            AFa1vSDK aFa1vSDK = new AFa1vSDK(this, aFa1qSDK.AFInAppEventType(obj2).AFInAppEventType(AFKeystoreWrapper2).valueOf(AFInAppEventType4), b);
            if (AFInAppEventType3) {
                stop = (updateServerUninstallToken + 23) % 128;
                byte b2 = 0;
                for (AFe1lSDK aFe1lSDK : afInfoLog()) {
                    if (aFe1lSDK.afRDLog == AFe1lSDK.AFa1wSDK.STARTED) {
                        StringBuilder sb5 = new StringBuilder("Failed to get ");
                        sb5.append(aFe1lSDK.valueOf);
                        sb5.append(" referrer, wait ...");
                        AFLogger.afDebugLog(sb5.toString());
                        updateServerUninstallToken = (stop + 37) % 128;
                        b2 = 1;
                    }
                }
                if (!this.onAppOpenAttribution || afRDLog()) {
                    b = b2;
                } else {
                    int i3 = updateServerUninstallToken + 105;
                    stop = i3 % 128;
                    if (i3 % 2 == 0) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                    } else {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        b = 1;
                    }
                }
                if (this.AppsFlyerLib.AFLogger$LogLevel().AFInAppEventParameterName()) {
                    stop = (updateServerUninstallToken + 115) % 128;
                    b = 1;
                }
            }
            ScheduledExecutorService AFInAppEventType5 = this.AppsFlyerLib.AFInAppEventType();
            if (b != 0) {
                stop = (updateServerUninstallToken + 23) % 128;
                j = 500;
            } else {
                j = 0;
            }
            AFKeystoreWrapper(AFInAppEventType5, aFa1vSDK, j, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.valueOf;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1eSDK.values);
        }
        int i4 = stop + 89;
        updateServerUninstallToken = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFb1oSDK.AFInAppEventType().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        for (int i = 0; i < length; i++) {
            int i2 = stop + 23;
            updateServerUninstallToken = i2 % 128;
            if (i2 % 2 == 0) {
                String str2 = strArr[i];
                if (AnonymousClass6.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(AFb1sSDK.values(str2));
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
            } else {
                String str3 = strArr[i];
                int i3 = AnonymousClass6.AFInAppEventParameterName[emailsCryptType.ordinal()];
                throw null;
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        updateServerUninstallToken = (stop + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
    }

    private static File afDebugLog(String str) {
        updateServerUninstallToken = (stop + 67) % 128;
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    File file = new File(str.trim());
                    updateServerUninstallToken = (stop + 67) % 128;
                    return file;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        updateServerUninstallToken = (stop + 53) % 128;
        return null;
    }

    private static void values(String str) {
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            updateServerUninstallToken = (stop + 99) % 128;
            AFInAppEventParameterName("preInstallName", str);
            updateServerUninstallToken = (stop + 7) % 128;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    private boolean AFLogger() {
        String format;
        String format2;
        if (this.onInstallConversionFailureNative > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onInstallConversionFailureNative;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String AFInAppEventType2 = AFInAppEventType(simpleDateFormat, this.onInstallConversionFailureNative);
            String AFInAppEventType3 = AFInAppEventType(simpleDateFormat, this.AppsFlyer2dXConversionCallback);
            if (currentTimeMillis < this.onAppOpenAttributionNative) {
                int i = stop + 99;
                updateServerUninstallToken = i % 128;
                if (i % 2 == 0) {
                    if (!isStopped()) {
                        int i2 = updateServerUninstallToken + 115;
                        stop = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object[] objArr = new Object[3];
                            objArr[0] = AFInAppEventType2;
                            objArr[0] = AFInAppEventType3;
                            objArr[3] = Long.valueOf(currentTimeMillis);
                            objArr[4] = Long.valueOf(this.onAppOpenAttributionNative);
                            format2 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
                        } else {
                            format2 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", AFInAppEventType2, AFInAppEventType3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onAppOpenAttributionNative));
                        }
                        AFLogger.afInfoLog(format2);
                        return true;
                    }
                } else {
                    isStopped();
                    throw null;
                }
            }
            if (!isStopped()) {
                int i3 = updateServerUninstallToken + 91;
                stop = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = new Object[4];
                    objArr2[1] = AFInAppEventType2;
                    objArr2[1] = AFInAppEventType3;
                    objArr2[4] = Long.valueOf(currentTimeMillis);
                    format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr2);
                } else {
                    format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", AFInAppEventType2, AFInAppEventType3, Long.valueOf(currentTimeMillis));
                }
                AFLogger.afInfoLog(format);
            }
        } else if (!isStopped()) {
            updateServerUninstallToken = (stop + 77) % 128;
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    @Nullable
    @Deprecated
    public final String values(Context context) {
        int i = updateServerUninstallToken;
        stop = (i + 7) % 128;
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (context != null) {
                stop = (i + 49) % 128;
                aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        return this.AppsFlyerLib.values().values();
    }

    private static void AFKeystoreWrapper(String str, boolean z) {
        stop = (updateServerUninstallToken + 39) % 128;
        AppsFlyerProperties.getInstance().set(str, z);
        stop = (updateServerUninstallToken + 41) % 128;
    }

    private static String AFKeystoreWrapper(String str) {
        updateServerUninstallToken = (stop + 79) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        stop = (updateServerUninstallToken + 9) % 128;
        return string;
    }

    public final boolean AFKeystoreWrapper() {
        if (valueOf(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            updateServerUninstallToken = (stop + 93) % 128;
            if (AFInAppEventType() == null) {
                stop = (updateServerUninstallToken + 27) % 128;
                return true;
            }
        }
        return false;
    }

    private void AFKeystoreWrapper(Context context, AFd1bSDK aFd1bSDK) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            int i = (updateServerUninstallToken + 49) % 128;
            stop = i;
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (context != null) {
                updateServerUninstallToken = (i + 33) % 128;
                aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        AFd1cSDK afInfoLog2 = AFInAppEventParameterName().afInfoLog();
        AFd1eSDK valueOf2 = AFa1pSDK.valueOf(context);
        if (afInfoLog2.values()) {
            afInfoLog2.valueOf.put("api_name", aFd1bSDK.toString());
            afInfoLog2.valueOf(valueOf2);
            updateServerUninstallToken = (stop + 45) % 128;
        }
        afInfoLog2.valueOf();
    }

    private static int values(SharedPreferences sharedPreferences, boolean z) {
        int i = updateServerUninstallToken + 51;
        stop = i % 128;
        if (i % 2 != 0) {
            return AFInAppEventType(sharedPreferences, "appsFlyerInAppEventCount", z);
        }
        AFInAppEventType(sharedPreferences, "appsFlyerInAppEventCount", z);
        throw null;
    }

    private void afErrorLog() {
        int i = stop + ContentType.LIVE;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            if (AFc1aSDK.afInfoLog()) {
                updateServerUninstallToken = (stop + 49) % 128;
                return;
            }
            AFc1xSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFc1lSDK afRDLog = AFInAppEventParameterName2.afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(new AFc1aSDK(AFInAppEventParameterName2)));
            return;
        }
        AFc1aSDK.afInfoLog();
        throw null;
    }

    private static int values(SharedPreferences sharedPreferences) {
        int i = updateServerUninstallToken + 31;
        stop = i % 128;
        int AFInAppEventType2 = AFInAppEventType(sharedPreferences, "appsFlyerAdRevenueCount", i % 2 != 0);
        int i2 = stop + 21;
        updateServerUninstallToken = i2 % 128;
        if (i2 % 2 == 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    private static void AFInAppEventParameterName(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            int i = 0;
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                while (i < jSONArray.length()) {
                    int i2 = updateServerUninstallToken + ContentType.LIVE;
                    stop = i2 % 128;
                    if (i2 % 2 == 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                        i += 110;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                        i++;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                updateServerUninstallToken = (stop + 73) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue()) {
                            updateServerUninstallToken = (stop + 9) % 128;
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i3++;
                            str = next;
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
            break loop2;
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.onAttributionFailure != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3.onAttributionFailure != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r3.onAttributionFailure.isEmpty() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = (com.appsflyer.internal.AFa1aSDK.stop + 125) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean afRDLog() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L15
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.onAttributionFailure
            r2 = 20
            int r2 = r2 / r1
            if (r0 == 0) goto L2b
            goto L19
        L15:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.onAttributionFailure
            if (r0 == 0) goto L2b
        L19:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.onAttributionFailure
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2b
            int r3 = com.appsflyer.internal.AFa1aSDK.stop
            int r3 = r3 + 125
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r3
            r3 = 1
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.afRDLog():boolean");
    }

    private static boolean valueOf(String str, boolean z) {
        int i = stop + 83;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().getBoolean(str, z);
            throw null;
        }
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
        int i2 = updateServerUninstallToken + 65;
        stop = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return z2;
    }

    private static void valueOf(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = (stop + 125) % 128;
        updateServerUninstallToken = i;
        if (appsFlyerConversionListener == null) {
            stop = (i + 117) % 128;
        } else {
            valueOf = appsFlyerConversionListener;
        }
    }

    private void valueOf(AFa1qSDK aFa1qSDK) {
        int i = stop + 59;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            byte b = 0;
            boolean z = aFa1qSDK.afInfoLog == null;
            if (AFKeystoreWrapper()) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                stop = (updateServerUninstallToken + 29) % 128;
                return;
            }
            if (z) {
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    updateServerUninstallToken = (stop + 93) % 128;
                    if (!(!AFLogger())) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.valueOf;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, AFb1eSDK.AFInAppEventType);
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                }
                this.onInstallConversionFailureNative = System.currentTimeMillis();
            }
            AFKeystoreWrapper(this.AppsFlyerLib.AFInAppEventType(), new AFa1zSDK(this, aFa1qSDK, b), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        String str = aFa1qSDK.afInfoLog;
        throw null;
    }

    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1vSDK aFe1vSDK = new AFe1vSDK();
        if (context != null) {
            aFe1vSDK.AFInAppEventType = (Application) context.getApplicationContext();
        }
        aFe1vSDK.afInfoLog = str;
        aFe1vSDK.AFInAppEventParameterName = map;
        if (context instanceof Activity) {
            updateServerUninstallToken = (stop + 57) % 128;
            activity = (Activity) context;
        } else {
            updateServerUninstallToken = (stop + 51) % 128;
            activity = null;
        }
        AFKeystoreWrapper(aFe1vSDK, activity);
        int i = stop + 9;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @VisibleForTesting
    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1qSDK aFe1ySDK;
        if (str != null && !str.trim().isEmpty()) {
            aFe1ySDK = new AFe1vSDK();
        } else {
            aFe1ySDK = new AFe1ySDK();
            updateServerUninstallToken = (stop + 11) % 128;
        }
        if (context != null) {
            updateServerUninstallToken = (stop + 119) % 128;
            aFe1ySDK.AFInAppEventType = (Application) context.getApplicationContext();
            updateServerUninstallToken = (stop + 21) % 128;
        }
        aFe1ySDK.afInfoLog = str;
        aFe1ySDK.AFInAppEventParameterName = map;
        aFe1ySDK.afDebugLog = str2;
        aFe1ySDK.AFKeystoreWrapper = str3;
        valueOf(aFe1ySDK);
    }

    private static void AFInAppEventParameterName(String str, String str2) {
        stop = (updateServerUninstallToken + ContentType.USER_GENERATED_LIVE) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        stop = (updateServerUninstallToken + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
    }

    final void AFInAppEventParameterName(WeakReference<Context> weakReference) {
        updateServerUninstallToken = (stop + 77) % 128;
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        SharedPreferences AFInAppEventType2 = AFInAppEventType(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        long j = AFInAppEventParameterName().afInfoLog().afWarnLog;
        HashMap hashMap = new HashMap();
        String str = this.AppsFlyerLib.AFLogger$LogLevel().AFInAppEventType;
        if (str == null) {
            AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            stop = (updateServerUninstallToken + ContentType.SHORT_FORM_ON_DEMAND) % 128;
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFa1rSDK valueOf2 = AFb1ySDK.valueOf(weakReference.get().getContentResolver());
        if (valueOf2 != null) {
            hashMap.put("amazon_aid", valueOf2.AFKeystoreWrapper);
            hashMap.put("amazon_aid_limit", String.valueOf(valueOf2.valueOf));
            updateServerUninstallToken = (stop + 25) % 128;
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            hashMap.put("advertiserId", string);
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", str);
        hashMap.put("uid", AFb1rSDK.AFInAppEventParameterName(weakReference));
        hashMap.put("time_in_app", String.valueOf(j));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(AFInAppEventType(AFInAppEventType2, false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, values(weakReference.get()));
        if (AFKeystoreWrapper2 == null) {
            AFKeystoreWrapper2 = "";
        }
        hashMap.put("originalAppsflyerId", AFKeystoreWrapper2);
        if (this.onResponseErrorNative) {
            AFe1sSDK aFe1sSDK = new AFe1sSDK();
            ((AFd1dSDK) aFe1sSDK).init = isStopped();
            AFd1uSDK aFd1uSDK = new AFd1uSDK((AFe1sSDK) aFe1sSDK.AFInAppEventType(hashMap).AFInAppEventType(String.format(afDebugLog, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName())), this.AppsFlyerLib);
            AFc1lSDK afRDLog = this.AppsFlyerLib.afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1uSDK));
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    }

    private void valueOf(Map<String, Object> map) {
        int i = stop + 71;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        updateServerUninstallToken = (stop + 47) % 128;
        if (map.get("advertiserId") != null) {
            try {
                if (AFb1nSDK.AFInAppEventType(this.afErrorLog) && map.remove("android_id") != null) {
                    int i2 = updateServerUninstallToken + 49;
                    stop = i2 % 128;
                    if (i2 % 2 == 0) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        throw null;
                    }
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFb1nSDK.AFInAppEventType(this.AppsFlyerLib.AFLogger$LogLevel().values)) {
                    updateServerUninstallToken = (stop + 37) % 128;
                    if (map.remove("imei") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        stop = (updateServerUninstallToken + 91) % 128;
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFe1uSDK aFe1uSDK = new AFe1uSDK();
        if (context != null) {
            aFe1uSDK.AFInAppEventType = (Application) context.getApplicationContext();
        }
        aFe1uSDK.afDebugLog = str;
        if (str != null) {
            int i = stop + 17;
            updateServerUninstallToken = i % 128;
            if (i % 2 != 0) {
                if (str.length() <= 4) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            if (AFKeystoreWrapper(aFe1uSDK, AFInAppEventType(context))) {
                AFKeystoreWrapper(this.AppsFlyerLib.AFInAppEventType(), new AFa1zSDK(this, aFe1uSDK, (byte) 0), 5L, TimeUnit.MILLISECONDS);
                stop = (updateServerUninstallToken + 77) % 128;
            }
        }
    }

    private String init(Context context) {
        File afDebugLog2 = afDebugLog(valueOf("ro.appsflyer.preinstall.path"));
        if (AFKeystoreWrapper(afDebugLog2)) {
            afDebugLog2 = afDebugLog(AFInAppEventType(context, "AF_PRE_INSTALL_PATH"));
        }
        if (AFKeystoreWrapper(afDebugLog2)) {
            int i = updateServerUninstallToken + 95;
            stop = i % 128;
            if (i % 2 == 0) {
                afDebugLog("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            afDebugLog2 = afDebugLog("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(afDebugLog2)) {
            afDebugLog2 = afDebugLog("/etc/pre_install.appsflyer");
            stop = (updateServerUninstallToken + 57) % 128;
        }
        if (AFKeystoreWrapper(afDebugLog2)) {
            return null;
        }
        return AFInAppEventParameterName(afDebugLog2, context.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK r4, android.content.SharedPreferences r5) {
        /*
            r3 = this;
            int r3 = com.appsflyer.internal.AFa1aSDK.stop
            int r3 = r3 + 119
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r3
            r3 = 0
            int r0 = AFInAppEventType(r5, r3)
            r1 = 1
            if (r0 != r1) goto L25
            boolean r4 = r4 instanceof com.appsflyer.internal.AFe1zSDK
            r4 = r4 ^ r1
            if (r4 == r1) goto L16
            goto L25
        L16:
            int r4 = com.appsflyer.internal.AFa1aSDK.stop
            int r4 = r4 + 123
            int r2 = r4 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r2
            int r4 = r4 % 2
            if (r4 == 0) goto L23
            goto L2d
        L23:
            r4 = r1
            goto L2e
        L25:
            int r4 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r4 = r4 + 77
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r4
        L2d:
            r4 = r3
        L2e:
            java.lang.String r2 = "newGPReferrerSent"
            boolean r5 = r5.getBoolean(r2, r3)
            if (r5 != 0) goto L41
            if (r0 != r1) goto L41
            int r3 = com.appsflyer.internal.AFa1aSDK.stop
            int r3 = r3 + 29
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r3
            goto L43
        L41:
            if (r4 == 0) goto L44
        L43:
            return r1
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK, android.content.SharedPreferences):boolean");
    }

    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (context != null) {
                stop = (updateServerUninstallToken + 19) % 128;
                aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        if (!map.containsKey("af_deeplink")) {
            String AFInAppEventParameterName2 = AFInAppEventParameterName(uri.toString());
            AFa1tSDK AFKeystoreWrapper2 = AFa1tSDK.AFKeystoreWrapper();
            String str = AFKeystoreWrapper2.AFKeystoreWrapper;
            if (str != null) {
                updateServerUninstallToken = (stop + 91) % 128;
                if (AFKeystoreWrapper2.afInfoLog != null && AFInAppEventParameterName2.contains(str)) {
                    Uri.Builder buildUpon = Uri.parse(AFInAppEventParameterName2).buildUpon();
                    Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                    for (Map.Entry<String, String> entry : AFKeystoreWrapper2.afInfoLog.entrySet()) {
                        stop = (updateServerUninstallToken + 7) % 128;
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                        buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    AFInAppEventParameterName2 = buildUpon.build().toString();
                    map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                }
            }
            map.put("af_deeplink", AFInAppEventParameterName2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        AFc1bSDK aFc1bSDK = new AFc1bSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (!(!aFc1bSDK.init())) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFb1wSDK.AFKeystoreWrapper(context, hashMap, uri);
        if (aFc1bSDK.AFVersionDeclaration()) {
            aFc1bSDK.afRDLog = AFKeystoreWrapper(hashMap);
            AFc1lSDK afRDLog = this.AppsFlyerLib.afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFc1bSDK));
            return;
        }
        AFb1lSDK.AFInAppEventParameterName(hashMap);
    }

    private static void AFKeystoreWrapper(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", valueOf("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", valueOf("ro.product.cpu.abi2"));
        hashMap.put("arch", valueOf("os.arch"));
        hashMap.put("build_display_id", valueOf("ro.build.display.id"));
        if (z) {
            updateServerUninstallToken = (stop + 103) % 128;
            AFInAppEventType(context, hashMap);
            if (i <= 2) {
                updateServerUninstallToken = (stop + 11) % 128;
                hashMap.putAll(AFa1bSDK.AFInAppEventType(context).values());
            }
        }
        hashMap.put("dim", AFa1fSDK.AFInAppEventParameterName(context));
        map.put("deviceData", hashMap);
    }

    private static boolean valueOf(@NonNull SharedPreferences sharedPreferences) {
        stop = (updateServerUninstallToken + 15) % 128;
        boolean parseBoolean = Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
        updateServerUninstallToken = (stop + 29) % 128;
        return parseBoolean;
    }

    private static void valueOf(Context context, Map<String, Object> map) {
        String str;
        int i = stop + 79;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                int rotation = windowManager.getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    str = "p";
                } else if (rotation == 1) {
                    str = "l";
                } else if (rotation != 2) {
                    str = rotation != 3 ? "" : "lr";
                } else {
                    str = "pr";
                }
                map.put("sc_o", str);
                updateServerUninstallToken = (stop + 51) % 128;
                return;
            }
            return;
        }
        throw null;
    }

    private AFc1bSDK.AFa1vSDK AFKeystoreWrapper(final Map<String, String> map) {
        AFc1bSDK.AFa1vSDK aFa1vSDK = new AFc1bSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1aSDK.3
            @Override // com.appsflyer.internal.AFc1bSDK.AFa1vSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1lSDK.AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFc1bSDK.AFa1vSDK
            public final void values(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1lSDK.AFInAppEventParameterName(map);
            }
        };
        int i = stop + 33;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return aFa1vSDK;
        }
        throw null;
    }

    public static boolean AFKeystoreWrapper(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i = (stop + ContentType.USER_GENERATED_LIVE) % 128;
                updateServerUninstallToken = i;
                stop = (i + 5) % 128;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFKeystoreWrapper(android.content.Context r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "use cached AndroidId: "
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "deviceTrackingDisabled"
            r3 = 0
            boolean r4 = r1.getBoolean(r2, r3)
            if (r4 == 0) goto L15
            java.lang.String r7 = "true"
            r9.put(r2, r7)
            return
        L15:
            com.appsflyer.internal.AFb1aSDK r2 = r7.AppsFlyerLib
            com.appsflyer.internal.AFb1cSDK r4 = new com.appsflyer.internal.AFb1cSDK
            com.appsflyer.internal.AFb1fSDK r2 = r2.AFInAppEventParameterName
            android.content.Context r2 = r2.AFKeystoreWrapper
            if (r2 == 0) goto Lbf
            android.content.SharedPreferences r2 = AFInAppEventType(r2)
            r4.<init>(r2)
            com.appsflyer.internal.AFb1aSDK r2 = r7.AppsFlyerLib
            com.appsflyer.internal.AFd1kSDK r2 = r2.AFLogger$LogLevel()
            java.lang.String r2 = r2.AFInAppEventParameterName(r4)
            boolean r5 = com.appsflyer.internal.AFb1nSDK.AFInAppEventType(r2)
            if (r5 != 0) goto L3b
            java.lang.String r5 = "imei"
            r9.put(r5, r2)
        L3b:
            java.lang.String r2 = "collectAndroidId"
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.String r2 = "androidIdCached"
            r3 = 0
            java.lang.String r5 = r4.valueOf(r2, r3)
            java.lang.String r6 = "android_id"
            if (r1 == 0) goto L84
            java.lang.String r1 = r7.afErrorLog
            boolean r1 = com.appsflyer.internal.AFb1nSDK.AFInAppEventType(r1)
            if (r1 == 0) goto L84
            boolean r7 = afDebugLog(r8)
            if (r7 == 0) goto L89
            android.content.ContentResolver r7 = r8.getContentResolver()     // Catch: java.lang.Exception -> L71
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r6)     // Catch: java.lang.Exception -> L71
            if (r7 == 0) goto L66
        L64:
            r3 = r7
            goto L89
        L66:
            if (r5 == 0) goto L89
            java.lang.String r7 = r0.concat(r5)     // Catch: java.lang.Exception -> L71
            com.appsflyer.AFLogger.afDebugLog(r7)     // Catch: java.lang.Exception -> L71
            r3 = r5
            goto L89
        L71:
            r7 = move-exception
            if (r5 == 0) goto L7c
            java.lang.String r0 = r0.concat(r5)
            com.appsflyer.AFLogger.afDebugLog(r0)
            r3 = r5
        L7c:
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r7)
            goto L89
        L84:
            java.lang.String r7 = r7.afErrorLog
            if (r7 == 0) goto L89
            goto L64
        L89:
            if (r3 == 0) goto L92
            r4.AFInAppEventParameterName(r2, r3)
            r9.put(r6, r3)
            goto L97
        L92:
            java.lang.String r7 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r7)
        L97:
            com.appsflyer.internal.AFa1rSDK r7 = com.appsflyer.internal.AFb1ySDK.AFKeystoreWrapper(r8)
            if (r7 == 0) goto Lbe
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = "isManual"
            java.lang.Boolean r1 = r7.values
            r8.put(r0, r1)
            java.lang.String r0 = "val"
            java.lang.String r1 = r7.AFKeystoreWrapper
            r8.put(r0, r1)
            java.lang.Boolean r7 = r7.valueOf
            if (r7 == 0) goto Lb9
            java.lang.String r0 = "isLat"
            r8.put(r0, r7)
        Lb9:
            java.lang.String r7 = "oaid"
            r9.put(r7, r8)
        Lbe:
            return
        Lbf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Context must be set via setContext method before calling this dependency."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(android.content.Context, java.util.Map):void");
    }

    private static void valueOf(Context context, Map<String, Object> map, String str) {
        int i = stop + 45;
        updateServerUninstallToken = i % 128;
        try {
            if (i % 2 == 0) {
                SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
                SharedPreferences.Editor edit = AFInAppEventType2.edit();
                String string = AFInAppEventType2.getString("prev_event_name", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", AFInAppEventType2.getLong("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", string);
                    map.put("prev_event", jSONObject);
                    updateServerUninstallToken = (stop + 85) % 128;
                }
                edit.putString("prev_event_name", str).putLong("prev_event_timestamp", System.currentTimeMillis()).apply();
                return;
            }
            SharedPreferences AFInAppEventType3 = AFInAppEventType(context);
            AFInAppEventType3.edit();
            AFInAppEventType3.getString("prev_event_name", null);
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        Map<String, Object> map2;
        if (!(!map.containsKey("meta"))) {
            stop = (updateServerUninstallToken + 71) % 128;
            map2 = (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        stop = (updateServerUninstallToken + 49) % 128;
        return map2;
    }

    private static String AFInAppEventType(String str) {
        updateServerUninstallToken = (stop + 21) % 128;
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            return "";
        }
        String substring = str.substring(indexOf);
        stop = (updateServerUninstallToken + 41) % 128;
        return substring;
    }

    public static void AFInAppEventParameterName(Context context, Map<String, ? super String> map) {
        boolean valueOf2 = valueOf(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1gSDK aFa1gSDK = AFa1gSDK.AFa1xSDK.AFInAppEventType;
        AFa1gSDK.AFa1zSDK AFInAppEventParameterName2 = AFa1gSDK.AFInAppEventParameterName(context);
        map.put("network", AFInAppEventParameterName2.valueOf);
        if (!valueOf2) {
            int i = (updateServerUninstallToken + 23) % 128;
            stop = i;
            String str = AFInAppEventParameterName2.AFInAppEventType;
            if (str != null) {
                int i2 = i + 43;
                updateServerUninstallToken = i2 % 128;
                if (i2 % 2 != 0) {
                    map.put("operator", str);
                    int i3 = 26 / 0;
                } else {
                    map.put("operator", str);
                }
            }
        }
        if (valueOf2) {
            return;
        }
        updateServerUninstallToken = (stop + 51) % 128;
        String str2 = AFInAppEventParameterName2.values;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    @VisibleForTesting
    @Nullable
    private String AFInAppEventType(Context context, String str) {
        int i = stop + 45;
        updateServerUninstallToken = i % 128;
        if (i % 2 != 0) {
            int i2 = 32 / 0;
            if (context == null) {
                return null;
            }
        } else if (context == null) {
            return null;
        }
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
            if (context != null) {
                aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
                updateServerUninstallToken = (stop + 69) % 128;
            }
        }
        return AFInAppEventParameterName().values().AFKeystoreWrapper(str);
    }

    private static String valueOf(String str) {
        updateServerUninstallToken = (stop + 3) % 128;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            updateServerUninstallToken = (stop + 95) % 128;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (values().onResponse == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        values().onResponse = r4.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        com.appsflyer.internal.AFa1aSDK.stop = (com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken + 99) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (values().onResponse == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.content.SharedPreferences AFInAppEventType(android.content.Context r4) {
        /*
            java.lang.Class<com.appsflyer.internal.AFa1aSDK> r0 = com.appsflyer.internal.AFa1aSDK.class
            monitor-enter(r0)
            int r1 = com.appsflyer.internal.AFa1aSDK.stop     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r2     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L20
            com.appsflyer.internal.AFa1aSDK r1 = values()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r1 = r1.onResponse     // Catch: java.lang.Throwable -> L1e
            r3 = 81
            int r3 = r3 / r2
            if (r1 != 0) goto L40
            goto L28
        L1c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4 = move-exception
            goto L48
        L20:
            com.appsflyer.internal.AFa1aSDK r1 = values()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r1 = r1.onResponse     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L40
        L28:
            com.appsflyer.internal.AFa1aSDK r1 = values()     // Catch: java.lang.Throwable -> L1e
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "appsflyer-data"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r3, r2)     // Catch: java.lang.Throwable -> L1e
            r1.onResponse = r4     // Catch: java.lang.Throwable -> L1e
            int r4 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + 99
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r4     // Catch: java.lang.Throwable -> L1e
        L40:
            com.appsflyer.internal.AFa1aSDK r4 = values()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r4 = r4.onResponse     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r4
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFInAppEventType(android.content.Context):android.content.SharedPreferences");
    }

    public final AFd1pSDK valueOf(Context context) {
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            aFb1aSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        Context context2 = this.AppsFlyerLib.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context2 != null) {
            return new AFb1cSDK(AFInAppEventType(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r0 = r5.getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = r0.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r3 = com.appsflyer.internal.AFa1aSDK.stop + 69;
        com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ((r3 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r2 = r1.getString("af");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Push Notification received af payload = ".concat(r2));
        r1.remove("af");
        r5.setIntent(r0.putExtras(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r5 = r1.getString("af");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r2 = r5;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r5.getMessage(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r5.getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0014, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = r0 + 51;
        com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r0 % 2) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFInAppEventParameterName(android.app.Activity r5) {
        /*
            int r0 = com.appsflyer.internal.AFa1aSDK.stop
            int r1 = r0 + 65
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L14
            r1 = 30
            int r1 = r1 / 0
            if (r5 == 0) goto L6a
            goto L16
        L14:
            if (r5 == 0) goto L6a
        L16:
            int r0 = r0 + 51
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L66
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L6a
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L6a
            int r3 = com.appsflyer.internal.AFa1aSDK.stop
            int r3 = r3 + 69
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r4
            int r3 = r3 % 2
            java.lang.String r4 = "af"
            if (r3 != 0) goto L56
            java.lang.String r2 = r1.getString(r4)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L6a
            java.lang.String r3 = "Push Notification received af payload = "
            java.lang.String r3 = r3.concat(r2)     // Catch: java.lang.Throwable -> L54
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch: java.lang.Throwable -> L54
            r1.remove(r4)     // Catch: java.lang.Throwable -> L54
            android.content.Intent r0 = r0.putExtras(r1)     // Catch: java.lang.Throwable -> L54
            r5.setIntent(r0)     // Catch: java.lang.Throwable -> L54
            goto L6a
        L54:
            r5 = move-exception
            goto L5e
        L56:
            java.lang.String r5 = r1.getString(r4)     // Catch: java.lang.Throwable -> L54
            throw r2     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L5e:
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
            goto L6a
        L66:
            r5.getIntent()
            throw r2
        L6a:
            int r5 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r5 = r5 + 47
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFInAppEventParameterName(android.app.Activity):java.lang.String");
    }

    public static int AFInAppEventType(SharedPreferences sharedPreferences, boolean z) {
        int i = updateServerUninstallToken + 93;
        stop = i % 128;
        if (i % 2 != 0) {
            return AFInAppEventType(sharedPreferences, "appsFlyerCount", z);
        }
        AFInAppEventType(sharedPreferences, "appsFlyerCount", z);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r0 = r0 + 1;
        r2.edit().putInt(r3, r0).apply();
        com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = (com.appsflyer.internal.AFa1aSDK.stop + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int AFInAppEventType(android.content.SharedPreferences r2, java.lang.String r3, boolean r4) {
        /*
            int r0 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L14
            int r0 = r2.getInt(r3, r1)
            if (r4 == 0) goto L2f
            goto L1a
        L14:
            int r0 = r2.getInt(r3, r1)
            if (r4 == 0) goto L2f
        L1a:
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r0)
            r2.apply()
            int r2 = com.appsflyer.internal.AFa1aSDK.stop
            int r2 = r2 + 107
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r2
        L2f:
            com.appsflyer.internal.AFb1oSDK r2 = com.appsflyer.internal.AFb1oSDK.AFInAppEventType()
            boolean r2 = r2.afRDLog()
            if (r2 == 0) goto L44
            com.appsflyer.internal.AFb1oSDK r2 = com.appsflyer.internal.AFb1oSDK.AFInAppEventType()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.AFKeystoreWrapper(r3)
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFInAppEventType(android.content.SharedPreferences, java.lang.String, boolean):int");
    }

    private static boolean AFKeystoreWrapper(File file) {
        if (file == null) {
            return true;
        }
        int i = updateServerUninstallToken + 119;
        stop = i % 128;
        if (i % 2 == 0) {
            file.exists();
            throw null;
        }
        if (!file.exists()) {
            return true;
        }
        int i2 = updateServerUninstallToken + 115;
        stop = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return false;
    }

    public static String AFKeystoreWrapper(AFd1pSDK aFd1pSDK, String str) {
        stop = (updateServerUninstallToken + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
        String valueOf2 = aFd1pSDK.valueOf("CACHED_CHANNEL", null);
        if (valueOf2 != null) {
            return valueOf2;
        }
        aFd1pSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        int i = stop + 59;
        updateServerUninstallToken = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    @NonNull
    @Deprecated
    public static String AFInAppEventType(HttpURLConnection httpURLConnection) {
        String obj;
        InputStreamReader inputStreamReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                    updateServerUninstallToken = (stop + 49) % 128;
                }
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(z ? '\n' : "");
                            sb.append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    updateServerUninstallToken = (stop + 3) % 128;
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                obj = sb.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.afErrorLog(th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                    stop = (updateServerUninstallToken + 85) % 128;
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6);
        }
        obj = sb.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException unused) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException unused2) {
                return new JSONObject().toString();
            }
        }
    }

    private static String AFInAppEventParameterName(@Nullable String str) {
        int i = updateServerUninstallToken + 47;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        if (str.matches("fb\\d*?://authorize.*")) {
            int i2 = updateServerUninstallToken + 21;
            stop = i2 % 128;
            if (i2 % 2 != 0) {
                if (str.contains(AccessToken.ACCESS_TOKEN_KEY)) {
                    String AFInAppEventType2 = AFInAppEventType(str);
                    if (AFInAppEventType2.length() == 0) {
                        int i3 = stop + 29;
                        updateServerUninstallToken = i3 % 128;
                        if (i3 % 2 == 0) {
                            return str;
                        }
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (AFInAppEventType2.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(AFInAppEventType2.split("&")));
                    } else {
                        arrayList.add(AFInAppEventType2);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i4 = stop + 67;
                        updateServerUninstallToken = i4 % 128;
                        if (i4 % 2 == 0) {
                            String str2 = (String) it2.next();
                            if (str2.contains(AccessToken.ACCESS_TOKEN_KEY)) {
                                it2.remove();
                                updateServerUninstallToken = (stop + 35) % 128;
                            } else {
                                if (sb.length() != 0) {
                                    sb.append("&");
                                } else if (!str2.startsWith("?")) {
                                    sb.append("?");
                                }
                                sb.append(str2);
                            }
                        } else {
                            ((String) it2.next()).contains(AccessToken.ACCESS_TOKEN_KEY);
                            throw null;
                        }
                    }
                    return str.replace(AFInAppEventType2, sb.toString());
                }
            } else {
                str.contains(AccessToken.ACCESS_TOKEN_KEY);
                throw null;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r4 = r4.format(new java.util.Date());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (afInfoLog(r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (afInfoLog(r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        r4 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFKeystoreWrapper(java.text.SimpleDateFormat r4, android.content.Context r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1aSDK.stop
            int r0 = r0 + 61
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "appsFlyerFirstInstall"
            if (r0 != 0) goto L5e
            android.content.SharedPreferences r0 = AFInAppEventType(r5)
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L50
            int r0 = com.appsflyer.internal.AFa1aSDK.stop
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L30
            boolean r0 = afInfoLog(r5)
            r1 = 86
            int r1 = r1 / 0
            if (r0 == 0) goto L46
            goto L36
        L30:
            boolean r0 = afInfoLog(r5)
            if (r0 == 0) goto L46
        L36:
            java.lang.String r0 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r4 = r4.format(r0)
        L44:
            r0 = r4
            goto L49
        L46:
            java.lang.String r4 = ""
            goto L44
        L49:
            com.appsflyer.internal.AFd1pSDK r3 = r3.valueOf(r5)
            r3.AFInAppEventParameterName(r2, r0)
        L50:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "AppsFlyer: first launch date: "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.afInfoLog(r3)
            return r0
        L5e:
            android.content.SharedPreferences r3 = AFInAppEventType(r5)
            r3.getString(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(java.text.SimpleDateFormat, android.content.Context):java.lang.String");
    }

    private static void AFKeystoreWrapper(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        int i = updateServerUninstallToken + 81;
        stop = i % 128;
        try {
            if (i % 2 == 0) {
                scheduledExecutorService.schedule(runnable, j, timeUnit);
                int i2 = 52 / 0;
            } else {
                scheduledExecutorService.schedule(runnable, j, timeUnit);
            }
            int i3 = stop + 105;
            updateServerUninstallToken = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @android.support.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void AFKeystoreWrapper(@android.support.annotation.NonNull com.appsflyer.internal.AFa1qSDK r5, @android.support.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            android.app.Application r0 = r5.AFInAppEventType
            java.lang.String r1 = ""
            if (r6 == 0) goto L28
            android.content.Intent r2 = r6.getIntent()
            if (r2 == 0) goto L28
            int r2 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r2 = r2 + 35
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L23
            android.net.Uri r6 = com.appsflyer.internal.AFb1hSDK.AFInAppEventParameterName(r6)
            if (r6 == 0) goto L28
            java.lang.String r6 = r6.toString()
            goto L29
        L23:
            com.appsflyer.internal.AFb1hSDK.AFInAppEventParameterName(r6)
            r4 = 0
            throw r4
        L28:
            r6 = r1
        L29:
            com.appsflyer.internal.AFb1aSDK r2 = r4.AppsFlyerLib
            com.appsflyer.internal.AFd1kSDK r2 = r2.AFLogger$LogLevel()
            java.lang.String r2 = r2.AFInAppEventType
            if (r2 != 0) goto L64
            int r4 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r4 = r4 + 47
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r4
            java.lang.String r4 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r4)
            com.appsflyer.attribution.AppsFlyerRequestListener r4 = r5.valueOf
            if (r4 == 0) goto L63
            int r5 = com.appsflyer.internal.AFa1aSDK.updateServerUninstallToken
            int r5 = r5 + 33
            int r6 = r5 % 128
            com.appsflyer.internal.AFa1aSDK.stop = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L5c
            int r5 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r6 = com.appsflyer.internal.AFb1eSDK.values
            r4.onError(r5, r6)
            r4 = 82
            int r4 = r4 / 0
            goto L63
        L5c:
            int r5 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r6 = com.appsflyer.internal.AFb1eSDK.values
            r4.onError(r5, r6)
        L63:
            return
        L64:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r2.getReferrer(r0)
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            r1 = r0
        L70:
            r5.afDebugLog = r1
            r5.AFKeystoreWrapper = r6
            r4.valueOf(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK, android.app.Activity):void");
    }

    private static void AFInAppEventType(Context context, Map<String, Object> map) {
        AFa1ySDK.C0144AFa1ySDK AFInAppEventParameterName2 = AFa1ySDK.AFa1vSDK.valueOf.AFInAppEventParameterName(context);
        map.put("btl", Float.toString(AFInAppEventParameterName2.AFInAppEventType));
        String str = AFInAppEventParameterName2.valueOf;
        if (str != null) {
            stop = (updateServerUninstallToken + 19) % 128;
            map.put("btch", str);
            stop = (updateServerUninstallToken + 65) % 128;
        }
    }

    private static String AFInAppEventParameterName(File file, String str) {
        FileReader fileReader;
        Properties properties;
        try {
            try {
                try {
                    properties = new Properties();
                    fileReader = new FileReader(file);
                } catch (Throwable th) {
                    AFLogger.afErrorLog(th.getMessage(), th);
                    return null;
                }
            } catch (FileNotFoundException unused) {
                fileReader = null;
            } catch (Throwable th2) {
                th = th2;
                fileReader = null;
            }
            try {
                properties.load(fileReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                String property = properties.getProperty(str);
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    AFLogger.afErrorLog(th3.getMessage(), th3);
                }
                return property;
            } catch (FileNotFoundException unused2) {
                StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                sb.append(file.getAbsolutePath());
                AFLogger.afDebugLog(sb.toString());
                if (fileReader != null) {
                    fileReader.close();
                    updateServerUninstallToken = (stop + 95) % 128;
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                AFLogger.afErrorLog(th.getMessage(), th);
                if (fileReader != null) {
                    fileReader.close();
                }
                return null;
            }
        } catch (Throwable th5) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x041f A[Catch: all -> 0x00b5, Exception -> 0x0425, TRY_LEAVE, TryCatch #15 {Exception -> 0x0425, blocks: (B:147:0x0414, B:149:0x041f), top: B:146:0x0414, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0578 A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0581 A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05fe A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x061d A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x065e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06a6 A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0753 A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x040c A[Catch: all -> 0x00b5, TryCatch #13 {all -> 0x00b5, blocks: (B:14:0x00a3, B:16:0x00a9, B:19:0x00ba, B:20:0x00ca, B:22:0x00d2, B:24:0x00e5, B:27:0x00fd, B:29:0x0119, B:30:0x0122, B:32:0x012a, B:33:0x012f, B:35:0x0135, B:37:0x013d, B:39:0x0148, B:41:0x01b3, B:43:0x01b9, B:45:0x01bf, B:46:0x01cc, B:48:0x01d9, B:50:0x01e0, B:51:0x01e7, B:53:0x01ed, B:54:0x01f4, B:56:0x020b, B:57:0x0210, B:60:0x0218, B:61:0x021b, B:63:0x0222, B:64:0x0225, B:66:0x022f, B:68:0x0235, B:69:0x0238, B:71:0x0240, B:72:0x0249, B:76:0x025a, B:78:0x0265, B:81:0x026f, B:82:0x0274, B:84:0x027c, B:85:0x0290, B:88:0x02a0, B:90:0x02aa, B:91:0x02b4, B:93:0x02bc, B:95:0x02c1, B:97:0x02cf, B:99:0x02dc, B:101:0x02e2, B:103:0x02e8, B:104:0x02eb, B:106:0x02f9, B:108:0x0303, B:109:0x0308, B:111:0x030e, B:112:0x0317, B:114:0x031d, B:115:0x0326, B:117:0x032c, B:120:0x0339, B:122:0x033f, B:123:0x0356, B:125:0x035c, B:126:0x0361, B:128:0x0369, B:130:0x0382, B:131:0x038e, B:133:0x0394, B:134:0x039d, B:136:0x03a5, B:138:0x03ac, B:139:0x03c2, B:140:0x03c7, B:142:0x03cf, B:143:0x03d4, B:271:0x040c, B:145:0x0411, B:147:0x0414, B:149:0x041f, B:152:0x043c, B:155:0x0451, B:157:0x0466, B:158:0x047b, B:160:0x0492, B:178:0x055b, B:180:0x0578, B:182:0x0581, B:184:0x0585, B:186:0x058d, B:187:0x0594, B:189:0x05aa, B:220:0x05b5, B:223:0x05ca, B:224:0x05df, B:226:0x05da, B:191:0x05f8, B:193:0x05fe, B:196:0x060c, B:198:0x0613, B:200:0x061d, B:201:0x062f, B:204:0x0650, B:207:0x0660, B:208:0x0664, B:210:0x06a6, B:211:0x06b4, B:213:0x0753, B:215:0x0757, B:229:0x05e3, B:233:0x0555, B:253:0x04ad, B:257:0x0476, B:261:0x0461, B:264:0x044c, B:267:0x0427, B:275:0x0401, B:278:0x0406, B:279:0x036f, B:281:0x0377, B:282:0x0343, B:284:0x034d, B:286:0x0353, B:287:0x075d, B:293:0x02d7, B:294:0x0252, B:295:0x028d, B:298:0x0143, B:301:0x00f8, B:303:0x00c5, B:269:0x03ea), top: B:13:0x00a3, inners: #2, #3, #4, #6, #7, #8, #10, #11, #14, #15, #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.String, java.lang.Object> AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK r29) {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK):java.util.Map");
    }

    public final void AFInAppEventParameterName(@NonNull Context context) {
        int i = (stop + 15) % 128;
        updateServerUninstallToken = i;
        AFb1aSDK aFb1aSDK = this.AppsFlyerLib;
        if (context != null) {
            int i2 = i + 17;
            stop = i2 % 128;
            if (i2 % 2 != 0) {
                AFb1fSDK aFb1fSDK = aFb1aSDK.AFInAppEventParameterName;
                if (context != null) {
                    aFb1fSDK.AFKeystoreWrapper = context.getApplicationContext();
                }
            } else {
                AFb1fSDK aFb1fSDK2 = aFb1aSDK.AFInAppEventParameterName;
                throw null;
            }
        }
        stop = (updateServerUninstallToken + 71) % 128;
    }

    private void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        Application application = aFa1qSDK.AFInAppEventType;
        String format = String.format(afInfoLog, AppsFlyerLib.getInstance().getHostPrefix(), values().getHostName());
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(application.getPackageName());
        String obj = sb.toString();
        SharedPreferences AFInAppEventType2 = AFInAppEventType(application);
        byte b = 0;
        int AFInAppEventType3 = AFInAppEventType(AFInAppEventType2, false);
        int values2 = values(AFInAppEventType2);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", aFa1qSDK.AFInAppEventParameterName);
        hashMap.put("adrevenue_counter", Integer.valueOf(values2));
        hashMap.put("af_key", this.AppsFlyerLib.AFLogger$LogLevel().AFInAppEventType);
        hashMap.put("launch_counter", Integer.valueOf(AFInAppEventType3));
        hashMap.put(AFInAppEventParameterName("\ue732Ⲹ凑ꔣ警ꤢ᪃뎶벹욍ヌ\uef43", 11 - MotionEvent.axisFromString("")).intern(), Long.toString(new Date().getTime()));
        hashMap.put("uid", AFb1rSDK.AFInAppEventParameterName(new WeakReference(application)));
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (string2 != null) {
            stop = (updateServerUninstallToken + 69) % 128;
            hashMap.put("advertiserIdEnabled", string2);
        }
        if (string != null) {
            hashMap.put("advertiserId", string);
        }
        AFKeystoreWrapper(application, hashMap);
        hashMap.put("device", Build.DEVICE);
        valueOf(application, hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            hashMap.put("install_date", AFInAppEventType(simpleDateFormat, packageInfo.firstInstallTime));
            String string3 = AFInAppEventType2.getString("appsFlyerFirstInstall", null);
            if (string3 == null) {
                string3 = AFKeystoreWrapper(simpleDateFormat, application);
            }
            hashMap.put("first_launch_date", string3);
            stop = (updateServerUninstallToken + 5) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th, true);
        }
        AFKeystoreWrapper(this.AppsFlyerLib.AFInAppEventType(), new AFa1vSDK(this, aFa1qSDK.AFInAppEventType(obj).AFInAppEventType(hashMap).valueOf(AFInAppEventType3), b), 1L, TimeUnit.MILLISECONDS);
        int i = updateServerUninstallToken + 87;
        stop = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }

    private static String AFInAppEventParameterName(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1vSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = new char[cArr2.length];
                AFf1vSDK.valueOf = 0;
                char[] cArr4 = new char[2];
                while (true) {
                    int i2 = AFf1vSDK.valueOf;
                    if (i2 < cArr2.length) {
                        cArr4[0] = cArr2[i2];
                        cArr4[1] = cArr2[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr4[1];
                            char c2 = cArr4[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + AppsFlyerInAppPurchaseValidatorListener)) ^ ((c2 >>> 5) + onValidateInAppFailure)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + onValidateInApp) ^ ((c3 + i3) ^ ((c3 << 4) + AppsFlyerConversionListener))));
                            i3 -= 40503;
                        }
                        int i5 = AFf1vSDK.valueOf;
                        cArr3[i5] = cArr4[0];
                        cArr3[i5 + 1] = cArr4[1];
                        AFf1vSDK.valueOf = i5 + 2;
                    } else {
                        str2 = new String(cArr3, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private static void AFKeystoreWrapper(Map<String, Object> map, AFd1cSDK aFd1cSDK) {
        HashMap hashMap = new HashMap(aFd1cSDK.values);
        aFd1cSDK.values.clear();
        aFd1cSDK.AFInAppEventType.AFInAppEventType("gcd");
        if (!hashMap.isEmpty()) {
            stop = (updateServerUninstallToken + 77) % 128;
            AFInAppEventParameterName(map).put("gcd", hashMap);
        }
        int i = updateServerUninstallToken + 91;
        stop = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
