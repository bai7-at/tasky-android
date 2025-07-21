package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.ExceptionErrorInfo;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class ExceptionErrorInfoJsonAdapter extends JsonAdapter<ExceptionErrorInfo> {
    private volatile Constructor<ExceptionErrorInfo> constructorRef;
    private final JsonAdapter<ExceptionErrorInfo.AppState> nullableAppStateAdapter;
    private final JsonAdapter<List<ExceptionInfo>> nullableListOfExceptionInfoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public ExceptionErrorInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("timestamp", "app_state", "exceptions");
        zq3.g(a, "JsonReader.Options.of(\"t…ate\",\n      \"exceptions\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "timestamp");
        zq3.g(f, "moshi.adapter(Long::clas… emptySet(), \"timestamp\")");
        this.nullableLongAdapter = f;
        JsonAdapter<ExceptionErrorInfo.AppState> f2 = iVar.f(ExceptionErrorInfo.AppState.class, b0.e(), "appState");
        zq3.g(f2, "moshi.adapter(ExceptionE…, emptySet(), \"appState\")");
        this.nullableAppStateAdapter = f2;
        JsonAdapter<List<ExceptionInfo>> f3 = iVar.f(j.j(List.class, ExceptionInfo.class), b0.e(), "exceptions");
        zq3.g(f3, "moshi.adapter(Types.newP…emptySet(), \"exceptions\")");
        this.nullableListOfExceptionInfoAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ExceptionErrorInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ExceptionErrorInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        ExceptionErrorInfo.AppState appState = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    appState = (ExceptionErrorInfo.AppState) this.nullableAppStateAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    list = (List) this.nullableListOfExceptionInfoAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967288L)) {
            return new ExceptionErrorInfo(l, appState, list);
        }
        Constructor<ExceptionErrorInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ExceptionErrorInfo.class.getDeclaredConstructor(Long.class, ExceptionErrorInfo.AppState.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "ExceptionErrorInfo::clas…his.constructorRef = it }");
        }
        ExceptionErrorInfo newInstance = constructor.newInstance(l, appState, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ExceptionErrorInfo exceptionErrorInfo) {
        zq3.h(hVar, "writer");
        if (exceptionErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("timestamp");
        this.nullableLongAdapter.mo197toJson(hVar, exceptionErrorInfo.getTimestamp());
        hVar.C("app_state");
        this.nullableAppStateAdapter.mo197toJson(hVar, exceptionErrorInfo.getAppState());
        hVar.C("exceptions");
        this.nullableListOfExceptionInfoAdapter.mo197toJson(hVar, exceptionErrorInfo.getExceptions());
        hVar.l();
    }
}
