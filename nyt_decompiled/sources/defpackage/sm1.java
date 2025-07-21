package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class sm1 implements h8 {
    public static final sm1 a = new sm1();
    private static final List b = i.o("__typename", "descendantAssets");

    private sm1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qm1 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = j8.a(j8.c(rm1.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new qm1(str, list);
        }
        vr.a(jsonReader, "descendantAssets");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, qm1 qm1Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(qm1Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, qm1Var.b());
        lu3Var.name("descendantAssets");
        j8.a(j8.c(rm1.a, true)).toJson(lu3Var, w41Var, qm1Var.a());
    }
}
