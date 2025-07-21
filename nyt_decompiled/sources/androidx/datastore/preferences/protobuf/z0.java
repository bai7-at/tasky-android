package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class z0 extends x0 {
    z0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public y0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(y0 y0Var) {
        return y0Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(y0 y0Var) {
        return y0Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public y0 k(y0 y0Var, y0 y0Var2) {
        return y0Var2.equals(y0.e()) ? y0Var : y0.k(y0Var, y0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public y0 n() {
        return y0.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, y0 y0Var) {
        p(obj, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, y0 y0Var) {
        ((GeneratedMessageLite) obj).unknownFields = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public y0 r(y0 y0Var) {
        y0Var.j();
        return y0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(y0 y0Var, Writer writer) {
        y0Var.o(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(y0 y0Var, Writer writer) {
        y0Var.q(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    boolean q(q0 q0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(y0 y0Var, int i, int i2) {
        y0Var.n(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(y0 y0Var, int i, long j) {
        y0Var.n(WireFormat.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(y0 y0Var, int i, y0 y0Var2) {
        y0Var.n(WireFormat.c(i, 3), y0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(y0 y0Var, int i, ByteString byteString) {
        y0Var.n(WireFormat.c(i, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(y0 y0Var, int i, long j) {
        y0Var.n(WireFormat.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.x0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public y0 f(Object obj) {
        y0 g = g(obj);
        if (g != y0.e()) {
            return g;
        }
        y0 l = y0.l();
        p(obj, l);
        return l;
    }
}
