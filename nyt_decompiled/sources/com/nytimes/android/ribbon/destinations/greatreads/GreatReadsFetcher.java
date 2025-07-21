package com.nytimes.android.ribbon.destinations.greatreads;

import android.content.SharedPreferences;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.api.config.model.RibbonTabEndpoint;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import defpackage.b05;
import defpackage.dg3;
import defpackage.du8;
import defpackage.eq;
import defpackage.he0;
import defpackage.q23;
import defpackage.si1;
import defpackage.uo6;
import defpackage.x23;
import defpackage.y75;
import defpackage.z76;
import defpackage.zq3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class GreatReadsFetcher {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private static final String g = RibbonConfig.GREAT_READS.getId();
    private final ApolloClient a;
    private final c b;
    private final b c;
    private final RibbonTabConfigRepository d;
    private final CachedParallelStore e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private final GreatReadsLockupData b(q23.c cVar) {
            ArrayList arrayList;
            List h0;
            List h02;
            dg3 c;
            dg3.c a2;
            dg3.b a3;
            dg3 c2;
            dg3.c a4;
            dg3.b a5;
            z76 d;
            z76 d2;
            eq a6;
            eq a7;
            eq a8;
            eq a9;
            eq.b b;
            q23.e a10 = cVar.a();
            LinkedHashMap linkedHashMap = null;
            y75 a11 = a10 != null ? a10.a() : null;
            String a12 = (a11 == null || (a9 = a11.a()) == null || (b = a9.b()) == null) ? null : b.a();
            String c3 = (a11 == null || (a8 = a11.a()) == null) ? null : a8.c();
            String d3 = (a11 == null || (a7 = a11.a()) == null) ? null : a7.d();
            Integer valueOf = ((a11 == null || (a6 = a11.a()) == null) ? null : a6.e()) != null ? Integer.valueOf((int) Math.ceil(r2.intValue() / 270)) : null;
            String b2 = (a11 == null || (d2 = a11.d()) == null) ? null : d2.b();
            String a13 = (a11 == null || (d = a11.d()) == null) ? null : d.a();
            String b3 = (a11 == null || (c2 = a11.c()) == null || (a4 = c2.a()) == null || (a5 = a4.a()) == null) ? null : a5.b();
            List c4 = (a11 == null || (c = a11.c()) == null || (a2 = c.a()) == null || (a3 = a2.a()) == null) ? null : a3.c();
            if (c4 == null || (h02 = i.h0(c4)) == null) {
                arrayList = null;
            } else {
                List list = h02;
                arrayList = new ArrayList(i.w(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dg3.d dVar = (dg3.d) i.m0(((dg3.a) it2.next()).a());
                    arrayList.add(dVar != null ? dVar.a() : null);
                }
            }
            if (a12 == null) {
                a12 = "";
            }
            String str = a12;
            String str2 = arrayList != null ? (String) i.m0(arrayList) : null;
            List b4 = cVar.b();
            if (b4 != null && (h0 = i.h0(b4)) != null) {
                List<q23.g> list2 = h0;
                linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list2, 10)), 16));
                for (q23.g gVar : list2) {
                    Pair a14 = du8.a(gVar.a(), gVar.b());
                    linkedHashMap.put(a14.c(), a14.d());
                }
            }
            return new GreatReadsLockupData(c3, str, b2, a13, str2, valueOf, d3, b3, linkedHashMap);
        }

        public final List a(q23.b bVar) {
            q23.d a2;
            List<q23.c> a3;
            zq3.h(bVar, "data");
            q23.f a4 = bVar.a();
            if (a4 == null || (a2 = a4.a()) == null || (a3 = a2.a()) == null) {
                return i.l();
            }
            ArrayList arrayList = new ArrayList();
            for (q23.c cVar : a3) {
                GreatReadsLockupData b = cVar == null ? null : b(cVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    public static final class c {
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private final GreatReadsLockupData b(x23.c cVar) {
            ArrayList arrayList;
            List h0;
            dg3.d dVar;
            dg3 c;
            dg3.c a2;
            dg3.b a3;
            dg3 c2;
            dg3.c a4;
            dg3.b a5;
            z76 d;
            z76 d2;
            eq a6;
            eq a7;
            eq a8;
            eq a9;
            eq.b b;
            x23.d a10 = cVar.a();
            LinkedHashMap linkedHashMap = null;
            y75 a11 = a10 != null ? a10.a() : null;
            String a12 = (a11 == null || (a9 = a11.a()) == null || (b = a9.b()) == null) ? null : b.a();
            String c3 = (a11 == null || (a8 = a11.a()) == null) ? null : a8.c();
            String d3 = (a11 == null || (a7 = a11.a()) == null) ? null : a7.d();
            Integer valueOf = ((a11 == null || (a6 = a11.a()) == null) ? null : a6.e()) != null ? Integer.valueOf((int) Math.ceil(r2.intValue() / 270)) : null;
            String b2 = (a11 == null || (d2 = a11.d()) == null) ? null : d2.b();
            String a13 = (a11 == null || (d = a11.d()) == null) ? null : d.a();
            String b3 = (a11 == null || (c2 = a11.c()) == null || (a4 = c2.a()) == null || (a5 = a4.a()) == null) ? null : a5.b();
            List<dg3.a> c4 = (a11 == null || (c = a11.c()) == null || (a2 = c.a()) == null || (a3 = a2.a()) == null) ? null : a3.c();
            if (c4 != null) {
                arrayList = new ArrayList();
                for (dg3.a aVar : c4) {
                    String a14 = (aVar == null || (dVar = (dg3.d) i.m0(aVar.a())) == null) ? null : dVar.a();
                    if (a14 != null) {
                        arrayList.add(a14);
                    }
                }
            } else {
                arrayList = null;
            }
            if (a12 == null) {
                a12 = "";
            }
            String str = a12;
            String str2 = arrayList != null ? (String) i.m0(arrayList) : null;
            List b4 = cVar.b();
            if (b4 != null && (h0 = i.h0(b4)) != null) {
                List<x23.g> list = h0;
                linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list, 10)), 16));
                for (x23.g gVar : list) {
                    Pair a15 = du8.a(gVar.a(), gVar.b());
                    linkedHashMap.put(a15.c(), a15.d());
                }
            }
            return new GreatReadsLockupData(c3, str, b2, a13, str2, valueOf, d3, b3, linkedHashMap);
        }

        public final List a(x23.b bVar) {
            x23.e a2;
            List<x23.c> a3;
            zq3.h(bVar, "data");
            x23.f a4 = bVar.a();
            if (a4 == null || (a2 = a4.a()) == null || (a3 = a2.a()) == null) {
                return i.l();
            }
            ArrayList arrayList = new ArrayList();
            for (x23.c cVar : a3) {
                GreatReadsLockupData b = cVar == null ? null : b(cVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RibbonTabEndpoint.values().length];
            try {
                iArr[RibbonTabEndpoint.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RibbonTabEndpoint.PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public GreatReadsFetcher(ApolloClient apolloClient, c cVar, b bVar, RibbonTabConfigRepository ribbonTabConfigRepository, File file, b05 b05Var, SharedPreferences sharedPreferences, si1.a aVar) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(cVar, "greatReadsPersonalizedAssetParser");
        zq3.h(bVar, "greatReadsGenericPersonalizedAssetParser");
        zq3.h(ribbonTabConfigRepository, "ribbonConfigRepo");
        zq3.h(file, "baseDir");
        zq3.h(b05Var, "clock");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(aVar, "tracerBuilder");
        this.a = apolloClient;
        this.b = cVar;
        this.c = bVar;
        this.d = ribbonTabConfigRepository;
        this.e = new CachedParallelStore(sharedPreferences, new GreatReadsFetcher$store$1(b05Var), file, "greatReadsCache.json", he0.h(GreatReadsLockupData.Companion.serializer()), new GreatReadsFetcher$store$2(this, null), si1.a.b(aVar, "GreatReadsDataStore", null, null, 6, null), 0L, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$fetchGreatReadsData$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$fetchGreatReadsData$1 r0 = (com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$fetchGreatReadsData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$fetchGreatReadsData$1 r0 = new com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$fetchGreatReadsData$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher r7 = (com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher) r7
            kotlin.f.b(r8)
            goto Lba
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher r7 = (com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher) r7
            kotlin.f.b(r8)
            goto L94
        L44:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher r7 = (com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher) r7
            kotlin.f.b(r8)
            goto L5a
        L4c:
            kotlin.f.b(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r7.e(r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            com.nytimes.android.api.config.model.RibbonConfigDTO r8 = (com.nytimes.android.api.config.model.RibbonConfigDTO) r8
            if (r8 == 0) goto L63
            com.nytimes.android.api.config.model.RibbonTabEndpoint r8 = r8.getEndpoint()
            goto L64
        L63:
            r8 = 0
        L64:
            r2 = -1
            if (r8 != 0) goto L69
            r8 = r2
            goto L71
        L69:
            int[] r6 = com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher.d.a
            int r8 = r8.ordinal()
            r8 = r6[r8]
        L71:
            if (r8 == r2) goto La4
            if (r8 == r5) goto L7e
            if (r8 != r4) goto L78
            goto La4
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7e:
            com.apollographql.apollo.ApolloClient r8 = r7.a
            q23 r2 = new q23
            r2.<init>()
            com.apollographql.apollo.ApolloCall r8 = r8.L(r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = com.nytimes.android.apolloschema.ExtensionsKt.a(r8, r0)
            if (r8 != r1) goto L94
            return r1
        L94:
            yj r8 = (defpackage.yj) r8
            ii5$a r8 = r8.c
            defpackage.zq3.e(r8)
            q23$b r8 = (q23.b) r8
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$b r7 = r7.c
            java.util.List r7 = r7.a(r8)
            goto Lc9
        La4:
            com.apollographql.apollo.ApolloClient r8 = r7.a
            x23 r2 = new x23
            r2.<init>()
            com.apollographql.apollo.ApolloCall r8 = r8.L(r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = com.nytimes.android.apolloschema.ExtensionsKt.a(r8, r0)
            if (r8 != r1) goto Lba
            return r1
        Lba:
            yj r8 = (defpackage.yj) r8
            ii5$a r8 = r8.c
            defpackage.zq3.e(r8)
            x23$b r8 = (x23.b) r8
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$c r7 = r7.b
            java.util.List r7 = r7.a(r8)
        Lc9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher.c(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$greatReadsConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$greatReadsConfig$1 r0 = (com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$greatReadsConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$greatReadsConfig$1 r0 = new com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$greatReadsConfig$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository r4 = r4.d
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L45:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.nytimes.android.api.config.model.RibbonConfigDTO r0 = (com.nytimes.android.api.config.model.RibbonConfigDTO) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher.g
            boolean r0 = defpackage.zq3.c(r0, r1)
            if (r0 == 0) goto L45
            goto L60
        L5f:
            r5 = 0
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher.e(by0):java.lang.Object");
    }

    public final Flow d(List list, boolean z) {
        return this.e.d(z ? ParallelDownloadStrategy.FETCH_ALWAYS : ParallelDownloadStrategy.FETCH_IF_STALE, new GreatReadsFetcher$getGreatReads$1(null), list);
    }
}
