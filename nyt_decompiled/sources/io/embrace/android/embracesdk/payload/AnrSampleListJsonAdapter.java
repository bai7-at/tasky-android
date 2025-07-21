package io.embrace.android.embracesdk.payload;

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

/* loaded from: classes5.dex */
public final class AnrSampleListJsonAdapter extends JsonAdapter<AnrSampleList> {
    private final JsonAdapter<List<AnrSample>> listOfAnrSampleAdapter;
    private final JsonReader.b options;

    public AnrSampleListJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ticks");
        zq3.g(a, "JsonReader.Options.of(\"ticks\")");
        this.options = a;
        JsonAdapter<List<AnrSample>> f = iVar.f(j.j(List.class, AnrSample.class), b0.e(), "samples");
        zq3.g(f, "moshi.adapter(Types.newP…tySet(),\n      \"samples\")");
        this.listOfAnrSampleAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AnrSampleList");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AnrSampleList fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (list = (List) this.listOfAnrSampleAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("samples", "ticks", jsonReader);
                zq3.g(x, "Util.unexpectedNull(\"samples\", \"ticks\", reader)");
                throw x;
            }
        }
        jsonReader.h();
        if (list != null) {
            return new AnrSampleList(list);
        }
        JsonDataException o = c29.o("samples", "ticks", jsonReader);
        zq3.g(o, "Util.missingProperty(\"samples\", \"ticks\", reader)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AnrSampleList anrSampleList) {
        zq3.h(hVar, "writer");
        if (anrSampleList == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ticks");
        this.listOfAnrSampleAdapter.mo197toJson(hVar, anrSampleList.getSamples());
        hVar.l();
    }
}
