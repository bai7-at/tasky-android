package com.nytimes.android.firebase;

import defpackage.r82;
import defpackage.vp1;

/* loaded from: classes4.dex */
public final class FirebaseModule$provideEventTrackerUserToken$1 implements vp1 {
    final /* synthetic */ r82 a;

    FirebaseModule$provideEventTrackerUserToken$1(r82 r82Var) {
        this.a = r82Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|(2:13|14)(2:16|17)))|27|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r4, "FirebaseInstanceId - token not valid: " + r4.getMessage(), new java.lang.Object[0]);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.vp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1 r0 = (com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1 r0 = new com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1$getDeviceToken$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.io.IOException -> L29
            goto L45
        L29:
            r4 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            r82 r4 = r4.a     // Catch: java.io.IOException -> L29
            kotlinx.coroutines.flow.Flow r4 = r4.a()     // Catch: java.io.IOException -> L29
            r0.label = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.first(r4, r0)     // Catch: java.io.IOException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.IOException -> L29
            goto L64
        L48:
            java.lang.String r5 = r4.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FirebaseInstanceId - token not valid: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.nytimes.android.logging.NYTLogger.i(r4, r5, r0)
            r5 = 0
        L64:
            if (r5 != 0) goto L69
            up1$b r4 = up1.b.a
            goto L6e
        L69:
            up1$a r4 = new up1$a
            r4.<init>(r5)
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.firebase.FirebaseModule$provideEventTrackerUserToken$1.a(by0):java.lang.Object");
    }
}
