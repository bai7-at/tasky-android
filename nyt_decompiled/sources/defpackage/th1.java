package defpackage;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.i;

/* loaded from: classes2.dex */
public final class th1 implements f93 {
    @Override // defpackage.f93
    public i.a a() {
        return new HlsPlaylistParser();
    }

    @Override // defpackage.f93
    public i.a b(d dVar, c cVar) {
        return new HlsPlaylistParser(dVar, cVar);
    }
}
