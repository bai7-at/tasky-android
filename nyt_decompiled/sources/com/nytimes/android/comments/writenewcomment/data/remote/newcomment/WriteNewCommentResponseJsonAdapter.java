package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class WriteNewCommentResponseJsonAdapter extends JsonAdapter<WriteNewCommentResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public WriteNewCommentResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("commentID", "updateES", "api_timestamp", "status", "error");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "commentID");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isUpdateES");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "status");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WriteNewCommentResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WriteNewCommentResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Boolean bool = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("commentID", "commentID", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x2 = c29.x("isUpdateES", "updateES", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x3 = c29.x("apiTimestamp", "api_timestamp", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
            } else if (P == 3) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("commentID", "commentID", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        long longValue = l.longValue();
        if (bool == null) {
            JsonDataException o2 = c29.o("isUpdateES", "updateES", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        boolean booleanValue = bool.booleanValue();
        if (l2 != null) {
            return new WriteNewCommentResponse(longValue, booleanValue, l2.longValue(), str, str2);
        }
        JsonDataException o3 = c29.o("apiTimestamp", "api_timestamp", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WriteNewCommentResponse writeNewCommentResponse) {
        zq3.h(hVar, "writer");
        if (writeNewCommentResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("commentID");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(writeNewCommentResponse.getCommentID()));
        hVar.C("updateES");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(writeNewCommentResponse.isUpdateES()));
        hVar.C("api_timestamp");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(writeNewCommentResponse.getApiTimestamp()));
        hVar.C("status");
        this.nullableStringAdapter.mo197toJson(hVar, writeNewCommentResponse.getStatus());
        hVar.C("error");
        this.nullableStringAdapter.mo197toJson(hVar, writeNewCommentResponse.getError());
        hVar.l();
    }
}
