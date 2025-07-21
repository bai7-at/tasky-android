package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e15 {

    public static final class a extends e15 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            zq3.h(str, "errorMessage");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.a + ")";
        }
    }

    public static final class b extends e15 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends e15 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends e15 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends e15 {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ e15(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e15() {
    }
}
