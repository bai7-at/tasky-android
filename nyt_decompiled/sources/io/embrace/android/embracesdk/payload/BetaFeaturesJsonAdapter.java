package io.embrace.android.embracesdk.payload;

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
public final class BetaFeaturesJsonAdapter extends JsonAdapter<BetaFeatures> {
    private volatile Constructor<BetaFeatures> constructorRef;
    private final JsonAdapter<List<ThermalState>> nullableListOfThermalStateAdapter;
    private final JsonReader.b options;

    public BetaFeaturesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ts");
        zq3.g(a, "JsonReader.Options.of(\"ts\")");
        this.options = a;
        JsonAdapter<List<ThermalState>> f = iVar.f(j.j(List.class, ThermalState.class), b0.e(), "thermalStates");
        zq3.g(f, "moshi.adapter(Types.newP…tySet(), \"thermalStates\")");
        this.nullableListOfThermalStateAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BetaFeatures");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BetaFeatures fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfThermalStateAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new BetaFeatures(list);
        }
        Constructor<BetaFeatures> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BetaFeatures.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "BetaFeatures::class.java…his.constructorRef = it }");
        }
        BetaFeatures newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BetaFeatures betaFeatures) {
        zq3.h(hVar, "writer");
        if (betaFeatures == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ts");
        this.nullableListOfThermalStateAdapter.mo197toJson(hVar, betaFeatures.getThermalStates$embrace_android_sdk_release());
        hVar.l();
    }
}
