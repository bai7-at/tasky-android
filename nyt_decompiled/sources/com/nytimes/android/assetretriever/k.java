package com.nytimes.android.assetretriever;

import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class k {
    private final long a;
    private final e.b b;
    private final e.c c;
    private final Instant d;
    private final Instant e;
    private final int f;
    private final Instant g;
    private final boolean h;
    private final e.b i;

    public k(long j, e.b bVar, e.c cVar, Instant instant, Instant instant2, int i, Instant instant3, boolean z, e.b bVar2) {
        zq3.h(instant2, "insertDate");
        zq3.h(instant3, "nextAttempt");
        this.a = j;
        this.b = bVar;
        this.c = cVar;
        this.d = instant;
        this.e = instant2;
        this.f = i;
        this.g = instant3;
        this.h = z;
        this.i = bVar2;
    }

    public final k a(long j, e.b bVar, e.c cVar, Instant instant, Instant instant2, int i, Instant instant3, boolean z, e.b bVar2) {
        zq3.h(instant2, "insertDate");
        zq3.h(instant3, "nextAttempt");
        return new k(j, bVar, cVar, instant, instant2, i, instant3, z, bVar2);
    }

    public final int c() {
        return this.f;
    }

    public final e.b d() {
        return this.i;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && zq3.c(this.b, kVar.b) && zq3.c(this.c, kVar.c) && zq3.c(this.d, kVar.d) && zq3.c(this.e, kVar.e) && this.f == kVar.f && zq3.c(this.g, kVar.g) && this.h == kVar.h && zq3.c(this.i, kVar.i);
    }

    public final Instant f() {
        return this.e;
    }

    public final Instant g() {
        return this.g;
    }

    public final Instant h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        e.b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e.c cVar = this.c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Instant instant = this.d;
        int hashCode4 = (((((((((hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31;
        e.b bVar2 = this.i;
        return hashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public final e.b i() {
        return this.b;
    }

    public final e.c j() {
        return this.c;
    }

    public final boolean k() {
        return this.h;
    }

    public String toString() {
        return "AssetRequestEntity(id=" + this.a + ", requestedUri=" + this.b + ", requestedUrl=" + this.c + ", requestedLastModified=" + this.d + ", insertDate=" + this.e + ", attempts=" + this.f + ", nextAttempt=" + this.g + ", isRunning=" + this.h + ", downloadedUri=" + this.i + ")";
    }

    public /* synthetic */ k(long j, e.b bVar, e.c cVar, Instant instant, Instant instant2, int i, Instant instant3, boolean z, e.b bVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, bVar, cVar, instant, instant2, i, instant3, z, bVar2);
    }

    public /* synthetic */ k(e eVar, Instant instant, Instant instant2, e.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? null : bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Instant instant, Instant instant2, e.b bVar) {
        this(0L, eVar instanceof e.b ? (e.b) eVar : null, eVar instanceof e.c ? (e.c) eVar : null, instant2, instant, 0, instant, false, bVar, 1, null);
        zq3.h(eVar, "assetIdentifier");
        zq3.h(instant, "now");
    }
}
