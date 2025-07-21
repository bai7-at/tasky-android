package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes3.dex */
public abstract class gab extends ContextWrapper {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
