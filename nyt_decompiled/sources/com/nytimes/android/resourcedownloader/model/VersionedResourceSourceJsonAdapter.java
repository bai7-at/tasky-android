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
public final class VersionedResourceSourceJsonAdapter extends JsonAdapter<VersionedResourceSource> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public VersionedResourceSourceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "version");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "version");
        zq3.g(f2, "adapter(...)");
        this.longAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VersionedResourceSource");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public VersionedResourceSource fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("id", "id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("version", "version", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("id", "id", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (l != null) {
            return new VersionedResourceSource(str, l.longValue());
        }
        JsonDataException o2 = c29.o("version", "version", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VersionedResourceSource versionedResourceSource) {
        zq3.h(hVar, "writer");
        if (versionedResourceSource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, versionedResourceSource.getId());
        hVar.C("version");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(versionedResourceSource.getVersion()));
        hVar.l();
    }
}
