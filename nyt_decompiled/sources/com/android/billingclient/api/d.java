package com.android.billingclient.api;

import defpackage.yca;

/* loaded from: classes2.dex */
public final class d {
    private int a;
    private String b;

    public static class a {
        private int a;
        private String b = "";

        /* synthetic */ a(yca ycaVar) {
        }

        public d a() {
            d dVar = new d();
            dVar.a = this.a;
            dVar.b = this.b;
            return dVar;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(int i) {
            this.a = i;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.k.f(this.a) + ", Debug Message: " + this.b;
    }
}
