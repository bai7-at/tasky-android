package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.d44;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements g {
    private final String a;
    private final n b;
    private boolean c;

    public SavedStateHandleController(String str, n nVar) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(nVar, "handle");
        this.a = str;
        this.b = nVar;
    }

    public final void a(androidx.savedstate.a aVar, Lifecycle lifecycle) {
        zq3.h(aVar, "registry");
        zq3.h(lifecycle, "lifecycle");
        if (this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        lifecycle.a(this);
        aVar.h(this.a, this.b.g());
    }

    public final n b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c = false;
            d44Var.getLifecycle().d(this);
        }
    }
}
