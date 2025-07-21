package com.nytimes.android.growthui.paywall;

import defpackage.hq5;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface b {

    public static final class a implements b {
        public static final a a = new a();

        private a() {
        }
    }

    /* renamed from: com.nytimes.android.growthui.paywall.b$b, reason: collision with other inner class name */
    public static final class C0322b implements b {
        public static final C0322b a = new C0322b();

        private C0322b() {
        }
    }

    public static final class c implements b {
        private final hq5 a;

        public c(hq5 hq5Var) {
            zq3.h(hq5Var, "config");
            this.a = hq5Var;
        }

        public final hq5 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Success(config=" + this.a + ")";
        }
    }
}
