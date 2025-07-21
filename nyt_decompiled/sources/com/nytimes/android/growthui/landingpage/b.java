package com.nytimes.android.growthui.landingpage;

import defpackage.dy3;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface b {

    public static final class a implements b {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
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

    /* renamed from: com.nytimes.android.growthui.landingpage.b$b, reason: collision with other inner class name */
    public static final class C0320b implements b {
        public static final C0320b a = new C0320b();

        private C0320b() {
        }
    }

    public static final class c implements b {
        private final dy3 a;

        public c(dy3 dy3Var) {
            zq3.h(dy3Var, "config");
            this.a = dy3Var;
        }

        public final dy3 a() {
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
