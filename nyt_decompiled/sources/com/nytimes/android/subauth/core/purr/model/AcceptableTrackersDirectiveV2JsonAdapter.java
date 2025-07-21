package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class AcceptableTrackersDirectiveV2JsonAdapter extends JsonAdapter<AcceptableTrackersDirectiveV2> {
    private final JsonAdapter<AcceptableTracker> acceptableTrackerAdapter;
    private final JsonReader.b options;

    public AcceptableTrackersDirectiveV2JsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AcceptableTracker> f = iVar.f(AcceptableTracker.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.acceptableTrackerAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AcceptableTrackersDirectiveV2");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AcceptableTrackersDirectiveV2 fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AcceptableTracker acceptableTracker = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (acceptableTracker = (AcceptableTracker) this.acceptableTrackerAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("value__", "value", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (acceptableTracker != null) {
            return new AcceptableTrackersDirectiveV2(acceptableTracker);
        }
        JsonDataException o = c29.o("value__", "value", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2) {
        zq3.h(hVar, "writer");
        if (acceptableTrackersDirectiveV2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.acceptableTrackerAdapter.mo197toJson(hVar, acceptableTrackersDirectiveV2.getValue());
        hVar.l();
    }
}
