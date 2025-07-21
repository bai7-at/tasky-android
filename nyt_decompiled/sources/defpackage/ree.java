package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class ree {
    public static qee a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new see(new yee(context));
    }
}
