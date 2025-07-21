package io.embrace.android.embracesdk.internal.payload;

import com.facebook.AuthenticationTokenClaims;
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

/* loaded from: classes5.dex */
public final class ExceptionInfoJsonAdapter extends JsonAdapter<ExceptionInfo> {
    private volatile Constructor<ExceptionInfo> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ExceptionInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "message", "stacktrace");
        zq3.g(a, "JsonReader.Options.of(\"n… \"message\", \"stacktrace\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f;
        JsonAdapter<List<String>> f2 = iVar.f(j.j(List.class, String.class), b0.e(), "stacktrace");
        zq3.g(f2, "moshi.adapter(Types.newP…et(),\n      \"stacktrace\")");
        this.nullableListOfStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ExceptionInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ExceptionInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
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
            return new ExceptionInfo(str, str2, list);
        }
        Constructor<ExceptionInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ExceptionInfo.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "ExceptionInfo::class.jav…his.constructorRef = it }");
        }
        ExceptionInfo newInstance = constructor.newInstance(str, str2, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ExceptionInfo exceptionInfo) {
        zq3.h(hVar, "writer");
        if (exceptionInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.nullableStringAdapter.mo197toJson(hVar, exceptionInfo.getName());
        hVar.C("message");
        this.nullableStringAdapter.mo197toJson(hVar, exceptionInfo.getMessage());
        hVar.C("stacktrace");
        this.nullableListOfStringAdapter.mo197toJson(hVar, exceptionInfo.getStacktrace());
        hVar.l();
    }
}
