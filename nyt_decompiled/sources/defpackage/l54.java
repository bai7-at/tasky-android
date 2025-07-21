package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class l54 {
    private final String a;
    private final Throwable b;

    public static final class a extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th, int i) {
            super(str, th, i);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public static final class b extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Throwable th, int i) {
            super(str, th, i);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public static final class c extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Throwable th, int i) {
            super(str, th, i);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public static final class d extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Throwable th, int i) {
            super(str, th, i);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public static final class e extends l54 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "throwable"
                defpackage.zq3.h(r3, r0)
                java.lang.String r0 = r3.getMessage()
                if (r0 != 0) goto Ld
                java.lang.String r0 = ""
            Ld:
                r1 = 0
                r2.<init>(r0, r3, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l54.e.<init>(java.lang.Throwable):void");
        }
    }

    public static final class f extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Throwable th, int i) {
            super(str, th, i);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public static class g extends l54 {
        private final int c;

        public /* synthetic */ g(String str, Throwable th, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, (i2 & 4) != 0 ? -1 : i);
        }

        @Override // defpackage.l54
        public String toString() {
            return "Error Code: " + this.c + " - " + a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Throwable th, int i) {
            super(str, th, null);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
            this.c = i;
        }
    }

    public static class h extends l54 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Throwable th) {
            super(str, th, null);
            zq3.h(str, "errorMessage");
            zq3.h(th, "throwable");
        }
    }

    public /* synthetic */ l54(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public final String a() {
        return this.a;
    }

    public final Throwable b() {
        return this.b;
    }

    public String toString() {
        return this.a;
    }

    private l54(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }
}
