package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class s54 implements h8 {
    private final h8 a;

    public s54(h8 h8Var) {
        zq3.h(h8Var, "wrappedAdapter");
        this.a = h8Var;
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(this.a.fromJson(jsonReader, w41Var));
        }
        jsonReader.endArray();
        return arrayList;
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, List list) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(list, "value");
        lu3Var.beginArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            this.a.toJson(lu3Var, w41Var, it2.next());
        }
        lu3Var.endArray();
    }
}
