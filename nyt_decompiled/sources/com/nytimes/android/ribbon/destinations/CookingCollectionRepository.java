package com.nytimes.android.ribbon.destinations;

import com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher;
import defpackage.cx3;
import defpackage.e56;
import defpackage.e86;
import defpackage.fz0;
import defpackage.jz0;
import defpackage.ly0;
import defpackage.oz0;
import defpackage.pz0;
import defpackage.yy0;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class CookingCollectionRepository {
    private final GraphQlSectionFrontFetcher a;

    public CookingCollectionRepository(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher) {
        zq3.h(graphQlSectionFrontFetcher, "graphQlFetch");
        this.a = graphQlSectionFrontFetcher;
    }

    private final oz0 a(ly0.h hVar) {
        String str;
        String str2;
        String str3;
        String a;
        yy0 a2;
        fz0.a a3;
        fz0.b a4;
        String c;
        String a5;
        cx3 c2;
        String str4 = null;
        ly0.a a6 = hVar != null ? hVar.a() : null;
        String f = a6 != null ? a6.f() : null;
        e56 d = a6 != null ? a6.d() : null;
        fz0 a7 = a6 != null ? a6.a() : null;
        jz0 b = a6 != null ? a6.b() : null;
        e86 e = a6 != null ? a6.e() : null;
        String a8 = (a6 == null || (c2 = a6.c()) == null) ? null : c2.a();
        String str5 = (b == null || (a5 = b.a()) == null) ? "" : a5;
        String str6 = (b == null || (c = b.c()) == null) ? "" : c;
        String b2 = (a7 == null || (a3 = a7.a()) == null || (a4 = a3.a()) == null) ? null : a4.b();
        jz0.a b3 = b != null ? b.b() : null;
        String d2 = b3 != null ? d(b3) : null;
        String b4 = (b3 == null || (a2 = b3.a()) == null) ? null : a2.b();
        if (d == null || (str = d.b()) == null) {
            str = "";
        }
        if (e == null || (str2 = e.b()) == null) {
            str2 = "";
        }
        if (str.length() != 0) {
            str2 = str;
        }
        String str7 = (e == null || (a = e.a()) == null) ? "" : a;
        if (a8 == null || a8.length() == 0) {
            if (b2 != null) {
                str4 = b2 + " Newsletter";
            }
            str3 = str4;
        } else {
            str3 = a8;
        }
        return new oz0(str2, str7, b4, f, str3, str5, str6, d2);
    }

    private final String b(jz0.a aVar) {
        List c;
        yy0.b bVar;
        List a;
        yy0.c cVar;
        yy0 a2 = aVar.a();
        if (a2 == null || (c = a2.c()) == null || (bVar = (yy0.b) i.k0(c)) == null || (a = bVar.a()) == null || (cVar = (yy0.c) i.k0(a)) == null) {
            return null;
        }
        return cVar.c();
    }

    private final String c(jz0.a aVar) {
        pz0.b b;
        pz0.a a;
        yy0 a2;
        List c;
        yy0.b bVar;
        List a3;
        yy0.c cVar;
        pz0 b2 = aVar.b();
        if (b2 == null || (b = b2.b()) == null || (a = b.a()) == null || (a2 = a.a()) == null || (c = a2.c()) == null || (bVar = (yy0.b) i.k0(c)) == null || (a3 = bVar.a()) == null || (cVar = (yy0.c) i.k0(a3)) == null) {
            return null;
        }
        return cVar.c();
    }

    private final String d(jz0.a aVar) {
        String b = b(aVar);
        return b == null ? c(aVar) : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingCollection$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingCollection$1 r0 = (com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingCollection$1 r0 = new com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingCollection$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository r6 = (com.nytimes.android.ribbon.destinations.CookingCollectionRepository) r6
            kotlin.f.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r8)
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher r8 = r6.a
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.s(r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r8.next()
            r1 = r0
            ly0$c r1 = (ly0.c) r1
            ly0$g r1 = r1.a()
            java.lang.String r1 = r1.a()
            java.lang.Object r2 = r7.get(r1)
            if (r2 != 0) goto L73
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.put(r1, r2)
        L73:
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            goto L50
        L79:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r0 = r7.size()
            int r0 = kotlin.collections.t.e(r0)
            r8.<init>(r0)
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L90:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lf0
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Laf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r0.next()
            ly0$c r3 = (ly0.c) r3
            ly0$g r3 = r3.a()
            java.util.List r3 = r3.b()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.i.w(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        Ld4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Le8
            java.lang.Object r5 = r3.next()
            ly0$h r5 = (ly0.h) r5
            oz0 r5 = r6.a(r5)
            r4.add(r5)
            goto Ld4
        Le8:
            kotlin.collections.i.B(r2, r4)
            goto Laf
        Lec:
            r8.put(r1, r2)
            goto L90
        Lf0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.CookingCollectionRepository.e(java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingHeroPromoImage$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingHeroPromoImage$1 r0 = (com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingHeroPromoImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingHeroPromoImage$1 r0 = new com.nytimes.android.ribbon.destinations.CookingCollectionRepository$queryCookingHeroPromoImage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.ribbon.destinations.CookingCollectionRepository r4 = (com.nytimes.android.ribbon.destinations.CookingCollectionRepository) r4
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher r6 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.t(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            uy0$c r6 = (uy0.c) r6
            uy0$a r5 = r6.a()
            if (r5 == 0) goto L64
            mz0 r5 = r5.a()
            if (r5 == 0) goto L64
            jz0 r5 = r5.a()
            if (r5 == 0) goto L64
            jz0$a r5 = r5.b()
            if (r5 == 0) goto L64
            java.lang.String r4 = r4.d(r5)
            goto L65
        L64:
            r4 = 0
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.CookingCollectionRepository.f(java.lang.String, by0):java.lang.Object");
    }
}
