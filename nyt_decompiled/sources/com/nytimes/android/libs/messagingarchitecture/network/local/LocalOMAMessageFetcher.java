package com.nytimes.android.libs.messagingarchitecture.network.local;

import defpackage.e74;
import defpackage.er4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class LocalOMAMessageFetcher implements er4 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final OMAApiService a;
    private final e74 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LocalOMAMessageFetcher(OMAApiService oMAApiService, e74 e74Var) {
        zq3.h(oMAApiService, "omaApiService");
        zq3.h(e74Var, "parser");
        this.a = oMAApiService;
        this.b = e74Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.er4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher$fetchData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher$fetchData$1 r0 = (com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher$fetchData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher$fetchData$1 r0 = new com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher$fetchData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher r4 = (com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher) r4
            kotlin.f.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.nytimes.android.libs.messagingarchitecture.network.local.OMAApiService r5 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.String r4 = "android_news"
            java.lang.Object r5 = r5.allUnits(r4, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            retrofit2.Response r5 = (retrofit2.Response) r5
            java.lang.Object r4 = r5.body()
            defpackage.lh4.a(r4)
            java.util.List r4 = kotlin.collections.i.l()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.network.local.LocalOMAMessageFetcher.a(by0):java.lang.Object");
    }
}
