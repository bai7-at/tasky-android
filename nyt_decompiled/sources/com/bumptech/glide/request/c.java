package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import defpackage.ey6;

/* loaded from: classes2.dex */
public class c implements RequestCoordinator, ey6 {
    private final RequestCoordinator a;
    private final Object b;
    private volatile ey6 c;
    private volatile ey6 d;
    private RequestCoordinator.RequestState e;
    private RequestCoordinator.RequestState f;
    private boolean g;

    public c(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.b = obj;
        this.a = requestCoordinator;
    }

    private boolean k() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.a(this);
    }

    private boolean l() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.f(this);
    }

    private boolean m() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean a(ey6 ey6Var) {
        boolean z;
        synchronized (this.b) {
            try {
                z = k() && ey6Var.equals(this.c) && this.e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.ey6
    public boolean b() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.b() || this.c.b();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(ey6 ey6Var) {
        synchronized (this.b) {
            try {
                if (!ey6Var.equals(this.c)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.a;
                if (requestCoordinator != null) {
                    requestCoordinator.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.e = requestState;
            this.f = requestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void d(ey6 ey6Var) {
        synchronized (this.b) {
            try {
                if (ey6Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.a;
                if (requestCoordinator != null) {
                    requestCoordinator.d(this);
                }
                if (!this.f.isComplete()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(ey6 ey6Var) {
        boolean z;
        synchronized (this.b) {
            try {
                z = l() && ey6Var.equals(this.c) && !b();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.RequestCoordinator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        ?? r2;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.a;
                this = this;
                if (requestCoordinator != null) {
                    r2 = requestCoordinator.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // defpackage.ey6
    public boolean h(ey6 ey6Var) {
        if (!(ey6Var instanceof c)) {
            return false;
        }
        c cVar = (c) ey6Var;
        if (this.c == null) {
            if (cVar.c != null) {
                return false;
            }
        } else if (!this.c.h(cVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (cVar.d != null) {
                return false;
            }
        } else if (!this.d.h(cVar.d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(ey6 ey6Var) {
        boolean z;
        synchronized (this.b) {
            try {
                z = m() && (ey6Var.equals(this.c) || this.e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // defpackage.ey6
    public void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f = requestState2;
                            this.d.j();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator.RequestState requestState3 = this.e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.e = requestState4;
                            this.c.j();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(ey6 ey6Var, ey6 ey6Var2) {
        this.c = ey6Var;
        this.d = ey6Var2;
    }

    @Override // defpackage.ey6
    public void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.isComplete()) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.e.isComplete()) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
