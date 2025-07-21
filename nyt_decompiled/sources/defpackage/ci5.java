package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes4.dex */
public abstract class ci5 {
    public static final void a(Activity activity, String str) {
        zq3.h(activity, "activity");
        zq3.h(str, "url");
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        activity.finish();
    }
}
