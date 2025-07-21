package com.nytimes.android.growthui.regibundle;

import defpackage.du6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface b {

    public static final class a implements b {
        public static final a a = new a();

        private a() {
        }
    }

    /* renamed from: com.nytimes.android.growthui.regibundle.b$b, reason: collision with other inner class name */
    public static final class C0327b implements b {
        public static final C0327b a = new C0327b();

        private C0327b() {
        }
    }

    public static final class c implements b {
        private final du6 a;
        private final boolean b;

        public c(du6 du6Var, boolean z) {
            zq3.h(du6Var, "config");
            this.a = du6Var;
            this.b = z;
        }

        public final du6 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "Success(config=" + this.a + ", userIsLoggedIn=" + this.b + ")";
        }
    }
}
