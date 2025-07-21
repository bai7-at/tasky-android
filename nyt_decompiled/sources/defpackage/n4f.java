package defpackage;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class n4f extends i51 {
    private final WeakReference b;

    public n4f(tqa tqaVar) {
        this.b = new WeakReference(tqaVar);
    }

    @Override // defpackage.i51
    public final void a(ComponentName componentName, g51 g51Var) {
        tqa tqaVar = (tqa) this.b.get();
        if (tqaVar != null) {
            tqaVar.c(g51Var);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        tqa tqaVar = (tqa) this.b.get();
        if (tqaVar != null) {
            tqaVar.d();
        }
    }
}
