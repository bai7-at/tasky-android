package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ug5 implements h8 {
    public static final ug5 a = new ug5();
    private static final List b = i.e("messageSelectionMessageCaps");

    private ug5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public sg5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(tg5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new sg5(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, sg5 sg5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(sg5Var, "value");
        lu3Var.name("messageSelectionMessageCaps");
        j8.b(j8.a(j8.b(j8.d(tg5.a, false, 1, null)))).toJson(lu3Var, w41Var, sg5Var.a());
    }
}
