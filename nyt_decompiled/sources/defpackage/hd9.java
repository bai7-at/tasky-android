package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.WebActivity;
import defpackage.h51;

/* loaded from: classes4.dex */
public final class hd9 implements id9 {
    public static final hd9 a = new hd9();

    private hd9() {
    }

    private final void d(Context context, String str) {
        h51 a2 = new h51.b().g(true).a();
        zq3.g(a2, "build(...)");
        a2.a(context, Uri.parse(str));
    }

    @Override // defpackage.id9
    public void a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra("com.nytimes.android.extra.URL", str);
        intent.putExtra("sectionIsAthleticSectionFront", true);
        intent.putExtra("INTENT_EXTRA_KEY_SHOW_SHARING_OPTION", false);
        mx0.m(context, intent, null);
    }

    @Override // defpackage.id9
    public Intent b(String str) {
        zq3.h(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    @Override // defpackage.id9
    public void c(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        d(context, str);
    }
}
