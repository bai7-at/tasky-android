package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class jw6 {

    public static final class a extends jw6 {
        private final int a;

        public a(int i) {
            super(null);
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return "intake-code-" + this.a;
        }
    }

    public static final class b extends jw6 {
        public static final b a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "invalid";
        }
    }

    public static final class c extends jw6 {
        public static final c a = new c();

        private c() {
            super(null);
        }

        public String toString() {
            return "obsolete";
        }
    }

    public static final class d extends jw6 {
        public static final d a = new d();

        private d() {
            super(null);
        }

        public String toString() {
            return "purged";
        }
    }

    public /* synthetic */ jw6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return true;
    }

    private jw6() {
    }
}
