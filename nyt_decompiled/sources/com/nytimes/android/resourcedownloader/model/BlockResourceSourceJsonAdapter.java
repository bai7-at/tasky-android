package com.nytimes.android.resourcedownloader.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class BlockResourceSourceJsonAdapter extends JsonAdapter<BlockResourceSource> {
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public BlockResourceSourceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("dataId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "dataId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BlockResourceSource");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BlockResourceSource fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("dataId", "dataId", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (str != null) {
            return new BlockResourceSource(str);
        }
        JsonDataException o = c29.o("dataId", "dataId", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BlockResourceSource blockResourceSource) {
        zq3.h(hVar, "writer");
        if (blockResourceSource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("dataId");
        this.stringAdapter.mo197toJson(hVar, blockResourceSource.getDataId());
        hVar.l();
    }
}
