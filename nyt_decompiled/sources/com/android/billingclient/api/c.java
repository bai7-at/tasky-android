package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import defpackage.aff;
import defpackage.b9a;
import defpackage.c4a;
import defpackage.daa;
import defpackage.i5a;
import defpackage.n6a;
import defpackage.t7a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private boolean a;
    private String b;
    private String c;
    private C0139c d;
    private zzu e;
    private ArrayList f;
    private boolean g;

    public static class a {
        private String a;
        private String b;
        private List c;
        private ArrayList d;
        private boolean e;
        private C0139c.a f;

        /* synthetic */ a(c4a c4aVar) {
            C0139c.a a = C0139c.a();
            C0139c.a.b(a);
            this.f = a;
        }

        public c a() {
            ArrayList arrayList = this.d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            daa daaVar = null;
            if (!z2) {
                b bVar = (b) this.c.get(0);
                for (int i = 0; i < this.c.size(); i++) {
                    b bVar2 = (b) this.c.get(i);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i != 0 && !bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String h = bVar.b().h();
                for (b bVar3 : this.c) {
                    if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !h.equals(bVar3.b().h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.d.get(0);
                    String m = skuDetails.m();
                    ArrayList arrayList2 = this.d;
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                        if (!m.equals("play_pass_subs") && !skuDetails2.m().equals("play_pass_subs") && !m.equals(skuDetails2.m())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String q = skuDetails.q();
                    ArrayList arrayList3 = this.d;
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                        if (!m.equals("play_pass_subs") && !skuDetails3.m().equals("play_pass_subs") && !q.equals(skuDetails3.q())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            c cVar = new c(daaVar);
            if ((!z2 || ((SkuDetails) this.d.get(0)).q().isEmpty()) && (!z3 || ((b) this.c.get(0)).b().h().isEmpty())) {
                z = false;
            }
            cVar.a = z;
            cVar.b = this.a;
            cVar.c = this.b;
            cVar.d = this.f.a();
            ArrayList arrayList4 = this.d;
            cVar.f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            cVar.g = this.e;
            List list2 = this.c;
            cVar.e = list2 != null ? zzu.o(list2) : zzu.p();
            return cVar;
        }

        public a b(List list) {
            this.c = new ArrayList(list);
            return this;
        }

        public a c(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.d = arrayList;
            return this;
        }
    }

    public static final class b {
        private final e a;
        private final String b;

        public static class a {
            private e a;
            private String b;

            /* synthetic */ a(i5a i5aVar) {
            }

            public b a() {
                aff.c(this.a, "ProductDetails is required for constructing ProductDetailsParams.");
                aff.c(this.b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a c(e eVar) {
                this.a = eVar;
                if (eVar.c() != null) {
                    eVar.c().getClass();
                    this.b = eVar.c().d();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, n6a n6aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final e b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    /* renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    public static class C0139c {
        private String a;
        private String b;
        private int c = 0;
        private int d = 0;

        /* renamed from: com.android.billingclient.api.c$c$a */
        public static class a {
            private String a;
            private String b;
            private boolean c;
            private int d = 0;
            private int e = 0;

            /* synthetic */ a(t7a t7aVar) {
            }

            static /* synthetic */ a b(a aVar) {
                aVar.c = true;
                return aVar;
            }

            public C0139c a() {
                boolean z = true;
                b9a b9aVar = null;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.b);
                if (z && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.c && !z && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0139c c0139c = new C0139c(b9aVar);
                c0139c.a = this.a;
                c0139c.c = this.d;
                c0139c.d = this.e;
                c0139c.b = this.b;
                return c0139c;
            }
        }

        /* synthetic */ C0139c(b9a b9aVar) {
        }

        public static a a() {
            return new a(null);
        }

        final int b() {
            return this.c;
        }

        final int c() {
            return this.d;
        }

        final String d() {
            return this.a;
        }

        final String e() {
            return this.b;
        }
    }

    /* synthetic */ c(daa daaVar) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.d.b();
    }

    public final int c() {
        return this.d.c();
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.d.d();
    }

    public final String g() {
        return this.d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final List i() {
        return this.e;
    }

    public final boolean q() {
        return this.g;
    }

    final boolean r() {
        return (this.b == null && this.c == null && this.d.e() == null && this.d.b() == 0 && this.d.c() == 0 && !this.a && !this.g) ? false : true;
    }
}
