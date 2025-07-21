package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
class y0 extends w0 {
    y0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public x0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(x0 x0Var) {
        return x0Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(x0 x0Var) {
        return x0Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public x0 k(x0 x0Var, x0 x0Var2) {
        return x0Var2.equals(x0.e()) ? x0Var : x0.k(x0Var, x0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public x0 n() {
        return x0.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, x0 x0Var) {
        p(obj, x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, x0 x0Var) {
        ((GeneratedMessageLite) obj).unknownFields = x0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public x0 r(x0 x0Var) {
        x0Var.j();
        return x0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(x0 x0Var, Writer writer) {
        x0Var.o(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(x0 x0Var, Writer writer) {
        x0Var.q(writer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    void j(Object obj) {
        g(obj).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w0
    boolean q(q0 q0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(x0 x0Var, int i, int i2) {
        x0Var.n(WireFormat.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(x0 x0Var, int i, long j) {
        x0Var.n(WireFormat.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(x0 x0Var, int i, x0 x0Var2) {
        x0Var.n(WireFormat.c(i, 3), x0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(x0 x0Var, int i, ByteString byteString) {
        x0Var.n(WireFormat.c(i, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(x0 x0Var, int i, long j) {
        x0Var.n(WireFormat.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.w0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public x0 f(Object obj) {
        x0 g = g(obj);
        if (g != x0.e()) {
            return g;
        }
        x0 l = x0.l();
        p(obj, l);
        return l;
    }
}
