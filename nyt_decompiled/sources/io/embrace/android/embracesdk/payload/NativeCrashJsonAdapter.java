package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeCrashJsonAdapter extends JsonAdapter<NativeCrash> {
    private volatile Constructor<NativeCrash> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<NativeCrashDataError>> nullableListOfNullableNativeCrashDataErrorAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfNullableStringNullableStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NativeCrashJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", QueryKeys.MAX_SCROLL_DEPTH, "sb", "er", "ue", "ma", "crash_number");
        zq3.g(a, "JsonReader.Options.of(\"i…a\",\n      \"crash_number\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "id");
        zq3.g(f, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Map<String, String>> f2 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "symbols");
        zq3.g(f2, "moshi.adapter(Types.newP…), emptySet(), \"symbols\")");
        this.nullableMapOfNullableStringNullableStringAdapter = f2;
        JsonAdapter<List<NativeCrashDataError>> f3 = iVar.f(j.j(List.class, NativeCrashDataError.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f3, "moshi.adapter(Types.newP…    emptySet(), \"errors\")");
        this.nullableListOfNullableNativeCrashDataErrorAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.class, b0.e(), "unwindError");
        zq3.g(f4, "moshi.adapter(Int::class…mptySet(), \"unwindError\")");
        this.nullableIntAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeCrash");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeCrash fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        Map map = null;
        List list = null;
        Integer num = null;
        String str3 = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    map = (Map) this.nullableMapOfNullableStringNullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = (List) this.nullableListOfNullableNativeCrashDataErrorAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    i &= (int) 4294967231L;
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967231L)) {
            return new NativeCrash(str, str2, map, list, num, str3, num2);
        }
        Constructor<NativeCrash> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NativeCrash.class.getDeclaredConstructor(String.class, String.class, Map.class, List.class, Integer.class, String.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NativeCrash::class.java.…his.constructorRef = it }");
        }
        NativeCrash newInstance = constructor.newInstance(str, str2, map, list, num, str3, num2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeCrash nativeCrash) {
        zq3.h(hVar, "writer");
        if (nativeCrash == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrash.getId());
        hVar.C(QueryKeys.MAX_SCROLL_DEPTH);
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrash.getCrashMessage());
        hVar.C("sb");
        this.nullableMapOfNullableStringNullableStringAdapter.mo197toJson(hVar, nativeCrash.getSymbols());
        hVar.C("er");
        this.nullableListOfNullableNativeCrashDataErrorAdapter.mo197toJson(hVar, nativeCrash.getErrors());
        hVar.C("ue");
        this.nullableIntAdapter.mo197toJson(hVar, nativeCrash.getUnwindError());
        hVar.C("ma");
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrash.getMap());
        hVar.C("crash_number");
        this.nullableIntAdapter.mo197toJson(hVar, nativeCrash.getCrashNumber());
        hVar.l();
    }
}
