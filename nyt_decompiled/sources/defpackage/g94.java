package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class g94 implements tc4 {
    private static final Set a = new HashSet();

    @Override // defpackage.tc4
    public void a(String str) {
        c(str, null);
    }

    @Override // defpackage.tc4
    public void b(String str, Throwable th) {
        if (yx3.a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // defpackage.tc4
    public void c(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    public void d(String str, Throwable th) {
        if (yx3.a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // defpackage.tc4
    public void debug(String str) {
        d(str, null);
    }
}
