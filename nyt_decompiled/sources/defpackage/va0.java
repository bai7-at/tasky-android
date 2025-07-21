package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class va0 {

    public static final class a extends va0 {
        private final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(null);
            zq3.h(obj, "value");
            this.a = obj;
        }

        public final Object a() {
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
            return "Element(value=" + this.a + ')';
        }
    }

    public static final class b extends va0 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends va0 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ va0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private va0() {
    }
}
