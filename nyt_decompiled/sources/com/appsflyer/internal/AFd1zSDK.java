package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.amazonaws.http.HttpHeader;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class AFd1zSDK extends AFc1nSDK<Map<String, Object>> {
    private static final int afInfoLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Context AFLogger;
    private final Map<String, Object> afDebugLog;
    private final List<String> afErrorLog;
    private final Uri afRDLog;

    public AFd1zSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFc1jSDK.RESOLVE_ESP, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, "ResolveEsp");
        this.AFLogger = context;
        this.afDebugLog = map;
        this.afRDLog = uri;
        this.afErrorLog = list;
    }

    private boolean valueOf(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.afErrorLog);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.afErrorLog.contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        if (!valueOf(this.afRDLog.toString())) {
            AFa1aSDK.values().AFInAppEventType(this.AFLogger, this.afDebugLog, this.afRDLog);
            return AFc1rSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.afRDLog.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> AFInAppEventType = AFInAppEventType(Uri.parse(obj));
            String str2 = (String) AFInAppEventType.get("res");
            Integer num2 = (Integer) AFInAppEventType.get("status");
            String str3 = (String) AFInAppEventType.get("error");
            if (str2 == null || !valueOf(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.afDebugLog) {
            this.afDebugLog.put("af_deeplink_r", hashMap);
            this.afDebugLog.put("af_deeplink", this.afRDLog.toString());
        }
        AFa1aSDK.values().AFInAppEventType(this.AFLogger, this.afDebugLog, obj != null ? Uri.parse(obj) : this.afRDLog);
        return AFc1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 60000L;
    }

    private static Map<String, Object> AFInAppEventType(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = afInfoLog;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.8.2");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField(HttpHeader.LOCATION));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }
}
