package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class rv7 {

    public static final class a extends rv7 {
        private final String a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(null);
            zq3.h(str, "message");
            this.a = str;
            this.b = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Error(message=" + this.a + ", error=" + this.b + ")";
        }
    }

    public static final class b extends rv7 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ rv7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private rv7() {
    }
}
