package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class ce5 {
    private final CopyOnWriteArrayList<lh0> cancellables = new CopyOnWriteArrayList<>();
    private qs2 enabledChangedCallback;
    private boolean isEnabled;

    public ce5(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(lh0 lh0Var) {
        zq3.h(lh0Var, "cancellable");
        this.cancellables.add(lh0Var);
    }

    public final qs2 getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(h30 h30Var) {
        zq3.h(h30Var, "backEvent");
    }

    public void handleOnBackStarted(h30 h30Var) {
        zq3.h(h30Var, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it2 = this.cancellables.iterator();
        while (it2.hasNext()) {
            ((lh0) it2.next()).cancel();
        }
    }

    public final void removeCancellable(lh0 lh0Var) {
        zq3.h(lh0Var, "cancellable");
        this.cancellables.remove(lh0Var);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        qs2 qs2Var = this.enabledChangedCallback;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(qs2 qs2Var) {
        this.enabledChangedCallback = qs2Var;
    }
}
