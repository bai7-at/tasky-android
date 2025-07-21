package io.embrace.android.embracesdk.payload;

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
public final class CrashJsonAdapter extends JsonAdapter<Crash> {
    private volatile Constructor<Crash> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<LegacyExceptionInfo>> nullableListOfLegacyExceptionInfoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<List<ThreadInfo>> nullableListOfThreadInfoAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public CrashJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "ex", "rep_js", "th", "crash_number");
        zq3.g(a, "JsonReader.Options.of(\"i…h\",\n      \"crash_number\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "crashId");
        zq3.g(f, "moshi.adapter(String::cl…tySet(),\n      \"crashId\")");
        this.stringAdapter = f;
        JsonAdapter<List<LegacyExceptionInfo>> f2 = iVar.f(j.j(List.class, LegacyExceptionInfo.class), b0.e(), "exceptions");
        zq3.g(f2, "moshi.adapter(Types.newP…emptySet(), \"exceptions\")");
        this.nullableListOfLegacyExceptionInfoAdapter = f2;
        JsonAdapter<List<String>> f3 = iVar.f(j.j(List.class, String.class), b0.e(), "jsExceptions");
        zq3.g(f3, "moshi.adapter(Types.newP…(),\n      \"jsExceptions\")");
        this.nullableListOfStringAdapter = f3;
        JsonAdapter<List<ThreadInfo>> f4 = iVar.f(j.j(List.class, ThreadInfo.class), b0.e(), "threads");
        zq3.g(f4, "moshi.adapter(Types.newP…   emptySet(), \"threads\")");
        this.nullableListOfThreadInfoAdapter = f4;
        JsonAdapter<Integer> f5 = iVar.f(Integer.class, b0.e(), "crashNumber");
        zq3.g(f5, "moshi.adapter(Int::class…mptySet(), \"crashNumber\")");
        this.nullableIntAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Crash");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Crash fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("crashId", "id", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"cra…\"id\",\n            reader)");
                    throw x;
                }
            } else if (P == 1) {
                i &= (int) 4294967293L;
                list = (List) this.nullableListOfLegacyExceptionInfoAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                i &= (int) 4294967291L;
                list2 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                i &= (int) 4294967287L;
                list3 = (List) this.nullableListOfThreadInfoAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                i &= (int) 4294967279L;
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967265L)) {
            if (str != null) {
                return new Crash(str, list, list2, list3, num);
            }
            JsonDataException o = c29.o("crashId", "id", jsonReader);
            zq3.g(o, "Util.missingProperty(\"crashId\", \"id\", reader)");
            throw o;
        }
        Constructor<Crash> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Crash.class.getDeclaredConstructor(String.class, List.class, List.class, List.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Crash::class.java.getDec…his.constructorRef = it }");
        }
        if (str == null) {
            JsonDataException o2 = c29.o("crashId", "id", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"crashId\", \"id\", reader)");
            throw o2;
        }
        Crash newInstance = constructor.newInstance(str, list, list2, list3, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Crash crash) {
        zq3.h(hVar, "writer");
        if (crash == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, crash.crashId);
        hVar.C("ex");
        this.nullableListOfLegacyExceptionInfoAdapter.mo197toJson(hVar, crash.getExceptions());
        hVar.C("rep_js");
        this.nullableListOfStringAdapter.mo197toJson(hVar, crash.getJsExceptions());
        hVar.C("th");
        this.nullableListOfThreadInfoAdapter.mo197toJson(hVar, crash.getThreads());
        hVar.C("crash_number");
        this.nullableIntAdapter.mo197toJson(hVar, crash.getCrashNumber());
        hVar.l();
    }
}
