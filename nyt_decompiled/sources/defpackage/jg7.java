package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fg7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class jg7 implements h8 {
    public static final jg7 a = new jg7();
    private static final List b = i.e("edges");

    private jg7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fg7.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(hg7.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new fg7.e(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fg7.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(hg7.a, false, 1, null)))).toJson(lu3Var, w41Var, eVar.a());
    }
}
