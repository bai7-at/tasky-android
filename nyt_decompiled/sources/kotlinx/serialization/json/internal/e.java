package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.du3;
import defpackage.hk7;
import defpackage.hz5;
import defpackage.nt3;
import defpackage.qt3;
import defpackage.st3;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
class e extends a {
    private final JsonObject f;
    private final String g;
    private final SerialDescriptor h;
    private int i;
    private boolean j;

    public /* synthetic */ e(at3 at3Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(at3Var, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean u0(SerialDescriptor serialDescriptor, int i) {
        boolean z = (d().e().g() || serialDescriptor.j(i) || !serialDescriptor.h(i).b()) ? false : true;
        this.j = z;
        return z;
    }

    private final boolean v0(SerialDescriptor serialDescriptor, int i, String str) {
        at3 d = d();
        SerialDescriptor h = serialDescriptor.h(i);
        if (!h.b() && (e0(str) instanceof JsonNull)) {
            return true;
        }
        if (zq3.c(h.d(), hk7.b.a) && (!h.b() || !(e0(str) instanceof JsonNull))) {
            JsonElement e0 = e0(str);
            JsonPrimitive jsonPrimitive = e0 instanceof JsonPrimitive ? (JsonPrimitive) e0 : null;
            String f = jsonPrimitive != null ? nt3.f(jsonPrimitive) : null;
            if (f != null && JsonNamesMapKt.h(h, d, f) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.a, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return !this.j && super.E();
    }

    @Override // defpackage.n15
    protected String a0(SerialDescriptor serialDescriptor, int i) {
        Object obj;
        zq3.h(serialDescriptor, "descriptor");
        JsonNamesMapKt.l(serialDescriptor, d());
        String f = serialDescriptor.f(i);
        if (!this.e.l() || s0().keySet().contains(f)) {
            return f;
        }
        Map e = JsonNamesMapKt.e(d(), serialDescriptor);
        Iterator<T> it2 = s0().keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Integer num = (Integer) e.get((String) obj);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : f;
    }

    @Override // kotlinx.serialization.json.internal.a, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.c b(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        if (serialDescriptor != this.h) {
            return super.b(serialDescriptor);
        }
        at3 d = d();
        JsonElement f0 = f0();
        SerialDescriptor serialDescriptor2 = this.h;
        if (f0 instanceof JsonObject) {
            return new e(d, (JsonObject) f0, this.g, serialDescriptor2);
        }
        throw qt3.e(-1, "Expected " + zt6.b(JsonObject.class) + " as the serialized body of " + serialDescriptor2.i() + ", but had " + zt6.b(f0.getClass()));
    }

    @Override // kotlinx.serialization.json.internal.a, kotlinx.serialization.encoding.c
    public void c(SerialDescriptor serialDescriptor) {
        Set m;
        zq3.h(serialDescriptor, "descriptor");
        if (this.e.h() || (serialDescriptor.d() instanceof hz5)) {
            return;
        }
        JsonNamesMapKt.l(serialDescriptor, d());
        if (this.e.l()) {
            Set a = st3.a(serialDescriptor);
            Map map = (Map) du3.a(d()).a(serialDescriptor, JsonNamesMapKt.f());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = b0.e();
            }
            m = b0.m(a, keySet);
        } else {
            m = st3.a(serialDescriptor);
        }
        for (String str : s0().keySet()) {
            if (!m.contains(str) && !zq3.c(str, this.g)) {
                throw qt3.g(str, s0().toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.a
    protected JsonElement e0(String str) {
        zq3.h(str, "tag");
        return (JsonElement) t.j(s0(), str);
    }

    @Override // kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        while (this.i < serialDescriptor.e()) {
            int i = this.i;
            this.i = i + 1;
            String V = V(serialDescriptor, i);
            int i2 = this.i - 1;
            this.j = false;
            if (s0().containsKey(V) || u0(serialDescriptor, i2)) {
                if (!this.e.d() || !v0(serialDescriptor, i2, V)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.a
    /* renamed from: w0 */
    public JsonObject s0() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(at3 at3Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(at3Var, jsonObject, null);
        zq3.h(at3Var, "json");
        zq3.h(jsonObject, "value");
        this.f = jsonObject;
        this.g = str;
        this.h = serialDescriptor;
    }
}
