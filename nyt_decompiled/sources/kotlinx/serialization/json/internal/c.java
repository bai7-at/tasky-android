package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.zq3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
final class c extends a {
    private final JsonElement f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(at3 at3Var, JsonElement jsonElement) {
        super(at3Var, jsonElement, null);
        zq3.h(at3Var, "json");
        zq3.h(jsonElement, "value");
        this.f = jsonElement;
        X("primitive");
    }

    @Override // kotlinx.serialization.json.internal.a
    protected JsonElement e0(String str) {
        zq3.h(str, "tag");
        if (str == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // kotlinx.serialization.encoding.c
    public int o(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.a
    public JsonElement s0() {
        return this.f;
    }
}
