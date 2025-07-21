package com.nytimes.android.api.cms;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class AddendumJsonAdapter extends JsonAdapter<Addendum> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AddendumJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetId", TransferTable.COLUMN_TYPE, "publicationDate", "correctionFlag", "body");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "assetId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "publicationDate");
        zq3.g(f2, "adapter(...)");
        this.longAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.TYPE, b0.e(), "correctionFlag");
        zq3.g(f3, "adapter(...)");
        this.booleanAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Addendum");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Addendum fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("assetId", "assetId", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x(TransferTable.COLUMN_TYPE, TransferTable.COLUMN_TYPE, jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x3 = c29.x("publicationDate", "publicationDate", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
            } else if (P == 3) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x4 = c29.x("correctionFlag", "correctionFlag", jsonReader);
                    zq3.g(x4, "unexpectedNull(...)");
                    throw x4;
                }
            } else if (P == 4 && (str3 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x5 = c29.x("body", "body", jsonReader);
                zq3.g(x5, "unexpectedNull(...)");
                throw x5;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("assetId", "assetId", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o(TransferTable.COLUMN_TYPE, TransferTable.COLUMN_TYPE, jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (l == null) {
            JsonDataException o3 = c29.o("publicationDate", "publicationDate", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        long longValue = l.longValue();
        if (bool == null) {
            JsonDataException o4 = c29.o("correctionFlag", "correctionFlag", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        boolean booleanValue = bool.booleanValue();
        if (str3 != null) {
            return new Addendum(str, str2, longValue, booleanValue, str3);
        }
        JsonDataException o5 = c29.o("body", "body", jsonReader);
        zq3.g(o5, "missingProperty(...)");
        throw o5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Addendum addendum) {
        zq3.h(hVar, "writer");
        if (addendum == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetId");
        this.stringAdapter.mo197toJson(hVar, addendum.getAssetId());
        hVar.C(TransferTable.COLUMN_TYPE);
        this.stringAdapter.mo197toJson(hVar, addendum.getType());
        hVar.C("publicationDate");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(addendum.getPublicationDate()));
        hVar.C("correctionFlag");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(addendum.getCorrectionFlag()));
        hVar.C("body");
        this.stringAdapter.mo197toJson(hVar, addendum.getBody());
        hVar.l();
    }
}
