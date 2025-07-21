package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1lSDK;

/* loaded from: classes2.dex */
public final class AFe1nSDK extends AFe1lSDK {
    private final AFc1xSDK AFInAppEventParameterName;
    final ProviderInfo values;

    @RequiresApi(api = 19)
    public AFe1nSDK(ProviderInfo providerInfo, Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFInAppEventParameterName = aFc1xSDK;
        this.values = providerInfo;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void AFInAppEventType(final Context context) {
        this.AFInAppEventParameterName.valueOf().execute(new Runnable() { // from class: com.appsflyer.internal.AFe1nSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                AFe1nSDK aFe1nSDK = AFe1nSDK.this;
                aFe1nSDK.afErrorLog = System.currentTimeMillis();
                aFe1nSDK.afRDLog = AFe1lSDK.AFa1wSDK.STARTED;
                aFe1nSDK.addObserver(new AFe1lSDK.AnonymousClass4());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFe1nSDK.this.values.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder sb2 = new StringBuilder("app_id=");
                sb2.append(context.getPackageName());
                Cursor query = contentResolver.query(parse, null, sb2.toString(), null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("transaction_id");
                    if (columnIndex == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        AFe1nSDK.this.AFInAppEventType.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFe1nSDK.this.AFInAppEventType.put("response", "OK");
                        if (query.moveToFirst()) {
                            String string = query.getString(columnIndex);
                            query.close();
                            if (string != null && !string.isEmpty()) {
                                AFe1nSDK.this.AFInAppEventType.put("referrer", string);
                            }
                        }
                    }
                } else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    AFe1nSDK.this.AFInAppEventType.put("response", "SERVICE_UNAVAILABLE");
                }
                AFe1nSDK aFe1nSDK2 = AFe1nSDK.this;
                aFe1nSDK2.AFInAppEventType.put("api_ver", Long.valueOf(AFb1wSDK.AFInAppEventType(context, ((PackageItemInfo) aFe1nSDK2.values).packageName)));
                AFe1nSDK aFe1nSDK3 = AFe1nSDK.this;
                aFe1nSDK3.AFInAppEventType.put("api_ver_name", AFb1wSDK.valueOf(context, ((PackageItemInfo) aFe1nSDK3.values).packageName));
                AFe1nSDK.this.values();
            }
        });
    }
}
