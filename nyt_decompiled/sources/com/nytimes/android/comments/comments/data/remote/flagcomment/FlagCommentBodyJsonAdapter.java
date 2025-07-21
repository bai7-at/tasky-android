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
public final class FlagCommentBodyJsonAdapter extends JsonAdapter<FlagCommentBody> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public FlagCommentBodyJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("url", "commentID", "commentLabels");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "commentID");
        zq3.g(f2, "adapter(...)");
        this.longAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FlagCommentBody");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public FlagCommentBody fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("url", "url", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x2 = c29.x("commentID", "commentID", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (str2 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("commentLabels", "commentLabels", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("url", "url", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (l == null) {
            JsonDataException o2 = c29.o("commentID", "commentID", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        long longValue = l.longValue();
        if (str2 != null) {
            return new FlagCommentBody(str, longValue, str2);
        }
        JsonDataException o3 = c29.o("commentLabels", "commentLabels", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, FlagCommentBody flagCommentBody) {
        zq3.h(hVar, "writer");
        if (flagCommentBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, flagCommentBody.getUrl());
        hVar.C("commentID");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(flagCommentBody.getCommentID()));
        hVar.C("commentLabels");
        this.stringAdapter.mo197toJson(hVar, flagCommentBody.getCommentLabels());
        hVar.l();
    }
}
