package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import defpackage.eg8;
import defpackage.ey6;
import defpackage.lh4;
import defpackage.ly6;
import defpackage.py6;
import defpackage.s62;
import defpackage.tr1;
import defpackage.x19;
import defpackage.z06;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class d extends com.bumptech.glide.request.a implements Cloneable {
    protected static final py6 n0 = (py6) ((py6) ((py6) new py6().e(tr1.c)).N(Priority.LOW)).V(true);
    private final Context Q;
    private final e S;
    private final Class X;
    private final com.bumptech.glide.a Y;
    private final c Z;
    private f e0;
    private Object f0;
    private List g0;
    private d h0;
    private d i0;
    private Float j0;
    private boolean k0 = true;
    private boolean l0;
    private boolean m0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Priority.values().length];
            b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected d(com.bumptech.glide.a aVar, e eVar, Class cls, Context context) {
        this.Y = aVar;
        this.S = eVar;
        this.X = cls;
        this.Q = context;
        this.e0 = eVar.q(cls);
        this.Z = aVar.i();
        k0(eVar.o());
        a(eVar.p());
    }

    private ey6 d0(eg8 eg8Var, ly6 ly6Var, com.bumptech.glide.request.a aVar, Executor executor) {
        return g0(new Object(), eg8Var, ly6Var, null, this.e0, aVar.t(), aVar.q(), aVar.p(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ey6 g0(Object obj, eg8 eg8Var, ly6 ly6Var, RequestCoordinator requestCoordinator, f fVar, Priority priority, int i, int i2, com.bumptech.glide.request.a aVar, Executor executor) {
        com.bumptech.glide.request.b bVar;
        RequestCoordinator requestCoordinator2;
        if (this.i0 != null) {
            requestCoordinator2 = new com.bumptech.glide.request.b(obj, requestCoordinator);
            bVar = requestCoordinator2;
        } else {
            bVar = 0;
            requestCoordinator2 = requestCoordinator;
        }
        ey6 h0 = h0(obj, eg8Var, ly6Var, requestCoordinator2, fVar, priority, i, i2, aVar, executor);
        if (bVar == 0) {
            return h0;
        }
        int q = this.i0.q();
        int p = this.i0.p();
        if (x19.r(i, i2) && !this.i0.I()) {
            q = aVar.q();
            p = aVar.p();
        }
        d dVar = this.i0;
        bVar.o(h0, dVar.g0(obj, eg8Var, ly6Var, bVar, dVar.e0, dVar.t(), q, p, this.i0, executor));
        return bVar;
    }

    private ey6 h0(Object obj, eg8 eg8Var, ly6 ly6Var, RequestCoordinator requestCoordinator, f fVar, Priority priority, int i, int i2, com.bumptech.glide.request.a aVar, Executor executor) {
        d dVar = this.h0;
        if (dVar == null) {
            if (this.j0 == null) {
                return u0(obj, eg8Var, ly6Var, aVar, requestCoordinator, fVar, priority, i, i2, executor);
            }
            com.bumptech.glide.request.c cVar = new com.bumptech.glide.request.c(obj, requestCoordinator);
            cVar.n(u0(obj, eg8Var, ly6Var, aVar, cVar, fVar, priority, i, i2, executor), u0(obj, eg8Var, ly6Var, aVar.clone().U(this.j0.floatValue()), cVar, fVar, j0(priority), i, i2, executor));
            return cVar;
        }
        if (this.m0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        f fVar2 = dVar.k0 ? fVar : dVar.e0;
        Priority t = dVar.D() ? this.h0.t() : j0(priority);
        int q = this.h0.q();
        int p = this.h0.p();
        if (x19.r(i, i2) && !this.h0.I()) {
            q = aVar.q();
            p = aVar.p();
        }
        com.bumptech.glide.request.c cVar2 = new com.bumptech.glide.request.c(obj, requestCoordinator);
        ey6 u0 = u0(obj, eg8Var, ly6Var, aVar, cVar2, fVar, priority, i, i2, executor);
        this.m0 = true;
        d dVar2 = this.h0;
        ey6 g0 = dVar2.g0(obj, eg8Var, ly6Var, cVar2, fVar2, t, q, p, dVar2, executor);
        this.m0 = false;
        cVar2.n(u0, g0);
        return cVar2;
    }

    private Priority j0(Priority priority) {
        int i = a.b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + t());
    }

    private void k0(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            lh4.a(it2.next());
            b0(null);
        }
    }

    private eg8 n0(eg8 eg8Var, ly6 ly6Var, com.bumptech.glide.request.a aVar, Executor executor) {
        z06.d(eg8Var);
        if (!this.l0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        ey6 d0 = d0(eg8Var, ly6Var, aVar, executor);
        ey6 c = eg8Var.c();
        if (d0.h(c) && !p0(aVar, c)) {
            if (!((ey6) z06.d(c)).isRunning()) {
                c.j();
            }
            return eg8Var;
        }
        this.S.n(eg8Var);
        eg8Var.h(d0);
        this.S.x(eg8Var, d0);
        return eg8Var;
    }

    private boolean p0(com.bumptech.glide.request.a aVar, ey6 ey6Var) {
        return !aVar.B() && ey6Var.g();
    }

    private d s0(Object obj) {
        this.f0 = obj;
        this.l0 = true;
        return this;
    }

    private ey6 u0(Object obj, eg8 eg8Var, ly6 ly6Var, com.bumptech.glide.request.a aVar, RequestCoordinator requestCoordinator, f fVar, Priority priority, int i, int i2, Executor executor) {
        Context context = this.Q;
        c cVar = this.Z;
        return SingleRequest.x(context, cVar, obj, this.f0, this.X, aVar, i, i2, priority, eg8Var, ly6Var, this.g0, requestCoordinator, cVar.e(), fVar.b(), executor);
    }

    public d b0(ly6 ly6Var) {
        if (ly6Var != null) {
            if (this.g0 == null) {
                this.g0 = new ArrayList();
            }
            this.g0.add(ly6Var);
        }
        return this;
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public d a(com.bumptech.glide.request.a aVar) {
        z06.d(aVar);
        return (d) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public d clone() {
        d dVar = (d) super.clone();
        dVar.e0 = dVar.e0.clone();
        return dVar;
    }

    public eg8 l0(eg8 eg8Var) {
        return o0(eg8Var, null, s62.b());
    }

    eg8 o0(eg8 eg8Var, ly6 ly6Var, Executor executor) {
        return n0(eg8Var, ly6Var, this, executor);
    }

    public d q0(Object obj) {
        return s0(obj);
    }

    public d r0(String str) {
        return s0(str);
    }
}
