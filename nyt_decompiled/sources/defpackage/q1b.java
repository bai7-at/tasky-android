package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class q1b extends hhb {
    private final una d;
    private final Object c = new Object();
    private boolean e = false;
    private int f = 0;

    public q1b(una unaVar) {
        this.d = unaVar;
    }

    public final l1b f() {
        l1b l1bVar = new l1b(this);
        pzc.k("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            pzc.k("createNewReference: Lock acquired");
            e(new m1b(this, l1bVar), new n1b(this, l1bVar));
            Preconditions.checkState(this.f >= 0);
            this.f++;
        }
        pzc.k("createNewReference: Lock released");
        return l1bVar;
    }

    public final void g() {
        pzc.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            pzc.k("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.f >= 0);
            pzc.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            h();
        }
        pzc.k("markAsDestroyable: Lock released");
    }

    protected final void h() {
        pzc.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                pzc.k("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.f >= 0);
                if (this.e && this.f == 0) {
                    pzc.k("No reference is left (including root). Cleaning up engine.");
                    e(new p1b(this), new xgb());
                } else {
                    pzc.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pzc.k("maybeDestroy: Lock released");
    }

    protected final void i() {
        pzc.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            pzc.k("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.f > 0);
            pzc.k("Releasing 1 reference for JS Engine");
            this.f--;
            h();
        }
        pzc.k("releaseOneReference: Lock released");
    }
}
