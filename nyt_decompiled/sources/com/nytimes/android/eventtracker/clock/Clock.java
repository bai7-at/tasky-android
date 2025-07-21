package com.nytimes.android.eventtracker.clock;

import com.nytimes.android.eventtracker.model.Timestamp;
import defpackage.cm0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class Clock {
    public static final Clock a = new Clock();
    private static final List b = i.o("time.google.com", "time1.google.com", "time2.google.com", "time3.google.com", "time4.google.com");
    private static AtomicReference c = new AtomicReference(null);

    private Clock() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        defpackage.ul8.a.z("ET2").m(r6, "Clock Install Failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cm0 r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.eventtracker.clock.Clock$install$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.eventtracker.clock.Clock$install$1 r0 = (com.nytimes.android.eventtracker.clock.Clock$install$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.clock.Clock$install$1 r0 = new com.nytimes.android.eventtracker.clock.Clock$install$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 0
            java.lang.String r3 = "ET2"
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            cm0 r7 = (defpackage.cm0) r7
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L4c
        L30:
            r6 = move-exception
            goto L5f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.f.b(r6)
            java.util.List r6 = com.nytimes.android.eventtracker.clock.Clock.b     // Catch: java.lang.Throwable -> L30
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L30
            r0.label = r4     // Catch: java.lang.Throwable -> L30
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = r7.a(r6, r4, r0)     // Catch: java.lang.Throwable -> L30
            if (r6 != r8) goto L4c
            return r8
        L4c:
            java.util.concurrent.atomic.AtomicReference r6 = com.nytimes.android.eventtracker.clock.Clock.c     // Catch: java.lang.Throwable -> L30
            r6.set(r7)     // Catch: java.lang.Throwable -> L30
            ul8$b r6 = defpackage.ul8.a     // Catch: java.lang.Throwable -> L30
            ul8$c r6 = r6.z(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "Clock Installed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30
            r6.l(r7, r8)     // Catch: java.lang.Throwable -> L30
            goto L6c
        L5f:
            ul8$b r7 = defpackage.ul8.a
            ul8$c r7 = r7.z(r3)
            java.lang.String r8 = "Clock Install Failed"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r7.m(r6, r8, r0)
        L6c:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.clock.Clock.a(cm0, by0):java.lang.Object");
    }

    public final Timestamp b() {
        cm0 cm0Var = (cm0) c.get();
        Long now = cm0Var != null ? cm0Var.now() : null;
        return new Timestamp(now != null ? now.longValue() : System.currentTimeMillis(), now == null);
    }
}
