package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes4.dex */
public abstract class yx0 {
    public static Application a(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
