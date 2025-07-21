package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public abstract class wp1 {
    public static final int a() {
        return (int) (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final boolean b(Context context) {
        zq3.h(context, "<this>");
        return !c(context);
    }

    public static final boolean c(Context context) {
        zq3.h(context, "<this>");
        return context.getResources().getBoolean(oc6.hybrid_is_tablet);
    }
}
