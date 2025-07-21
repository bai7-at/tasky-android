package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class u14 {
    private final Object a;

    public static final class a extends u14 {
        private final String b;
        private final Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(null);
            zq3.h(str, "message");
            this.b = str;
            this.c = th;
        }

        public final Throwable b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Throwable th = this.c;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Error(message=" + this.b + ", throwable=" + this.c + ")";
        }

        public /* synthetic */ a(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.Throwable r2) {
            /*
                r1 = this;
                java.lang.String r0 = "t"
                defpackage.zq3.h(r2, r0)
                java.lang.String r0 = r2.getMessage()
                if (r0 != 0) goto Ld
                java.lang.String r0 = ""
            Ld:
                r1.<init>(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u14.a.<init>(java.lang.Throwable):void");
        }
    }

    public static final class b extends u14 {
        public static final b b = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends u14 {
        private final Object b;

        public c(Object obj) {
            super(null);
            this.b = obj;
        }

        @Override // defpackage.u14
        public Object a() {
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
            return "Success(data=" + this.b + ")";
        }
    }

    public /* synthetic */ u14(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Object a() {
        return this.a;
    }

    private u14() {
    }
}
