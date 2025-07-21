package defpackage;

import com.nytimes.android.analytics.event.audio.AudioReferralSource;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.common.a;

/* loaded from: classes3.dex */
public final class ex {
    private final AudioManager a;
    private final bo4 b;
    private final a c;
    private final ax d;

    public ex(AudioManager audioManager, bo4 bo4Var, a aVar, ax axVar) {
        zq3.h(audioManager, "audioManager");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(aVar, "assetToMediaItem");
        zq3.h(axVar, "audioEventReporter");
        this.a = audioManager;
        this.b = bo4Var;
        this.c = aVar;
        this.d = axVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ex exVar, AudioAsset audioAsset) {
        zq3.h(exVar, "this$0");
        zq3.h(audioAsset, "$audioAsset");
        NYTMediaItem a = exVar.c.a(audioAsset, null);
        exVar.b.h(a, qo4.Companion.b(), null);
        exVar.d.a(a, AudioReferralSource.ARTICLE);
        exVar.a.m();
        exVar.a.g();
    }

    public final void b(final AudioAsset audioAsset) {
        zq3.h(audioAsset, "audioAsset");
        this.b.d(new oz4() { // from class: dx
            @Override // defpackage.oz4
            public final void call() {
                ex.c(ex.this, audioAsset);
            }
        });
    }
}
