package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class StacktracesJsonAdapter extends JsonAdapter<Stacktraces> {
    private volatile Constructor<Stacktraces> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public StacktracesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.TIME_ON_VIEW_IN_MINUTES, "l", QueryKeys.VISIT_FREQUENCY, "jsk", "tt", QueryKeys.USER_ID);
        zq3.g(a, "JsonReader.Options.of(\"c…\", \"f\", \"jsk\", \"tt\", \"u\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "context");
        zq3.g(f, "moshi.adapter(String::cl…   emptySet(), \"context\")");
        this.nullableStringAdapter = f;
        JsonAdapter<List<String>> f2 = iVar.f(j.j(List.class, String.class), b0.e(), "jvmStacktrace");
        zq3.g(f2, "moshi.adapter(Types.newP…),\n      \"jvmStacktrace\")");
        this.nullableListOfStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Stacktraces");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Stacktraces fromJson(JsonReader jsonReader) {
        Stacktraces stacktraces;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        List<String> list = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = -1;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= (int) 4294967287L;
                    break;
                case 1:
                    i &= (int) 4294967279L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    z = true;
                    break;
                case 3:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    z2 = true;
                    break;
                case 4:
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    z3 = true;
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    z4 = true;
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967271L)) {
            stacktraces = new Stacktraces(null, null, null, str, str2, 7, null);
        } else {
            Constructor<Stacktraces> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = Stacktraces.class.getDeclaredConstructor(List.class, String.class, Embrace.AppFramework.class, String.class, String.class, Integer.TYPE, c29.c);
                this.constructorRef = constructor;
                zq3.g(constructor, "Stacktraces::class.java.…his.constructorRef = it }");
            }
            Stacktraces newInstance = constructor.newInstance(null, null, null, str, str2, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            stacktraces = newInstance;
        }
        if (!z) {
            str4 = stacktraces.getFlutterStacktrace();
        }
        stacktraces.setFlutterStacktrace(str4);
        if (!z2) {
            str5 = stacktraces.getJavascriptStacktrace();
        }
        stacktraces.setJavascriptStacktrace(str5);
        if (!z3) {
            list = stacktraces.getJvmStacktrace();
        }
        stacktraces.setJvmStacktrace(list);
        if (!z4) {
            str3 = stacktraces.getUnityStacktrace();
        }
        stacktraces.setUnityStacktrace(str3);
        return stacktraces;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Stacktraces stacktraces) {
        zq3.h(hVar, "writer");
        if (stacktraces == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.nullableStringAdapter.mo197toJson(hVar, stacktraces.getContext());
        hVar.C("l");
        this.nullableStringAdapter.mo197toJson(hVar, stacktraces.getLibrary());
        hVar.C(QueryKeys.VISIT_FREQUENCY);
        this.nullableStringAdapter.mo197toJson(hVar, stacktraces.getFlutterStacktrace());
        hVar.C("jsk");
        this.nullableStringAdapter.mo197toJson(hVar, stacktraces.getJavascriptStacktrace());
        hVar.C("tt");
        this.nullableListOfStringAdapter.mo197toJson(hVar, stacktraces.getJvmStacktrace());
        hVar.C(QueryKeys.USER_ID);
        this.nullableStringAdapter.mo197toJson(hVar, stacktraces.getUnityStacktrace());
        hVar.l();
    }
}
