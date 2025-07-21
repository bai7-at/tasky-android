package defpackage;

import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter;
import com.nytimes.android.media.common.NYTMediaItem;

/* loaded from: classes4.dex */
public final class rb3 {
    private final z4 a;
    private final hb5 b;
    private final bo4 c;
    private final AudioManager d;
    private final b04 e;

    public rb3(z4 z4Var, hb5 hb5Var, bo4 bo4Var, AudioManager audioManager, b04 b04Var) {
        zq3.h(z4Var, "mediaManager");
        zq3.h(hb5Var, "mediaControl");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(audioManager, "audioManager");
        zq3.h(b04Var, "audioIndicatorPresenter");
        this.a = z4Var;
        this.b = hb5Var;
        this.c = bo4Var;
        this.d = audioManager;
        this.e = b04Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final rb3 rb3Var, final NYTMediaItem nYTMediaItem) {
        zq3.h(rb3Var, "this$0");
        zq3.h(nYTMediaItem, "$mediaItem");
        if (rb3Var.b.h(nYTMediaItem)) {
            return;
        }
        rb3Var.c.d(new oz4() { // from class: pb3
            @Override // defpackage.oz4
            public final void call() {
                rb3.e(rb3.this, nYTMediaItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(rb3 rb3Var, NYTMediaItem nYTMediaItem) {
        zq3.h(rb3Var, "this$0");
        zq3.h(nYTMediaItem, "$mediaItem");
        rb3Var.c.h(nYTMediaItem, qo4.Companion.b(), null);
        rb3Var.d.m();
        rb3Var.d.g();
        ((AudioIndicatorPresenter) rb3Var.e.get()).R0();
    }

    public final void c(final NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.a.j(new oz4() { // from class: qb3
            @Override // defpackage.oz4
            public final void call() {
                rb3.d(rb3.this, nYTMediaItem);
            }
        });
    }
}
