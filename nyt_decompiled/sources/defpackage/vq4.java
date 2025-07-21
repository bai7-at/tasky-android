package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tq4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vq4 implements h8 {
    public static final vq4 a = new vq4();
    private static final List b = i.o("moduleName", "label");

    private vq4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tq4.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "moduleName");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new tq4.b(str, str2);
        }
        vr.a(jsonReader, "label");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tq4.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("moduleName");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("label");
        h8Var.toJson(lu3Var, w41Var, bVar.a());
    }
}
