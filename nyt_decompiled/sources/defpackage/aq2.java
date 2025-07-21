package defpackage;

import android.content.Context;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class aq2 {

    public interface a {
        Set l();
    }

    public static boolean a(Context context) {
        Set l = ((a) z12.b(context, a.class)).l();
        f16.d(l.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (l.isEmpty()) {
            return true;
        }
        return ((Boolean) l.iterator().next()).booleanValue();
    }
}
