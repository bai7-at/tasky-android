package kotlinx.serialization.json.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.at3;
import defpackage.au3;
import defpackage.ct3;
import defpackage.qt3;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
final class j extends f {
    private String g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(at3 at3Var, ss2 ss2Var) {
        super(at3Var, ss2Var);
        zq3.h(at3Var, "json");
        zq3.h(ss2Var, "nodeConsumer");
        this.h = true;
    }

    @Override // kotlinx.serialization.json.internal.f, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement r0() {
        return new JsonObject(w0());
    }

    @Override // kotlinx.serialization.json.internal.f, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, JsonElement jsonElement) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(jsonElement, "element");
        if (!this.h) {
            Map w0 = w0();
            String str2 = this.g;
            if (str2 == null) {
                zq3.z("tag");
                str2 = null;
            }
            w0.put(str2, jsonElement);
            this.h = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.g = ((JsonPrimitive) jsonElement).a();
            this.h = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw qt3.d(au3.a.getDescriptor());
            }
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw qt3.d(ct3.a.getDescriptor());
        }
    }
}
