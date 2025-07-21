package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import defpackage.fza;
import defpackage.iwa;
import defpackage.nxa;
import defpackage.sya;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {
    private final zzu a;

    public static class a {
        private zzu a;

        /* synthetic */ a(iwa iwaVar) {
        }

        public f a() {
            return new f(this, null);
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.a = zzu.o(list);
            return this;
        }
    }

    public static class b {
        private final String a;
        private final String b;

        public static class a {
            private String a;
            private String b;

            /* synthetic */ a(nxa nxaVar) {
            }

            public b a() {
                if ("first_party".equals(this.b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, sya syaVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    /* synthetic */ f(a aVar, fza fzaVar) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final zzu b() {
        return this.a;
    }

    public final String c() {
        return ((b) this.a.get(0)).c();
    }
}
