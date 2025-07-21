package com.nytimes.android.comments.comments.data.remote.flagcomment;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class FlaggedCommentResponseJsonAdapter extends JsonAdapter<FlaggedCommentResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;

    public FlaggedCommentResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("commentID");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "commentID");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FlaggedCommentResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public FlaggedCommentResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("commentID", "commentID", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (num != null) {
            return new FlaggedCommentResponse(num.intValue());
        }
        JsonDataException o = c29.o("commentID", "commentID", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, FlaggedCommentResponse flaggedCommentResponse) {
        zq3.h(hVar, "writer");
        if (flaggedCommentResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("commentID");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(flaggedCommentResponse.getCommentID()));
        hVar.l();
    }
}
