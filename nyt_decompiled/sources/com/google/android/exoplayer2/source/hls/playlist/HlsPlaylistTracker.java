package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.h;
import defpackage.b93;
import defpackage.f93;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(b93 b93Var, h hVar, f93 f93Var);
    }

    public interface b {
        void a();

        boolean e(Uri uri, h.c cVar, boolean z);
    }

    public interface c {
        void b(com.google.android.exoplayer2.source.hls.playlist.c cVar);
    }

    void a(b bVar);

    void b(Uri uri);

    long c();

    d d();

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean i(Uri uri, long j);

    boolean isLive();

    void j(Uri uri, p.a aVar, c cVar);

    void l();

    com.google.android.exoplayer2.source.hls.playlist.c m(Uri uri, boolean z);

    void stop();
}
