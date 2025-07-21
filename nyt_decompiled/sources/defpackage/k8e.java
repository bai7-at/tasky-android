package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzfok;

/* loaded from: classes3.dex */
public abstract class k8e {
    public static k8e a(l8e l8eVar, m8e m8eVar) {
        if (i8e.b()) {
            return new n8e(l8eVar, m8eVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, zzfok zzfokVar, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
