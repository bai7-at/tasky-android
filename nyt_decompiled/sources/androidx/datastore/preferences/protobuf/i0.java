package androidx.datastore.preferences.protobuf;

import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class i0 implements r0 {
    private final f0 a;
    private final x0 b;
    private final boolean c;
    private final m d;

    private i0(x0 x0Var, m mVar, f0 f0Var) {
        this.b = x0Var;
        this.c = mVar.e(f0Var);
        this.d = mVar;
        this.a = f0Var;
    }

    private int j(x0 x0Var, Object obj) {
        return x0Var.i(x0Var.g(obj));
    }

    private void k(x0 x0Var, m mVar, Object obj, q0 q0Var, l lVar) {
        Object f = x0Var.f(obj);
        p d = mVar.d(obj);
        do {
            try {
                if (q0Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                x0Var.o(obj, f);
            }
        } while (m(q0Var, lVar, mVar, d, x0Var, f));
    }

    static i0 l(x0 x0Var, m mVar, f0 f0Var) {
        return new i0(x0Var, mVar, f0Var);
    }

    private boolean m(q0 q0Var, l lVar, m mVar, p pVar, x0 x0Var, Object obj) {
        int p = q0Var.p();
        if (p != WireFormat.a) {
            if (WireFormat.b(p) != 2) {
                return q0Var.D();
            }
            Object b = mVar.b(lVar, this.a, WireFormat.a(p));
            if (b == null) {
                return x0Var.m(obj, q0Var);
            }
            mVar.h(q0Var, b, lVar, pVar);
            return true;
        }
        Object obj2 = null;
        int i = 0;
        ByteString byteString = null;
        while (q0Var.A() != Integer.MAX_VALUE) {
            int p2 = q0Var.p();
            if (p2 == WireFormat.c) {
                i = q0Var.g();
                obj2 = mVar.b(lVar, this.a, i);
            } else if (p2 == WireFormat.d) {
                if (obj2 != null) {
                    mVar.h(q0Var, obj2, lVar, pVar);
                } else {
                    byteString = q0Var.n();
                }
            } else if (!q0Var.D()) {
                break;
            }
        }
        if (q0Var.p() != WireFormat.b) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteString != null) {
            if (obj2 != null) {
                mVar.i(byteString, obj2, lVar, pVar);
            } else {
                x0Var.d(obj, i, byteString);
            }
        }
        return true;
    }

    private void n(x0 x0Var, Object obj, Writer writer) {
        x0Var.s(x0Var.g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void a(Object obj, Object obj2) {
        t0.F(this.b, obj, obj2);
        if (this.c) {
            t0.D(this.d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void b(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(Object obj) {
        return this.d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int d(Object obj) {
        int j = j(this.b, obj);
        return this.c ? j + this.d.c(obj).f() : j;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public Object e() {
        return this.a.c().j();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int f(Object obj) {
        int hashCode = this.b.g(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public boolean g(Object obj, Object obj2) {
        if (!this.b.g(obj).equals(this.b.g(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(obj).equals(this.d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void h(Object obj, q0 q0Var, l lVar) {
        k(this.b, this.d, obj, q0Var, lVar);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void i(Object obj, Writer writer) {
        Iterator n = this.d.c(obj).n();
        if (n.hasNext()) {
            lh4.a(((Map.Entry) n.next()).getKey());
            throw null;
        }
        n(this.b, obj, writer);
    }
}
