package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes4.dex */
public abstract class x25 {
    public static final void a(Context context) {
        zq3.h(context, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
