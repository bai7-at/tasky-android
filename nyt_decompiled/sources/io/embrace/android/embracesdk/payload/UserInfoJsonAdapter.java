package io.embrace.android.embracesdk.payload;

import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class UserInfoJsonAdapter extends JsonAdapter<UserInfo> {
    private volatile Constructor<UserInfo> constructorRef;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public UserInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", Tag.EM, "un", "per");
        zq3.g(a, "JsonReader.Options.of(\"id\", \"em\", \"un\", \"per\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "userId");
        zq3.g(f, "moshi.adapter(String::cl…    emptySet(), \"userId\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Set<String>> f2 = iVar.f(j.j(Set.class, String.class), b0.e(), "personas");
        zq3.g(f2, "moshi.adapter(Types.newP…ySet(),\n      \"personas\")");
        this.nullableSetOfStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UserInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UserInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Set set = null;
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
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            return new UserInfo(str, str2, str3, set);
        }
        Constructor<UserInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UserInfo.class.getDeclaredConstructor(String.class, String.class, String.class, Set.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "UserInfo::class.java.get…his.constructorRef = it }");
        }
        UserInfo newInstance = constructor.newInstance(str, str2, str3, set, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserInfo userInfo) {
        zq3.h(hVar, "writer");
        if (userInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.nullableStringAdapter.mo197toJson(hVar, userInfo.getUserId());
        hVar.C(Tag.EM);
        this.nullableStringAdapter.mo197toJson(hVar, userInfo.getEmail());
        hVar.C("un");
        this.nullableStringAdapter.mo197toJson(hVar, userInfo.getUsername());
        hVar.C("per");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, userInfo.getPersonas());
        hVar.l();
    }
}
