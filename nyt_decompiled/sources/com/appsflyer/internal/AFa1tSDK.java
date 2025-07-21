package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFa1tSDK {
    public static String[] AFInAppEventType;

    @VisibleForTesting
    private static AFa1tSDK afErrorLog;

    @VisibleForTesting
    public static Intent valueOf;
    static final List<String> values = new ArrayList();
    public DeepLinkListener AFInAppEventParameterName;
    public String AFKeystoreWrapper;

    @Nullable
    public List<List<String>> afDebugLog = new ArrayList();
    public Map<String, String> afInfoLog;

    @Nullable
    private Uri AFInAppEventType(Object obj, Iterator<String> it2) {
        while (obj != JSONObject.NULL) {
            if (!it2.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it2.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static AFa1tSDK AFKeystoreWrapper() {
        if (afErrorLog == null) {
            afErrorLog = new AFa1tSDK();
        }
        return afErrorLog;
    }

    final void valueOf(Map<String, Object> map, Intent intent, Context context) {
        AFa1aSDK.values().AFInAppEventParameterName(context);
        AFc1xSDK AFInAppEventParameterName = AFa1aSDK.values().AFInAppEventParameterName();
        AFd1pSDK afErrorLog2 = AFInAppEventParameterName.afErrorLog();
        if (!AFKeystoreWrapper(intent, context, map) && this.AFInAppEventParameterName != null && AFInAppEventParameterName.values().valueOf.values("appsFlyerCount") == 0 && !afErrorLog2.valueOf("ddl_sent")) {
            AFb1pSDK aFb1pSDK = new AFb1pSDK(context, AFInAppEventParameterName);
            AFc1lSDK afRDLog = AFInAppEventParameterName.afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(new AFd1ySDK(aFb1pSDK)));
        }
        afErrorLog2.AFInAppEventParameterName("ddl_sent", true);
    }

    static void AFKeystoreWrapper(Context context, Map<String, Object> map, Uri uri) {
        AFd1zSDK aFd1zSDK = new AFd1zSDK(context, map, uri, values);
        AFa1aSDK.values().AFInAppEventParameterName(context);
        AFc1lSDK afRDLog = AFa1aSDK.values().AFInAppEventParameterName().afRDLog();
        afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1zSDK));
        valueOf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:44:0x0048->B:53:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFKeystoreWrapper(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.AFKeystoreWrapper(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }

    @VisibleForTesting
    @Nullable
    static Uri valueOf(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }
}
