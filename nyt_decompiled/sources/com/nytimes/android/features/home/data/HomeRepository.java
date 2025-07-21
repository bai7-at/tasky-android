package com.nytimes.android.features.home.data;

import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.coroutinesutils.b;
import defpackage.b05;
import defpackage.h07;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class HomeRepository {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private final HomeDataFetcher a;
    private final h07 b;
    private final b05 c;
    private final AssetRetriever d;
    private final CoroutineDispatcher e;
    private final b f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HomeRepository(HomeDataFetcher homeDataFetcher, h07 h07Var, b05 b05Var, AssetRetriever assetRetriever, CoroutineDispatcher coroutineDispatcher, b bVar) {
        zq3.h(homeDataFetcher, "fetcher");
        zq3.h(h07Var, "resourceRetriever");
        zq3.h(b05Var, "clock");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(bVar, "homeContentLoadJourney");
        this.a = homeDataFetcher;
        this.b = h07Var;
        this.c = b05Var;
        this.d = assetRetriever;
        this.e = coroutineDispatcher;
        this.f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.features.home.data.HomeRepository$deleteOldHomeSources$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.features.home.data.HomeRepository$deleteOldHomeSources$1 r0 = (com.nytimes.android.features.home.data.HomeRepository$deleteOldHomeSources$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.home.data.HomeRepository$deleteOldHomeSources$1 r0 = new com.nytimes.android.features.home.data.HomeRepository$deleteOldHomeSources$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = -1
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L2e
            kotlin.f.b(r8)
            goto L60
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.features.home.data.HomeRepository r7 = (com.nytimes.android.features.home.data.HomeRepository) r7
            kotlin.f.b(r8)
            goto L50
        L3e:
            kotlin.f.b(r8)
            com.nytimes.android.assetretriever.AssetRetriever r8 = r7.d
            r0.L$0 = r7
            r0.label = r6
            java.lang.String r2 = "program_uncacheable"
            java.lang.Object r8 = r8.j(r2, r3, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            com.nytimes.android.assetretriever.AssetRetriever r7 = r7.d
            r8 = 0
            r0.L$0 = r8
            r0.label = r5
            java.lang.String r8 = "program_cacheable"
            java.lang.Object r7 = r7.j(r8, r3, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.HomeRepository.f(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r18, long r19, defpackage.by0 r21) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.HomeRepository.h(java.util.List, long, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$1 r0 = (com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$1 r0 = new com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.features.home.data.HomeRepository r7 = (com.nytimes.android.features.home.data.HomeRepository) r7
            kotlin.f.b(r9)
            goto L4c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.f.b(r9)
            com.nytimes.android.features.home.data.HomeDataFetcher r9 = r7.a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            nh5 r9 = (defpackage.nh5) r9
            kotlinx.coroutines.CoroutineDispatcher r0 = r7.e
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
            com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$2 r4 = new com.nytimes.android.features.home.data.HomeRepository$fetchFromServer$2
            r0 = 0
            r4.<init>(r7, r9, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r9.getHybridBody()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.HomeRepository.g(java.lang.String, by0):java.lang.Object");
    }
}
