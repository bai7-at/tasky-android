package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public abstract class h83 {
    public static final t.b a(Context context, t.b bVar) {
        zq3.h(context, "context");
        zq3.h(bVar, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                t.b c = g83.c((ComponentActivity) context, bVar);
                zq3.g(c, "createInternal(\n        … */ delegateFactory\n    )");
                return c;
            }
            context = ((ContextWrapper) context).getBaseContext();
            zq3.g(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
