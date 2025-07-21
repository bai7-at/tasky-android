package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class i0 implements r0 {
    private final f0 a;
    private final w0 b;
    private final boolean c;
    private final n d;

    private i0(w0 w0Var, n nVar, f0 f0Var) {
        this.b = w0Var;
        this.c = nVar.e(f0Var);
        this.d = nVar;
        this.a = f0Var;
    }

    private int k(w0 w0Var, Object obj) {
        return w0Var.i(w0Var.g(obj));
    }

    private void l(w0 w0Var, n nVar, Object obj, q0 q0Var, m mVar) {
        Object f = w0Var.f(obj);
        q d = nVar.d(obj);
        do {
            try {
                if (q0Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                w0Var.o(obj, f);
            }
        } while (n(q0Var, mVar, nVar, d, w0Var, f));
    }

    static i0 m(w0 w0Var, n nVar, f0 f0Var) {
        return new i0(w0Var, nVar, f0Var);
    }

    private boolean n(q0 q0Var, m mVar, n nVar, q qVar, w0 w0Var, Object obj) {
        int p = q0Var.p();
        if (p != WireFormat.a) {
            if (WireFormat.b(p) != 2) {
                return q0Var.D();
            }
            Object b = nVar.b(mVar, this.a, WireFormat.a(p));
            if (b == null) {
                return w0Var.m(obj, q0Var);
            }
            nVar.h(q0Var, b, mVar, qVar);
            return true;
        }
        Object obj2 = null;
        int i = 0;
        ByteString byteString = null;
        while (q0Var.A() != Integer.MAX_VALUE) {
            int p2 = q0Var.p();
            if (p2 == WireFormat.c) {
                i = q0Var.g();
                obj2 = nVar.b(mVar, this.a, i);
            } else if (p2 == WireFormat.d) {
                if (obj2 != null) {
                    nVar.h(q0Var, obj2, mVar, qVar);
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
                nVar.i(byteString, obj2, mVar, qVar);
            } else {
                w0Var.d(obj, i, byteString);
            }
        }
        return true;
    }

    private void o(w0 w0Var, Object obj, Writer writer) {
        w0Var.s(w0Var.g(obj), writer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(Object obj, Object obj2) {
        t0.F(this.b, obj, obj2);
        if (this.c) {
            t0.D(this.d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void b(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean c(Object obj) {
        return this.d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int d(Object obj) {
        int k = k(this.b, obj);
        return this.c ? k + this.d.c(obj).b() : k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public Object e() {
        return this.a.c().j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int f(Object obj) {
        int hashCode = this.b.g(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.c(obj).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public boolean g(Object obj, Object obj2) {
        if (!this.b.g(obj).equals(this.b.g(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(obj).equals(this.d.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void h(Object obj, byte[] bArr, int i, int i2, e.a aVar) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        if (generatedMessageLite.unknownFields == x0.e()) {
            generatedMessageLite.unknownFields = x0.l();
        }
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void i(Object obj, q0 q0Var, m mVar) {
        l(this.b, this.d, obj, q0Var, mVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void j(Object obj, Writer writer) {
        Iterator f = this.d.c(obj).f();
        if (f.hasNext()) {
            lh4.a(((Map.Entry) f.next()).getKey());
            throw null;
        }
        o(this.b, obj, writer);
    }
}
