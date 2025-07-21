package com.nytimes.subauth.ui.purr.ui.screens;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {
    private final String a;

    /* renamed from: com.nytimes.subauth.ui.purr.ui.screens.a$a, reason: collision with other inner class name */
    public static final class C0462a extends a {
        public static final C0462a b = new C0462a();

        private C0462a() {
            super("California Notices", null);
        }
    }

    public static final class b extends a {
        public static final b b = new b();

        private b() {
            super("Cookie Policy", null);
        }
    }

    public static final class c extends a {
        public static final c b = new c();

        private c() {
            super("Privacy FAQ", null);
        }
    }

    public static final class d extends a {
        public static final d b = new d();

        private d() {
            super("Privacy Policy", null);
        }
    }

    public static final class e extends a {
        public static final e b = new e();

        private e() {
            super("Privacy Settings", null);
        }
    }

    public static final class f extends a {
        public static final f b = new f();

        private f() {
            super("Manage Privacy Preferences", null);
        }
    }

    public static final class g extends a {
        public static final g b = new g();

        private g() {
            super("Your Privacy Choices", null);
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private a(String str) {
        this.a = str;
    }
}
