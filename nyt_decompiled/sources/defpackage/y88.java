package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class y88 {

    public static final class a extends y88 {
        private final y28 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y28 y28Var) {
            super(null);
            zq3.h(y28Var, "status");
            this.a = y28Var;
        }

        public final y28 a() {
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
            return "OnPurchase(status=" + this.a + ")";
        }
    }

    public /* synthetic */ y88(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y88() {
    }
}
