package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeThreadAnrIntervalJsonAdapter extends JsonAdapter<NativeThreadAnrInterval> {
    private volatile Constructor<NativeThreadAnrInterval> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<List<NativeThreadAnrSample>> nullableMutableListOfNativeThreadAnrSampleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NativeThreadAnrIntervalJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", QueryKeys.IS_NEW_USER, "p", "os", QueryKeys.TOKEN, "ss", "s", "uw");
        zq3.g(a, "JsonReader.Options.of(\"i…\", \"ss\",\n      \"s\", \"uw\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "id");
        zq3.g(f, "moshi.adapter(Long::clas…,\n      emptySet(), \"id\")");
        this.nullableLongAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f2, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.class, b0.e(), "priority");
        zq3.g(f3, "moshi.adapter(Int::class…  emptySet(), \"priority\")");
        this.nullableIntAdapter = f3;
        JsonAdapter<List<NativeThreadAnrSample>> f4 = iVar.f(j.j(List.class, NativeThreadAnrSample.class), b0.e(), "samples");
        zq3.g(f4, "moshi.adapter(Types.newP…), emptySet(), \"samples\")");
        this.nullableMutableListOfNativeThreadAnrSampleAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeThreadAnrInterval");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeThreadAnrInterval fromJson(JsonReader jsonReader) {
        NativeThreadAnrInterval nativeThreadAnrInterval;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        String str = null;
        Integer num = null;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        Integer num2 = null;
        boolean z = false;
        boolean z2 = false;
        Integer num3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = (List) this.nullableMutableListOfNativeThreadAnrSampleAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    z = true;
                    break;
                case 7:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    z2 = true;
                    break;
            }
        }
        jsonReader.h();
        if (-1 == ((int) 4294967295L)) {
            nativeThreadAnrInterval = new NativeThreadAnrInterval(l, str, num, l2, l3, list, null, null, 192, null);
        } else {
            Constructor<NativeThreadAnrInterval> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = NativeThreadAnrInterval.class.getDeclaredConstructor(Long.class, String.class, Integer.class, Long.class, Long.class, List.class, ThreadState.class, AnrRemoteConfig.Unwinder.class, Integer.TYPE, c29.c);
                this.constructorRef = constructor;
                zq3.g(constructor, "NativeThreadAnrInterval:…his.constructorRef = it }");
            }
            NativeThreadAnrInterval newInstance = constructor.newInstance(l, str, num, l2, l3, list, null, null, -1, null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            nativeThreadAnrInterval = newInstance;
        }
        if (!z) {
            num3 = nativeThreadAnrInterval.getState$embrace_android_sdk_release();
        }
        nativeThreadAnrInterval.setState$embrace_android_sdk_release(num3);
        if (!z2) {
            num2 = nativeThreadAnrInterval.getUnwinder$embrace_android_sdk_release();
        }
        nativeThreadAnrInterval.setUnwinder$embrace_android_sdk_release(num2);
        return nativeThreadAnrInterval;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeThreadAnrInterval nativeThreadAnrInterval) {
        zq3.h(hVar, "writer");
        if (nativeThreadAnrInterval == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.nullableLongAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getId$embrace_android_sdk_release());
        hVar.C(QueryKeys.IS_NEW_USER);
        this.nullableStringAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getName$embrace_android_sdk_release());
        hVar.C("p");
        this.nullableIntAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getPriority$embrace_android_sdk_release());
        hVar.C("os");
        this.nullableLongAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getSampleOffsetMs$embrace_android_sdk_release());
        hVar.C(QueryKeys.TOKEN);
        this.nullableLongAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getThreadBlockedTimestamp$embrace_android_sdk_release());
        hVar.C("ss");
        this.nullableMutableListOfNativeThreadAnrSampleAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getSamples$embrace_android_sdk_release());
        hVar.C("s");
        this.nullableIntAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getState$embrace_android_sdk_release());
        hVar.C("uw");
        this.nullableIntAdapter.mo197toJson(hVar, nativeThreadAnrInterval.getUnwinder$embrace_android_sdk_release());
        hVar.l();
    }
}
