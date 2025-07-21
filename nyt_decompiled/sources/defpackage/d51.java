package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.h51;

/* loaded from: classes4.dex */
public final class d51 {
    public static final d51 a = new d51();

    private d51() {
    }

    public final void a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        h51 a2 = new h51.b().g(true).a();
        zq3.g(a2, "build(...)");
        a2.a(context, Uri.parse(str));
    }
}
