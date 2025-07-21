package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class ParsedHtmlTextJsonAdapter extends JsonAdapter<ParsedHtmlText> {
    private volatile Constructor<ParsedHtmlText> constructorRef;
    private final JsonAdapter<List<Tag>> nullableListOfTagAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ParsedHtmlTextJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tags", "cleanText");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<Tag>> f = iVar.f(j.j(List.class, Tag.class), b0.e(), "tags");
        zq3.g(f, "adapter(...)");
        this.nullableListOfTagAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "cleanText");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ParsedHtmlText");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ParsedHtmlText fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfTagAdapter.fromJson(jsonReader);
                i = -2;
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new ParsedHtmlText(list, str);
        }
        Constructor<ParsedHtmlText> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ParsedHtmlText.class.getDeclaredConstructor(List.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        ParsedHtmlText newInstance = constructor.newInstance(list, str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ParsedHtmlText parsedHtmlText) {
        zq3.h(hVar, "writer");
        if (parsedHtmlText == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tags");
        this.nullableListOfTagAdapter.mo197toJson(hVar, parsedHtmlText.getTags());
        hVar.C("cleanText");
        this.nullableStringAdapter.mo197toJson(hVar, parsedHtmlText.getCleanText());
        hVar.l();
    }
}
