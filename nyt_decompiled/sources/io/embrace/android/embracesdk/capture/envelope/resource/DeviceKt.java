package io.embrace.android.embracesdk.capture.envelope.resource;

/* loaded from: classes5.dex */
public final class DeviceKt {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (kotlin.text.h.K(r7, "generic", false, 2, null) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isEmulator(io.embrace.android.embracesdk.internal.SystemInfo r7) {
        /*
            java.lang.String r0 = "systemInfo"
            defpackage.zq3.h(r7, r0)
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "Build.FINGERPRINT"
            defpackage.zq3.g(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = kotlin.text.h.K(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L8b
            defpackage.zq3.g(r0, r1)
            java.lang.String r6 = "unknown"
            boolean r6 = kotlin.text.h.K(r0, r6, r3, r4, r5)
            if (r6 != 0) goto L8b
            defpackage.zq3.g(r0, r1)
            java.lang.String r1 = "emulator"
            boolean r0 = kotlin.text.h.P(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r7.getDeviceModel()
            java.lang.String r1 = "google_sdk"
            boolean r0 = kotlin.text.h.P(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r7.getDeviceModel()
            java.lang.String r6 = "sdk_gphone64"
            boolean r0 = kotlin.text.h.P(r0, r6, r3, r4, r5)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r7.getDeviceModel()
            java.lang.String r6 = "Emulator"
            boolean r0 = kotlin.text.h.P(r0, r6, r3, r4, r5)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r7.getDeviceModel()
            java.lang.String r6 = "Android SDK built for"
            boolean r0 = kotlin.text.h.P(r0, r6, r3, r4, r5)
            if (r0 != 0) goto L8b
            java.lang.String r7 = r7.getDeviceManufacturer()
            java.lang.String r0 = "Genymotion"
            boolean r7 = kotlin.text.h.P(r7, r0, r3, r4, r5)
            if (r7 != 0) goto L8b
            java.lang.String r7 = android.os.Build.BRAND
            java.lang.String r0 = "Build.BRAND"
            defpackage.zq3.g(r7, r0)
            boolean r7 = kotlin.text.h.K(r7, r2, r3, r4, r5)
            if (r7 == 0) goto L83
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r0 = "Build.DEVICE"
            defpackage.zq3.g(r7, r0)
            boolean r7 = kotlin.text.h.K(r7, r2, r3, r4, r5)
            if (r7 != 0) goto L8b
        L83:
            java.lang.String r7 = android.os.Build.PRODUCT
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L8c
        L8b:
            r3 = 1
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.capture.envelope.resource.DeviceKt.isEmulator(io.embrace.android.embracesdk.internal.SystemInfo):boolean");
    }
}
