package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class xn1 {

    public static final class a extends xn1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends xn1 {
        private final String a;

        public b(String str) {
            super(null);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.a + ")";
        }
    }

    public static final class c extends xn1 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ xn1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private xn1() {
    }
}
