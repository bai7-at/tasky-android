package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFd1jSDK extends AFa1qSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFd1jSDK(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.appsflyer.internal.AFd1lSDK.AFKeystoreWrapper
            com.appsflyer.AppsFlyerLib r2 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r2 = r2.getHostPrefix()
            com.appsflyer.internal.AFa1aSDK r3 = com.appsflyer.internal.AFa1aSDK.values()
            java.lang.String r3 = r3.getHostName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "Register"
            r4.<init>(r2, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1jSDK.<init>(android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFc1jSDK AFInAppEventParameterName() {
        return AFc1jSDK.REGISTER;
    }
}
