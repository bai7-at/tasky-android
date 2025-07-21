package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class qv7 {

    public static final class a extends qv7 {
        private final String a;
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(null);
            zq3.h(str, "message");
            this.a = str;
            this.b = th;
        }

        public final String a() {
            return this.a;
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

        public /* synthetic */ a(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    public static final class b extends qv7 {
        private final Throwable a;

        public b(Throwable th) {
            super(null);
            this.a = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "SigninCancellation(error=" + this.a + ")";
        }
    }

    public static final class c extends qv7 {
        private final String a;
        private final i77 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, i77 i77Var) {
            super(null);
            zq3.h(str, "userId");
            this.a = str;
            this.b = i77Var;
        }

        public final i77 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            i77 i77Var = this.b;
            return hashCode + (i77Var == null ? 0 : i77Var.hashCode());
        }

        public String toString() {
            return "SuccessAccountOnly(userId=" + this.a + ", accountType=" + this.b + ")";
        }
    }

    public static final class d extends qv7 {
        private final String a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(null);
            zq3.h(str, "userId");
            zq3.h(str2, "password");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SuccessCredentials(userId=" + this.a + ", password=" + this.b + ")";
        }
    }

    public /* synthetic */ qv7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private qv7() {
    }
}
