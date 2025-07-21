package com.nytimes.android.saved.repository;

import com.apollographql.apollo.ApolloClient;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.by0;
import defpackage.kw6;
import defpackage.u8;
import defpackage.zp6;
import defpackage.zq3;
import kotlin.random.Random;

/* loaded from: classes4.dex */
public final class SavedQueryFactory {
    private final ApolloClient a;
    private final zp6 b;

    public SavedQueryFactory(ApolloClient apolloClient, zp6 zp6Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(zp6Var, "readingListParser");
        this.a = apolloClient;
        this.b = zp6Var;
    }

    private final String b() {
        return Random.a.e() + QueryKeys.END_MARKER + System.currentTimeMillis();
    }

    public final Object a(String str, by0 by0Var) {
        return ExtensionsKt.a(this.a.G(new u8(str, b())), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, java.lang.String r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.saved.repository.SavedQueryFactory$readingListQuery$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.saved.repository.SavedQueryFactory$readingListQuery$1 r0 = (com.nytimes.android.saved.repository.SavedQueryFactory$readingListQuery$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.repository.SavedQueryFactory$readingListQuery$1 r0 = new com.nytimes.android.saved.repository.SavedQueryFactory$readingListQuery$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.saved.repository.SavedQueryFactory r5 = (com.nytimes.android.saved.repository.SavedQueryFactory) r5
            kotlin.f.b(r8)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r5.a
            oy2 r2 = new oy2
            nk5$b r4 = defpackage.nk5.a
            nk5$c r7 = r4.a(r7)
            r2.<init>(r6, r7)
            com.apollographql.apollo.ApolloCall r6 = r8.L(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = com.nytimes.android.apolloschema.ExtensionsKt.a(r6, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            yj r8 = (defpackage.yj) r8
            zp6 r5 = r5.b
            ii5$a r6 = r8.c
            oy2$b r6 = (oy2.b) r6
            yp6 r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.repository.SavedQueryFactory.c(int, java.lang.String, by0):java.lang.Object");
    }

    public final Object d(String str, by0 by0Var) {
        return ExtensionsKt.a(this.a.G(new kw6(str, b())), by0Var);
    }
}
