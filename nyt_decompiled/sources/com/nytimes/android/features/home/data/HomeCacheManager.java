package com.nytimes.android.features.home.data;

import com.nytimes.android.coroutinesutils.b;
import defpackage.by0;
import defpackage.j91;
import defpackage.lm;
import defpackage.ve2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class HomeCacheManager {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final j91 a;
    private final ve2 b;
    private final CoroutineDispatcher c;
    private final lm d;
    private final b e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HomeCacheManager(j91 j91Var, ve2 ve2Var, CoroutineDispatcher coroutineDispatcher, lm lmVar, b bVar) {
        zq3.h(j91Var, "expirationChecker");
        zq3.h(ve2Var, "fileSystem");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(lmVar, "appLaunchPerformanceTracker");
        zq3.h(bVar, "homeContentLoadJourney");
        this.a = j91Var;
        this.b = ve2Var;
        this.c = coroutineDispatcher;
        this.d = lmVar;
        this.e = bVar;
    }

    public final boolean e() {
        return this.a.e();
    }

    public final Object f(by0 by0Var) {
        return BuildersKt.withContext(this.c, new HomeCacheManager$load$2(this, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.features.home.data.HomeCacheManager$save$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.features.home.data.HomeCacheManager$save$1 r0 = (com.nytimes.android.features.home.data.HomeCacheManager$save$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.home.data.HomeCacheManager$save$1 r0 = new com.nytimes.android.features.home.data.HomeCacheManager$save$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.features.home.data.HomeCacheManager r5 = (com.nytimes.android.features.home.data.HomeCacheManager) r5
            kotlin.f.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.c
            com.nytimes.android.features.home.data.HomeCacheManager$save$2 r2 = new com.nytimes.android.features.home.data.HomeCacheManager$save$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            j91 r5 = r5.a
            org.threeten.bp.Instant r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.HomeCacheManager.g(java.lang.String, by0):java.lang.Object");
    }
}
