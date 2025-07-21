package defpackage;

import defpackage.hk7;
import kotlin.KotlinNothingValueException;
import kotlin.text.h;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.JsonTreeReader;
import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes5.dex */
public class s38 extends kotlinx.serialization.encoding.a implements lt3 {
    private final at3 a;
    private final WriteMode b;
    public final g1 c;
    private final uk7 d;
    private int e;
    private a f;
    private final gt3 g;
    private final JsonElementMarker h;

    public static final class a {
        public String a;

        public a(String str) {
            this.a = str;
        }
    }

    public /* synthetic */ class b {
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
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public s38(at3 at3Var, WriteMode writeMode, g1 g1Var, SerialDescriptor serialDescriptor, a aVar) {
        zq3.h(at3Var, "json");
        zq3.h(writeMode, "mode");
        zq3.h(g1Var, "lexer");
        zq3.h(serialDescriptor, "descriptor");
        this.a = at3Var;
        this.b = writeMode;
        this.c = g1Var;
        this.d = at3Var.a();
        this.e = -1;
        this.f = aVar;
        gt3 e = at3Var.e();
        this.g = e;
        this.h = e.g() ? null : new JsonElementMarker(serialDescriptor);
    }

    private final void K() {
        if (this.c.I() != 4) {
            return;
        }
        g1.z(this.c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean L(SerialDescriptor serialDescriptor, int i) {
        String J;
        at3 at3Var = this.a;
        SerialDescriptor h = serialDescriptor.h(i);
        if (!h.b() && this.c.Q(true)) {
            return true;
        }
        if (!zq3.c(h.d(), hk7.b.a) || ((h.b() && this.c.Q(false)) || (J = this.c.J(this.g.n())) == null || JsonNamesMapKt.h(h, at3Var, J) != -3)) {
            return false;
        }
        this.c.q();
        return true;
    }

    private final int M() {
        boolean P = this.c.P();
        if (!this.c.f()) {
            if (!P) {
                return -1;
            }
            g1.z(this.c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = this.e;
        if (i != -1 && !P) {
            g1.z(this.c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = i + 1;
        this.e = i2;
        return i2;
    }

    private final int N() {
        int i;
        int i2;
        int i3 = this.e;
        boolean z = false;
        boolean z2 = i3 % 2 != 0;
        if (!z2) {
            this.c.n(':');
        } else if (i3 != -1) {
            z = this.c.P();
        }
        if (!this.c.f()) {
            if (!z) {
                return -1;
            }
            g1.z(this.c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (this.e == -1) {
                g1 g1Var = this.c;
                i2 = g1Var.a;
                if (z) {
                    g1.z(g1Var, "Unexpected trailing comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                g1 g1Var2 = this.c;
                i = g1Var2.a;
                if (!z) {
                    g1.z(g1Var2, "Expected comma after the key-value pair", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i4 = this.e + 1;
        this.e = i4;
        return i4;
    }

    private final int O(SerialDescriptor serialDescriptor) {
        boolean z;
        boolean P = this.c.P();
        while (this.c.f()) {
            String P2 = P();
            this.c.n(':');
            int h = JsonNamesMapKt.h(serialDescriptor, this.a, P2);
            boolean z2 = false;
            if (h == -3) {
                z2 = true;
                z = false;
            } else {
                if (!this.g.d() || !L(serialDescriptor, h)) {
                    JsonElementMarker jsonElementMarker = this.h;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.c(h);
                    }
                    return h;
                }
                z = this.c.P();
            }
            P = z2 ? Q(P2) : z;
        }
        if (P) {
            g1.z(this.c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        JsonElementMarker jsonElementMarker2 = this.h;
        if (jsonElementMarker2 != null) {
            return jsonElementMarker2.d();
        }
        return -1;
    }

    private final String P() {
        return this.g.n() ? this.c.t() : this.c.k();
    }

    private final boolean Q(String str) {
        if (this.g.h() || S(this.f, str)) {
            this.c.L(this.g.n());
        } else {
            this.c.C(str);
        }
        return this.c.P();
    }

    private final void R(SerialDescriptor serialDescriptor) {
        while (o(serialDescriptor) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !zq3.c(aVar.a, str)) {
            return false;
        }
        aVar.a = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public String A() {
        return this.g.n() ? this.c.t() : this.c.q();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        JsonElementMarker jsonElementMarker = this.h;
        return ((jsonElementMarker != null ? jsonElementMarker.b() : false) || g1.R(this.c, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public byte H() {
        long o = this.c.o();
        byte b2 = (byte) o;
        if (o == b2) {
            return b2;
        }
        g1.z(this.c, "Failed to parse byte for input '" + o + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.c
    public uk7 a() {
        return this.d;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public c b(SerialDescriptor serialDescriptor) {
        s38 s38Var;
        zq3.h(serialDescriptor, "descriptor");
        WriteMode b2 = nl9.b(this.a, serialDescriptor);
        this.c.b.c(serialDescriptor);
        this.c.n(b2.begin);
        K();
        int i = b.a[b2.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            s38Var = new s38(this.a, b2, this.c, serialDescriptor, this.f);
        } else {
            if (this.b == b2 && this.a.e().g()) {
                return this;
            }
            s38Var = new s38(this.a, b2, this.c, serialDescriptor, this.f);
        }
        return s38Var;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        if (this.a.e().h() && serialDescriptor.e() == 0) {
            R(serialDescriptor);
        }
        this.c.n(this.b.end);
        this.c.b.b();
    }

    @Override // defpackage.lt3
    public final at3 d() {
        return this.a;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int e(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "enumDescriptor");
        return JsonNamesMapKt.i(serialDescriptor, this.a, A(), " at path " + this.c.b.a());
    }

    @Override // defpackage.lt3
    public JsonElement h() {
        return new JsonTreeReader(this.a.e(), this.c).e();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int i() {
        long o = this.c.o();
        int i = (int) o;
        if (o == i) {
            return i;
        }
        g1.z(this.c, "Failed to parse int for input '" + o + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public Void k() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public long m() {
        return this.c.o();
    }

    @Override // kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        int i = b.a[this.b.ordinal()];
        int M = i != 2 ? i != 4 ? M() : O(serialDescriptor) : N();
        if (this.b != WriteMode.MAP) {
            this.c.b.g(M);
        }
        return M;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public Decoder q(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return u38.b(serialDescriptor) ? new mt3(this.c, this.a) : super.q(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public short s() {
        long o = this.c.o();
        short s = (short) o;
        if (o == s) {
            return s;
        }
        g1.z(this.c, "Failed to parse short for input '" + o + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public float t() {
        g1 g1Var = this.c;
        String s = g1Var.s();
        try {
            float parseFloat = Float.parseFloat(s);
            if (this.a.e().a() || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            qt3.j(this.c, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'float' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public double v() {
        g1 g1Var = this.c;
        String s = g1Var.s();
        try {
            double parseDouble = Double.parseDouble(s);
            if (this.a.e().a() || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            qt3.j(this.c, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            g1.z(g1Var, "Failed to parse type 'double' for input '" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean w() {
        return this.g.n() ? this.c.i() : this.c.g();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public char x() {
        String s = this.c.s();
        if (s.length() == 1) {
            return s.charAt(0);
        }
        g1.z(this.c, "Expected single char, but got '" + s + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public Object y(SerialDescriptor serialDescriptor, int i, ym1 ym1Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(ym1Var, "deserializer");
        boolean z = this.b == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            this.c.b.d();
        }
        Object y = super.y(serialDescriptor, i, ym1Var, obj);
        if (z) {
            this.c.b.f(y);
        }
        return y;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public Object z(ym1 ym1Var) {
        zq3.h(ym1Var, "deserializer");
        try {
            if ((ym1Var instanceof t1) && !this.a.e().m()) {
                String c = iz5.c(ym1Var.getDescriptor(), this.a);
                String H = this.c.H(c, this.g.n());
                ym1 c2 = H != null ? ((t1) ym1Var).c(this, H) : null;
                if (c2 == null) {
                    return iz5.d(this, ym1Var);
                }
                this.f = new a(c);
                return c2.deserialize(this);
            }
            return ym1Var.deserialize(this);
        } catch (MissingFieldException e) {
            String message = e.getMessage();
            zq3.e(message);
            if (h.P(message, "at path", false, 2, null)) {
                throw e;
            }
            throw new MissingFieldException(e.a(), e.getMessage() + " at path: " + this.c.b.a(), e);
        }
    }
}
