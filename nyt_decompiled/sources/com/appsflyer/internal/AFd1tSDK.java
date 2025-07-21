package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFe1lSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFd1tSDK extends AFd1uSDK {
    public Map<String, Object> AFVersionDeclaration;

    @NonNull
    private final AFd1pSDK afWarnLog;

    @NonNull
    private final AFd1cSDK getLevel;

    @NonNull
    private final AFe1fSDK init;

    @NonNull
    private final AppsFlyerProperties onAppOpenAttributionNative;

    @NonNull
    private final CreateOneLinkHttpTask onInstallConversionDataLoadedNative;

    /* renamed from: com.appsflyer.internal.AFd1tSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFe1lSDK.AFa1wSDK.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AFe1lSDK.AFa1wSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AFe1lSDK.AFa1wSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1tSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK) {
        super(aFa1qSDK, aFc1xSDK);
        this.init = aFc1xSDK.AFVersionDeclaration();
        this.afWarnLog = aFc1xSDK.afErrorLog();
        this.getLevel = aFc1xSDK.afInfoLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.AFLogger();
        this.onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
        this.values.add(AFc1jSDK.RESOLVE_ESP);
        this.values.add(AFc1jSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    protected final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        super.AFInAppEventType(aFa1qSDK);
        int i = aFa1qSDK.afRDLog;
        this.getLevel.values(i);
        Map map = (Map) aFa1qSDK.valueOf().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.valueOf().put("meta", map);
        }
        AFb1mSDK AFKeystoreWrapper = this.onInstallConversionDataLoadedNative.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFKeystoreWrapper.valueOf);
            String str = AFKeystoreWrapper.AFInAppEventType;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j = AFKeystoreWrapper.AFKeystoreWrapper;
            if (j > 0) {
                hashMap.put("latency", Long.valueOf(j));
            }
            long j2 = AFKeystoreWrapper.values;
            if (j2 > 0) {
                hashMap.put("delay", Long.valueOf(j2));
            }
            int i2 = AFKeystoreWrapper.AFInAppEventParameterName;
            if (i2 > 0) {
                hashMap.put("res_code", Integer.valueOf(i2));
            }
            if (AFKeystoreWrapper.afInfoLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFKeystoreWrapper.afInfoLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFKeystoreWrapper.afInfoLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFe1rSDK aFe1rSDK = AFKeystoreWrapper.AFLogger;
            if (aFe1rSDK != null) {
                hashMap.put("sig", aFe1rSDK.toString());
            }
            map.put("rc", hashMap);
        }
        if (i == 1) {
            if (this.onAppOpenAttributionNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1qSDK.valueOf().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.getLevel.AFKeystoreWrapper);
            this.getLevel.AFInAppEventType.AFInAppEventType("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.getLevel.valueOf);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.getLevel.valueOf);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.getLevel.AFInAppEventType.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1qSDK.valueOf().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFe1lSDK aFe1lSDK : this.init.values()) {
                boolean z = aFe1lSDK instanceof AFe1kSDK;
                int i3 = AnonymousClass4.AFInAppEventParameterName[aFe1lSDK.afRDLog.ordinal()];
                if (i3 == 1) {
                    if (z) {
                        aFa1qSDK.values("rfr", ((AFe1kSDK) aFe1lSDK).AFInAppEventParameterName);
                        this.afWarnLog.AFInAppEventParameterName(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFe1lSDK.AFInAppEventType);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFe1lSDK.valueOf);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put(TransferTable.COLUMN_TYPE, aFe1lSDK.afDebugLog);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.values("referrers", arrayList);
            }
            Object obj = this.AFVersionDeclaration;
            if (obj != null) {
                aFa1qSDK.values("fb_ddl", obj);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        super.values();
        AFd1cSDK aFd1cSDK = this.getLevel;
        int i = ((AFd1uSDK) this).afRDLog.afRDLog;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFd1cSDK.afInfoLog;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFd1cSDK.valueOf.put("net", Long.valueOf(currentTimeMillis - j));
            aFd1cSDK.AFInAppEventType.AFInAppEventParameterName("first_launch", new JSONObject(aFd1cSDK.valueOf).toString());
        }
    }
}
