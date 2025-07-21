package com.nytimes.android.onboarding.compose;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c {
    public static final a Companion = new a(null);
    private final String a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends c {
        public static final b b = new b();

        private b() {
            super("complete", null);
        }
    }

    /* renamed from: com.nytimes.android.onboarding.compose.c$c, reason: collision with other inner class name */
    public static final class C0372c extends c {
        public static final C0372c b = new C0372c();

        private C0372c() {
            super("notifications", null);
        }
    }

    public static final class d extends c {
        public static final d b = new d();

        private d() {
            super("registration", null);
        }
    }

    public static final class e extends c {
        public static final e b = new e();

        private e() {
            super("splash", null);
        }
    }

    public static final class f extends c {
        public static final f b = new f();

        private f() {
            super("subscription", null);
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private c(String str) {
        this.a = str;
    }
}
