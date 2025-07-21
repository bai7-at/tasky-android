package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.CommentStatus;

/* loaded from: classes5.dex */
public final class CommentStatus_ResponseAdapter implements h8 {
    public static final CommentStatus_ResponseAdapter INSTANCE = new CommentStatus_ResponseAdapter();

    private CommentStatus_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public CommentStatus fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return CommentStatus.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, CommentStatus commentStatus) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(commentStatus, "value");
        lu3Var.value(commentStatus.getRawValue());
    }
}
