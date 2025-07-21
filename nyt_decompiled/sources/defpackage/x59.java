package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import defpackage.n59;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class x59 implements h8 {
    public static final x59 a = new x59();
    private static final List b = i.o("__typename", "width", "url", TransferTable.COLUMN_TYPE);

    private x59() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n59.j fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new n59.j(str, num, str2, str3);
        }
        vr.a(jsonReader, TransferTable.COLUMN_TYPE);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, n59.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, jVar.d());
        lu3Var.name("width");
        j8.k.toJson(lu3Var, w41Var, jVar.c());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, jVar.b());
        lu3Var.name(TransferTable.COLUMN_TYPE);
        h8Var.toJson(lu3Var, w41Var, jVar.a());
    }
}
