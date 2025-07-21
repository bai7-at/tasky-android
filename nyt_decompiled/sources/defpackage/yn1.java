package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class yn1 {
    private final String a;

    public static final class a extends yn1 {
        public static final a b = new a();

        private a() {
            super("Core functions", null);
        }
    }

    public static final class b extends yn1 {
        public static final int c = 0;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null);
            zq3.h(str, "customTitle");
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Custom(customTitle=" + this.b + ")";
        }
    }

    public static final class c extends yn1 {
        public static final c b = new c();

        private c() {
            super("Features", null);
        }
    }

    public /* synthetic */ yn1(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private yn1(String str) {
        this.a = str;
    }
}
