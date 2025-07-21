package com.nytimes.android.assetretriever;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class d {
    private final e.b a;
    private final String b;
    private final Instant c;
    private final e.c d;
    private final Instant e;
    private final Asset f;

    public d(e.b bVar, String str, Instant instant, e.c cVar, Instant instant2, Asset asset) {
        zq3.h(bVar, "uri");
        zq3.h(instant, "lastModified");
        zq3.h(instant2, "downloadDate");
        zq3.h(asset, "jsonData");
        this.a = bVar;
        this.b = str;
        this.c = instant;
        this.d = cVar;
        this.e = instant2;
        this.f = asset;
    }

    public static /* synthetic */ d b(d dVar, e.b bVar, String str, Instant instant, e.c cVar, Instant instant2, Asset asset, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = dVar.a;
        }
        if ((i & 2) != 0) {
            str = dVar.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            instant = dVar.c;
        }
        Instant instant3 = instant;
        if ((i & 8) != 0) {
            cVar = dVar.d;
        }
        e.c cVar2 = cVar;
        if ((i & 16) != 0) {
            instant2 = dVar.e;
        }
        Instant instant4 = instant2;
        if ((i & 32) != 0) {
            asset = dVar.f;
        }
        return dVar.a(bVar, str2, instant3, cVar2, instant4, asset);
    }

    public final d a(e.b bVar, String str, Instant instant, e.c cVar, Instant instant2, Asset asset) {
        zq3.h(bVar, "uri");
        zq3.h(instant, "lastModified");
        zq3.h(instant2, "downloadDate");
        zq3.h(asset, "jsonData");
        return new d(bVar, str, instant, cVar, instant2, asset);
    }

    public final String c() {
        return this.b;
    }

    public final Instant d() {
        return this.e;
    }

    public final Asset e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d) && zq3.c(this.e, dVar.e) && zq3.c(this.f, dVar.f);
    }

    public final Instant f() {
        return this.c;
    }

    public final e.b g() {
        return this.a;
    }

    public final e.c h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        e.c cVar = this.d;
        return ((((hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "AssetEntity(uri=" + this.a + ", assetType=" + this.b + ", lastModified=" + this.c + ", url=" + this.d + ", downloadDate=" + this.e + ", jsonData=" + this.f + ")";
    }
}
