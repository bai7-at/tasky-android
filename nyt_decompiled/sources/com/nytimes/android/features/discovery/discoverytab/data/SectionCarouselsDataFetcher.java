package com.nytimes.android.features.discovery.discoverytab.data;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.assetretriever.AssetRetriever;
import defpackage.b05;
import defpackage.e23;
import defpackage.er1;
import defpackage.g56;
import defpackage.gp;
import defpackage.ho3;
import defpackage.kf3;
import defpackage.lv;
import defpackage.ml0;
import defpackage.n59;
import defpackage.rp2;
import defpackage.uu7;
import defpackage.zq1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SectionCarouselsDataFetcher {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final ApolloClient a;
    private final e23 b;
    private final ml0 c;
    private final AssetRetriever d;
    private final b05 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SectionCarouselsDataFetcher(ApolloClient apolloClient, e23 e23Var, ml0 ml0Var, AssetRetriever assetRetriever, b05 b05Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(e23Var, "graphQlAssetParser");
        zq3.h(ml0Var, "adParams");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(b05Var, "clock");
        this.a = apolloClient;
        this.b = e23Var;
        this.c = ml0Var;
        this.d = assetRetriever;
        this.e = b05Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.nytimes.android.features.discovery.discoverytab.data.CarouselBlock c(uq1.a r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher.c(uq1$a):com.nytimes.android.features.discovery.discoverytab.data.CarouselBlock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r17, defpackage.by0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$executeQuery$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$executeQuery$1 r2 = (com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$executeQuery$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$executeQuery$1 r2 = new com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$executeQuery$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            kotlin.f.b(r1)
            goto L9d
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.f.b(r1)
            com.apollographql.apollo.ApolloClient r1 = r0.a
            r4 = r17
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.i.w(r4, r6)
            r8.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L4d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r4.next()
            se7 r6 = (defpackage.se7) r6
            java.lang.String r6 = r6.a()
            r8.add(r6)
            goto L4d
        L61:
            nk5$b r4 = defpackage.nk5.a
            type.PersonalizationAppType r6 = type.PersonalizationAppType.NATIVE
            nk5 r10 = r4.b(r6)
            type.PersonalizationDeviceType r6 = type.PersonalizationDeviceType.MOBILE
            nk5 r11 = r4.b(r6)
            ml0 r4 = r0.c
            java.lang.String r12 = r4.c()
            ml0 r4 = r0.c
            java.lang.String r13 = r4.a()
            ml0 r4 = r0.c
            java.lang.String r14 = r4.b()
            ml0 r0 = r0.c
            java.lang.String r15 = r0.d()
            uq1 r0 = new uq1
            java.lang.String r7 = "discover"
            r9 = 6
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.apollographql.apollo.ApolloCall r0 = r1.L(r0)
            r2.label = r5
            java.lang.Object r1 = com.nytimes.android.apolloschema.ExtensionsKt.a(r0, r2)
            if (r1 != r3) goto L9d
            return r3
        L9d:
            yj r1 = (defpackage.yj) r1
            ii5$a r0 = r1.c
            uq1$c r0 = (uq1.c) r0
            if (r0 == 0) goto Lb0
            uq1$d r0 = r0.a()
            if (r0 == 0) goto Lb0
            java.util.List r0 = r0.a()
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            defpackage.zq3.e(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.i.h0(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.i.a1(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher.d(java.util.List, by0):java.lang.Object");
    }

    private final List e(zq1 zq1Var, er1 er1Var) {
        er1.c a2;
        er1.a a3;
        zq1.c a4;
        zq1.a a5;
        List<zq1.b> a6 = (zq1Var == null || (a5 = zq1Var.a()) == null) ? null : a5.a();
        if (a6 == null) {
            a6 = i.l();
        }
        ArrayList arrayList = new ArrayList();
        for (zq1.b bVar : a6) {
            rp2 g = (bVar == null || (a4 = bVar.a()) == null) ? null : g(a4);
            if (g != null) {
                arrayList.add(g);
            }
        }
        List<er1.b> a7 = (er1Var == null || (a3 = er1Var.a()) == null) ? null : a3.a();
        if (a7 == null) {
            a7 = i.l();
        }
        ArrayList arrayList2 = new ArrayList();
        for (er1.b bVar2 : a7) {
            rp2 h = (bVar2 == null || (a2 = bVar2.a()) == null) ? null : h(a2);
            if (h != null) {
                arrayList2.add(h);
            }
        }
        return i.F0(arrayList, arrayList2);
    }

    private final rp2 g(zq1.c cVar) {
        gp a2 = cVar.a();
        if (a2 != null) {
            return a2;
        }
        ho3 e = cVar.e();
        if (e != null) {
            return e;
        }
        n59 h = cVar.h();
        if (h != null) {
            return h;
        }
        kf3 d = cVar.d();
        if (d != null) {
            return d;
        }
        uu7 g = cVar.g();
        if (g != null) {
            return g;
        }
        lv b = cVar.b();
        if (b != null) {
            return b;
        }
        g56 f2 = cVar.f();
        return f2 != null ? f2 : cVar.c();
    }

    private final rp2 h(er1.c cVar) {
        gp a2 = cVar.a();
        if (a2 != null) {
            return a2;
        }
        ho3 e = cVar.e();
        if (e != null) {
            return e;
        }
        n59 h = cVar.h();
        if (h != null) {
            return h;
        }
        kf3 d = cVar.d();
        if (d != null) {
            return d;
        }
        uu7 g = cVar.g();
        if (g != null) {
            return g;
        }
        lv b = cVar.b();
        if (b != null) {
            return b;
        }
        g56 f2 = cVar.f();
        return f2 != null ? f2 : cVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r19, java.util.List r20, defpackage.by0 r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher.i(java.util.List, java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[LOOP:0: B:17:0x0066->B:19:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$fetchCarousels$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$fetchCarousels$1 r0 = (com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$fetchCarousels$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$fetchCarousels$1 r0 = new com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher$fetchCarousels$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.f.b(r7)
            goto L89
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher r5 = (com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher) r5
            kotlin.f.b(r7)
            goto L55
        L45:
            kotlin.f.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.i.w(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r7.next()
            uq1$a r4 = (uq1.a) r4
            com.nytimes.android.features.discovery.discoverytab.data.CarouselBlock r4 = r5.c(r4)
            r2.add(r4)
            goto L66
        L7a:
            r0.L$0 = r2
            r7 = 0
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.i(r2, r6, r0)
            if (r5 != r1) goto L88
            return r1
        L88:
            r5 = r2
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher.f(java.util.List, by0):java.lang.Object");
    }
}
