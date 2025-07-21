package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFe1oSDK extends AFe1mSDK {
    private final AFc1xSDK values;

    public AFe1oSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "huawei", runnable);
        this.values = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void AFInAppEventType(Context context) {
        AFKeystoreWrapper(context, new AFb1jSDK<Map<String, Object>>(context, this.values, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFe1oSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00fd, code lost:
            
                if (r2 != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
            
                r10.AFKeystoreWrapper.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
            
                return r10.AFKeystoreWrapper.AFInAppEventType;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
            
                if (0 == 0) goto L24;
             */
            @Override // com.appsflyer.internal.AFb1jSDK
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> valueOf() {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1oSDK.AnonymousClass1.valueOf():java.util.Map");
            }
        });
    }
}
