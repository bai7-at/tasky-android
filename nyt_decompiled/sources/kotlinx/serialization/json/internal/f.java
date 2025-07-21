package kotlinx.serialization.json.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.at3;
import defpackage.nk7;
import defpackage.ss2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
class f extends AbstractJsonTreeEncoder {
    private final Map f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(at3 at3Var, ss2 ss2Var) {
        super(at3Var, ss2Var, null);
        zq3.h(at3Var, "json");
        zq3.h(ss2Var, "nodeConsumer");
        this.f = new LinkedHashMap();
    }

    @Override // defpackage.xf8, kotlinx.serialization.encoding.d
    public void l(SerialDescriptor serialDescriptor, int i, nk7 nk7Var, Object obj) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(nk7Var, "serializer");
        if (obj != null || this.d.g()) {
            super.l(serialDescriptor, i, nk7Var, obj);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement r0() {
        return new JsonObject(this.f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, JsonElement jsonElement) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(jsonElement, "element");
        this.f.put(str, jsonElement);
    }

    protected final Map w0() {
        return this.f;
    }
}
