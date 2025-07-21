package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public interface at7 {

    public static final class a {
        public static /* synthetic */ Intent a(at7 at7Var, Context context, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
            if (obj == null) {
                return at7Var.c(context, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forDeeplink");
        }
    }

    PendingIntent a(Context context, String str, int i, String str2, String str3, String str4, String str5, String str6);

    Intent b(Context context, String str, String str2);

    Intent c(Context context, String str, String str2, boolean z, boolean z2, String str3);
}
