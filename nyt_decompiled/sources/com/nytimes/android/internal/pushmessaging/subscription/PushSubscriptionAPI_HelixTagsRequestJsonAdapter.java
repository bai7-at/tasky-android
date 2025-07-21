package com.nytimes.android.internal.pushmessaging.subscription;

import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PushSubscriptionAPI_HelixTagsRequestJsonAdapter extends JsonAdapter<PushSubscriptionAPI.HelixTagsRequest> {
    private final JsonReader.b options;
    private final JsonAdapter<Set<String>> setOfStringAdapter;

    public PushSubscriptionAPI_HelixTagsRequestJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tags");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Set<String>> f = iVar.f(j.j(Set.class, String.class), b0.e(), "tags");
        zq3.g(f, "adapter(...)");
        this.setOfStringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PushSubscriptionAPI.HelixTagsRequest fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Set set = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (set = (Set) this.setOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("tags", "tags", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (set != null) {
            return new PushSubscriptionAPI.HelixTagsRequest(set);
        }
        JsonDataException o = c29.o("tags", "tags", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PushSubscriptionAPI.HelixTagsRequest helixTagsRequest) {
        zq3.h(hVar, "writer");
        if (helixTagsRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tags");
        this.setOfStringAdapter.mo197toJson(hVar, helixTagsRequest.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushSubscriptionAPI.HelixTagsRequest");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
