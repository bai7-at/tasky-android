package defpackage;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class tr8 {
    public static final tr8 a = new tr8();

    private tr8() {
    }

    public static final void a(Intent intent, Activity activity) {
        zq3.h(intent, "intent");
        zq3.h(activity, "activity");
        activity.startActivity(intent, ur8.a(activity));
    }

    public final void b(Intent intent, Activity activity, int i) {
        zq3.h(intent, "intent");
        zq3.h(activity, "activity");
        activity.startActivityForResult(intent, i, ur8.a(activity));
    }
}
