package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

/* loaded from: classes2.dex */
final class AFb1zSDK extends AFb1jSDK<String> {
    AFb1zSDK(Context context, AFc1xSDK aFc1xSDK) {
        super(context, aFc1xSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1jSDK
    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public String valueOf() {
        Throwable th;
        Cursor cursor;
        try {
            ContentResolver contentResolver = this.values.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFInAppEventType);
            cursor = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // com.appsflyer.internal.AFb1jSDK
    @Nullable
    public final /* synthetic */ String AFInAppEventParameterName() {
        this.AFInAppEventParameterName.valueOf().execute(this.valueOf);
        return (String) super.AFInAppEventParameterName();
    }

    @Nullable
    public final String AFInAppEventType() {
        this.AFInAppEventParameterName.valueOf().execute(this.valueOf);
        return (String) super.AFInAppEventParameterName();
    }
}
