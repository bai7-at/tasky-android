package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.nt3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
final class i extends e {
    private final JsonObject k;
    private final List l;
    private final int m;
    private int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(at3 at3Var, JsonObject jsonObject) {
        super(at3Var, jsonObject, null, null, 12, null);
        zq3.h(at3Var, "json");
        zq3.h(jsonObject, "value");
        this.k = jsonObject;
        List X0 = kotlin.collections.i.X0(s0().keySet());
        this.l = X0;
        this.m = X0.size() * 2;
        this.n = -1;
    }

    @Override // kotlinx.serialization.json.internal.e, defpackage.n15
    protected String a0(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return (String) this.l.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.json.internal.a, kotlinx.serialization.encoding.c
    public void c(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.json.internal.a
    protected JsonElement e0(String str) {
        zq3.h(str, "tag");
        return this.n % 2 == 0 ? nt3.c(str) : (JsonElement) t.j(s0(), str);
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        int i = this.n;
        if (i >= this.m - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.n = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.e, kotlinx.serialization.json.internal.a
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public JsonObject s0() {
        return this.k;
    }
}
