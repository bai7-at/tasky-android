package kotlinx.serialization.json.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.at3;
import defpackage.ss2;
import defpackage.zq3;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
final class d extends AbstractJsonTreeEncoder {
    private JsonElement f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(at3 at3Var, ss2 ss2Var) {
        super(at3Var, ss2Var, null);
        zq3.h(at3Var, "json");
        zq3.h(ss2Var, "nodeConsumer");
        Z("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement r0() {
        JsonElement jsonElement = this.f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, JsonElement jsonElement) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(jsonElement, "element");
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f = jsonElement;
        s0().invoke(jsonElement);
    }
}
