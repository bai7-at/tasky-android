package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import defpackage.lh4;
import defpackage.s14;
import java.util.List;

/* loaded from: classes.dex */
final class g implements q0 {
    private final f a;
    private int b;
    private int c;
    private int d = 0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private g(f fVar) {
        f fVar2 = (f) t.b(fVar, "input");
        this.a = fVar2;
        fVar2.d = this;
    }

    public static g O(f fVar) {
        g gVar = fVar.d;
        return gVar != null ? gVar : new g(fVar);
    }

    private Object P(WireFormat.FieldType fieldType, Class cls, l lVar) {
        switch (a.a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(o());
            case 9:
                return Long.valueOf(H());
            case 10:
                return S(cls, lVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(s());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(r0 r0Var, l lVar) {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.b), 4);
        try {
            Object e = r0Var.e();
            r0Var.h(e, this, lVar);
            r0Var.b(e);
            if (this.b == this.c) {
                return e;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.c = i;
        }
    }

    private Object R(r0 r0Var, l lVar) {
        int C = this.a.C();
        f fVar = this.a;
        if (fVar.a >= fVar.b) {
            throw InvalidProtocolBufferException.h();
        }
        int l = fVar.l(C);
        Object e = r0Var.e();
        this.a.a++;
        r0Var.h(e, this, lVar);
        r0Var.b(e);
        this.a.a(0);
        r4.a--;
        this.a.k(l);
        return e;
    }

    private void U(int i) {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void V(int i) {
        if (WireFormat.b(this.b) != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void W(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void X(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int A() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void B(List list) {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void C(List list) {
        int B;
        if (list instanceof q) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b != 2) {
                if (b != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.a.s();
                throw null;
            }
            W(this.a.C());
            this.a.d();
            this.a.s();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int C = this.a.C();
            W(C);
            int d = this.a.d() + C;
            do {
                list.add(Float.valueOf(this.a.s()));
            } while (this.a.d() < d);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Float.valueOf(this.a.s()));
            if (this.a.e()) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public boolean D() {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int E() {
        V(5);
        return this.a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void F(List list) {
        int B;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(n());
            if (this.a.e()) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void G(List list) {
        int B;
        if (list instanceof i) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 1) {
                this.a.o();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.a.C());
            this.a.d();
            this.a.o();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Double.valueOf(this.a.o()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C = this.a.C();
        X(C);
        int d = this.a.d() + C;
        do {
            list.add(Double.valueOf(this.a.o()));
        } while (this.a.d() < d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public long H() {
        V(0);
        return this.a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public String I() {
        V(2);
        return this.a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public Object J(r0 r0Var, l lVar) {
        V(2);
        return R(r0Var, lVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void K(List list, r0 r0Var, l lVar) {
        int B;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            list.add(R(r0Var, lVar));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == i);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public Object L(r0 r0Var, l lVar) {
        V(3);
        return Q(r0Var, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(java.util.Map r8, androidx.datastore.preferences.protobuf.z.a r9, androidx.datastore.preferences.protobuf.l r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.f r1 = r7.a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.f r2 = r7.a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.f r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.f r7 = r7.a
            r7.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.f r7 = r7.a
            r7.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.g.M(java.util.Map, androidx.datastore.preferences.protobuf.z$a, androidx.datastore.preferences.protobuf.l):void");
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void N(List list, r0 r0Var, l lVar) {
        int B;
        if (WireFormat.b(this.b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            list.add(Q(r0Var, lVar));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == i);
        this.d = B;
    }

    public Object S(Class cls, l lVar) {
        V(2);
        return R(n0.a().c(cls), lVar);
    }

    public void T(List list, boolean z) {
        int B;
        int B2;
        if (WireFormat.b(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        if (!(list instanceof s14) || z) {
            do {
                list.add(z ? I() : z());
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        s14 s14Var = (s14) list;
        do {
            s14Var.F0(n());
            if (this.a.e()) {
                return;
            } else {
                B2 = this.a.B();
            }
        } while (B2 == this.b);
        this.d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public long a() {
        V(1);
        return this.a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void b(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b != 2) {
                if (b != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.a.v();
                throw null;
            }
            W(this.a.C());
            this.a.d();
            this.a.v();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int C = this.a.C();
            W(C);
            int d = this.a.d() + C;
            do {
                list.add(Integer.valueOf(this.a.v()));
            } while (this.a.d() < d);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.v()));
            if (this.a.e()) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void c(List list) {
        int B;
        if (list instanceof x) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.y();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.y();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.y()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Long.valueOf(this.a.y()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public boolean d() {
        V(0);
        return this.a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public long e() {
        V(1);
        return this.a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void f(List list) {
        int B;
        if (list instanceof x) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.D();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.D();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.D()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Long.valueOf(this.a.D()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int g() {
        V(0);
        return this.a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void h(List list) {
        int B;
        if (list instanceof x) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.u();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.u();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Long.valueOf(this.a.u()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void i(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.p();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.p();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.p()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Integer.valueOf(this.a.p()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int j() {
        V(0);
        return this.a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int k() {
        V(0);
        return this.a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void l(List list) {
        int B;
        if (list instanceof e) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.m();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.m();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.m()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Boolean.valueOf(this.a.m()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void m(List list) {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public ByteString n() {
        V(2);
        return this.a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int o() {
        V(0);
        return this.a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int p() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void q(List list) {
        int B;
        if (list instanceof x) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 1) {
                this.a.r();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.a.C());
            this.a.d();
            this.a.r();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.r()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C = this.a.C();
        X(C);
        int d = this.a.d() + C;
        do {
            list.add(Long.valueOf(this.a.r()));
        } while (this.a.d() < d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void r(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.x();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.x();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.x()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Integer.valueOf(this.a.x()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public double readDouble() {
        V(1);
        return this.a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public float readFloat() {
        V(5);
        return this.a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public long s() {
        V(0);
        return this.a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void t(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.C();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.C();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.C()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Integer.valueOf(this.a.C()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public int u() {
        V(5);
        return this.a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void v(List list) {
        int B;
        if (list instanceof x) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 1) {
                this.a.w();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            X(this.a.C());
            this.a.d();
            this.a.w();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.w()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int C = this.a.C();
        X(C);
        int d = this.a.d() + C;
        do {
            list.add(Long.valueOf(this.a.w()));
        } while (this.a.d() < d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void w(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b == 0) {
                this.a.t();
                throw null;
            }
            if (b != 2) {
                throw InvalidProtocolBufferException.d();
            }
            this.a.C();
            this.a.d();
            this.a.t();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.t()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        if (b2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int d = this.a.d() + this.a.C();
        do {
            list.add(Integer.valueOf(this.a.t()));
        } while (this.a.d() < d);
        U(d);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public void x(List list) {
        int B;
        if (list instanceof s) {
            lh4.a(list);
            int b = WireFormat.b(this.b);
            if (b != 2) {
                if (b != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                this.a.q();
                throw null;
            }
            W(this.a.C());
            this.a.d();
            this.a.q();
            throw null;
        }
        int b2 = WireFormat.b(this.b);
        if (b2 == 2) {
            int C = this.a.C();
            W(C);
            int d = this.a.d() + C;
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.d() < d);
            return;
        }
        if (b2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.q()));
            if (this.a.e()) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public long y() {
        V(0);
        return this.a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public String z() {
        V(2);
        return this.a.z();
    }
}
