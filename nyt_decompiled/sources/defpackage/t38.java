package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.b;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes5.dex */
public final class t38 extends b implements pt3 {
    private final ms0 a;
    private final at3 b;
    private final WriteMode c;
    private final pt3[] d;
    private final uk7 e;
    private final gt3 f;
    private boolean g;
    private String h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public t38(ms0 ms0Var, at3 at3Var, WriteMode writeMode, pt3[] pt3VarArr) {
        zq3.h(ms0Var, "composer");
        zq3.h(at3Var, "json");
        zq3.h(writeMode, "mode");
        this.a = ms0Var;
        this.b = at3Var;
        this.c = writeMode;
        this.d = pt3VarArr;
        this.e = d().a();
        this.f = d().e();
        int ordinal = writeMode.ordinal();
        if (pt3VarArr != null) {
            pt3 pt3Var = pt3VarArr[ordinal];
            if (pt3Var == null && pt3Var == this) {
                return;
            }
            pt3VarArr[ordinal] = this;
        }
    }

    private final void K(SerialDescriptor serialDescriptor) {
        this.a.c();
        String str = this.h;
        zq3.e(str);
        G(str);
        this.a.e(':');
        this.a.o();
        G(serialDescriptor.i());
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public boolean A(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return this.f.f();
    }

    @Override // defpackage.pt3
    public void B(JsonElement jsonElement) {
        zq3.h(jsonElement, "element");
        t(JsonElementSerializer.a, jsonElement);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void C(int i) {
        if (this.g) {
            G(String.valueOf(i));
        } else {
            this.a.h(i);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void G(String str) {
        zq3.h(str, "value");
        this.a.m(str);
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean H(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        int i2 = a.a[this.c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.a.a()) {
                        this.a.e(',');
                    }
                    this.a.c();
                    G(JsonNamesMapKt.g(serialDescriptor, d(), i));
                    this.a.e(':');
                    this.a.o();
                } else {
                    if (i == 0) {
                        this.g = true;
                    }
                    if (i == 1) {
                        this.a.e(',');
                        this.a.o();
                        this.g = false;
                    }
                }
            } else if (this.a.a()) {
                this.g = true;
                this.a.c();
            } else {
                if (i % 2 == 0) {
                    this.a.e(',');
                    this.a.c();
                    z = true;
                } else {
                    this.a.e(':');
                    this.a.o();
                }
                this.g = z;
            }
        } else {
            if (!this.a.a()) {
                this.a.e(',');
            }
            this.a.c();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public uk7 a() {
        return this.e;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public d b(SerialDescriptor serialDescriptor) {
        pt3 pt3Var;
        zq3.h(serialDescriptor, "descriptor");
        WriteMode b = nl9.b(d(), serialDescriptor);
        char c = b.begin;
        if (c != 0) {
            this.a.e(c);
            this.a.b();
        }
        if (this.h != null) {
            K(serialDescriptor);
            this.h = null;
        }
        if (this.c == b) {
            return this;
        }
        pt3[] pt3VarArr = this.d;
        return (pt3VarArr == null || (pt3Var = pt3VarArr[b.ordinal()]) == null) ? new t38(this.a, d(), b, this.d) : pt3Var;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        if (this.c.end != 0) {
            this.a.p();
            this.a.c();
            this.a.e(this.c.end);
        }
    }

    @Override // defpackage.pt3
    public at3 d() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void f(double d) {
        if (this.g) {
            G(String.valueOf(d));
        } else {
            this.a.f(d);
        }
        if (this.f.a()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw qt3.b(Double.valueOf(d), this.a.a.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void g(byte b) {
        if (this.g) {
            G(String.valueOf((int) b));
        } else {
            this.a.d(b);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void i(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "enumDescriptor");
        G(serialDescriptor.f(i));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        if (u38.b(serialDescriptor)) {
            ms0 ms0Var = this.a;
            if (!(ms0Var instanceof ps0)) {
                ms0Var = new ps0(ms0Var.a, this.g);
            }
            return new t38(ms0Var, d(), this.c, (pt3[]) null);
        }
        if (!u38.a(serialDescriptor)) {
            return super.j(serialDescriptor);
        }
        ms0 ms0Var2 = this.a;
        if (!(ms0Var2 instanceof os0)) {
            ms0Var2 = new os0(ms0Var2.a, this.g);
        }
        return new t38(ms0Var2, d(), this.c, (pt3[]) null);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void k(long j) {
        if (this.g) {
            G(String.valueOf(j));
        } else {
            this.a.i(j);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public void l(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(nk7Var, "serializer");
        if (obj != null || this.f.g()) {
            super.l(serialDescriptor, i, nk7Var, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void n() {
        this.a.j(Constants.NULL_VERSION_ID);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void p(short s) {
        if (this.g) {
            G(String.valueOf((int) s));
        } else {
            this.a.k(s);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void q(boolean z) {
        if (this.g) {
            G(String.valueOf(z));
        } else {
            this.a.l(z);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void s(float f) {
        if (this.g) {
            G(String.valueOf(f));
        } else {
            this.a.g(f);
        }
        if (this.f.a()) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw qt3.b(Float.valueOf(f), this.a.a.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void t(nk7 nk7Var, Object obj) {
        zq3.h(nk7Var, "serializer");
        if (!(nk7Var instanceof t1) || d().e().m()) {
            nk7Var.serialize(this, obj);
            return;
        }
        t1 t1Var = (t1) nk7Var;
        String c = iz5.c(nk7Var.getDescriptor(), d());
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Any");
        nk7 b = jz5.b(t1Var, this, obj);
        iz5.f(t1Var, b, c);
        iz5.b(b.getDescriptor().d());
        this.h = c;
        b.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void u(char c) {
        G(String.valueOf(c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t38(ku3 ku3Var, at3 at3Var, WriteMode writeMode, pt3[] pt3VarArr) {
        this(rs0.a(ku3Var, at3Var), at3Var, writeMode, pt3VarArr);
        zq3.h(ku3Var, "output");
        zq3.h(at3Var, "json");
        zq3.h(writeMode, "mode");
        zq3.h(pt3VarArr, "modeReuseCache");
    }
}
