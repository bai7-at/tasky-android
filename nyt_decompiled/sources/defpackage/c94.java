package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c94 {
    private final String a;

    public static final class a extends c94 {
        public a() {
            super("NA", null);
        }
    }

    public static final class b extends c94 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null);
            zq3.h(str, "logId");
        }
    }

    public static final class c extends c94 {
        private final String b;
        private final Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Throwable th) {
            super(str, null);
            zq3.h(str, "logId");
            zq3.h(str2, "message");
            this.b = str2;
            this.c = th;
        }

        public final Throwable a() {
            return this.c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(java.lang.String r2, java.lang.Throwable r3) {
            /*
                r1 = this;
                java.lang.String r0 = "logId"
                defpackage.zq3.h(r2, r0)
                java.lang.String r0 = "error"
                defpackage.zq3.h(r3, r0)
                java.lang.String r0 = r3.getMessage()
                if (r0 != 0) goto L12
                java.lang.String r0 = ""
            L12:
                r1.<init>(r2, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c94.c.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public /* synthetic */ c94(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private c94(String str) {
        this.a = str;
    }
}
