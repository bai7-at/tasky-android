package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.cms.AssetConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class s55 extends e32 {
    private final String b;

    public static final class a extends s55 {
        public static final a c = new a();

        private a() {
            super("post login offer", "subscription", null, null, null, 28, null);
        }
    }

    public static final class b extends s55 {
        public static final b c = new b();

        private b() {
            super("post regi offer", "subscription", null, null, null, 28, null);
        }
    }

    public static final class c extends s55 {
        public static final c c = new c();

        private c() {
            super("settings", "about", null, null, null, 28, null);
        }
    }

    public static final class d extends s55 {
        public static final d c = new d();

        private d() {
            super(null, AssetConstants.ARTICLE_TYPE, null, null, null, 29, null);
        }
    }

    public static final class e extends s55 {
        public static final e c = new e();

        private e() {
            super(null, "full screen video", null, null, null, 29, null);
        }
    }

    public static final class f extends s55 implements zl9 {
        public static final f c = new f();

        private f() {
            super("home", "homepage", null, null, null, 28, null);
        }
    }

    public static final class g extends s55 {
        public static final g c = new g();

        private g() {
            super("push notifications", "onboarding", null, null, null, 28, null);
        }
    }

    public static final class h extends s55 {
        public static final h c = new h();

        private h() {
            super(null, "play tab", null, null, null, 29, null);
        }
    }

    public static final class i extends s55 {
        public static final i c = new i();

        private i() {
            super("section front", "recently viewed", null, null, null, 28, null);
        }
    }

    public static final class j extends s55 {
        public static final j c = new j();

        private j() {
            super("regi primer", "onboarding", null, null, null, 28, null);
        }
    }

    public static final class k extends s55 {
        public static final k c = new k();

        private k() {
            super("regiwall", "subscriptions", null, null, null, 28, null);
        }
    }

    public static final class l extends s55 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super("section front", str, null, null, null, 28, null);
            zq3.h(str, "sectionName");
        }
    }

    public static final class m extends s55 {
        public static final m c = new m();

        private m() {
            super(null, "section tab", null, null, null, 29, null);
        }
    }

    public static final class n extends s55 {
        public static final n c = new n();

        private n() {
            super("main navigation with saved for later", "about", null, null, null, 28, null);
        }
    }

    public static final class o extends s55 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2) {
            super(str, AssetConstants.SLIDESHOW_TYPE, null, null, str2, 12, null);
            zq3.h(str, "typeName");
        }
    }

    public static final class p extends s55 {
        public static final p c = new p();

        private p() {
            super(null, AssetConstants.ARTICLE_TYPE, "web view", null, null, 25, null);
        }
    }

    public static final class q extends s55 {
        public static final q c = new q();

        private q() {
            super(null, "the athletic charm bracelet", null, null, null, 29, null);
        }
    }

    public static final class r extends s55 {
        public static final r c = new r();

        private r() {
            super(null, "the athletic app download", null, null, null, 29, null);
        }
    }

    public static final class s extends s55 {
        public static final s c = new s();

        private s() {
            super("section front", "sports", "web view", null, null, 24, null);
        }
    }

    public static final class t extends s55 {
        public static final t c = new t();

        private t() {
            super("text size", "settings", null, null, null, 28, null);
        }
    }

    public static final class u extends s55 {
        public static final u c = new u();

        private u() {
            super("subscription primer", "onboarding", null, null, null, 28, null);
        }
    }

    public static final class v extends s55 {
        public static final v c = new v();

        private v() {
            super(null, null, "web view", null, null, 27, null);
        }
    }

    public static final class w extends s55 implements zl9 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super("xpn panel", str, null, null, null, 28, null);
            zq3.h(str, TransferTable.COLUMN_TYPE);
        }
    }

    public static final class x extends s55 implements zl9 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super("xpn panel", str, "web view", null, null, 24, null);
            zq3.h(str, TransferTable.COLUMN_TYPE);
        }
    }

    public static final class y extends s55 {
        public static final y c = new y();

        private y() {
            super(null, "you tab", null, null, null, 29, null);
        }
    }

    public /* synthetic */ s55(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    public final String d() {
        return this.b;
    }

    public /* synthetic */ s55(String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, null);
    }

    private s55(String str, String str2, String str3, String str4, String str5) {
        super(new ue4(du8.a(TransferTable.COLUMN_TYPE, str), du8.a("section", str2), du8.a("view", str3), du8.a(AppsFlyerProperties.CHANNEL, str4), du8.a("image_uri", str5)));
        this.b = str2;
    }
}
