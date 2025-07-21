package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.du8;
import defpackage.gt2;
import defpackage.k75;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class ParallelStore {
    private final ss2 a;
    private final gt2 b;
    private final gt2 c;
    private final b d;
    private final long e;

    public ParallelStore(ss2 ss2Var, gt2 gt2Var, gt2 gt2Var2, b bVar, long j) {
        zq3.h(ss2Var, "staleDataChecker");
        zq3.h(gt2Var, "loadFromCache");
        zq3.h(gt2Var2, "fetchAndSave");
        zq3.h(bVar, "tracer");
        this.a = ss2Var;
        this.b = gt2Var;
        this.c = gt2Var2;
        this.d = bVar;
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r6, kotlin.Pair[] r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.coroutinesutils.ParallelStore$cacheLoad$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.coroutinesutils.ParallelStore$cacheLoad$1 r0 = (com.nytimes.android.coroutinesutils.ParallelStore$cacheLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.ParallelStore$cacheLoad$1 r0 = new com.nytimes.android.coroutinesutils.ParallelStore$cacheLoad$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.coroutinesutils.b r5 = (com.nytimes.android.coroutinesutils.b) r5
            kotlin.f.b(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            goto L66
        L2d:
            r6 = move-exception
            goto L73
        L2f:
            r6 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r8)
            com.nytimes.android.coroutinesutils.b r8 = r5.d
            int r2 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)
            kotlin.Pair[] r7 = (kotlin.Pair[]) r7
            java.lang.String r2 = "CacheLoad"
            com.nytimes.android.coroutinesutils.b r8 = r8.c(r2)
            int r2 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)
            kotlin.Pair[] r7 = (kotlin.Pair[]) r7
            r2 = 0
            r8.b(r2, r7)
            gt2 r5 = r5.b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            java.lang.Object r5 = r5.invoke(r6, r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            if (r5 != r1) goto L63
            return r1
        L63:
            r4 = r8
            r8 = r5
            r5 = r4
        L66:
            r5.a()
            return r8
        L6a:
            r6 = move-exception
            r5 = r8
            goto L73
        L6d:
            r6 = move-exception
            r5 = r8
        L6f:
            r5.error(r6)     // Catch: java.lang.Throwable -> L2d
            throw r6     // Catch: java.lang.Throwable -> L2d
        L73:
            r5.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore.k(java.lang.Object, kotlin.Pair[], by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r6, java.lang.Object r7, kotlin.Pair[] r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.coroutinesutils.ParallelStore$fetch$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.coroutinesutils.ParallelStore$fetch$1 r0 = (com.nytimes.android.coroutinesutils.ParallelStore$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.ParallelStore$fetch$1 r0 = new com.nytimes.android.coroutinesutils.ParallelStore$fetch$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.coroutinesutils.b r5 = (com.nytimes.android.coroutinesutils.b) r5
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            goto L79
        L2d:
            r6 = move-exception
            goto L86
        L2f:
            r6 = move-exception
            goto L82
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r9)
            com.nytimes.android.coroutinesutils.b r9 = r5.d
            mz7 r2 = new mz7
            r4 = 2
            r2.<init>(r4)
            kotlin.Pair r7 = r5.o(r7)
            r2.a(r7)
            r2.b(r8)
            int r7 = r2.c()
            kotlin.Pair[] r7 = new kotlin.Pair[r7]
            java.lang.Object[] r7 = r2.d(r7)
            kotlin.Pair[] r7 = (kotlin.Pair[]) r7
            java.lang.String r8 = "Fetch"
            com.nytimes.android.coroutinesutils.b r8 = r9.c(r8)
            int r9 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
            kotlin.Pair[] r7 = (kotlin.Pair[]) r7
            r9 = 0
            r8.b(r9, r7)
            gt2 r5 = r5.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.lang.Object r9 = r5.invoke(r6, r0)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            if (r9 != r1) goto L78
            return r1
        L78:
            r5 = r8
        L79:
            r5.a()
            return r9
        L7d:
            r6 = move-exception
            r5 = r8
            goto L86
        L80:
            r6 = move-exception
            r5 = r8
        L82:
            r5.error(r6)     // Catch: java.lang.Throwable -> L2d
            throw r6     // Catch: java.lang.Throwable -> L2d
        L86:
            r5.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore.l(java.lang.Object, java.lang.Object, kotlin.Pair[], by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:24|25|(1:27))|19|20|(1:22)|12|13))|30|6|7|(0)(0)|19|20|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r7 = new com.nytimes.android.coroutinesutils.FetchResult.b.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kotlinx.coroutines.flow.FlowCollector r6, java.lang.Object r7, java.lang.Object r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.coroutinesutils.ParallelStore$fetchFromServer$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.coroutinesutils.ParallelStore$fetchFromServer$1 r0 = (com.nytimes.android.coroutinesutils.ParallelStore$fetchFromServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.ParallelStore$fetchFromServer$1 r0 = new com.nytimes.android.coroutinesutils.ParallelStore$fetchFromServer$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.coroutinesutils.ParallelStore r5 = (com.nytimes.android.coroutinesutils.ParallelStore) r5
            kotlin.f.b(r9)
            goto L89
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r5 = r0.L$1
            r6 = r5
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.coroutinesutils.ParallelStore r5 = (com.nytimes.android.coroutinesutils.ParallelStore) r5
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L47
            goto L69
        L47:
            r7 = move-exception
            goto L6f
        L49:
            kotlin.f.b(r9)
            com.nytimes.android.coroutinesutils.FetchResult$a r9 = com.nytimes.android.coroutinesutils.FetchResult.Companion
            java.lang.String r9 = "context.reason"
            java.lang.String r2 = "forcedFetch"
            kotlin.Pair r9 = defpackage.du8.a(r9, r2)     // Catch: java.lang.Exception -> L47
            kotlin.Pair[] r9 = new kotlin.Pair[]{r9}     // Catch: java.lang.Exception -> L47
            r0.L$0 = r5     // Catch: java.lang.Exception -> L47
            r0.L$1 = r6     // Catch: java.lang.Exception -> L47
            r0.L$2 = r8     // Catch: java.lang.Exception -> L47
            r0.label = r4     // Catch: java.lang.Exception -> L47
            java.lang.Object r9 = r5.l(r7, r8, r9, r0)     // Catch: java.lang.Exception -> L47
            if (r9 != r1) goto L69
            return r1
        L69:
            com.nytimes.android.coroutinesutils.FetchResult$b$b r7 = new com.nytimes.android.coroutinesutils.FetchResult$b$b     // Catch: java.lang.Exception -> L47
            r7.<init>(r9)     // Catch: java.lang.Exception -> L47
            goto L75
        L6f:
            com.nytimes.android.coroutinesutils.FetchResult$b$a r9 = new com.nytimes.android.coroutinesutils.FetchResult$b$a
            r9.<init>(r7)
            r7 = r9
        L75:
            com.nytimes.android.coroutinesutils.DownloadState r7 = r7.a(r8)
            r0.L$0 = r5
            r8 = 0
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L89
            return r1
        L89:
            com.nytimes.android.coroutinesutils.b r5 = r5.d
            r5.a()
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore.m(kotlinx.coroutines.flow.FlowCollector, java.lang.Object, java.lang.Object, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(FlowCollector flowCollector, Object obj, Object obj2, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new ParallelStore$getAndFetchInParallel$2(this, obj2, flowCollector, obj, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair o(Object obj) {
        return du8.a("context.dataVisibleToUser", Boolean.valueOf(obj != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlinx.coroutines.flow.FlowCollector r15, java.lang.Object r16, java.lang.Object r17, defpackage.by0 r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore.q(kotlinx.coroutines.flow.FlowCollector, java.lang.Object, java.lang.Object, by0):java.lang.Object");
    }

    public final Flow p(ParallelDownloadStrategy parallelDownloadStrategy, ss2 ss2Var, Object obj) {
        zq3.h(parallelDownloadStrategy, "strategy");
        zq3.h(ss2Var, "paramsProvider");
        return FlowKt.flow(new ParallelStore$load$1(this, obj, parallelDownloadStrategy, ss2Var, null));
    }

    public /* synthetic */ ParallelStore(ss2 ss2Var, gt2 gt2Var, gt2 gt2Var2, b bVar, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, gt2Var, gt2Var2, (i & 8) != 0 ? new k75() : bVar, (i & 16) != 0 ? 2000L : j);
    }
}
