package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.k;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.x1;
import com.google.android.gms.internal.play_billing.z1;
import com.google.android.gms.internal.play_billing.zzu;
import defpackage.ata;
import defpackage.cc;
import defpackage.e46;
import defpackage.h80;
import defpackage.hzc;
import defpackage.ku7;
import defpackage.lb6;
import defpackage.lja;
import defpackage.n86;
import defpackage.o86;
import defpackage.s3;
import defpackage.t3;
import defpackage.yaa;
import defpackage.yd0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes2.dex */
class b extends a {
    private volatile int a;
    private final String b;
    private final Handler c;
    private volatile y d;
    private Context e;
    private l f;
    private volatile hzc g;
    private volatile k h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private q x;
    private boolean y;
    private ExecutorService z;

    private b(Context context, q qVar, o86 o86Var, String str, String str2, cc ccVar, l lVar) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = str;
        j(context, o86Var, qVar, ccVar, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future A(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.z == null) {
            this.z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.k.a, new h(this));
        }
        try {
            final Future submit = this.z.submit(callable);
            handler.postDelayed(new Runnable() { // from class: h2g
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    k.i("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.k.j("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void B(String str, final n86 n86Var) {
        if (!c()) {
            l lVar = this.f;
            d dVar = m.m;
            lVar.b(yaa.a(2, 9, dVar));
            n86Var.a(dVar, zzu.p());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Please provide a valid product type.");
            l lVar2 = this.f;
            d dVar2 = m.g;
            lVar2.b(yaa.a(50, 9, dVar2));
            n86Var.a(dVar2, zzu.p());
            return;
        }
        if (A(new j0(this, str, n86Var), 30000L, new Runnable() { // from class: com.android.billingclient.api.h0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.t(n86Var);
            }
        }, w()) == null) {
            d y = y();
            this.f.b(yaa.a(25, 9, y));
            n86Var.a(y, zzu.p());
        }
    }

    private final void C(d dVar, int i, int i2) {
        if (dVar.b() == 0) {
            l lVar = this.f;
            s1 t = t1.t();
            t.h(5);
            g2 t2 = i2.t();
            t2.g(i2);
            t.g((i2) t2.c());
            lVar.c((t1) t.c());
            return;
        }
        l lVar2 = this.f;
        o1 u = p1.u();
        v1 t3 = x1.t();
        t3.h(dVar.b());
        t3.g(dVar.a());
        t3.i(i);
        u.g(t3);
        u.i(5);
        g2 t4 = i2.t();
        t4.g(i2);
        u.h((i2) t4.c());
        lVar2.b((p1) u.c());
    }

    private void j(Context context, o86 o86Var, q qVar, cc ccVar, String str, l lVar) {
        this.e = context.getApplicationContext();
        z1 t = a2.t();
        t.h(str);
        t.g(this.e.getPackageName());
        if (lVar != null) {
            this.f = lVar;
        } else {
            this.f = new n(this.e, (a2) t.c());
        }
        if (o86Var == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.d = new y(this.e, o86Var, ccVar, this.f);
        this.x = qVar;
        this.y = ccVar != null;
    }

    static /* synthetic */ ata v(b bVar, String str, int i) {
        Bundle D1;
        com.google.android.gms.internal.play_billing.k.h("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        Bundle c = com.google.android.gms.internal.play_billing.k.c(bVar.n, bVar.v, true, false, bVar.b);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (bVar.n) {
                    D1 = bVar.g.k3(z != bVar.v ? 9 : 19, bVar.e.getPackageName(), str, str2, c);
                } else {
                    D1 = bVar.g.D1(3, bVar.e.getPackageName(), str, str2);
                }
                v a = w.a(D1, "BillingClient", "getPurchase()");
                d a2 = a.a();
                if (a2 != m.l) {
                    bVar.f.b(yaa.a(a.b(), 9, a2));
                    return new ata(a2, list);
                }
                ArrayList<String> stringArrayList = D1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = D1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = D1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i3 = i2;
                int i4 = i3;
                while (i3 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i3);
                    String str4 = stringArrayList3.get(i3);
                    com.google.android.gms.internal.play_billing.k.h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.g())) {
                            com.google.android.gms.internal.play_billing.k.i("BillingClient", "BUG: empty/null token!");
                            i4 = 1;
                        }
                        arrayList.add(purchase);
                        i3++;
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.k.j("BillingClient", "Got an exception trying to decode the purchase!", e);
                        l lVar = bVar.f;
                        d dVar = m.j;
                        lVar.b(yaa.a(51, 9, dVar));
                        return new ata(dVar, null);
                    }
                }
                if (i4 != 0) {
                    bVar.f.b(yaa.a(26, 9, m.j));
                }
                str2 = D1.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.k.h("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new ata(m.l, arrayList);
                }
                list = null;
                z = true;
                i2 = 0;
            } catch (Exception e2) {
                l lVar2 = bVar.f;
                d dVar2 = m.m;
                lVar2.b(yaa.a(52, 9, dVar2));
                com.google.android.gms.internal.play_billing.k.j("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new ata(dVar2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler w() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    private final d x(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.c.post(new Runnable() { // from class: com.android.billingclient.api.i0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.r(dVar);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d y() {
        return (this.a == 0 || this.a == 3) ? m.m : m.j;
    }

    private static String z() {
        try {
            return (String) yd0.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.0.1";
        }
    }

    final /* synthetic */ Bundle F(int i, String str, String str2, c cVar, Bundle bundle) {
        return this.g.x2(i, this.e.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle G(String str, String str2) {
        return this.g.T4(3, this.e.getPackageName(), str, str2, null);
    }

    final /* synthetic */ Object L(s3 s3Var, t3 t3Var) {
        try {
            hzc hzcVar = this.g;
            String packageName = this.e.getPackageName();
            String a = s3Var.a();
            String str = this.b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle m6 = hzcVar.m6(9, packageName, a, bundle);
            int b = com.google.android.gms.internal.play_billing.k.b(m6, "BillingClient");
            String e = com.google.android.gms.internal.play_billing.k.e(m6, "BillingClient");
            d.a c = d.c();
            c.c(b);
            c.b(e);
            t3Var.a(c.a());
            return null;
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.k.j("BillingClient", "Error acknowledge purchase!", e2);
            l lVar = this.f;
            d dVar = m.m;
            lVar.b(yaa.a(28, 3, dVar));
            t3Var.a(dVar);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        r12 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Object M(com.android.billingclient.api.f r25, defpackage.e46 r26) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.M(com.android.billingclient.api.f, e46):java.lang.Object");
    }

    final /* synthetic */ Object N(String str, List list, String str2, ku7 ku7Var) {
        String str3;
        int i;
        Bundle A2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                if (this.o) {
                    hzc hzcVar = this.g;
                    String packageName = this.e.getPackageName();
                    int i4 = this.k;
                    String str4 = this.b;
                    Bundle bundle2 = new Bundle();
                    if (i4 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str4);
                    }
                    if (i4 >= 9) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    A2 = hzcVar.T3(10, packageName, str, bundle, bundle2);
                } else {
                    A2 = this.g.A2(3, this.e.getPackageName(), str, bundle);
                }
                str3 = "Item is unavailable for purchase.";
                if (A2 == null) {
                    com.google.android.gms.internal.play_billing.k.i("BillingClient", "querySkuDetailsAsync got null sku details list");
                    this.f.b(yaa.a(44, 8, m.B));
                    break;
                }
                if (A2.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = A2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.k.i("BillingClient", "querySkuDetailsAsync got null response list");
                        this.f.b(yaa.a(46, 8, m.B));
                        break;
                    }
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                            com.google.android.gms.internal.play_billing.k.h("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.k.j("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                            str3 = "Error trying to decode SkuDetails.";
                            this.f.b(yaa.a(47, 8, m.a(6, "Error trying to decode SkuDetails.")));
                            arrayList = null;
                            i = 6;
                            d.a c = d.c();
                            c.c(i);
                            c.b(str3);
                            ku7Var.a(c.a(), arrayList);
                            return null;
                        }
                    }
                    i2 = i3;
                } else {
                    int b = com.google.android.gms.internal.play_billing.k.b(A2, "BillingClient");
                    str3 = com.google.android.gms.internal.play_billing.k.e(A2, "BillingClient");
                    if (b != 0) {
                        com.google.android.gms.internal.play_billing.k.i("BillingClient", "getSkuDetails() failed. Response code: " + b);
                        this.f.b(yaa.a(23, 8, m.a(b, str3)));
                        i = b;
                    } else {
                        com.google.android.gms.internal.play_billing.k.i("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        this.f.b(yaa.a(45, 8, m.a(6, str3)));
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.internal.play_billing.k.j("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                this.f.b(yaa.a(43, 8, m.m));
                str3 = "Service connection is disconnected.";
                i = -1;
                arrayList = null;
            }
        }
        arrayList = null;
        i = 4;
        d.a c2 = d.c();
        c2.c(i);
        c2.b(str3);
        ku7Var.a(c2.a(), arrayList);
        return null;
    }

    @Override // com.android.billingclient.api.a
    public final void a(final s3 s3Var, final t3 t3Var) {
        if (!c()) {
            l lVar = this.f;
            d dVar = m.m;
            lVar.b(yaa.a(2, 3, dVar));
            t3Var.a(dVar);
            return;
        }
        if (TextUtils.isEmpty(s3Var.a())) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Please provide a valid purchase token.");
            l lVar2 = this.f;
            d dVar2 = m.i;
            lVar2.b(yaa.a(26, 3, dVar2));
            t3Var.a(dVar2);
            return;
        }
        if (!this.n) {
            l lVar3 = this.f;
            d dVar3 = m.b;
            lVar3.b(yaa.a(27, 3, dVar3));
            t3Var.a(dVar3);
            return;
        }
        if (A(new Callable() { // from class: com.android.billingclient.api.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.L(s3Var, t3Var);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.d0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.q(t3Var);
            }
        }, w()) == null) {
            d y = y();
            this.f.b(yaa.a(25, 3, y));
            t3Var.a(y);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.a
    public final d b(String str) {
        char c;
        if (!c()) {
            d dVar = m.m;
            if (dVar.b() != 0) {
                this.f.b(yaa.a(2, 5, dVar));
            } else {
                this.f.c(yaa.b(5));
            }
            return dVar;
        }
        d dVar2 = m.a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                d dVar3 = this.i ? m.l : m.o;
                C(dVar3, 9, 2);
                return dVar3;
            case 1:
                d dVar4 = this.j ? m.l : m.p;
                C(dVar4, 10, 3);
                return dVar4;
            case 2:
                d dVar5 = this.m ? m.l : m.r;
                C(dVar5, 35, 4);
                return dVar5;
            case 3:
                d dVar6 = this.p ? m.l : m.w;
                C(dVar6, 30, 5);
                return dVar6;
            case 4:
                d dVar7 = this.r ? m.l : m.s;
                C(dVar7, 31, 6);
                return dVar7;
            case 5:
                d dVar8 = this.q ? m.l : m.u;
                C(dVar8, 21, 7);
                return dVar8;
            case 6:
                d dVar9 = this.s ? m.l : m.t;
                C(dVar9, 19, 8);
                return dVar9;
            case 7:
                d dVar10 = this.s ? m.l : m.t;
                C(dVar10, 61, 9);
                return dVar10;
            case '\b':
                d dVar11 = this.t ? m.l : m.v;
                C(dVar11, 20, 10);
                return dVar11;
            case '\t':
                d dVar12 = this.u ? m.l : m.z;
                C(dVar12, 32, 11);
                return dVar12;
            case '\n':
                d dVar13 = this.u ? m.l : m.A;
                C(dVar13, 33, 12);
                return dVar13;
            case 11:
                d dVar14 = this.w ? m.l : m.C;
                C(dVar14, 60, 13);
                return dVar14;
            default:
                com.google.android.gms.internal.play_billing.k.i("BillingClient", "Unsupported feature: ".concat(str));
                d dVar15 = m.y;
                C(dVar15, 34, 1);
                return dVar15;
        }
    }

    @Override // com.android.billingclient.api.a
    public final boolean c() {
        return (this.a != 2 || this.g == null || this.h == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03dd  */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.d d(android.app.Activity r32, final com.android.billingclient.api.c r33) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.d(android.app.Activity, com.android.billingclient.api.c):com.android.billingclient.api.d");
    }

    @Override // com.android.billingclient.api.a
    public final void f(final f fVar, final e46 e46Var) {
        if (!c()) {
            l lVar = this.f;
            d dVar = m.m;
            lVar.b(yaa.a(2, 7, dVar));
            e46Var.a(dVar, new ArrayList());
            return;
        }
        if (this.t) {
            if (A(new Callable() { // from class: com.android.billingclient.api.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    b.this.M(fVar, e46Var);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.b0
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.s(e46Var);
                }
            }, w()) == null) {
                d y = y();
                this.f.b(yaa.a(25, 7, y));
                e46Var.a(y, new ArrayList());
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.k.i("BillingClient", "Querying product details is not supported.");
        l lVar2 = this.f;
        d dVar2 = m.v;
        lVar2.b(yaa.a(20, 7, dVar2));
        e46Var.a(dVar2, new ArrayList());
    }

    @Override // com.android.billingclient.api.a
    public final void g(lb6 lb6Var, n86 n86Var) {
        B(lb6Var.b(), n86Var);
    }

    @Override // com.android.billingclient.api.a
    public final void h(g gVar, final ku7 ku7Var) {
        if (!c()) {
            l lVar = this.f;
            d dVar = m.m;
            lVar.b(yaa.a(2, 8, dVar));
            ku7Var.a(dVar, null);
            return;
        }
        final String a = gVar.a();
        final List b = gVar.b();
        if (TextUtils.isEmpty(a)) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Please fix the input params. SKU type can't be empty.");
            l lVar2 = this.f;
            d dVar2 = m.f;
            lVar2.b(yaa.a(49, 8, dVar2));
            ku7Var.a(dVar2, null);
            return;
        }
        if (b == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            l lVar3 = this.f;
            d dVar3 = m.e;
            lVar3.b(yaa.a(48, 8, dVar3));
            ku7Var.a(dVar3, null);
            return;
        }
        final String str = null;
        if (A(new Callable(a, b, str, ku7Var) { // from class: com.android.billingclient.api.z
            public final /* synthetic */ String b;
            public final /* synthetic */ List c;
            public final /* synthetic */ ku7 d;

            {
                this.d = ku7Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.N(this.b, this.c, null, this.d);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.e0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.u(ku7Var);
            }
        }, w()) == null) {
            d y = y();
            this.f.b(yaa.a(25, 8, y));
            ku7Var.a(y, null);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void i(h80 h80Var) {
        if (c()) {
            com.google.android.gms.internal.play_billing.k.h("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f.c(yaa.b(6));
            h80Var.a(m.l);
            return;
        }
        int i = 1;
        if (this.a == 1) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Client is already in the process of connecting to billing service.");
            l lVar = this.f;
            d dVar = m.d;
            lVar.b(yaa.a(37, 6, dVar));
            h80Var.a(dVar);
            return;
        }
        if (this.a == 3) {
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            l lVar2 = this.f;
            d dVar2 = m.m;
            lVar2.b(yaa.a(38, 6, dVar2));
            h80Var.a(dVar2);
            return;
        }
        this.a = 1;
        this.d.d();
        com.google.android.gms.internal.play_billing.k.h("BillingClient", "Starting in-app billing setup.");
        this.h = new k(this, h80Var, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.k.i("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.e.bindService(intent2, this.h, 1)) {
                        com.google.android.gms.internal.play_billing.k.h("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.k.i("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.a = 0;
        com.google.android.gms.internal.play_billing.k.h("BillingClient", "Billing service unavailable on device.");
        l lVar3 = this.f;
        d dVar3 = m.c;
        lVar3.b(yaa.a(i, 6, dVar3));
        h80Var.a(dVar3);
    }

    final /* synthetic */ void q(t3 t3Var) {
        l lVar = this.f;
        d dVar = m.n;
        lVar.b(yaa.a(24, 3, dVar));
        t3Var.a(dVar);
    }

    final /* synthetic */ void r(d dVar) {
        if (this.d.c() != null) {
            this.d.c().a(dVar, null);
        } else {
            this.d.b();
            com.google.android.gms.internal.play_billing.k.i("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void s(e46 e46Var) {
        l lVar = this.f;
        d dVar = m.n;
        lVar.b(yaa.a(24, 7, dVar));
        e46Var.a(dVar, new ArrayList());
    }

    final /* synthetic */ void t(n86 n86Var) {
        l lVar = this.f;
        d dVar = m.n;
        lVar.b(yaa.a(24, 9, dVar));
        n86Var.a(dVar, zzu.p());
    }

    final /* synthetic */ void u(ku7 ku7Var) {
        l lVar = this.f;
        d dVar = m.n;
        lVar.b(yaa.a(24, 8, dVar));
        ku7Var.a(dVar, null);
    }

    b(String str, q qVar, Context context, lja ljaVar, l lVar) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = z();
        this.e = context.getApplicationContext();
        z1 t = a2.t();
        t.h(z());
        t.g(this.e.getPackageName());
        this.f = new n(this.e, (a2) t.c());
        com.google.android.gms.internal.play_billing.k.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.d = new y(this.e, null, this.f);
        this.x = qVar;
    }

    b(String str, q qVar, Context context, o86 o86Var, cc ccVar, l lVar) {
        this(context, qVar, o86Var, z(), null, ccVar, null);
    }
}
