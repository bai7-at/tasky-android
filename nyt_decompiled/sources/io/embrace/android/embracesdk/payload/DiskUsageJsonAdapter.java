package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class DiskUsageJsonAdapter extends JsonAdapter<DiskUsage> {
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public DiskUsageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("as", "fs");
        zq3.g(a, "JsonReader.Options.of(\"as\", \"fs\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "appDiskUsage");
        zq3.g(f, "moshi.adapter(Long::clas…ptySet(), \"appDiskUsage\")");
        this.nullableLongAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DiskUsage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DiskUsage fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new DiskUsage(l, l2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DiskUsage diskUsage) {
        zq3.h(hVar, "writer");
        if (diskUsage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("as");
        this.nullableLongAdapter.mo197toJson(hVar, diskUsage.getAppDiskUsage());
        hVar.C("fs");
        this.nullableLongAdapter.mo197toJson(hVar, diskUsage.getDeviceDiskFree());
        hVar.l();
    }
}
