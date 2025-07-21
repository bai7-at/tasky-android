package com.nytimes.android.subauth.core.purchase.models.productdetails;

import defpackage.c04;
import defpackage.n26;
import defpackage.qs2;
import defpackage.u28;
import defpackage.v28;
import defpackage.z28;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.c;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class StoreFrontProductDetailsWithPrice {
    private final v28 a;
    private final c04 b;
    private final String c;
    private final String d;
    private final z28 e;
    private final Long f;
    private final Integer g;
    private final u28 h;
    private final String i;
    private final String j;
    private final z28 k;
    private final Long l;
    private final Integer m;
    private final u28 n;
    private final boolean o;

    public StoreFrontProductDetailsWithPrice(v28 v28Var) {
        boolean z;
        zq3.h(v28Var, "storeFrontProductDetails");
        this.a = v28Var;
        this.b = c.a(new qs2() { // from class: com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice$pricingModel$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n26 mo865invoke() {
                Object obj;
                Object obj2;
                List b;
                List b2;
                u28 u28Var = null;
                if (StoreFrontProductDetailsWithPrice.this.i().size() == 1) {
                    z28 z28Var = (z28) StoreFrontProductDetailsWithPrice.this.i().get(0);
                    List b3 = z28Var.b();
                    return new n26(null, null, z28Var, b3 != null ? (u28) i.k0(b3) : null);
                }
                if (StoreFrontProductDetailsWithPrice.this.i().size() <= 1) {
                    return new n26(null, null, null, null);
                }
                Iterator it2 = StoreFrontProductDetailsWithPrice.this.i().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((z28) obj).a() != null) {
                        break;
                    }
                }
                z28 z28Var2 = (z28) obj;
                Iterator it3 = StoreFrontProductDetailsWithPrice.this.i().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    String a = ((z28) obj2).a();
                    if (a == null || a.length() == 0) {
                        break;
                    }
                }
                z28 z28Var3 = (z28) obj2;
                u28 u28Var2 = (z28Var2 == null || (b2 = z28Var2.b()) == null) ? null : (u28) i.k0(b2);
                if (z28Var3 != null && (b = z28Var3.b()) != null) {
                    u28Var = (u28) i.k0(b);
                }
                return new n26(z28Var2, u28Var2, z28Var3, u28Var);
            }
        });
        u28 d = g().d();
        this.c = d != null ? d.c() : null;
        u28 d2 = g().d();
        this.d = d2 != null ? d2.b() : null;
        this.e = g().c();
        u28 d3 = g().d();
        this.f = d3 != null ? d3.d() : null;
        u28 d4 = g().d();
        this.g = d4 != null ? d4.a() : null;
        this.h = g().d();
        u28 b = g().b();
        this.i = b != null ? b.c() : null;
        u28 b2 = g().b();
        this.j = b2 != null ? b2.b() : null;
        this.k = g().a();
        u28 b3 = g().b();
        this.l = b3 != null ? b3.d() : null;
        u28 b4 = g().b();
        this.m = b4 != null ? b4.a() : null;
        this.n = g().b();
        if (g().d() != null) {
            u28 d5 = g().d();
            if ((d5 != null ? d5.c() : null) != null) {
                z = true;
                this.o = z;
            }
        }
        z = false;
        this.o = z;
    }

    public String a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public Integer c() {
        return this.g;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public z28 f() {
        return this.e;
    }

    public final n26 g() {
        return (n26) this.b.getValue();
    }

    public String h() {
        return this.a.d();
    }

    public List i() {
        return this.a.e();
    }
}
