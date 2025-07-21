package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.aw8;
import defpackage.gt3;
import defpackage.hk7;
import defpackage.hv8;
import defpackage.hz5;
import defpackage.iz5;
import defpackage.jz5;
import defpackage.lv8;
import defpackage.nk7;
import defpackage.nl9;
import defpackage.nt3;
import defpackage.o15;
import defpackage.pt3;
import defpackage.pv8;
import defpackage.qt3;
import defpackage.r26;
import defpackage.ss2;
import defpackage.t1;
import defpackage.u38;
import defpackage.uk7;
import defpackage.ut3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes5.dex */
abstract class AbstractJsonTreeEncoder extends o15 implements pt3 {
    private final at3 b;
    private final ss2 c;
    protected final gt3 d;
    private String e;

    public static final class a extends kotlinx.serialization.encoding.b {
        final /* synthetic */ String b;
        final /* synthetic */ SerialDescriptor c;

        a(String str, SerialDescriptor serialDescriptor) {
            this.b = str;
            this.c = serialDescriptor;
        }

        @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
        public void G(String str) {
            zq3.h(str, "value");
            AbstractJsonTreeEncoder.this.v0(this.b, new ut3(str, false, this.c));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public uk7 a() {
            return AbstractJsonTreeEncoder.this.d().a();
        }
    }

    public static final class b extends kotlinx.serialization.encoding.b {
        private final uk7 a;
        final /* synthetic */ String c;

        b(String str) {
            this.c = str;
            this.a = AbstractJsonTreeEncoder.this.d().a();
        }

        @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
        public void C(int i) {
            K(Integer.toUnsignedString(lv8.b(i)));
        }

        public final void K(String str) {
            zq3.h(str, "s");
            AbstractJsonTreeEncoder.this.v0(this.c, new ut3(str, false, null, 4, null));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public uk7 a() {
            return this.a;
        }

        @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
        public void g(byte b) {
            K(hv8.e(hv8.b(b)));
        }

        @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
        public void k(long j) {
            K(Long.toUnsignedString(pv8.b(j)));
        }

        @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
        public void p(short s) {
            K(aw8.e(aw8.b(s)));
        }
    }

    public /* synthetic */ AbstractJsonTreeEncoder(at3 at3Var, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(at3Var, ss2Var);
    }

    public static final /* synthetic */ String e0(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        return (String) abstractJsonTreeEncoder.V();
    }

    private final a t0(String str, SerialDescriptor serialDescriptor) {
        return new a(str, serialDescriptor);
    }

    private final b u0(String str) {
        return new b(str);
    }

    @Override // kotlinx.serialization.encoding.d
    public boolean A(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return this.d.f();
    }

    @Override // defpackage.pt3
    public void B(JsonElement jsonElement) {
        zq3.h(jsonElement, "element");
        t(JsonElementSerializer.a, jsonElement);
    }

    @Override // defpackage.xf8
    protected void U(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        this.c.invoke(r0());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final uk7 a() {
        return this.b.a();
    }

    @Override // defpackage.o15
    protected String a0(String str, String str2) {
        zq3.h(str, "parentName");
        zq3.h(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.d b(SerialDescriptor serialDescriptor) {
        AbstractJsonTreeEncoder fVar;
        zq3.h(serialDescriptor, "descriptor");
        ss2 ss2Var = W() == null ? this.c : new ss2() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
            {
                super(1);
            }

            public final void b(JsonElement jsonElement) {
                zq3.h(jsonElement, "node");
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = AbstractJsonTreeEncoder.this;
                abstractJsonTreeEncoder.v0(AbstractJsonTreeEncoder.e0(abstractJsonTreeEncoder), jsonElement);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((JsonElement) obj);
                return ww8.a;
            }
        };
        hk7 d = serialDescriptor.d();
        if (zq3.c(d, a.b.a) ? true : d instanceof hz5) {
            fVar = new h(this.b, ss2Var);
        } else if (zq3.c(d, a.c.a)) {
            at3 at3Var = this.b;
            SerialDescriptor a2 = nl9.a(serialDescriptor.h(0), at3Var.a());
            hk7 d2 = a2.d();
            if ((d2 instanceof r26) || zq3.c(d2, hk7.b.a)) {
                fVar = new j(this.b, ss2Var);
            } else {
                if (!at3Var.e().b()) {
                    throw qt3.d(a2);
                }
                fVar = new h(this.b, ss2Var);
            }
        } else {
            fVar = new f(this.b, ss2Var);
        }
        String str = this.e;
        if (str != null) {
            zq3.e(str);
            fVar.v0(str, nt3.c(serialDescriptor.i()));
            this.e = null;
        }
        return fVar;
    }

    @Override // defpackage.o15
    protected String b0(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return JsonNamesMapKt.g(serialDescriptor, this.b, i);
    }

    @Override // defpackage.pt3
    public final at3 d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void J(String str, boolean z) {
        zq3.h(str, "tag");
        v0(str, nt3.a(Boolean.valueOf(z)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void K(String str, byte b2) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Byte.valueOf(b2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void L(String str, char c) {
        zq3.h(str, "tag");
        v0(str, nt3.c(String.valueOf(c)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void M(String str, double d) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Double.valueOf(d)));
        if (this.d.a()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw qt3.c(Double.valueOf(d), str, r0().toString());
        }
    }

    @Override // defpackage.xf8, kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return W() != null ? super.j(serialDescriptor) : new d(this.b, this.c).j(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void N(String str, SerialDescriptor serialDescriptor, int i) {
        zq3.h(str, "tag");
        zq3.h(serialDescriptor, "enumDescriptor");
        v0(str, nt3.c(serialDescriptor.f(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void O(String str, float f) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Float.valueOf(f)));
        if (this.d.a()) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw qt3.c(Float.valueOf(f), str, r0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public Encoder P(String str, SerialDescriptor serialDescriptor) {
        zq3.h(str, "tag");
        zq3.h(serialDescriptor, "inlineDescriptor");
        return u38.b(serialDescriptor) ? u0(str) : u38.a(serialDescriptor) ? t0(str, serialDescriptor) : super.P(str, serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void Q(String str, int i) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n() {
        String str = (String) W();
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            o0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void R(String str, long j) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Long.valueOf(j)));
    }

    protected void o0(String str) {
        zq3.h(str, "tag");
        v0(str, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void S(String str, short s) {
        zq3.h(str, "tag");
        v0(str, nt3.b(Short.valueOf(s)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xf8
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void T(String str, String str2) {
        zq3.h(str, "tag");
        zq3.h(str2, "value");
        v0(str, nt3.c(str2));
    }

    public abstract JsonElement r0();

    protected final ss2 s0() {
        return this.c;
    }

    @Override // defpackage.xf8, kotlinx.serialization.encoding.Encoder
    public void t(nk7 nk7Var, Object obj) {
        boolean b2;
        zq3.h(nk7Var, "serializer");
        if (W() == null) {
            b2 = TreeJsonEncoderKt.b(nl9.a(nk7Var.getDescriptor(), a()));
            if (b2) {
                new d(this.b, this.c).t(nk7Var, obj);
                return;
            }
        }
        if (!(nk7Var instanceof t1) || d().e().m()) {
            nk7Var.serialize(this, obj);
            return;
        }
        t1 t1Var = (t1) nk7Var;
        String c = iz5.c(nk7Var.getDescriptor(), d());
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Any");
        nk7 b3 = jz5.b(t1Var, this, obj);
        iz5.f(t1Var, b3, c);
        iz5.b(b3.getDescriptor().d());
        this.e = c;
        b3.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v() {
    }

    public abstract void v0(String str, JsonElement jsonElement);

    private AbstractJsonTreeEncoder(at3 at3Var, ss2 ss2Var) {
        this.b = at3Var;
        this.c = ss2Var;
        this.d = at3Var.e();
    }
}
