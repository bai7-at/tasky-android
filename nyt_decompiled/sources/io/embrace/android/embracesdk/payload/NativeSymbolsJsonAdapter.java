package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeSymbolsJsonAdapter extends JsonAdapter<NativeSymbols> {
    private final JsonAdapter<Map<String, Map<String, String>>> mapOfStringMapOfStringStringAdapter;
    private final JsonReader.b options;

    public NativeSymbolsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("symbols");
        zq3.g(a, "JsonReader.Options.of(\"symbols\")");
        this.options = a;
        JsonAdapter<Map<String, Map<String, String>>> f = iVar.f(j.j(Map.class, String.class, j.j(Map.class, String.class, String.class)), b0.e(), "symbols");
        zq3.g(f, "moshi.adapter(Types.newP…   emptySet(), \"symbols\")");
        this.mapOfStringMapOfStringStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeSymbols");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeSymbols fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (map = (Map) this.mapOfStringMapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("symbols", "symbols", jsonReader);
                zq3.g(x, "Util.unexpectedNull(\"symbols\", \"symbols\", reader)");
                throw x;
            }
        }
        jsonReader.h();
        if (map != null) {
            return new NativeSymbols(map);
        }
        JsonDataException o = c29.o("symbols", "symbols", jsonReader);
        zq3.g(o, "Util.missingProperty(\"symbols\", \"symbols\", reader)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeSymbols nativeSymbols) {
        zq3.h(hVar, "writer");
        if (nativeSymbols == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("symbols");
        this.mapOfStringMapOfStringStringAdapter.mo197toJson(hVar, nativeSymbols.getSymbols$embrace_android_sdk_release());
        hVar.l();
    }
}
