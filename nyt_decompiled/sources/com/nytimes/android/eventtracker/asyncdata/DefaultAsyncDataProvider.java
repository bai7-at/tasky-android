package com.nytimes.android.eventtracker.asyncdata;

import defpackage.fu;
import defpackage.ss2;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class DefaultAsyncDataProvider implements fu {
    private final ss2 a;
    private final AtomicReference b;

    public DefaultAsyncDataProvider(ss2 ss2Var) {
        zq3.h(ss2Var, "deviceTokenLambda");
        this.a = ss2Var;
        this.b = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$getDeviceToken$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$getDeviceToken$1 r0 = (com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$getDeviceToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$getDeviceToken$1 r0 = new com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$getDeviceToken$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider r4 = (com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider) r4
            kotlin.f.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            java.util.concurrent.atomic.AtomicReference r5 = r4.b
            java.lang.Object r5 = r5.get()
            up1 r5 = (defpackage.up1) r5
            if (r5 != 0) goto L56
            ss2 r5 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            up1 r5 = (defpackage.up1) r5
            java.util.concurrent.atomic.AtomicReference r4 = r4.b
            r4.set(r5)
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider.c(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$get$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$get$1 r0 = (com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$get$1 r0 = new com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider$get$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            up1 r5 = (defpackage.up1) r5
            eu r4 = new eu
            r4.<init>(r5)
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "ET2"
            ul8$c r5 = r5.z(r0)
            up1 r0 = r4.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DeviceToken ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5.a(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider.a(by0):java.lang.Object");
    }
}
