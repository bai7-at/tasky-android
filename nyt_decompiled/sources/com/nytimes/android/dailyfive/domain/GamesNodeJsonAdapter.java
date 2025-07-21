package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class GamesNodeJsonAdapter extends JsonAdapter<GamesNode> {
    public static final int $stable = 8;
    private final JsonAdapter<Instant> nullableInstantAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public GamesNodeJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("uri", "url", "headline", "summary", "lastModified", "sourceId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Instant> f2 = iVar.f(Instant.class, b0.e(), "lastModified");
        zq3.g(f2, "adapter(...)");
        this.nullableInstantAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "sourceId");
        zq3.g(f3, "adapter(...)");
        this.nullableLongAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GamesNode fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Instant instant = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("uri", "uri", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("url", "url", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("headline", "headline", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("summary", "summary", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    instant = (Instant) this.nullableInstantAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("uri", "uri", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("url", "url", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (str3 == null) {
            JsonDataException o3 = c29.o("headline", "headline", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (str4 != null) {
            return new GamesNode(str, str2, str3, str4, instant, l);
        }
        JsonDataException o4 = c29.o("summary", "summary", jsonReader);
        zq3.g(o4, "missingProperty(...)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GamesNode gamesNode) {
        zq3.h(hVar, "writer");
        if (gamesNode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, gamesNode.d());
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, gamesNode.e());
        hVar.C("headline");
        this.stringAdapter.mo197toJson(hVar, gamesNode.a());
        hVar.C("summary");
        this.stringAdapter.mo197toJson(hVar, gamesNode.c());
        hVar.C("lastModified");
        this.nullableInstantAdapter.mo197toJson(hVar, gamesNode.g());
        hVar.C("sourceId");
        this.nullableLongAdapter.mo197toJson(hVar, gamesNode.h());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GamesNode");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
