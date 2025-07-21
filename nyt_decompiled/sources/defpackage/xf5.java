package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wf5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class xf5 implements h8 {
    public static final xf5 a = new xf5();
    private static final List b = i.e("userTcfData");

    private xf5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wf5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        wf5.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (wf5.a) j8.b(j8.d(yf5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new wf5(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wf5 wf5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(wf5Var, "value");
        lu3Var.name("userTcfData");
        j8.b(j8.d(yf5.a, false, 1, null)).toJson(lu3Var, w41Var, wf5Var.a());
    }
}
