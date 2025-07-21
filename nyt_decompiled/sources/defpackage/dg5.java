package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;
import defpackage.cg5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class dg5 implements h8 {
    public static final dg5 a = new dg5();
    private static final List b = i.e("value");

    private dg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue = null;
        while (jsonReader.l1(b) == 0) {
            acceptableTrackersDirectiveValue = (AcceptableTrackersDirectiveValue) j8.b(n2.a).fromJson(jsonReader, w41Var);
        }
        return new cg5.a(acceptableTrackersDirectiveValue);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("value");
        j8.b(n2.a).toJson(lu3Var, w41Var, aVar.a());
    }
}
