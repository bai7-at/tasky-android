package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.p;
import com.nytimes.android.room.common.CompositeState;

/* loaded from: classes4.dex */
public final class ov5 {
    private final cl4 a;
    private final f06 b;

    public ov5(cl4 cl4Var, f06 f06Var) {
        zq3.h(cl4Var, "mediaProxy");
        zq3.h(f06Var, "stateMachine");
        this.a = cl4Var;
        this.b = f06Var;
    }

    private final CompositeState a(int i) {
        return CompositeState.Companion.a(i);
    }

    private final void e(NYTMediaItem nYTMediaItem, p pVar) {
        Long f0 = nYTMediaItem.f0();
        if (f0 != null) {
            this.a.c(Long.valueOf(f0.longValue()), nYTMediaItem.p(), pVar.m0(), a(pVar.V()));
        }
    }

    public final void b(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.a.a(nYTMediaItem.p());
    }

    public final void c(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.b.c(nYTMediaItem);
    }

    public final void d(NYTMediaItem nYTMediaItem, long j) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.a.c(nYTMediaItem.f0(), nYTMediaItem.p(), j, CompositeState.STOPPED);
    }

    public final void f(NYTMediaItem nYTMediaItem, p pVar) {
        zq3.h(nYTMediaItem, "mediaItem");
        zq3.h(pVar, "playback");
        this.b.a(nYTMediaItem);
        if (this.b.b()) {
            this.a.b(nYTMediaItem.p(), pVar);
        } else {
            e(nYTMediaItem, pVar);
        }
    }
}
