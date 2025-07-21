package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.collections.i;

/* loaded from: classes.dex */
final class rz5 {
    private final ArrayList a = new ArrayList();

    public final void a(qz5 qz5Var) {
        zq3.h(qz5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a.add(qz5Var);
    }

    public final void b() {
        for (int n = i.n(this.a); -1 < n; n--) {
            ((qz5) this.a.get(n)).b();
        }
    }

    public final void c(qz5 qz5Var) {
        zq3.h(qz5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a.remove(qz5Var);
    }
}
