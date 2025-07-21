package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class tq5 implements dd1 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(uri);
        zq3.g(data, "setData(...)");
        return data;
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        String path = uri.getPath();
        if (path == null) {
            return false;
        }
        String lowerCase = path.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        if (lowerCase != null) {
            return h.v(lowerCase, ".pdf", false, 2, null);
        }
        return false;
    }
}
