package com.android.billingclient.api;

import defpackage.v4b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private String a;
    private List b;

    public static class a {
        private String a;
        private List b;

        /* synthetic */ a(v4b v4bVar) {
        }

        public g a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            g gVar = new g();
            gVar.a = str;
            gVar.b = this.b;
            return gVar;
        }

        public a b(List list) {
            this.b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }
}
