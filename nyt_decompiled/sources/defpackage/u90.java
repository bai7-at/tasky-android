package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.o90;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class u90 implements h8 {
    public static final u90 a = new u90();
    private static final List b = i.o("__typename", "sellerName", "url");

    private u90() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o90.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new o90.a(str, str2, str3);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, o90.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("sellerName");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("url");
        ya5Var.toJson(lu3Var, w41Var, aVar.b());
    }
}
