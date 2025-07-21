package com.nytimes.android.eventtracker.validator;

import com.nytimes.android.eventtracker.validator.Validator;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class Validator_ResultJsonAdapter extends JsonAdapter<Validator.Result> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public Validator_ResultJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("valid", "flush", "version", "messages");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "valid");
        zq3.g(f, "adapter(...)");
        this.nullableBooleanAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "flush");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "version");
        zq3.g(f3, "adapter(...)");
        this.stringAdapter = f3;
        JsonAdapter<List<String>> f4 = iVar.f(j.j(List.class, String.class), b0.e(), "messages");
        zq3.g(f4, "adapter(...)");
        this.listOfStringAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Validator.Result fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    JsonDataException x = c29.x("flush", "flush", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 2) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("version", "version", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 3 && (list = (List) this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("messages", "messages", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (bool2 == null) {
            JsonDataException o = c29.o("flush", "flush", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        boolean booleanValue = bool2.booleanValue();
        if (str == null) {
            JsonDataException o2 = c29.o("version", "version", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (list != null) {
            return new Validator.Result(bool, booleanValue, str, list);
        }
        JsonDataException o3 = c29.o("messages", "messages", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Validator.Result result) {
        zq3.h(hVar, "writer");
        if (result == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("valid");
        this.nullableBooleanAdapter.mo197toJson(hVar, result.c());
        hVar.C("flush");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(result.a()));
        hVar.C("version");
        this.stringAdapter.mo197toJson(hVar, result.d());
        hVar.C("messages");
        this.listOfStringAdapter.mo197toJson(hVar, result.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Validator.Result");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
