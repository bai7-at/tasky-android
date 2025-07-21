package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class vc0 {
    public static Object a(Context context) {
        ComponentCallbacks2 a = yx0.a(context.getApplicationContext());
        f16.a(a instanceof hx2, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", a.getClass());
        return ((hx2) a).generatedComponent();
    }
}
