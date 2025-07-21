package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.f48;
import defpackage.gt3;
import defpackage.hk7;
import defpackage.hz5;
import defpackage.iz5;
import defpackage.lt3;
import defpackage.mt3;
import defpackage.n15;
import defpackage.nl9;
import defpackage.nt3;
import defpackage.qt3;
import defpackage.r26;
import defpackage.u38;
import defpackage.uk7;
import defpackage.ut3;
import defpackage.ym1;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
abstract class a extends n15 implements lt3 {
    private final at3 c;
    private final JsonElement d;
    protected final gt3 e;

    public /* synthetic */ a(at3 at3Var, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(at3Var, jsonElement);
    }

    private final ut3 d0(JsonPrimitive jsonPrimitive, String str) {
        ut3 ut3Var = jsonPrimitive instanceof ut3 ? (ut3) jsonPrimitive : null;
        if (ut3Var != null) {
            return ut3Var;
        }
        throw qt3.e(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void t0(String str) {
        throw qt3.f(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return !(f0() instanceof JsonNull);
    }

    @Override // defpackage.n15
    protected String Z(String str, String str2) {
        zq3.h(str, "parentName");
        zq3.h(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.c
    public uk7 a() {
        return d().a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.c b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        JsonElement f0 = f0();
        hk7 d = serialDescriptor.d();
        if (zq3.c(d, a.b.a) ? true : d instanceof hz5) {
            at3 d2 = d();
            if (f0 instanceof JsonArray) {
                return new g(d2, (JsonArray) f0);
            }
            throw qt3.e(-1, "Expected " + zt6.b(JsonArray.class) + " as the serialized body of " + serialDescriptor.i() + ", but had " + zt6.b(f0.getClass()));
        }
        if (!zq3.c(d, a.c.a)) {
            at3 d3 = d();
            if (f0 instanceof JsonObject) {
                return new e(d3, (JsonObject) f0, null, null, 12, null);
            }
            throw qt3.e(-1, "Expected " + zt6.b(JsonObject.class) + " as the serialized body of " + serialDescriptor.i() + ", but had " + zt6.b(f0.getClass()));
        }
        at3 d4 = d();
        SerialDescriptor a = nl9.a(serialDescriptor.h(0), d4.a());
        hk7 d5 = a.d();
        if ((d5 instanceof r26) || zq3.c(d5, hk7.b.a)) {
            at3 d6 = d();
            if (f0 instanceof JsonObject) {
                return new i(d6, (JsonObject) f0);
            }
            throw qt3.e(-1, "Expected " + zt6.b(JsonObject.class) + " as the serialized body of " + serialDescriptor.i() + ", but had " + zt6.b(f0.getClass()));
        }
        if (!d4.e().b()) {
            throw qt3.d(a);
        }
        at3 d7 = d();
        if (f0 instanceof JsonArray) {
            return new g(d7, (JsonArray) f0);
        }
        throw qt3.e(-1, "Expected " + zt6.b(JsonArray.class) + " as the serialized body of " + serialDescriptor.i() + ", but had " + zt6.b(f0.getClass()));
    }

    @Override // kotlinx.serialization.encoding.c
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
    }

    @Override // defpackage.lt3
    public at3 d() {
        return this.c;
    }

    protected abstract JsonElement e0(String str);

    protected final JsonElement f0() {
        JsonElement e0;
        String str = (String) U();
        return (str == null || (e0 = e0(str)) == null) ? s0() : e0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String str) {
        zq3.h(str, "tag");
        JsonPrimitive r0 = r0(str);
        if (!d().e().n() && d0(r0, "boolean").f()) {
            throw qt3.f(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean e = nt3.e(r0);
            if (e != null) {
                return e.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.lt3
    public JsonElement h() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String str) {
        zq3.h(str, "tag");
        try {
            int i = nt3.i(r0(str));
            Byte valueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            t0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String str) {
        zq3.h(str, "tag");
        try {
            return kotlin.text.h.k1(r0(str).a());
        } catch (IllegalArgumentException unused) {
            this.t0("char");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String str) {
        zq3.h(str, "tag");
        try {
            double g = nt3.g(r0(str));
            if (d().e().a() || !(Double.isInfinite(g) || Double.isNaN(g))) {
                return g;
            }
            throw qt3.a(Double.valueOf(g), str, f0().toString());
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String str, SerialDescriptor serialDescriptor) {
        zq3.h(str, "tag");
        zq3.h(serialDescriptor, "enumDescriptor");
        return JsonNamesMapKt.j(serialDescriptor, d(), r0(str).a(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String str) {
        zq3.h(str, "tag");
        try {
            float h = nt3.h(r0(str));
            if (d().e().a() || !(Float.isInfinite(h) || Float.isNaN(h))) {
                return h;
            }
            throw qt3.a(Float.valueOf(h), str, f0().toString());
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Decoder P(String str, SerialDescriptor serialDescriptor) {
        zq3.h(str, "tag");
        zq3.h(serialDescriptor, "inlineDescriptor");
        return u38.b(serialDescriptor) ? new mt3(new f48(r0(str).a()), d()) : super.P(str, serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String str) {
        zq3.h(str, "tag");
        try {
            return nt3.i(r0(str));
        } catch (IllegalArgumentException unused) {
            this.t0("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String str) {
        zq3.h(str, "tag");
        try {
            return nt3.l(r0(str));
        } catch (IllegalArgumentException unused) {
            this.t0("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String str) {
        zq3.h(str, "tag");
        try {
            int i = nt3.i(r0(str));
            Short valueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            t0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder q(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return U() != null ? super.q(serialDescriptor) : new c(d(), s0()).q(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String str) {
        zq3.h(str, "tag");
        JsonPrimitive r0 = r0(str);
        if (d().e().n() || d0(r0, "string").f()) {
            if (r0 instanceof JsonNull) {
                throw qt3.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return r0.a();
        }
        throw qt3.f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
    }

    protected final JsonPrimitive r0(String str) {
        zq3.h(str, "tag");
        JsonElement e0 = e0(str);
        JsonPrimitive jsonPrimitive = e0 instanceof JsonPrimitive ? (JsonPrimitive) e0 : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw qt3.f(-1, "Expected JsonPrimitive at " + str + ", found " + e0, f0().toString());
    }

    public abstract JsonElement s0();

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Object z(ym1 ym1Var) {
        zq3.h(ym1Var, "deserializer");
        return iz5.d(this, ym1Var);
    }

    private a(at3 at3Var, JsonElement jsonElement) {
        this.c = at3Var;
        this.d = jsonElement;
        this.e = d().e();
    }
}
