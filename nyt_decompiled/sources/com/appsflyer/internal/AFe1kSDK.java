package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1lSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AFe1kSDK extends AFe1lSDK {
    public final Map<String, Object> AFInAppEventParameterName;

    public AFe1kSDK(Runnable runnable) {
        super("store", "google", runnable);
        this.AFInAppEventParameterName = new HashMap();
    }

    private static boolean valueOf(@NonNull Context context) {
        AFa1aSDK.values();
        if (AFa1aSDK.AFInAppEventType(AFa1aSDK.AFInAppEventType(context), false) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            if (AFb1wSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.afRDLog(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void AFInAppEventType(final Context context) {
        if (valueOf(context)) {
            this.afErrorLog = System.currentTimeMillis();
            this.afRDLog = AFe1lSDK.AFa1wSDK.STARTED;
            addObserver(new AFe1lSDK.AnonymousClass4());
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.AFe1kSDK.1
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.afDebugLog("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i) {
                        AFe1kSDK.this.AFInAppEventParameterName.put("code", String.valueOf(i));
                        AFe1kSDK.this.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFInAppEventType(context, "com.android.vending")));
                        AFe1kSDK.this.AFInAppEventType.put("api_ver_name", AFb1wSDK.valueOf(context, "com.android.vending"));
                        if (i == -1) {
                            AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                            AFe1kSDK.this.AFInAppEventType.put("response", "SERVICE_DISCONNECTED");
                        } else if (i == 0) {
                            AFe1kSDK.this.AFInAppEventType.put("response", "OK");
                            try {
                                AFLogger.afDebugLog("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        AFe1kSDK.this.AFInAppEventParameterName.put("val", installReferrer2);
                                        AFe1kSDK.this.AFInAppEventType.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    AFe1kSDK.this.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    AFe1kSDK.this.AFInAppEventType.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    AFe1kSDK.this.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                                    AFe1kSDK.this.AFInAppEventType.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        AFe1kSDK.this.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        AFe1kSDK.this.AFInAppEventType.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                                    AFe1kSDK.this.AFInAppEventParameterName.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                AFLogger.afWarnLog("Failed to get install referrer: " + th.getMessage());
                                AFe1kSDK.this.AFInAppEventParameterName.put("err", th.getMessage());
                            }
                        } else if (i == 1) {
                            AFe1kSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.afWarnLog("InstallReferrer not supported");
                        } else if (i == 2) {
                            AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                            AFe1kSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i != 3) {
                            AFLogger.afWarnLog("responseCode not found.");
                        } else {
                            AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                            AFe1kSDK.this.AFInAppEventType.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.afDebugLog("Install Referrer collected locally");
                        AFe1kSDK.this.values();
                        build.endConnection();
                    }
                });
            } catch (Throwable th) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th);
            }
        }
    }
}
