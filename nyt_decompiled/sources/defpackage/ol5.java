package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ol5 {
    private final String a;

    public static final class a extends ol5 {
        public static final a b = new a();

        private a() {
            super("Already Purchased Item Error", null);
        }
    }

    public static final class b extends ol5 {
        public static final b b = new b();

        private b() {
            super("Blocked By Exiting Error", null);
        }
    }

    public static final class c extends ol5 {
        public static final c b = new c();

        private c() {
            super("Invalid Receipt Error", null);
        }
    }

    public static final class d extends ol5 {
        public static final d b = new d();

        private d() {
            super("Google Play Store Down Error", null);
        }
    }

    public static final class e extends ol5 {
        public static final e b = new e();

        private e() {
            super("Reauth Required Error", null);
        }
    }

    public static final class f extends ol5 {
        public static final f b = new f();

        private f() {
            super("Server Error", null);
        }
    }

    public static final class g extends ol5 {
        public static final g b = new g();

        private g() {
            super("Success", null);
        }
    }

    public static final class h extends ol5 {
        public static final h b = new h();

        private h() {
            super("Unknown / Unhandled Error", null);
        }
    }

    public /* synthetic */ ol5(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private ol5(String str) {
        this.a = str;
    }
}
