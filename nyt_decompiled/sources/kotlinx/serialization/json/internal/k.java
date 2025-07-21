package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.ut3;
import defpackage.ym1;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public abstract class k {
    public static final Object a(at3 at3Var, JsonElement jsonElement, ym1 ym1Var) {
        Decoder cVar;
        zq3.h(at3Var, "<this>");
        zq3.h(jsonElement, "element");
        zq3.h(ym1Var, "deserializer");
        if (jsonElement instanceof JsonObject) {
            cVar = new e(at3Var, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            cVar = new g(at3Var, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof ut3 ? true : zq3.c(jsonElement, JsonNull.INSTANCE))) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c(at3Var, (JsonPrimitive) jsonElement);
        }
        return cVar.z(ym1Var);
    }

    public static final Object b(at3 at3Var, String str, JsonObject jsonObject, ym1 ym1Var) {
        zq3.h(at3Var, "<this>");
        zq3.h(str, "discriminator");
        zq3.h(jsonObject, "element");
        zq3.h(ym1Var, "deserializer");
        return new e(at3Var, jsonObject, str, ym1Var.getDescriptor()).z(ym1Var);
    }
}
