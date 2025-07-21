package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements g {
    private final SavedStateHandlesProvider a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        zq3.h(savedStateHandlesProvider, "provider");
        this.a = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            d44Var.getLifecycle().d(this);
            this.a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
