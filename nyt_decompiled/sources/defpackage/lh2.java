package defpackage;

import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.i;
import java.util.List;

/* loaded from: classes2.dex */
public final class lh2 implements f93 {
    private final f93 a;
    private final List b;

    public lh2(f93 f93Var, List list) {
        this.a = f93Var;
        this.b = list;
    }

    @Override // defpackage.f93
    public i.a a() {
        return new mh2(this.a.a(), this.b);
    }

    @Override // defpackage.f93
    public i.a b(d dVar, c cVar) {
        return new mh2(this.a.b(dVar, cVar), this.b);
    }
}
