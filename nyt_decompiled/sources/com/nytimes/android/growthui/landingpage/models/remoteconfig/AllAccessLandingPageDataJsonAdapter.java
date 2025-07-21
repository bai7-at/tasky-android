package com.nytimes.android.growthui.landingpage.models.remoteconfig;

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

/* loaded from: classes4.dex */
public final class AllAccessLandingPageDataJsonAdapter extends JsonAdapter<AllAccessLandingPageData> {
    public static final int $stable = 8;
    private final JsonAdapter<AllAccessPackageData> allAccessPackageDataAdapter;
    private volatile Constructor<AllAccessLandingPageData> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<AllAccessUrgencyMessageData>> nullableListOfAllAccessUrgencyMessageDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AllAccessLandingPageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("policy_messages", "all_access_package", "urgency_messages", "icons");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "policyMessages");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<AllAccessPackageData> f2 = iVar.f(AllAccessPackageData.class, b0.e(), "allAccessPackage");
        zq3.g(f2, "adapter(...)");
        this.allAccessPackageDataAdapter = f2;
        JsonAdapter<List<AllAccessUrgencyMessageData>> f3 = iVar.f(j.j(List.class, AllAccessUrgencyMessageData.class), b0.e(), "urgencyMessages");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfAllAccessUrgencyMessageDataAdapter = f3;
        JsonAdapter<List<String>> f4 = iVar.f(j.j(List.class, String.class), b0.e(), "icons");
        zq3.g(f4, "adapter(...)");
        this.listOfStringAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AllAccessLandingPageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        AllAccessPackageData allAccessPackageData = null;
        List list = null;
        List list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("policyMessages", "policy_messages", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                allAccessPackageData = (AllAccessPackageData) this.allAccessPackageDataAdapter.fromJson(jsonReader);
                if (allAccessPackageData == null) {
                    JsonDataException x2 = c29.x("allAccessPackage", "all_access_package", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                list = (List) this.nullableListOfAllAccessUrgencyMessageDataAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                list2 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    JsonDataException x3 = c29.x("icons", "icons", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -16) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(allAccessPackageData, "null cannot be cast to non-null type com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData");
            zq3.f(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new AllAccessLandingPageData(str, allAccessPackageData, list, list2);
        }
        Constructor<AllAccessLandingPageData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AllAccessLandingPageData.class.getDeclaredConstructor(String.class, AllAccessPackageData.class, List.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AllAccessLandingPageData newInstance = constructor.newInstance(str, allAccessPackageData, list, list2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AllAccessLandingPageData allAccessLandingPageData) {
        zq3.h(hVar, "writer");
        if (allAccessLandingPageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("policy_messages");
        this.stringAdapter.mo197toJson(hVar, allAccessLandingPageData.c());
        hVar.C("all_access_package");
        this.allAccessPackageDataAdapter.mo197toJson(hVar, allAccessLandingPageData.a());
        hVar.C("urgency_messages");
        this.nullableListOfAllAccessUrgencyMessageDataAdapter.mo197toJson(hVar, allAccessLandingPageData.d());
        hVar.C("icons");
        this.listOfStringAdapter.mo197toJson(hVar, allAccessLandingPageData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AllAccessLandingPageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
