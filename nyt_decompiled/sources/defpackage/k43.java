package defpackage;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;

/* loaded from: classes4.dex */
public interface k43 {

    public static final class a {
        public static /* synthetic */ void a(k43 k43Var, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpression");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            k43Var.c(str, str2, str3, str4);
        }

        public static /* synthetic */ void b(k43 k43Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInteraction");
            }
            k43Var.b(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null);
        }
    }

    void a(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, String str2);

    void b(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void c(String str, String str2, String str3, String str4);
}
