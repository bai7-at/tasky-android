package com.nytimes.android.section.sectionfront;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.api.cms.SectionQueryData;
import com.nytimes.android.api.cms.SectionQueryType;
import com.nytimes.android.assetretriever.AssetRetriever;
import defpackage.b05;
import defpackage.by0;
import defpackage.du8;
import defpackage.e23;
import defpackage.fg7;
import defpackage.fh7;
import defpackage.gt2;
import defpackage.lf7;
import defpackage.ls5;
import defpackage.ly0;
import defpackage.ml0;
import defpackage.n59;
import defpackage.nx2;
import defpackage.rf7;
import defpackage.rp2;
import defpackage.sd8;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.uy0;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.rx2.RxSingleKt;
import type.MostPopularType;

/* loaded from: classes4.dex */
public final class GraphQlSectionFrontFetcher implements lf7 {
    public static final a Companion = new a(null);
    private final ApolloClient a;
    private final ml0 b;
    private final AssetRetriever c;
    private final e23 d;
    private final b05 e;
    private final int f;
    private final gt2 g;
    private final gt2 h;
    private final ss2 i;
    private final gt2 j;
    private final gt2 k;
    private final ss2 l;
    private final gt2 m;
    private final gt2 n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SectionQueryType.values().length];
            try {
                iArr[SectionQueryType.VIDEO_PLAY_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionQueryType.MOST_POPULAR_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public GraphQlSectionFrontFetcher(ApolloClient apolloClient, ml0 ml0Var, AssetRetriever assetRetriever, e23 e23Var, b05 b05Var, int i) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ml0Var, "adParams");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(e23Var, "assetParser");
        zq3.h(b05Var, "nytClock");
        this.a = apolloClient;
        this.b = ml0Var;
        this.c = assetRetriever;
        this.d = e23Var;
        this.e = b05Var;
        this.f = i;
        this.g = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$syndicatedCollectionQueryFactory$1
            public final sd8 b(String str, int i2) {
                zq3.h(str, "uri");
                return new sd8(str, i2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
        this.h = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$cookingCollectionQueryFactory$1
            public final ly0 b(String str, int i2) {
                zq3.h(str, "uri");
                return new ly0(str);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
        this.i = new ss2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$cookingHeroPromoImageQueryFactory$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final uy0 invoke(String str) {
                zq3.h(str, "assetId");
                return new uy0(str);
            }
        };
        this.j = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$legacyCollectionQueryFactory$1
            {
                super(2);
            }

            public final rf7 b(String str, int i2) {
                ml0 ml0Var2;
                ml0 ml0Var3;
                ml0 ml0Var4;
                ml0 ml0Var5;
                zq3.h(str, "uri");
                ml0Var2 = GraphQlSectionFrontFetcher.this.b;
                String c = ml0Var2.c();
                ml0Var3 = GraphQlSectionFrontFetcher.this.b;
                String a2 = ml0Var3.a();
                ml0Var4 = GraphQlSectionFrontFetcher.this.b;
                String b2 = ml0Var4.b();
                ml0Var5 = GraphQlSectionFrontFetcher.this.b;
                return new rf7(str, i2, c, a2, b2, ml0Var5.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
        this.k = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$playListQueryFactory$1
            {
                super(2);
            }

            public final fh7 b(String str, int i2) {
                ml0 ml0Var2;
                ml0 ml0Var3;
                ml0 ml0Var4;
                ml0 ml0Var5;
                zq3.h(str, "uri");
                ml0Var2 = GraphQlSectionFrontFetcher.this.b;
                String c = ml0Var2.c();
                ml0Var3 = GraphQlSectionFrontFetcher.this.b;
                String a2 = ml0Var3.a();
                ml0Var4 = GraphQlSectionFrontFetcher.this.b;
                String b2 = ml0Var4.b();
                ml0Var5 = GraphQlSectionFrontFetcher.this.b;
                return new fh7(str, i2, c, a2, b2, ml0Var5.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
        this.l = new ss2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$mostPopularListQueryFactory$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final fg7 invoke(MostPopularType mostPopularType) {
                ml0 ml0Var2;
                ml0 ml0Var3;
                ml0 ml0Var4;
                ml0 ml0Var5;
                zq3.h(mostPopularType, "popularType");
                ml0Var2 = GraphQlSectionFrontFetcher.this.b;
                String c = ml0Var2.c();
                ml0Var3 = GraphQlSectionFrontFetcher.this.b;
                String a2 = ml0Var3.a();
                ml0Var4 = GraphQlSectionFrontFetcher.this.b;
                String b2 = ml0Var4.b();
                ml0Var5 = GraphQlSectionFrontFetcher.this.b;
                return new fg7(mostPopularType, c, a2, b2, ml0Var5.d());
            }
        };
        this.m = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$personalizedSectionFrontQuery$1
            {
                super(2);
            }

            public final ls5 b(String str, int i2) {
                ml0 ml0Var2;
                ml0 ml0Var3;
                ml0 ml0Var4;
                ml0 ml0Var5;
                zq3.h(str, "uri");
                ml0Var2 = GraphQlSectionFrontFetcher.this.b;
                String c = ml0Var2.c();
                ml0Var3 = GraphQlSectionFrontFetcher.this.b;
                String a2 = ml0Var3.a();
                ml0Var4 = GraphQlSectionFrontFetcher.this.b;
                String b2 = ml0Var4.b();
                ml0Var5 = GraphQlSectionFrontFetcher.this.b;
                return new ls5(str, i2, c, a2, b2, ml0Var5.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
        this.n = new gt2() { // from class: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$genericPersonalizedSectionFrontQuery$1
            {
                super(2);
            }

            public final nx2 b(String str, int i2) {
                ml0 ml0Var2;
                ml0 ml0Var3;
                ml0 ml0Var4;
                ml0 ml0Var5;
                zq3.h(str, "uri");
                ml0Var2 = GraphQlSectionFrontFetcher.this.b;
                String c = ml0Var2.c();
                ml0Var3 = GraphQlSectionFrontFetcher.this.b;
                String a2 = ml0Var3.a();
                ml0Var4 = GraphQlSectionFrontFetcher.this.b;
                String b2 = ml0Var4.b();
                ml0Var5 = GraphQlSectionFrontFetcher.this.b;
                return new nx2(str, i2, c, a2, b2, ml0Var5.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((String) obj, ((Number) obj2).intValue());
            }
        };
    }

    private final List A(rf7.c cVar) {
        rf7.a a2;
        List<rf7.d> a3;
        rp2 rp2Var;
        rf7.f a4;
        rf7.e a5 = cVar.a();
        if (a5 == null || (a2 = a5.a()) == null || (a3 = a2.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (rf7.d dVar : a3) {
            if (dVar == null || (a4 = dVar.a()) == null) {
                rp2Var = null;
            } else {
                rp2Var = a4.a();
                if (rp2Var == null && (rp2Var = a4.c()) == null && (rp2Var = a4.d()) == null && (rp2Var = a4.f()) == null && (rp2Var = a4.g()) == null && (rp2Var = a4.e()) == null) {
                    rp2Var = a4.b();
                }
            }
            if (rp2Var != null) {
                arrayList.add(rp2Var);
            }
        }
        return arrayList;
    }

    private final List B(fg7.b bVar) {
        fg7.e a2;
        List<fg7.c> a3;
        rp2 rp2Var;
        fg7.f a4;
        fg7.d a5 = bVar.a();
        if (a5 == null || (a2 = a5.a()) == null || (a3 = a2.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (fg7.c cVar : a3) {
            if (cVar == null || (a4 = cVar.a()) == null) {
                rp2Var = null;
            } else {
                rp2Var = a4.a();
                if (rp2Var == null && (rp2Var = a4.c()) == null && (rp2Var = a4.d()) == null && (rp2Var = a4.f()) == null && (rp2Var = a4.g()) == null) {
                    rp2Var = a4.b();
                }
            }
            if (rp2Var != null) {
                arrayList.add(rp2Var);
            }
        }
        return arrayList;
    }

    private final List C(fh7.b bVar) {
        fh7.f b2;
        List<fh7.c> a2;
        fh7.d a3;
        fh7.e a4 = bVar.a();
        if (a4 == null || (b2 = a4.b()) == null || (a2 = b2.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (fh7.c cVar : a2) {
            n59 a5 = (cVar == null || (a3 = cVar.a()) == null) ? null : a3.a();
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        return arrayList;
    }

    private final Map D(nx2.c cVar) {
        List h0;
        List b2 = cVar.b();
        if (b2 == null || (h0 = i.h0(b2)) == null) {
            return null;
        }
        List<nx2.h> list = h0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list, 10)), 16));
        for (nx2.h hVar : list) {
            Pair a2 = du8.a(hVar.a(), hVar.b());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return linkedHashMap;
    }

    private final Map E(ls5.c cVar) {
        List h0;
        List b2 = cVar.b();
        if (b2 == null || (h0 = i.h0(b2)) == null) {
            return null;
        }
        List<ls5.h> list = h0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list, 10)), 16));
        for (ls5.h hVar : list) {
            Pair a2 = du8.a(hVar.a(), hVar.b());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.apollographql.apollo.ApolloCall r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$awaitData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$awaitData$1 r0 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$awaitData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$awaitData$1 r0 = new com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$awaitData$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.f.b(r4)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r4)
            r0.label = r2
            java.lang.Object r4 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r4 != r6) goto L3d
            return r6
        L3d:
            yj r4 = (defpackage.yj) r4
            ii5$a r4 = r4.c
            defpackage.zq3.e(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.k(com.apollographql.apollo.ApolloCall, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(SectionQueryType sectionQueryType, com.nytimes.android.section.sectionfront.a aVar, String str, by0 by0Var) {
        return sectionQueryType == SectionQueryType.GENERIC_LEGACY_COLLECTION ? n(aVar.a(), str, by0Var) : q(aVar.a(), str, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.nytimes.android.api.cms.SectionMeta r12, java.lang.String r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.n(com.nytimes.android.api.cms.SectionMeta, java.lang.String, by0):java.lang.Object");
    }

    private final MostPopularType o(String str) {
        MostPopularType mostPopularType;
        MostPopularType[] values = MostPopularType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mostPopularType = null;
                break;
            }
            mostPopularType = values[i];
            if (zq3.c(mostPopularType.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return mostPopularType == null ? MostPopularType.EMAILED : mostPopularType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(com.nytimes.android.section.sectionfront.a aVar, String str, by0 by0Var) {
        SectionQueryData queryOverride = aVar.a().getQueryOverride();
        SectionQueryType queryType = queryOverride != null ? queryOverride.getQueryType() : null;
        int i = queryType == null ? -1 : b.a[queryType.ordinal()];
        return i != 1 ? i != 2 ? u(aVar, str, by0Var) : v(aVar, by0Var) : w(aVar, str, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(com.nytimes.android.api.cms.SectionMeta r18, java.lang.String r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.q(com.nytimes.android.api.cms.SectionMeta, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r24, java.util.List r25, defpackage.by0 r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.r(java.lang.String, java.util.List, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.nytimes.android.section.sectionfront.a r8, java.lang.String r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.u(com.nytimes.android.section.sectionfront.a, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.nytimes.android.section.sectionfront.a r9, defpackage.by0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryMostPopular$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryMostPopular$1 r0 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryMostPopular$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryMostPopular$1 r0 = new com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryMostPopular$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.section.sectionfront.a r9 = (com.nytimes.android.section.sectionfront.a) r9
            kotlin.f.b(r10)
            goto Lb6
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$2
            type.MostPopularType r8 = (type.MostPopularType) r8
            java.lang.Object r9 = r0.L$1
            com.nytimes.android.section.sectionfront.a r9 = (com.nytimes.android.section.sectionfront.a) r9
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher r2 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher) r2
            kotlin.f.b(r10)
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
            goto L86
        L52:
            kotlin.f.b(r10)
            com.nytimes.android.api.cms.SectionMeta r10 = r9.a()
            com.nytimes.android.api.cms.SectionQueryData r10 = r10.getQueryOverride()
            if (r10 == 0) goto L64
            java.lang.String r10 = r10.getQueryParam()
            goto L65
        L64:
            r10 = r3
        L65:
            type.MostPopularType r10 = r8.o(r10)
            ss2 r2 = r8.l
            java.lang.Object r2 = r2.invoke(r10)
            fg7 r2 = (defpackage.fg7) r2
            com.apollographql.apollo.ApolloClient r6 = r8.a
            com.apollographql.apollo.ApolloCall r2 = r6.L(r2)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r2 = r8.k(r2, r0)
            if (r2 != r1) goto L86
            return r1
        L86:
            fg7$b r2 = (fg7.b) r2
            e23 r5 = r8.d
            java.util.List r2 = r8.B(r2)
            defpackage.zq3.e(r2)
            java.util.List r2 = r5.b(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "MOST_POPULAR_"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r8 = r8.r(r10, r2, r0)
            if (r8 != r1) goto Lb5
            return r1
        Lb5:
            r8 = r2
        Lb6:
            com.nytimes.android.api.cms.SectionFront$Companion r0 = com.nytimes.android.api.cms.SectionFront.Companion
            com.nytimes.android.api.cms.SectionMeta r10 = r9.a()
            java.lang.String r2 = r10.getName()
            com.nytimes.android.api.cms.SectionMeta r10 = r9.a()
            java.lang.String r1 = r10.getTitle()
            com.nytimes.android.api.cms.SectionMeta r6 = r9.a()
            java.lang.String r4 = "mostpopular"
            java.lang.String r5 = "mostemailed"
            r3 = 0
            com.nytimes.android.api.cms.SectionFront r9 = r0.from(r1, r2, r3, r4, r5, r6)
            r9.setAssets(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.v(com.nytimes.android.section.sectionfront.a, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.nytimes.android.section.sectionfront.a r8, java.lang.String r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryVideoPlaylist$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryVideoPlaylist$1 r0 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryVideoPlaylist$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryVideoPlaylist$1 r0 = new com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryVideoPlaylist$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$1
            fh7$b r8 = (fh7.b) r8
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.section.sectionfront.a r9 = (com.nytimes.android.section.sectionfront.a) r9
            kotlin.f.b(r10)
            goto Laa
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.L$2
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.nytimes.android.section.sectionfront.a r8 = (com.nytimes.android.section.sectionfront.a) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher r7 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher) r7
            kotlin.f.b(r10)
            goto L78
        L52:
            kotlin.f.b(r10)
            gt2 r10 = r7.k
            int r2 = r7.f
            java.lang.Integer r2 = defpackage.cc0.c(r2)
            java.lang.Object r10 = r10.invoke(r9, r2)
            fh7 r10 = (defpackage.fh7) r10
            com.apollographql.apollo.ApolloClient r2 = r7.a
            com.apollographql.apollo.ApolloCall r10 = r2.L(r10)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r7.k(r10, r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            fh7$b r10 = (fh7.b) r10
            e23 r2 = r7.d
            java.util.List r4 = r7.C(r10)
            defpackage.zq3.e(r4)
            java.util.List r2 = r2.b(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "VIDEO_PLAYLIST_"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = r7.r(r9, r2, r0)
            if (r7 != r1) goto La7
            return r1
        La7:
            r9 = r8
            r8 = r10
            r7 = r2
        Laa:
            com.nytimes.android.api.cms.SectionFront$Companion r0 = com.nytimes.android.api.cms.SectionFront.Companion
            com.nytimes.android.api.cms.SectionMeta r10 = r9.a()
            java.lang.String r2 = r10.getName()
            com.nytimes.android.api.cms.SectionMeta r10 = r9.a()
            java.lang.String r1 = r10.getTitle()
            fh7$e r8 = r8.a()
            if (r8 == 0) goto Lc8
            java.lang.String r8 = r8.a()
        Lc6:
            r3 = r8
            goto Lca
        Lc8:
            r8 = 0
            goto Lc6
        Lca:
            com.nytimes.android.api.cms.SectionMeta r6 = r9.a()
            java.lang.String r4 = "video"
            java.lang.String r5 = "latestvideo"
            com.nytimes.android.api.cms.SectionFront r8 = r0.from(r1, r2, r3, r4, r5, r6)
            r8.setAssets(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.w(com.nytimes.android.section.sectionfront.a, java.lang.String, by0):java.lang.Object");
    }

    private final List x(ly0.d dVar) {
        List a2;
        ly0.e eVar;
        List a3;
        ly0.f a4 = dVar.a();
        if (a4 == null || (a2 = a4.a()) == null || (eVar = (ly0.e) a2.get(0)) == null || (a3 = eVar.a()) == null) {
            return null;
        }
        return i.h0(a3);
    }

    private final List y(nx2.b bVar) {
        nx2.d a2;
        List<nx2.c> a3;
        rp2 rp2Var;
        nx2.g a4;
        nx2.e a5 = bVar.a();
        if (a5 == null || (a2 = a5.a()) == null || (a3 = a2.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (nx2.c cVar : a3) {
            if (cVar == null || (a4 = cVar.a()) == null) {
                rp2Var = null;
            } else {
                rp2Var = a4.a();
                if (rp2Var == null && (rp2Var = a4.e()) == null && (rp2Var = a4.c()) == null && (rp2Var = a4.d()) == null && (rp2Var = a4.f()) == null && (rp2Var = a4.g()) == null) {
                    rp2Var = a4.b();
                }
            }
            if (rp2Var != null) {
                arrayList.add(rp2Var);
            }
        }
        return arrayList;
    }

    private final List z(ls5.b bVar) {
        ls5.g a2;
        List<ls5.c> a3;
        rp2 rp2Var;
        ls5.f a4;
        ls5.d a5 = bVar.a();
        if (a5 == null || (a2 = a5.a()) == null || (a3 = a2.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ls5.c cVar : a3) {
            if (cVar == null || (a4 = cVar.a()) == null) {
                rp2Var = null;
            } else {
                rp2Var = a4.a();
                if (rp2Var == null && (rp2Var = a4.e()) == null && (rp2Var = a4.c()) == null && (rp2Var = a4.d()) == null && (rp2Var = a4.f()) == null && (rp2Var = a4.g()) == null) {
                    rp2Var = a4.b();
                }
            }
            if (rp2Var != null) {
                arrayList.add(rp2Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.wd2
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Single fetch(com.nytimes.android.section.sectionfront.a aVar) {
        Single rxSingle$default;
        zq3.h(aVar, "sectionFrontId");
        String queryId = aVar.a().getQueryId();
        if (queryId != null && (rxSingle$default = RxSingleKt.rxSingle$default(null, new GraphQlSectionFrontFetcher$fetch$1$1(aVar, this, queryId, null), 1, null)) != null) {
            return rxSingle$default;
        }
        Single error = Single.error(new IllegalArgumentException("Legacy Collection ID not found for " + ((Object) aVar.getKey())));
        zq3.g(error, "error(...)");
        return error;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryCookingCollection$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryCookingCollection$1 r0 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryCookingCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryCookingCollection$1 r0 = new com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$queryCookingCollection$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher r4 = (com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher) r4
            kotlin.f.b(r6)
            goto L57
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            gt2 r6 = r4.h
            int r2 = r4.f
            java.lang.Integer r2 = defpackage.cc0.c(r2)
            java.lang.Object r5 = r6.invoke(r5, r2)
            ly0 r5 = (defpackage.ly0) r5
            com.apollographql.apollo.ApolloClient r6 = r4.a
            com.apollographql.apollo.ApolloCall r5 = r6.L(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.k(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            ly0$d r6 = (ly0.d) r6
            java.util.List r4 = r4.x(r6)
            defpackage.zq3.e(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher.s(java.lang.String, by0):java.lang.Object");
    }

    public final Object t(String str, by0 by0Var) {
        return k(this.a.L((uy0) this.i.invoke(str)), by0Var);
    }

    public /* synthetic */ GraphQlSectionFrontFetcher(ApolloClient apolloClient, ml0 ml0Var, AssetRetriever assetRetriever, e23 e23Var, b05 b05Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(apolloClient, ml0Var, assetRetriever, e23Var, b05Var, (i2 & 32) != 0 ? 40 : i);
    }
}
