package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b65 extends wt6 {
    public static final a Companion = new a(null);
    public static final int l = 0;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b65 c(a aVar, Intent intent, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.b(intent, z);
        }

        public final b65 a(String str, String str2, String str3, String str4, String str5, String str6) {
            return new b65("push notification", "Helix", str, str2, str3, str4, str5, str6);
        }

        public final b65 b(Intent intent, boolean z) {
            zq3.h(intent, "intent");
            String stringExtra = intent.getStringExtra("et2_referring_source_type");
            if (stringExtra != null) {
                return new b65(stringExtra, intent.getStringExtra("et2_referring_source_detail"), intent.getStringExtra("et2_referring_source_alertId"), intent.getStringExtra("et2_referring_source_messageId"), intent.getStringExtra("et2_referring_source_productId"), intent.getStringExtra("et2_referring_source_campaignId"), intent.getStringExtra("com.nytimes.android.extra.ASSET_URL"), z ? null : intent.getStringExtra("com.nytimes.android.extra.ASSET_URI"));
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b65(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str, str2, du8.a("message_id", str4), du8.a("alert_id", str3), du8.a("product_id", str5), du8.a("campaign_id", str6), du8.a("url", str7), du8.a("uri", str8));
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.i;
    }

    public String f() {
        return this.e;
    }

    public final String g() {
        Uri parse;
        String str = this.k;
        if (str != null) {
            parse = Uri.parse(str);
        } else {
            String str2 = this.j;
            if (str2 == null) {
                return null;
            }
            parse = Uri.parse(str2);
        }
        return parse.getLastPathSegment();
    }

    public final String h() {
        return this.g;
    }

    public final String i() {
        return this.h;
    }

    public String j() {
        return this.d;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.j;
    }
}
