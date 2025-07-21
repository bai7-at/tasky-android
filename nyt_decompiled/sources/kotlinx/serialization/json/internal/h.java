package kotlinx.serialization.json.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.at3;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
final class h extends AbstractJsonTreeEncoder {
    private final ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(at3 at3Var, ss2 ss2Var) {
        super(at3Var, ss2Var, null);
        zq3.h(at3Var, "json");
        zq3.h(ss2Var, "nodeConsumer");
        this.f = new ArrayList();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, defpackage.o15
    protected String b0(SerialDescriptor serialDescriptor, int i) {
        zq3.h(serialDescriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public JsonElement r0() {
        return new JsonArray(this.f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void v0(String str, JsonElement jsonElement) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(jsonElement, "element");
        this.f.add(Integer.parseInt(str), jsonElement);
    }
}
