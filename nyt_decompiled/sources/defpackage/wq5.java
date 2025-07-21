package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes4.dex */
public abstract class wq5 {
    public static final PendingIntent a(Intent intent, Context context, int i, int i2) {
        zq3.h(intent, "<this>");
        zq3.h(context, "context");
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, i2 | 67108864);
        zq3.g(activity, "getActivity(...)");
        return activity;
    }

    public static /* synthetic */ PendingIntent b(Intent intent, Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 134217728;
        }
        return a(intent, context, i, i2);
    }

    public static final PendingIntent c(Intent intent, Context context, int i, Class cls, int i2) {
        zq3.h(intent, "<this>");
        zq3.h(context, "context");
        zq3.h(cls, "parentClass");
        ug8 j = ug8.j(context);
        j.g(cls);
        j.a(intent);
        return j.o(i, 67108864 | i2);
    }

    public static /* synthetic */ PendingIntent d(Intent intent, Context context, int i, Class cls, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 134217728;
        }
        return c(intent, context, i, cls, i2);
    }

    public static final Bundle e(Intent intent, Bundle bundle) {
        zq3.h(bundle, "bundle");
        if (intent != null && intent.hasExtra("ARTICLE_REFERRING_SOURCE")) {
            bundle.putString("ARTICLE_REFERRING_SOURCE", intent.getStringExtra("ARTICLE_REFERRING_SOURCE"));
        }
        return bundle;
    }
}
