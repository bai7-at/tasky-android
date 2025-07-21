package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import defpackage.ey6;

/* loaded from: classes2.dex */
public final class b implements RequestCoordinator, ey6 {
    private final Object a;
    private final RequestCoordinator b;
    private volatile ey6 c;
    private volatile ey6 d;
    private RequestCoordinator.RequestState e;
    private RequestCoordinator.RequestState f;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.a = obj;
        this.b = requestCoordinator;
    }

    private boolean k(ey6 ey6Var) {
        return ey6Var.equals(this.c) || (this.e == RequestCoordinator.RequestState.FAILED && ey6Var.equals(this.d));
    }

    private boolean l() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.a(this);
    }

    private boolean m() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.f(this);
    }

    private boolean n() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean a(ey6 ey6Var) {
        boolean z;
        synchronized (this.a) {
            try {
                z = l() && k(ey6Var);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.ey6
    public boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.b() || this.d.b();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(ey6 ey6Var) {
        synchronized (this.a) {
            try {
                if (ey6Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.b;
                    if (requestCoordinator != null) {
                        requestCoordinator.c(this);
                    }
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f = requestState2;
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public void clear() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.e = requestState;
                this.c.clear();
                if (this.f != requestState) {
                    this.f = requestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void d(ey6 ey6Var) {
        synchronized (this.a) {
            try {
                if (ey6Var.equals(this.c)) {
                    this.e = RequestCoordinator.RequestState.SUCCESS;
                } else if (ey6Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.b;
                if (requestCoordinator != null) {
                    requestCoordinator.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(ey6 ey6Var) {
        boolean z;
        synchronized (this.a) {
            try {
                z = m() && k(ey6Var);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public boolean g() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
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
        synchronized (this.a) {
            try {
                RequestCoordinator requestCoordinator = this.b;
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
        if (!(ey6Var instanceof b)) {
            return false;
        }
        b bVar = (b) ey6Var;
        return this.c.h(bVar.c) && this.d.h(bVar.d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(ey6 ey6Var) {
        boolean z;
        synchronized (this.a) {
            try {
                z = n() && k(ey6Var);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public void j() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.e = requestState2;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(ey6 ey6Var, ey6 ey6Var2) {
        this.c = ey6Var;
        this.d = ey6Var2;
    }

    @Override // defpackage.ey6
    public void pause() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
                if (this.f == requestState2) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
