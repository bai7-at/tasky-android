package defpackage;

import com.nytimes.android.utils.NetworkStatus;

/* loaded from: classes2.dex */
public final class bx implements ax {
    private final wc a;
    private final jc b;
    private final NetworkStatus c;
    private final b05 d;
    private final String e;
    private final String f;
    private final String g;

    public bx(wc wcVar, jc jcVar, NetworkStatus networkStatus, b05 b05Var, String str, String str2, String str3) {
        zq3.h(wcVar, "eventManager");
        zq3.h(jcVar, "analyticsClient");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(b05Var, "clock");
        zq3.h(str, "appVersion");
        zq3.h(str2, "buildNumber");
        zq3.h(str3, "etSourceAppName");
        this.a = wcVar;
        this.b = jcVar;
        this.c = networkStatus;
        this.d = b05Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.nytimes.android.media.common.NYTMediaItem r26, com.nytimes.android.analytics.event.audio.AudioReferralSource r27) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r1 = "mediaItem"
            r2 = r26
            defpackage.zq3.h(r2, r1)
            wc r1 = r0.a
            java.lang.Long r3 = r26.V()
            java.lang.String r4 = r26.W()
            java.lang.String r5 = r26.a()
            com.nytimes.android.media.common.AudioType r6 = r26.i()
            com.nytimes.android.media.common.AudioType r7 = com.nytimes.android.media.common.AudioType.AUTO
            r8 = 0
            if (r6 == r7) goto L21
            goto L22
        L21:
            r5 = r8
        L22:
            java.lang.String r6 = r26.g()
            com.nytimes.android.media.common.AudioPosition r7 = r26.h()
            if (r7 == 0) goto L31
            java.lang.String r7 = r7.getTitle()
            goto L32
        L31:
            r7 = r8
        L32:
            java.lang.Long r9 = r26.a0()
            if (r9 == 0) goto L4b
            long r10 = r9.longValue()
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L43
            goto L44
        L43:
            r9 = r8
        L44:
            if (r9 == 0) goto L4b
            java.lang.String r9 = r9.toString()
            goto L4c
        L4b:
            r9 = r8
        L4c:
            java.lang.String r10 = r26.b0()
            java.lang.String r11 = r26.e0()
            com.nytimes.android.media.common.AudioType r12 = r26.i()
            if (r12 == 0) goto L5f
            java.lang.String r12 = r12.getTitle()
            goto L60
        L5f:
            r12 = r8
        L60:
            java.lang.String r13 = r26.Y()
            if (r27 == 0) goto L6a
            java.lang.String r8 = r27.getTitle()
        L6a:
            r23 = r8
            java.lang.String r14 = r26.c0()
            jc r2 = r0.b
            com.nytimes.android.analytics.api.values.DeviceOrientation r15 = r2.g()
            java.lang.String r2 = r0.f
            r16 = r2
            java.lang.String r2 = r0.e
            r17 = r2
            com.nytimes.android.utils.NetworkStatus r2 = r0.c
            java.lang.String r18 = r2.e()
            jc r2 = r0.b
            com.nytimes.android.analytics.api.values.SubscriptionLevel r19 = r2.i()
            java.lang.String r2 = r0.g
            r20 = r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            b05 r0 = r0.d
            r24 = r1
            long r0 = r0.c()
            long r21 = r2.toSeconds(r0)
            r09 r0 = new r09
            r2 = r0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r24
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.a(com.nytimes.android.media.common.NYTMediaItem, com.nytimes.android.analytics.event.audio.AudioReferralSource):void");
    }
}
