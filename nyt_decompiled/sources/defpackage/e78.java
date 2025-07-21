package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e78 extends e32 {
    private final String b;

    public static final class a extends e78 {
        public static final a c = new a();

        private a() {
            super("auth confirmation", "lire", null);
        }
    }

    public static final class b extends e78 {
        public static final b c = new b();

        private b() {
            super("create password", "lire", null);
        }
    }

    public static final class c extends e78 {
        public static final c c = new c();

        private c() {
            super("entry view", "lire", null);
        }
    }

    public static final class d extends e78 {
        public static final d c = new d();

        private d() {
            super("login", "lire", null);
        }
    }

    public static final class e extends e78 {
        public static final e c = new e();

        private e() {
            super("register", "lire", null);
        }
    }

    public static final class f extends e78 {
        public static final f c = new f();

        private f() {
            super("verify email", "lire", null);
        }
    }

    public /* synthetic */ e78(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private e78(String str, String str2) {
        super(new ue4(du8.a(TransferTable.COLUMN_TYPE, str), du8.a("section", str2)));
        this.b = str2;
    }
}
