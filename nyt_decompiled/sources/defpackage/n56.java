package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.m56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.ImageCropName;
import type.adapter.ImageCropName_ResponseAdapter;

/* loaded from: classes3.dex */
public final class n56 implements h8 {
    public static final n56 a = new n56();
    private static final List b = i.o("__typename", AuthenticationTokenClaims.JSON_KEY_NAME, "renditions");

    private n56() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m56.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        ImageCropName imageCropName = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                imageCropName = ImageCropName_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.b(j8.d(q56.a, false, 1, null))).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (imageCropName == null) {
            vr.a(jsonReader, AuthenticationTokenClaims.JSON_KEY_NAME);
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new m56.a(str, imageCropName, list);
        }
        vr.a(jsonReader, "renditions");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, m56.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
        ImageCropName_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("renditions");
        j8.a(j8.b(j8.d(q56.a, false, 1, null))).toJson(lu3Var, w41Var, aVar.b());
    }
}
