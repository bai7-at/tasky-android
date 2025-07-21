package defpackage;

import android.content.Context;
import android.content.Intent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class sn3 {
    public static final a Companion = new a(null);
    private final Intent a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public sn3(Class cls, Context context) {
        zq3.h(cls, "klass");
        zq3.h(context, "context");
        this.a = new Intent(context, (Class<?>) cls);
    }

    public static /* synthetic */ sn3 k(sn3 sn3Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sn3Var.j(z);
    }

    public static /* synthetic */ sn3 u(sn3 sn3Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sn3Var.t(z);
    }

    public final sn3 a() {
        this.a.addFlags(67108864);
        return this;
    }

    public final sn3 b() {
        this.a.addFlags(268435456);
        return this;
    }

    public final sn3 c(String str) {
        this.a.putExtra("com.nytimes.android.extra.ASSET_URI", str);
        return this;
    }

    public final sn3 d(String str) {
        if (str != null) {
            this.a.putExtra("com.nytimes.android.extra.ASSET_URL", str);
        }
        return this;
    }

    public final Intent e() {
        return this.a;
    }

    public final sn3 f(String str) {
        zq3.h(str, "contentSource");
        this.a.putExtra("com.nytimes.android.extra.CONTENT_SRC", str);
        return this;
    }

    public final sn3 g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.a.putExtra("et2_referring_source_type", str);
        if (str2 != null) {
            this.a.putExtra("et2_referring_source_detail", str2);
        }
        if (str3 != null) {
            this.a.putExtra("et2_referring_source_alertId", str3);
        }
        if (str4 != null) {
            this.a.putExtra("et2_referring_source_messageId", str4);
        }
        if (str5 != null) {
            this.a.putExtra("et2_referring_source_productId", str5);
        }
        if (str6 != null) {
            this.a.putExtra("et2_referring_source_campaignId", str6);
        }
        if (str7 != null) {
            this.a.putExtra("com.nytimes.android.extra.ASSET_URL", str7);
        }
        if (str8 != null) {
            this.a.putExtra("com.nytimes.android.extra.ASSET_URI", str8);
        }
        return this;
    }

    public final sn3 h() {
        this.a.putExtra("com.nytimes.android.fullscreen.extra_style", "section front");
        return this;
    }

    public final sn3 i(String str) {
        if (str != null) {
            this.a.putExtra("com.nytimes.android.extra.sectionHeader", str);
        }
        return this;
    }

    public final sn3 j(boolean z) {
        this.a.putExtra("com.nytimes.android.extra.IS_AUDIO", z);
        return this;
    }

    public final sn3 l() {
        this.a.putExtra("com.nytimes.android.extra.DEEPLINK", true);
        return this;
    }

    public final sn3 m(boolean z) {
        this.a.putExtra("com.nytimes.android.extra.ISTAARTICLE", z);
        return this;
    }

    public final sn3 n(String str) {
        zq3.h(str, "pageName");
        this.a.putExtra("com.nytimes.android.extra.LANDINGPAGE_NAME", str);
        return this;
    }

    public final sn3 o(String str) {
        zq3.h(str, "mainTab");
        this.a.putExtra("com.nytimes.android.EXTRA_MAIN_TAB", str);
        return this;
    }

    public final sn3 p(boolean z) {
        this.a.putExtra("com.nytimes.android.extra.METER_OVERRIDE", z);
        return this;
    }

    public final sn3 q(String str) {
        if (str != null) {
            this.a.putExtra("ARTICLE_REFERRING_SOURCE", str);
        }
        return this;
    }

    public final sn3 r(String str) {
        if (str != null) {
            this.a.putExtra("com.nytimes.android.extra.SECTION_NAME_FRIENDLY", str);
        }
        return this;
    }

    public final sn3 s(String str) {
        if (str != null) {
            this.a.putExtra("com.nytimes.android.extra.SECTION_ID", str);
        }
        return this;
    }

    public final sn3 t(boolean z) {
        this.a.putExtra("com.nytimes.android.extra.STARTMAIN_ON_NAV_UP", z);
        return this;
    }

    public final sn3 v(String str) {
        zq3.h(str, "subTab");
        this.a.putExtra("com.nytimes.android.EXTRA_SUB_TAB", str);
        return this;
    }
}
