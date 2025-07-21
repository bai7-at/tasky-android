package defpackage;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class s28 {

    public static abstract class a extends s28 {

        /* renamed from: s28$a$a, reason: collision with other inner class name */
        public static final class C0536a extends a {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0536a(String str) {
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
                return (obj instanceof C0536a) && zq3.c(this.a, ((C0536a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(errorMessage=" + this.a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends s28 {
        private final Set a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set) {
            super(null);
            zq3.h(set, "result");
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
            return "Success(result=" + this.a + ")";
        }
    }

    public /* synthetic */ s28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private s28() {
    }
}
