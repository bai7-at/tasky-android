package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class up1 {

    public static final class a extends up1 {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            zq3.h(str, "value");
            this.a = str;
        }

        public final String b() {
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
            return "Available(value=" + this.a + ")";
        }
    }

    public static final class b extends up1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ up1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (zq3.c(this, b.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private up1() {
    }
}
