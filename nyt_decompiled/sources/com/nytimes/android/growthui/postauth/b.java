package com.nytimes.android.growthui.postauth;

import defpackage.j06;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface b {

    public static final class a implements b {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            return "Exiting(isSubscribed=" + this.a + ")";
        }
    }

    /* renamed from: com.nytimes.android.growthui.postauth.b$b, reason: collision with other inner class name */
    public static final class C0325b implements b {
        public static final C0325b a = new C0325b();

        private C0325b() {
        }
    }

    public static final class c implements b {
        private final j06 a;

        public c(j06 j06Var) {
            zq3.h(j06Var, "config");
            this.a = j06Var;
        }

        public final j06 a() {
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
