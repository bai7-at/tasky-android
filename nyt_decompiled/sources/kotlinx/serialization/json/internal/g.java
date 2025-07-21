package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
final class g extends a {
    private final JsonArray f;
    private final int g;
    private int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(at3 at3Var, JsonArray jsonArray) {
        super(at3Var, jsonArray, null);
        zq3.h(at3Var, "json");
        zq3.h(jsonArray, "value");
        this.f = jsonArray;
        this.g = s0().size();
        this.h = -1;
    }

    @Override // defpackage.n15
    protected String a0(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.a
    protected JsonElement e0(String str) {
        zq3.h(str, "tag");
        return s0().get(Integer.parseInt(str));
    }

    @Override // kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.a
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public JsonArray s0() {
        return this.f;
    }
}
