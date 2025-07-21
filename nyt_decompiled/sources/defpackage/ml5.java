package defpackage;

import com.comscore.streaming.WindowState;
import defpackage.l54;
import defpackage.n54;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ml5 {
    public static final c Companion = new c(null);
    private static final RuntimeException c = new RuntimeException("Test Error");
    private final l54 a;
    private final n54 b;

    public static final class a extends ml5 {
        public static final a d = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(new l54.a("Test Error", ml5.c, 410), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b extends ml5 {
        public static final b d = new b();

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super(new l54.b("Test Error", ml5.c, 418), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d extends ml5 {
        public static final d d = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(new l54.d("Test Error", ml5.c, WindowState.NORMAL), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class e extends ml5 {
        public static final e d = new e();

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super(new l54.c("Test Error", ml5.c, 503), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class f extends ml5 {
        public static final f d = new f();

        /* JADX WARN: Multi-variable type inference failed */
        private f() {
            super(new l54.f("Test Error", ml5.c, 499), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class g extends ml5 {
        public static final g d = new g();

        /* JADX WARN: Multi-variable type inference failed */
        private g() {
            super(new l54.g("Test Error", ml5.c, 0, 4, null), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class h extends ml5 {
        public static final h d = new h();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private h() {
            /*
                r3 = this;
                com.nytimes.android.subauth.core.purchase.network.response.LinkResponseData r0 = new com.nytimes.android.subauth.core.purchase.network.response.LinkResponseData
                r0.<init>()
                java.lang.String r1 = "test"
                r0.b(r1)
                ww8 r1 = defpackage.ww8.a
                com.nytimes.android.subauth.core.purchase.network.response.LinkResponseMeta r1 = new com.nytimes.android.subauth.core.purchase.network.response.LinkResponseMeta
                r1.<init>()
                com.nytimes.android.subauth.core.purchase.network.response.LinkResponse r2 = new com.nytimes.android.subauth.core.purchase.network.response.LinkResponse
                r2.<init>(r0, r1)
                n54$b r0 = new n54$b
                r0.<init>(r2)
                r1 = 0
                r3.<init>(r1, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ml5.h.<init>():void");
        }
    }

    public static final class i extends ml5 {
        public static final i d = new i();

        /* JADX WARN: Multi-variable type inference failed */
        private i() {
            super(new l54.g("Test Error", ml5.c, 12345), null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ml5(l54 l54Var, n54 n54Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(l54Var, n54Var);
    }

    public final n54 b() {
        n54 n54Var = this.b;
        if (n54Var != null) {
            return n54Var;
        }
        l54 l54Var = this.a;
        if (l54Var != null) {
            return new n54.a(l54Var);
        }
        return null;
    }

    private ml5(l54 l54Var, n54 n54Var) {
        this.a = l54Var;
        this.b = n54Var;
    }

    public /* synthetic */ ml5(l54 l54Var, n54 n54Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l54Var, (i2 & 2) != 0 ? null : n54Var, null);
    }
}
