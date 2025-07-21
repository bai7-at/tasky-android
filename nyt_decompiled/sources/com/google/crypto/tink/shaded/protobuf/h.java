package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import defpackage.r14;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class h implements q0 {
    private final g a;
    private int b;
    private int c;
    private int d = 0;

    private h(g gVar) {
        g gVar2 = (g) u.b(gVar, "input");
        this.a = gVar2;
        gVar2.d = this;
    }

    public static h O(g gVar) {
        h hVar = gVar.d;
        return hVar != null ? hVar : new h(gVar);
    }

    private Object P(r0 r0Var, m mVar) {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.b), 4);
        try {
            Object e = r0Var.e();
            r0Var.i(e, this, mVar);
            r0Var.b(e);
            if (this.b == this.c) {
                return e;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.c = i;
        }
    }

    private Object Q(r0 r0Var, m mVar) {
        int A = this.a.A();
        g gVar = this.a;
        if (gVar.a >= gVar.b) {
            throw InvalidProtocolBufferException.h();
        }
        int j = gVar.j(A);
        Object e = r0Var.e();
        this.a.a++;
        r0Var.i(e, this, mVar);
        r0Var.b(e);
        this.a.a(0);
        r4.a--;
        this.a.i(j);
        return e;
    }

    private void S(int i) {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.j();
        }
    }

    private void T(int i) {
        if (WireFormat.b(this.b) != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void U(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void V(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int A() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void B(List list) {
        R(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void C(List list) {
        int z;
        int z2;
        if (!(list instanceof r)) {
            int b = WireFormat.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                U(A);
                int d = this.a.d() + A;
                do {
                    list.add(Float.valueOf(this.a.q()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(this.a.q()));
                if (this.a.e()) {
                    return;
                } else {
                    z = this.a.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        r rVar = (r) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int A2 = this.a.A();
            U(A2);
            int d2 = this.a.d() + A2;
            do {
                rVar.c(this.a.q());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            rVar.c(this.a.q());
            if (this.a.e()) {
                return;
            } else {
                z2 = this.a.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean D() {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.C(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int E() {
        T(5);
        return this.a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void F(List list) {
        int z;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(n());
            if (this.a.e()) {
                return;
            } else {
                z = this.a.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void G(List list) {
        int z;
        int z2;
        if (!(list instanceof j)) {
            int b = WireFormat.b(this.b);
            if (b == 1) {
                do {
                    list.add(Double.valueOf(this.a.m()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int A = this.a.A();
            V(A);
            int d = this.a.d() + A;
            do {
                list.add(Double.valueOf(this.a.m()));
            } while (this.a.d() < d);
            return;
        }
        j jVar = (j) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                jVar.c(this.a.m());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int A2 = this.a.A();
        V(A2);
        int d2 = this.a.d() + A2;
        do {
            jVar.c(this.a.m());
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public long H() {
        T(0);
        return this.a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public String I() {
        T(2);
        return this.a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public Object J(r0 r0Var, m mVar) {
        T(3);
        return P(r0Var, mVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void K(Map map, z.a aVar, m mVar) {
        T(2);
        this.a.j(this.a.A());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void L(List list, r0 r0Var, m mVar) {
        int z;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            list.add(Q(r0Var, mVar));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                z = this.a.z();
            }
        } while (z == i);
        this.d = z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public Object M(r0 r0Var, m mVar) {
        T(2);
        return Q(r0Var, mVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void N(List list, r0 r0Var, m mVar) {
        int z;
        if (WireFormat.b(this.b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            list.add(P(r0Var, mVar));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                z = this.a.z();
            }
        } while (z == i);
        this.d = z;
    }

    public void R(List list, boolean z) {
        int z2;
        int z3;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        if (!(list instanceof r14) || z) {
            do {
                list.add(z ? I() : z());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        r14 r14Var = (r14) list;
        do {
            r14Var.h1(n());
            if (this.a.e()) {
                return;
            } else {
                z3 = this.a.z();
            }
        } while (z3 == this.b);
        this.d = z3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public long a() {
        T(1);
        return this.a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void b(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                U(A);
                int d = this.a.d() + A;
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(this.a.t()));
                if (this.a.e()) {
                    return;
                } else {
                    z = this.a.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int A2 = this.a.A();
            U(A2);
            int d2 = this.a.d() + A2;
            do {
                tVar.c(this.a.t());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            tVar.c(this.a.t());
            if (this.a.e()) {
                return;
            } else {
                z2 = this.a.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void c(List list) {
        int z;
        int z2;
        if (!(list instanceof x)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Long.valueOf(this.a.w()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        x xVar = (x) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                xVar.c(this.a.w());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            xVar.c(this.a.w());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean d() {
        T(0);
        return this.a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public long e() {
        T(1);
        return this.a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void f(List list) {
        int z;
        int z2;
        if (!(list instanceof x)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.B()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Long.valueOf(this.a.B()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        x xVar = (x) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                xVar.c(this.a.B());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            xVar.c(this.a.B());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int g() {
        T(0);
        return this.a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void h(List list) {
        int z;
        int z2;
        if (!(list instanceof x)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Long.valueOf(this.a.s()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        x xVar = (x) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                xVar.c(this.a.s());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            xVar.c(this.a.s());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void i(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                tVar.c(this.a.n());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            tVar.c(this.a.n());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int j() {
        T(0);
        return this.a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int k() {
        T(0);
        return this.a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void l(List list) {
        int z;
        int z2;
        if (!(list instanceof f)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Boolean.valueOf(this.a.k()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        f fVar = (f) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                fVar.c(this.a.k());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            fVar.c(this.a.k());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void m(List list) {
        R(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public ByteString n() {
        T(2);
        return this.a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int o() {
        T(0);
        return this.a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int p() {
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void q(List list) {
        int z;
        int z2;
        if (!(list instanceof x)) {
            int b = WireFormat.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int A = this.a.A();
            V(A);
            int d = this.a.d() + A;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.d() < d);
            return;
        }
        x xVar = (x) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                xVar.c(this.a.p());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int A2 = this.a.A();
        V(A2);
        int d2 = this.a.d() + A2;
        do {
            xVar.c(this.a.p());
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void r(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Integer.valueOf(this.a.v()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                tVar.c(this.a.v());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            tVar.c(this.a.v());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public double readDouble() {
        T(1);
        return this.a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public float readFloat() {
        T(5);
        return this.a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public long s() {
        T(0);
        return this.a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void t(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.A()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Integer.valueOf(this.a.A()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                tVar.c(this.a.A());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            tVar.c(this.a.A());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int u() {
        T(5);
        return this.a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void v(List list) {
        int z;
        int z2;
        if (!(list instanceof x)) {
            int b = WireFormat.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int A = this.a.A();
            V(A);
            int d = this.a.d() + A;
            do {
                list.add(Long.valueOf(this.a.u()));
            } while (this.a.d() < d);
            return;
        }
        x xVar = (x) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                xVar.c(this.a.u());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int A2 = this.a.A();
        V(A2);
        int d2 = this.a.d() + A2;
        do {
            xVar.c(this.a.u());
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void w(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (this.a.e()) {
                        return;
                    } else {
                        z = this.a.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int d = this.a.d() + this.a.A();
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.d() < d);
            S(d);
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                tVar.c(this.a.r());
                if (this.a.e()) {
                    return;
                } else {
                    z2 = this.a.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d2 = this.a.d() + this.a.A();
        do {
            tVar.c(this.a.r());
        } while (this.a.d() < d2);
        S(d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void x(List list) {
        int z;
        int z2;
        if (!(list instanceof t)) {
            int b = WireFormat.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                U(A);
                int d = this.a.d() + A;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.e()) {
                    return;
                } else {
                    z = this.a.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        t tVar = (t) list;
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int A2 = this.a.A();
            U(A2);
            int d2 = this.a.d() + A2;
            do {
                tVar.c(this.a.o());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            tVar.c(this.a.o());
            if (this.a.e()) {
                return;
            } else {
                z2 = this.a.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public long y() {
        T(0);
        return this.a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public String z() {
        T(2);
        return this.a.x();
    }
}
