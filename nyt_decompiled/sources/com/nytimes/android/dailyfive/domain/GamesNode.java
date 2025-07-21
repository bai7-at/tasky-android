package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import org.threeten.bp.Instant;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GamesNode extends b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Instant e;
    private final Long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesNode(String str, String str2, String str3, String str4, Instant instant, Long l) {
        super(null);
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        zq3.h(str3, "headline");
        zq3.h(str4, "summary");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = instant;
        this.f = l;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String a() {
        return this.c;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public Image b() {
        return null;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String c() {
        return this.d;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String d() {
        return this.a;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesNode)) {
            return false;
        }
        GamesNode gamesNode = (GamesNode) obj;
        return zq3.c(this.a, gamesNode.a) && zq3.c(this.b, gamesNode.b) && zq3.c(this.c, gamesNode.c) && zq3.c(this.d, gamesNode.d) && zq3.c(this.e, gamesNode.e) && zq3.c(this.f, gamesNode.f);
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public boolean f() {
        return false;
    }

    public final Instant g() {
        return this.e;
    }

    public final Long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Instant instant = this.e;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Long l = this.f;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "GamesNode(uri=" + this.a + ", url=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", lastModified=" + this.e + ", sourceId=" + this.f + ")";
    }
}
