package defpackage;

import defpackage.y28;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class w28 {

    public static abstract class a extends w28 {

        /* renamed from: w28$a$a, reason: collision with other inner class name */
        public static final class C0553a extends a {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0553a(String str) {
                super(null);
                zq3.h(str, "errorMessage");
                this.a = str;
            }

            public final y28.a.C0556a a() {
                return new y28.a.C0556a(this.a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0553a) && zq3.c(this.a, ((C0553a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(errorMessage=" + this.a + ")";
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }

            public final y28.a.d a() {
                return y28.a.d.a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends w28 {
        private final Set a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set) {
            super(null);
            zq3.h(set, "productDetails");
            this.a = set;
        }

        public final Set a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Success(productDetails=" + this.a + ")";
        }
    }

    public /* synthetic */ w28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w28() {
    }
}
