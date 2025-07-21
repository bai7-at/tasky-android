package com.nytimes.android.comments.comments.data.remote;

import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class CommentsResponseJsonAdapter extends JsonAdapter<CommentsResponse> {
    public static final int $stable = 8;
    private volatile Constructor<CommentsResponse> constructorRef;
    private final JsonAdapter<List<CommentResponse>> listOfCommentResponseAdapter;
    private final JsonReader.b options;

    public CommentsResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("comments");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<CommentResponse>> f = iVar.f(j.j(List.class, CommentResponse.class), b0.e(), "comments");
        zq3.g(f, "adapter(...)");
        this.listOfCommentResponseAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CommentsResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CommentsResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.listOfCommentResponseAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x = c29.x("comments", "comments", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -2) {
            zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.comments.comments.data.remote.getallcomments.CommentResponse>");
            return new CommentsResponse(list);
        }
        Constructor<CommentsResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommentsResponse.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        CommentsResponse newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CommentsResponse commentsResponse) {
        zq3.h(hVar, "writer");
        if (commentsResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("comments");
        this.listOfCommentResponseAdapter.mo197toJson(hVar, commentsResponse.getComments());
        hVar.l();
    }
}
