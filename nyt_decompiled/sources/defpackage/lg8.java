package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lg8 implements h8 {
    public static final lg8 a = new lg8();
    private static final List b = i.o(TransferTable.COLUMN_KEY, "value");

    private lg8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kg8 fromJson(JsonReader jsonReader, w41 w41Var) {
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
            vr.a(jsonReader, TransferTable.COLUMN_KEY);
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new kg8(str, str2);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kg8 kg8Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kg8Var, "value");
        lu3Var.name(TransferTable.COLUMN_KEY);
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, kg8Var.a());
        lu3Var.name("value");
        h8Var.toJson(lu3Var, w41Var, kg8Var.b());
    }
}
