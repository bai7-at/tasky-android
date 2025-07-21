package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e58 {

    public static abstract class a extends e58 {
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: e58$a$a, reason: collision with other inner class name */
        public static final class C0478a extends a {
            public static final C0478a d = new C0478a();

            private C0478a() {
                super("error", "active subscription", null, 4, null);
            }
        }

        public static final class b extends a {
            public static final b d = new b();

            private b() {
                super("are you sure", "are you sure", null, 4, null);
            }
        }

        public static final class c extends a {
            public static final c d = new c();

            private c() {
                super("delete account", "delete account", null, 4, null);
            }
        }

        public static final class d extends a {
            public static final d d = new d();

            private d() {
                super("success", "deleting your account", null, 4, null);
            }
        }

        public static final class e extends a {
            public static final e d = new e();

            private e() {
                super("error", "system error", null, 4, null);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "delete account" : str3, null);
        }

        private a(String str, String str2, String str3) {
            super(null);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public static abstract class b extends e58 {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;

        public static final class a extends b {
            public static final a g = new a();

            private a() {
                super("are you sure", "nevermind", "Cancel", null, null, null, 56, null);
            }
        }

        /* renamed from: e58$b$b, reason: collision with other inner class name */
        public static final class C0479b extends b {
            public static final C0479b g = new C0479b();

            private C0479b() {
                super("are you sure", "delete account", "Delete Account", null, null, null, 56, null);
            }
        }

        public static final class c extends b {
            public static final c g = new c();

            private c() {
                super("delete account", "delete account", "Delete Account", null, null, null, 56, null);
            }
        }

        public static final class d extends b {
            public static final d g = new d();

            private d() {
                super("error", "active subscription", "OK", null, null, null, 56, null);
            }
        }

        public static final class e extends b {
            public static final e g = new e();

            private e() {
                super("success", "deleting your account", "OK", null, null, null, 56, null);
            }
        }

        public static final class f extends b {
            public static final f g = new f();

            private f() {
                super("error", "system error", "OK", null, null, null, 56, null);
            }
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6);
        }

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.f;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "delete account" : str4, (i & 16) != 0 ? "tap" : str5, (i & 32) != 0 ? "button" : str6, null);
        }

        private b(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }
    }

    public static abstract class c extends e58 {
        private final String a;
        private final String b;

        public static final class a extends c {
            public static final a c = new a();

            /* JADX WARN: Multi-variable type inference failed */
            private a() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public /* synthetic */ c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "privacy settings" : str, (i & 2) != 0 ? "delete account" : str2, null);
        }

        private c(String str, String str2) {
            super(null);
            this.a = str;
            this.b = str2;
        }
    }

    public /* synthetic */ e58(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e58() {
    }
}
