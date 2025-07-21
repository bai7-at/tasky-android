package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lv;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.CommentStatus;
import type.adapter.CommentStatus_ResponseAdapter;

/* loaded from: classes3.dex */
public final class rv implements h8 {
    public static final rv a = new rv();
    private static final List b = i.e("status");

    private rv() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lv.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        CommentStatus commentStatus = null;
        while (jsonReader.l1(b) == 0) {
            commentStatus = CommentStatus_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
        }
        if (commentStatus != null) {
            return new lv.e(commentStatus);
        }
        vr.a(jsonReader, "status");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lv.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("status");
        CommentStatus_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, eVar.a());
    }
}
