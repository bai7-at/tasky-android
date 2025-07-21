package io.embrace.android.embracesdk.internal.payload;

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
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class InternalErrorJsonAdapter extends JsonAdapter<InternalError> {
    private volatile Constructor<InternalError> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ExceptionErrorInfo>> nullableListOfExceptionErrorInfoAdapter;
    private final JsonReader.b options;

    public InternalErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("count", SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(a, "JsonReader.Options.of(\"count\", \"errors\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "count");
        zq3.g(f, "moshi.adapter(Int::class…     emptySet(), \"count\")");
        this.nullableIntAdapter = f;
        JsonAdapter<List<ExceptionErrorInfo>> f2 = iVar.f(j.j(List.class, ExceptionErrorInfo.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f2, "moshi.adapter(Types.newP…    emptySet(), \"errors\")");
        this.nullableListOfExceptionErrorInfoAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InternalError fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    list = (List) this.nullableListOfExceptionErrorInfoAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967292L)) {
            return new InternalError(num, list);
        }
        Constructor<InternalError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InternalError.class.getDeclaredConstructor(Integer.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "InternalError::class.jav…his.constructorRef = it }");
        }
        InternalError newInstance = constructor.newInstance(num, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, InternalError internalError) {
        zq3.h(hVar, "writer");
        if (internalError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("count");
        this.nullableIntAdapter.mo197toJson(hVar, internalError.getCount());
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.nullableListOfExceptionErrorInfoAdapter.mo197toJson(hVar, internalError.getErrors());
        hVar.l();
    }
}
