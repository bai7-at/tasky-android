package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class LegacyExceptionErrorJsonAdapter extends JsonAdapter<LegacyExceptionError> {
    private volatile Constructor<LegacyExceptionError> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<LegacyExceptionErrorInfo>> mutableListOfLegacyExceptionErrorInfoAdapter;
    private final JsonReader.b options;

    public LegacyExceptionErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("rep", QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.g(a, "JsonReader.Options.of(\"rep\", \"c\")");
        this.options = a;
        JsonAdapter<List<LegacyExceptionErrorInfo>> f = iVar.f(j.j(List.class, LegacyExceptionErrorInfo.class), b0.e(), "exceptionErrors");
        zq3.g(f, "moshi.adapter(Types.newP…Set(), \"exceptionErrors\")");
        this.mutableListOfLegacyExceptionErrorInfoAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "occurrences");
        zq3.g(f2, "moshi.adapter(Int::class…t(),\n      \"occurrences\")");
        this.intAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LegacyExceptionError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LegacyExceptionError fromJson(JsonReader jsonReader) {
        LegacyExceptionError legacyExceptionError;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List<LegacyExceptionErrorInfo> list = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.mutableListOfLegacyExceptionErrorInfoAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x = c29.x("exceptionErrors", "rep", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"exc…onErrors\", \"rep\", reader)");
                    throw x;
                }
            } else if (P == 1 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("occurrences", QueryKeys.TIME_ON_VIEW_IN_MINUTES, jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"occ…\n            \"c\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (-1 == ((int) 4294967295L)) {
            legacyExceptionError = new LegacyExceptionError(false, 1, null);
        } else {
            Constructor<LegacyExceptionError> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = LegacyExceptionError.class.getDeclaredConstructor(Boolean.TYPE, Integer.TYPE, c29.c);
                this.constructorRef = constructor;
                zq3.g(constructor, "LegacyExceptionError::cl…his.constructorRef = it }");
            }
            LegacyExceptionError newInstance = constructor.newInstance(Boolean.FALSE, -1, null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            legacyExceptionError = newInstance;
        }
        if (list == null) {
            list = legacyExceptionError.getExceptionErrors();
        }
        legacyExceptionError.setExceptionErrors(list);
        legacyExceptionError.setOccurrences(num != null ? num.intValue() : legacyExceptionError.getOccurrences());
        return legacyExceptionError;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LegacyExceptionError legacyExceptionError) {
        zq3.h(hVar, "writer");
        if (legacyExceptionError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("rep");
        this.mutableListOfLegacyExceptionErrorInfoAdapter.mo197toJson(hVar, legacyExceptionError.getExceptionErrors());
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(legacyExceptionError.getOccurrences()));
        hVar.l();
    }
}
