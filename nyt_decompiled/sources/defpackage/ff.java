package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class ff {
    public static final ef a(Context context) {
        return new ef(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
