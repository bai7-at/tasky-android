package com.nytimes.android.subauth.core.purchase.storefront;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.c;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import defpackage.by0;
import defpackage.m13;
import defpackage.o86;
import defpackage.ww8;
import defpackage.x28;
import defpackage.y28;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class GoogleStoreFront implements o86 {
    private final Context a;
    private final CoroutineDispatcher b;
    private final com.android.billingclient.api.a c;
    private final CoroutineScope d;
    private com.android.billingclient.api.a e;
    private Map f;
    private Map g;
    private MutableSharedFlow h;
    private String i;
    private boolean j;

    public GoogleStoreFront(Context context, CoroutineDispatcher coroutineDispatcher, com.android.billingclient.api.a aVar) {
        zq3.h(context, "context");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = context;
        this.b = coroutineDispatcher;
        this.c = aVar;
        this.d = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.e = aVar;
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(String str, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.b, new GoogleStoreFront$acknowledgePurchase$2(str, this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    private final c k(String str, String str2) {
        String b;
        if (!z()) {
            SkuDetails skuDetails = (SkuDetails) this.f.get(str);
            if (skuDetails == null) {
                return null;
            }
            this.i = skuDetails.j();
            return c.a().c(skuDetails).a();
        }
        e eVar = (e) this.g.get(str);
        if (eVar == null) {
            return null;
        }
        this.i = eVar.d();
        c.b.a a = c.b.a();
        b = m13.b(eVar, str2);
        c.b a2 = a.b(b).c(eVar).a();
        zq3.g(a2, "build(...)");
        return c.a().b(i.e(a2)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.a m() {
        if (this.e == null) {
            com.android.billingclient.api.a aVar = this.c;
            if (aVar == null) {
                aVar = com.android.billingclient.api.a.e(this.a).b().c(this).a();
            }
            this.e = aVar;
        }
        com.android.billingclient.api.a aVar2 = this.e;
        zq3.e(aVar2);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[LOOP:0: B:12:0x0089->B:14:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[LOOP:1: B:22:0x005b->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.Set r7, int r8, defpackage.by0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getDetails$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getDetails$1 r0 = (com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getDetails$1 r0 = new com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getDetails$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 10
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.f.b(r9)
            goto L7a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.f.b(r9)
            goto L4c
        L3a:
            kotlin.f.b(r9)
            boolean r9 = r6.z()
            if (r9 == 0) goto L71
            r0.label = r5
            java.lang.Object r9 = r6.r(r7, r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.i.w(r9, r3)
            r6.<init>(r7)
            java.util.Iterator r7 = r9.iterator()
        L5b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r7.next()
            com.android.billingclient.api.e r8 = (com.android.billingclient.api.e) r8
            v28$a r9 = defpackage.v28.Companion
            v28 r8 = r9.a(r8)
            r6.add(r8)
            goto L5b
        L71:
            r0.label = r4
            java.lang.Object r9 = r6.u(r7, r8, r0)
            if (r9 != r1) goto L7a
            return r1
        L7a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.i.w(r9, r3)
            r6.<init>(r7)
            java.util.Iterator r7 = r9.iterator()
        L89:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r7.next()
            com.android.billingclient.api.SkuDetails r8 = (com.android.billingclient.api.SkuDetails) r8
            v28$a r9 = defpackage.v28.Companion
            v28 r8 = r9.b(r8)
            r6.add(r8)
            goto L89
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront.n(java.util.Set, int, by0):java.lang.Object");
    }

    private final Object r(Set set, int i, by0 by0Var) {
        return BuildersKt.withContext(this.b, new GoogleStoreFront$queryProductDetails$2(i, set, this, null), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(String str, by0 by0Var) {
        return BuildersKt.withContext(this.b, new GoogleStoreFront$queryPurchases$2(str, this, null), by0Var);
    }

    private final Object u(Set set, int i, by0 by0Var) {
        return BuildersKt.withContext(this.b, new GoogleStoreFront$querySkuDetails$2(i, set, this, null), by0Var);
    }

    private final x28 w(e eVar, List list) {
        e.a c;
        Object obj;
        List f;
        e.d dVar;
        e.c e;
        List a;
        e.b bVar;
        Pair pair = (eVar == null || (f = eVar.f()) == null || (dVar = (e.d) i.m0(f)) == null || (e = dVar.e()) == null || (a = e.a()) == null || (bVar = (e.b) i.y0(a)) == null) ? (eVar == null || (c = eVar.c()) == null) ? null : new Pair(Long.valueOf(c.b()), c.c()) : new Pair(Long.valueOf(bVar.d()), bVar.e());
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Purchase) obj).d().contains(this.i)) {
                break;
            }
        }
        Purchase purchase = (Purchase) obj;
        if (purchase != null) {
            return x28.Companion.a(purchase, pair != null ? (String) pair.d() : null);
        }
        return null;
    }

    private final x28 x(List list) {
        return z() ? w((e) this.g.get(this.i), list) : y((SkuDetails) this.f.get(this.i), list);
    }

    private final x28 y(SkuDetails skuDetails, List list) {
        Object obj;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Purchase) obj).i().contains(this.i)) {
                break;
            }
        }
        Purchase purchase = (Purchase) obj;
        if (purchase != null) {
            return x28.Companion.a(purchase, skuDetails != null ? skuDetails.i() : null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        return this.j && m().b("fff").b() == 0;
    }

    @Override // defpackage.o86
    public void a(d dVar, List list) {
        y28 bVar;
        zq3.h(dVar, "result");
        int b = dVar.b();
        if (b != 0) {
            bVar = b != 1 ? b != 7 ? new y28.a.e(dVar.a()) : y28.a.b.a : y28.a.f.a;
        } else {
            x28 x = x(list);
            bVar = x != null ? new y28.b(x, null, 2, null) : y28.a.c.a;
        }
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new GoogleStoreFront$onPurchasesUpdated$1(this, bVar, null), 3, null);
    }

    public Object l(by0 by0Var) {
        return BuildersKt.withContext(this.b, new GoogleStoreFront$connectToStoreFront$2(this, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.util.Set r6, int r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getProductDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getProductDetails$1 r0 = (com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getProductDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getProductDetails$1 r0 = new com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getProductDetails$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L69
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            int r7 = r0.I$0
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront r5 = (com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront) r5
            kotlin.f.b(r8)
            goto L55
        L43:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = r5.l(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            p28 r8 = (defpackage.p28) r8
            boolean r2 = r8 instanceof p28.b
            if (r2 == 0) goto L9f
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = r5.n(r6, r7, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            java.util.List r8 = (java.util.List) r8
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L74
            w28$a$b r5 = w28.a.b.a
            goto L7f
        L74:
            w28$b r5 = new w28$b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r6 = kotlin.collections.i.c1(r8)
            r5.<init>(r6)
        L7f:
            ul8$b r6 = defpackage.ul8.a
            java.lang.String r7 = "SUBAUTH"
            ul8$c r6 = r6.z(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getProductDetails result: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r6.a(r7, r8)
            goto Lae
        L9f:
            boolean r5 = r8 instanceof p28.c
            if (r5 == 0) goto Laf
            w28$a$a r5 = new w28$a$a
            p28$c r8 = (p28.c) r8
            java.lang.String r6 = r8.a()
            r5.<init>(r6)
        Lae:
            return r5
        Laf:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront.o(java.util.Set, int, by0):java.lang.Object");
    }

    public Object p(by0 by0Var) {
        return BuildersKt.withContext(this.b, new GoogleStoreFront$getPurchases$2(this, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(android.app.Activity r8, java.lang.String r9, java.lang.String r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront.q(android.app.Activity, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$1 r0 = (com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$1 r0 = new com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$2 r2 = new com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront.s(by0):java.lang.Object");
    }

    public final void v(boolean z) {
        this.j = z;
    }

    public /* synthetic */ GoogleStoreFront(Context context, CoroutineDispatcher coroutineDispatcher, com.android.billingclient.api.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 4) != 0 ? null : aVar);
    }
}
