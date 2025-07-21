package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes3.dex */
final class v1g implements g7g {
    public long a;
    public long b;
    public e7g c;
    public v1g d;

    public v1g(long j, int i) {
        c(j, 65536);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.c.b;
        return (int) j2;
    }

    public final v1g b() {
        this.c = null;
        v1g v1gVar = this.d;
        this.d = null;
        return v1gVar;
    }

    public final void c(long j, int i) {
        wad.f(this.c == null);
        this.a = j;
        this.b = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    @Override // defpackage.g7g
    public final e7g zzc() {
        e7g e7gVar = this.c;
        e7gVar.getClass();
        return e7gVar;
    }

    @Override // defpackage.g7g
    public final g7g zzd() {
        v1g v1gVar = this.d;
        if (v1gVar == null || v1gVar.c == null) {
            return null;
        }
        return v1gVar;
    }
}
