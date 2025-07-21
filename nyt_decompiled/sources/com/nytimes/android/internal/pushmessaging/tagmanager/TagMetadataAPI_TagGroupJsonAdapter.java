package com.nytimes.android.internal.pushmessaging.tagmanager;

import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;
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
public final class TagMetadataAPI_TagGroupJsonAdapter extends JsonAdapter<TagMetadataAPI.TagGroup> {
    private final JsonAdapter<List<TagMetadataAPI.InnerTag>> listOfInnerTagAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public TagMetadataAPI_TagGroupJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("title", "tags");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "title");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<TagMetadataAPI.InnerTag>> f2 = iVar.f(j.j(List.class, TagMetadataAPI.InnerTag.class), b0.e(), "tags");
        zq3.g(f2, "adapter(...)");
        this.listOfInnerTagAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TagMetadataAPI.TagGroup fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("title", "title", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (list = (List) this.listOfInnerTagAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("tags", "tags", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("title", "title", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list != null) {
            return new TagMetadataAPI.TagGroup(str, list);
        }
        JsonDataException o2 = c29.o("tags", "tags", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TagMetadataAPI.TagGroup tagGroup) {
        zq3.h(hVar, "writer");
        if (tagGroup == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, tagGroup.b());
        hVar.C("tags");
        this.listOfInnerTagAdapter.mo197toJson(hVar, tagGroup.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TagMetadataAPI.TagGroup");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
