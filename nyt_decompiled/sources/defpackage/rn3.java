package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public abstract class rn3 {
    public static final void a(Context context, td4 td4Var, String str, String str2) {
        zq3.h(context, "<this>");
        zq3.h(td4Var, "mainActivityNavigator");
        c(context, td4Var, str, str2);
        b(context, str, str2);
    }

    private static final void b(Context context, String str, String str2) {
        Intent intent = new Intent("com.nytimes.SAVE_ARTICLE");
        intent.putExtra("com.nytimes.android.extra.ASSET_URL", str);
        intent.putExtra("com.nytimes.android.extra.ASSET_URL", str2);
        intent.putExtra("ARTICLE_REFERRING_SOURCE", "Notification");
        context.sendBroadcast(intent);
    }

    private static final void c(Context context, td4 td4Var, String str, String str2) {
        Intent c = td4Var.c(context, "Notification", str2, str);
        c.addFlags(268435456);
        context.startActivity(c);
    }
}
