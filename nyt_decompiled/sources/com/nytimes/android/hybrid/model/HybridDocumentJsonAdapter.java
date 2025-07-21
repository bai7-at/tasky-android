package com.nytimes.android.hybrid.model;

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
public final class HybridDocumentJsonAdapter extends JsonAdapter<HybridDocument> {
    private final JsonAdapter<HybridMain> hybridMainAdapter;
    private final JsonAdapter<List<HybridImage>> listOfHybridImageAdapter;
    private final JsonAdapter<List<HybridSubResource>> listOfHybridSubResourceAdapter;
    private final JsonReader.b options;

    public HybridDocumentJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("main", "subResources", "images");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<HybridMain> f = iVar.f(HybridMain.class, b0.e(), "main");
        zq3.g(f, "adapter(...)");
        this.hybridMainAdapter = f;
        JsonAdapter<List<HybridSubResource>> f2 = iVar.f(j.j(List.class, HybridSubResource.class), b0.e(), "subResources");
        zq3.g(f2, "adapter(...)");
        this.listOfHybridSubResourceAdapter = f2;
        JsonAdapter<List<HybridImage>> f3 = iVar.f(j.j(List.class, HybridImage.class), b0.e(), "images");
        zq3.g(f3, "adapter(...)");
        this.listOfHybridImageAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridDocument");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public HybridDocument fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        HybridMain hybridMain = null;
        List list = null;
        List list2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                hybridMain = (HybridMain) this.hybridMainAdapter.fromJson(jsonReader);
                if (hybridMain == null) {
                    JsonDataException x = c29.x("main", "main", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                list = (List) this.listOfHybridSubResourceAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x2 = c29.x("subResources", "subResources", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (list2 = (List) this.listOfHybridImageAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("images", "images", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (hybridMain == null) {
            JsonDataException o = c29.o("main", "main", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list == null) {
            JsonDataException o2 = c29.o("subResources", "subResources", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (list2 != null) {
            return new HybridDocument(hybridMain, list, list2);
        }
        JsonDataException o3 = c29.o("images", "images", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridDocument hybridDocument) {
        zq3.h(hVar, "writer");
        if (hybridDocument == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("main");
        this.hybridMainAdapter.mo197toJson(hVar, hybridDocument.getMain());
        hVar.C("subResources");
        this.listOfHybridSubResourceAdapter.mo197toJson(hVar, hybridDocument.getSubResources());
        hVar.C("images");
        this.listOfHybridImageAdapter.mo197toJson(hVar, hybridDocument.getImages());
        hVar.l();
    }
}
