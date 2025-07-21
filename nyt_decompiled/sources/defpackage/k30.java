package defpackage;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes.dex */
public final class k30 extends q {
    private final String a = "SaveableStateHolder_BackStackEntryKey";
    private final UUID b;
    public WeakReference c;

    public k30(n nVar) {
        UUID uuid = (UUID) nVar.d("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            nVar.i("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.b = uuid;
    }

    public final UUID e() {
        return this.b;
    }

    public final WeakReference f() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return weakReference;
        }
        zq3.z("saveableStateHolderRef");
        return null;
    }

    public final void g(WeakReference weakReference) {
        this.c = weakReference;
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        super.onCleared();
        u87 u87Var = (u87) f().get();
        if (u87Var != null) {
            u87Var.c(this.b);
        }
        f().clear();
    }
}
