package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.n59;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.Sensitivity;
import type.adapter.Sensitivity_ResponseAdapter;

/* loaded from: classes3.dex */
public final class p59 implements h8 {
    public static final p59 a = new p59();
    private static final List b = i.o("__typename", "sensitivity");

    private p59() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n59.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Sensitivity sensitivity = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                sensitivity = Sensitivity_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (sensitivity != null) {
            return new n59.b(str, sensitivity);
        }
        vr.a(jsonReader, "sensitivity");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, n59.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("sensitivity");
        Sensitivity_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, bVar.a());
    }
}
