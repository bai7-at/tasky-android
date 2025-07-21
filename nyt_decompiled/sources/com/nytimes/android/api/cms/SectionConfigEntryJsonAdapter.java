package com.nytimes.android.api.cms;

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

/* loaded from: classes3.dex */
public final class SectionConfigEntryJsonAdapter extends JsonAdapter<SectionConfigEntry> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.b options;

    public SectionConfigEntryJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("rank", "isDefaultSection", "isAlwaysDefault", "entitlement");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "rank");
        zq3.g(f, "adapter(...)");
        this.nullableIntAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isDefaultSection");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<List<String>> f3 = iVar.f(j.j(List.class, String.class), b0.e(), "entitlement");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SectionConfigEntry");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SectionConfigEntry fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x = c29.x("isDefaultSection", "isDefaultSection", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 2) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    JsonDataException x2 = c29.x("isAlwaysDefault", "isAlwaysDefault", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 3) {
                list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (bool == null) {
            JsonDataException o = c29.o("isDefaultSection", "isDefaultSection", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new SectionConfigEntry(num, booleanValue, bool2.booleanValue(), list);
        }
        JsonDataException o2 = c29.o("isAlwaysDefault", "isAlwaysDefault", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SectionConfigEntry sectionConfigEntry) {
        zq3.h(hVar, "writer");
        if (sectionConfigEntry == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("rank");
        this.nullableIntAdapter.mo197toJson(hVar, sectionConfigEntry.getRank());
        hVar.C("isDefaultSection");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(sectionConfigEntry.isDefaultSection()));
        hVar.C("isAlwaysDefault");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(sectionConfigEntry.isAlwaysDefault()));
        hVar.C("entitlement");
        this.nullableListOfStringAdapter.mo197toJson(hVar, sectionConfigEntry.getEntitlement());
        hVar.l();
    }
}
