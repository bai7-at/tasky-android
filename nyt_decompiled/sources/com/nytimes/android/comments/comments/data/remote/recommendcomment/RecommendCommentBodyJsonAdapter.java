package com.nytimes.android.comments.comments.data.remote.recommendcomment;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class RecommendCommentBodyJsonAdapter extends JsonAdapter<RecommendCommentBody> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public RecommendCommentBodyJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("url", "commentSequence", "recommend");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "commentSequence");
        zq3.g(f2, "adapter(...)");
        this.longAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.TYPE, b0.e(), "recommend");
        zq3.g(f3, "adapter(...)");
        this.intAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RecommendCommentBody");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public RecommendCommentBody fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        Integer num = null;
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
                    JsonDataException x2 = c29.x("commentSequence", "commentSequence", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("recommend", "recommend", jsonReader);
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
            JsonDataException o2 = c29.o("commentSequence", "commentSequence", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        long longValue = l.longValue();
        if (num != null) {
            return new RecommendCommentBody(str, longValue, num.intValue());
        }
        JsonDataException o3 = c29.o("recommend", "recommend", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RecommendCommentBody recommendCommentBody) {
        zq3.h(hVar, "writer");
        if (recommendCommentBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, recommendCommentBody.getUrl());
        hVar.C("commentSequence");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(recommendCommentBody.getCommentSequence()));
        hVar.C("recommend");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(recommendCommentBody.getRecommend()));
        hVar.l();
    }
}
