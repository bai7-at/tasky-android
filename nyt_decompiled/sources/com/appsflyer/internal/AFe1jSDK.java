package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFe1jSDK extends AFe1mSDK {
    private final AFc1xSDK values;

    public AFe1jSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "samsung", runnable);
        this.values = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void AFInAppEventType(Context context) {
        AFKeystoreWrapper(context, new AFb1jSDK<Map<String, Object>>(context, this.values, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFe1jSDK.4
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r2 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.values.getPackageManager().resolveContentProvider(r10.AFInAppEventType, 128)).packageName;
                r10.AFKeystoreWrapper.AFInAppEventType.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1wSDK.AFInAppEventType(r10.values, r0)));
                r10.AFKeystoreWrapper.AFInAppEventType.put("api_ver_name", com.appsflyer.internal.AFb1wSDK.valueOf(r10.values, r0));
                r10.AFKeystoreWrapper.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0115, code lost:
            
                return r10.AFKeystoreWrapper.AFInAppEventType;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFb1jSDK
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> valueOf() {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1jSDK.AnonymousClass4.valueOf():java.util.Map");
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }
        });
    }
}
