package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GetCurrentUserResponseJsonAdapter extends JsonAdapter<GetCurrentUserResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public GetCurrentUserResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("userID", "displayName", "location", "picURL", "title", "comment_notify", "isReporter", "isModerator");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "userID");
        zq3.g(f, "adapter(...)");
        this.nullableLongAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "displayName");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.class, b0.e(), "emailMe");
        zq3.g(f3, "adapter(...)");
        this.nullableBooleanAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GetCurrentUserResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GetCurrentUserResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
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
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        return new GetCurrentUserResponse(l, str, str2, str3, str4, bool, bool2, bool3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GetCurrentUserResponse getCurrentUserResponse) {
        zq3.h(hVar, "writer");
        if (getCurrentUserResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("userID");
        this.nullableLongAdapter.mo197toJson(hVar, getCurrentUserResponse.getUserID());
        hVar.C("displayName");
        this.nullableStringAdapter.mo197toJson(hVar, getCurrentUserResponse.getDisplayName());
        hVar.C("location");
        this.nullableStringAdapter.mo197toJson(hVar, getCurrentUserResponse.getLocation());
        hVar.C("picURL");
        this.nullableStringAdapter.mo197toJson(hVar, getCurrentUserResponse.getPicURL());
        hVar.C("title");
        this.nullableStringAdapter.mo197toJson(hVar, getCurrentUserResponse.getTitle());
        hVar.C("comment_notify");
        this.nullableBooleanAdapter.mo197toJson(hVar, getCurrentUserResponse.getEmailMe());
        hVar.C("isReporter");
        this.nullableBooleanAdapter.mo197toJson(hVar, getCurrentUserResponse.isReporter());
        hVar.C("isModerator");
        this.nullableBooleanAdapter.mo197toJson(hVar, getCurrentUserResponse.isModerator());
        hVar.l();
    }
}
