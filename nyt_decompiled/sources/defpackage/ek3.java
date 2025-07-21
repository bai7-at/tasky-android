package defpackage;

import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.video.views.VideoControlView;

/* loaded from: classes4.dex */
public final class ek3 {
    private final w89 a;
    private final String b;
    private NYTMediaItem c;

    public ek3(jk jkVar, w89 w89Var) {
        zq3.h(jkVar, "activity");
        zq3.h(w89Var, "videoEventReporter");
        this.a = w89Var;
        String stringExtra = jkVar.getIntent().getStringExtra("com.nytimes.android.fullscreen.extra_style");
        this.b = stringExtra == null ? "Inline" : stringExtra;
    }

    public void a() {
        w89 w89Var = this.a;
        NYTMediaItem nYTMediaItem = this.c;
        if (nYTMediaItem == null) {
            zq3.z("item");
            nYTMediaItem = null;
        }
        w89Var.m(nYTMediaItem, this.b);
    }

    public void b() {
        w89 w89Var = this.a;
        NYTMediaItem nYTMediaItem = this.c;
        if (nYTMediaItem == null) {
            zq3.z("item");
            nYTMediaItem = null;
        }
        w89Var.e(nYTMediaItem, this.b);
    }

    public void c() {
        w89 w89Var = this.a;
        NYTMediaItem nYTMediaItem = this.c;
        if (nYTMediaItem == null) {
            zq3.z("item");
            nYTMediaItem = null;
        }
        w89Var.c(nYTMediaItem, this.b);
    }

    public final void d(VideoControlView.ControlInteractionCallback.Interaction interaction) {
        zq3.h(interaction, "interaction");
        if (interaction == VideoControlView.ControlInteractionCallback.Interaction.SEEK) {
            w89 w89Var = this.a;
            NYTMediaItem nYTMediaItem = this.c;
            if (nYTMediaItem == null) {
                zq3.z("item");
                nYTMediaItem = null;
            }
            w89Var.k(nYTMediaItem);
        }
    }

    public final void e(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.c = nYTMediaItem;
    }
}
