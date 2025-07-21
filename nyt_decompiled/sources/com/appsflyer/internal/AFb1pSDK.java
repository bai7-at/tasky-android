package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1lSDK;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class AFb1pSDK extends AFd1dSDK {

    @VisibleForTesting
    private static String AFVersionDeclaration = "https://%sdlsdk.%s/v1.0/android/";
    public static long getLevel;
    private final List<AFe1lSDK> AFLogger$LogLevel;
    private final ExecutorService AppsFlyer2dXConversionCallback;
    private final CountDownLatch afWarnLog;
    private final AFd1cSDK onAppOpenAttributionNative;
    private final AFe1fSDK onAttributionFailureNative;
    private int onConversionDataFail;
    private int onConversionDataSuccess;
    private int onDeepLinkingNative;
    private final AFb1dSDK onInstallConversionDataLoadedNative;
    private final AFd1kSDK onInstallConversionFailureNative;
    private boolean onResponseNative;

    /* renamed from: com.appsflyer.internal.AFb1pSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[AFe1lSDK.AFa1wSDK.values().length];
            valueOf = iArr;
            try {
                iArr[AFe1lSDK.AFa1wSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[AFe1lSDK.AFa1wSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1pSDK(Context context, AFc1xSDK aFc1xSDK) {
        super(null, AFVersionDeclaration, Boolean.FALSE, Boolean.TRUE, null, context);
        this.AFLogger$LogLevel = new ArrayList();
        this.afWarnLog = new CountDownLatch(1);
        this.onAppOpenAttributionNative = aFc1xSDK.afInfoLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.values();
        this.onInstallConversionFailureNative = aFc1xSDK.AFLogger$LogLevel();
        this.onAttributionFailureNative = aFc1xSDK.AFVersionDeclaration();
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.valueOf();
    }

    private boolean AFVersionDeclaration() {
        List list = (List) this.values.get("referrers");
        return (list != null ? list.size() : 0) < this.onConversionDataSuccess && !this.values.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getLevel() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1pSDK.getLevel():void");
    }

    private static boolean values(AFe1lSDK aFe1lSDK) {
        Long l = (Long) aFe1lSDK.AFInAppEventType.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        return AFc1jSDK.DLSDK;
    }

    public final DeepLinkResult afErrorLog() {
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.AFb1pSDK.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ DeepLinkResult call() throws Exception {
                Application application = AFb1pSDK.this.AFInAppEventType;
                AFb1pSDK.AFInAppEventParameterName(AFb1pSDK.this);
                AFb1pSDK.this.getLevel();
                return AFb1pSDK.valueOf(AFb1pSDK.this, application);
            }
        });
        this.AppsFlyer2dXConversionCallback.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(getLevel, TimeUnit.MILLISECONDS);
            this.onAppOpenAttributionNative.valueOf(deepLinkResult, getLevel);
            AFb1lSDK.values(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, e.getCause() instanceof IOException ? DeepLinkResult.Error.NETWORK : DeepLinkResult.Error.UNEXPECTED);
            this.onAppOpenAttributionNative.valueOf(deepLinkResult2, getLevel);
            AFb1lSDK.values(deepLinkResult2);
            return deepLinkResult2;
        } catch (TimeoutException unused) {
            StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb.append(this.onConversionDataFail);
            sb.append(" attempt(s) within ");
            sb.append(getLevel);
            sb.append(" milliseconds");
            AFLogger.afDebugLog(sb.toString());
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.onAppOpenAttributionNative.valueOf(deepLinkResult3, getLevel);
            AFb1lSDK.values(deepLinkResult3);
            return deepLinkResult3;
        }
    }

    static /* synthetic */ void AFInAppEventParameterName(AFb1pSDK aFb1pSDK) {
        ArrayList<AFe1lSDK> arrayList = new ArrayList();
        for (AFe1lSDK aFe1lSDK : aFb1pSDK.onAttributionFailureNative.values()) {
            if (aFe1lSDK != null && aFe1lSDK.afRDLog != AFe1lSDK.AFa1wSDK.NOT_STARTED) {
                arrayList.add(aFe1lSDK);
            }
        }
        aFb1pSDK.onConversionDataSuccess = arrayList.size();
        for (final AFe1lSDK aFe1lSDK2 : arrayList) {
            int i = AnonymousClass4.valueOf[aFe1lSDK2.afRDLog.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(aFe1lSDK2.AFInAppEventType.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb.toString());
                aFb1pSDK.AFKeystoreWrapper(aFe1lSDK2);
            } else if (i == 2) {
                aFe1lSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1pSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(aFe1lSDK2.AFInAppEventType.get("source"));
                        sb2.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb2.toString());
                        AFb1pSDK.this.AFKeystoreWrapper((AFe1lSDK) observable);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFe1lSDK aFe1lSDK) {
        if (values(aFe1lSDK)) {
            this.AFLogger$LogLevel.add(aFe1lSDK);
            this.afWarnLog.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(aFe1lSDK.getClass().getSimpleName());
            AFLogger.afDebugLog(sb.toString());
            return;
        }
        int i = this.onDeepLinkingNative + 1;
        this.onDeepLinkingNative = i;
        if (i == this.onConversionDataSuccess) {
            this.afWarnLog.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0166, code lost:
    
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult valueOf(com.appsflyer.internal.AFb1pSDK r11, android.content.Context r12) throws java.io.IOException, org.json.JSONException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1pSDK.valueOf(com.appsflyer.internal.AFb1pSDK, android.content.Context):com.appsflyer.deeplink.DeepLinkResult");
    }

    @Nullable
    private Map<String, Object> values(final AFa1rSDK aFa1rSDK) {
        if (aFa1rSDK == null || aFa1rSDK.AFKeystoreWrapper == null) {
            return null;
        }
        Boolean bool = aFa1rSDK.valueOf;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1pSDK.1
                {
                    put(TransferTable.COLUMN_TYPE, "unhashed");
                    put("value", AFa1rSDK.this.AFKeystoreWrapper);
                }
            };
        }
        return null;
    }
}
