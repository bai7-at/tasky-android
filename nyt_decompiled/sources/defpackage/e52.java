package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e52 {
    private final String a;

    public static final class a extends e52 {
        public a() {
            super("ab_expose", null);
        }
    }

    public static final class b extends e52 {
        public b() {
            super("app_performance", null);
        }
    }

    public static final class c extends e52 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str, null);
            zq3.h(str, "customSubject");
        }
    }

    public static final class d extends e52 {
        public d() {
            super("impression", null);
        }
    }

    public static final class e extends e52 {
        public e() {
            super("interaction", null);
        }
    }

    public static final class f extends e52 {
        public f() {
            super("media", null);
        }
    }

    public static final class g extends e52 {
        public g() {
            super("page", null);
        }
    }

    public static final class h extends e52 {
        public h() {
            super("page_exit", null);
        }
    }

    public static final class i extends e52 {
        public i() {
            super("page_soft", null);
        }
    }

    public static final class j extends e52 {
        public j() {
            super("page_update", null);
        }
    }

    public static final class k extends e52 {
        public k() {
            super("subscription_event", null);
        }
    }

    public /* synthetic */ e52(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private e52(String str) {
        this.a = str;
    }
}
