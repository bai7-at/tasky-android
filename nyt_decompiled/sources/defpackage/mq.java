package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kq;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.CommentStatus;
import type.adapter.CommentStatus_ResponseAdapter;

/* loaded from: classes3.dex */
public final class mq implements h8 {
    public static final mq a = new mq();
    private static final List b = i.o("__typename", "status");

    private mq() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kq.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        CommentStatus commentStatus = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                commentStatus = CommentStatus_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (commentStatus != null) {
            return new kq.a(str, commentStatus);
        }
        vr.a(jsonReader, "status");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kq.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("status");
        CommentStatus_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, aVar.a());
    }
}
