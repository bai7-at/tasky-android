package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class nk5 {
    public static final b a = new b(null);

    public static final class a extends nk5 {
        public static final a b = new a();

        private a() {
            super(null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Object obj) {
            return new c(obj);
        }

        public final nk5 b(Object obj) {
            return obj == null ? a.b : new c(obj);
        }

        private b() {
        }
    }

    public static final class c extends nk5 {
        private final Object b;

        public c(Object obj) {
            super(null);
            this.b = obj;
        }

        public final Object a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.b + ')';
        }
    }

    public /* synthetic */ nk5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private nk5() {
    }
}
