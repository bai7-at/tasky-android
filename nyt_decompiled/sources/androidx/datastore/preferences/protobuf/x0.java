package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class x0 {
    x0() {
    }

    abstract void a(Object obj, int i, int i2);

    abstract void b(Object obj, int i, long j);

    abstract void c(Object obj, int i, Object obj2);

    abstract void d(Object obj, int i, ByteString byteString);

    abstract void e(Object obj, int i, long j);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final void l(Object obj, q0 q0Var) {
        while (q0Var.A() != Integer.MAX_VALUE && m(obj, q0Var)) {
        }
    }

    final boolean m(Object obj, q0 q0Var) {
        int p = q0Var.p();
        int a = WireFormat.a(p);
        int b = WireFormat.b(p);
        if (b == 0) {
            e(obj, a, q0Var.H());
            return true;
        }
        if (b == 1) {
            b(obj, a, q0Var.a());
            return true;
        }
        if (b == 2) {
            d(obj, a, q0Var.n());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(obj, a, q0Var.u());
            return true;
        }
        Object n = n();
        int c = WireFormat.c(a, 4);
        l(n, q0Var);
        if (c != q0Var.p()) {
            throw InvalidProtocolBufferException.a();
        }
        c(obj, a, r(n));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(q0 q0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, Writer writer);

    abstract void t(Object obj, Writer writer);
}
