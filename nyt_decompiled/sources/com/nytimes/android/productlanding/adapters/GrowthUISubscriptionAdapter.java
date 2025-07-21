package com.nytimes.android.productlanding.adapters;

import defpackage.r53;
import defpackage.z58;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GrowthUISubscriptionAdapter implements r53 {
    private final z58 a;

    public GrowthUISubscriptionAdapter(z58 z58Var) {
        zq3.h(z58Var, "subauthClient");
        this.a = z58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.r53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List r10, defpackage.by0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$getOffers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$getOffers$1 r0 = (com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$getOffers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$getOffers$1 r0 = new com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$getOffers$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r11)
            goto L47
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.f.b(r11)
            z58 r9 = r9.a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.i.h0(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r0.label = r3
            java.lang.Object r11 = r9.H(r10, r3, r0)
            if (r11 != r1) goto L47
            return r1
        L47:
            w28 r11 = (defpackage.w28) r11
            boolean r9 = r11 instanceof w28.a.C0553a
            if (r9 == 0) goto L4e
            goto L54
        L4e:
            w28$a$b r9 = w28.a.b.a
            boolean r3 = defpackage.zq3.c(r11, r9)
        L54:
            if (r3 == 0) goto L5b
            java.util.List r9 = kotlin.collections.i.l()
            goto La5
        L5b:
            boolean r9 = r11 instanceof w28.b
            if (r9 == 0) goto La6
            w28$b r11 = (w28.b) r11
            java.util.Set r9 = r11.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.i.w(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L76:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto La4
            java.lang.Object r11 = r9.next()
            v28 r11 = (defpackage.v28) r11
            com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice r0 = new com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice
            r0.<init>(r11)
            zc5 r11 = new zc5
            pb8 r3 = defpackage.s53.a(r0)
            java.lang.String r0 = r0.h()
            if (r0 != 0) goto L95
            java.lang.String r0 = ""
        L95:
            r4 = r0
            r7 = 25
            r8 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.add(r11)
            goto L76
        La4:
            r9 = r10
        La5:
            return r9
        La6:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter.a(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.r53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.jk r11, defpackage.zc5 r12, defpackage.by0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$launchPurchase$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$launchPurchase$1 r0 = (com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$launchPurchase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$launchPurchase$1 r0 = new com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter$launchPurchase$1
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.f.b(r13)
            goto L4c
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.f.b(r13)
            z58 r1 = r10.a
            java.lang.String r3 = r12.e()
            r7.label = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 28
            r9 = 0
            r2 = r11
            java.lang.Object r13 = z88.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L4c
            return r0
        L4c:
            y28 r13 = (defpackage.y28) r13
            boolean r10 = r13 instanceof y28.b
            java.lang.Boolean r10 = defpackage.cc0.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter.b(jk, zc5, by0):java.lang.Object");
    }
}
