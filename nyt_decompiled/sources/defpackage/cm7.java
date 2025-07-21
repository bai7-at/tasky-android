package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.am7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cm7 implements h8 {
    public static final cm7 a = new cm7();
    private static final List b = i.o("userInterests", "optedOutInterests");

    private cm7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public am7.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        List list2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                list = j8.a(j8.k).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list2 = j8.a(j8.k).fromJson(jsonReader, w41Var);
            }
        }
        if (list == null) {
            vr.a(jsonReader, "userInterests");
            throw new KotlinNothingValueException();
        }
        if (list2 != null) {
            return new am7.c(list, list2);
        }
        vr.a(jsonReader, "optedOutInterests");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, am7.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("userInterests");
        ya5 ya5Var = j8.k;
        j8.a(ya5Var).toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("optedOutInterests");
        j8.a(ya5Var).toJson(lu3Var, w41Var, cVar.a());
    }
}
