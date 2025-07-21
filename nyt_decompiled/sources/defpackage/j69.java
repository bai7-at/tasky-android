package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaControllerCompat;
import com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment;
import com.nytimes.android.utils.NetworkStatus;

/* loaded from: classes4.dex */
public final class j69 extends BroadcastReceiver {
    private final FullScreenVideoFragment a;
    private final MediaControllerCompat b;
    private final NetworkStatus c;

    public j69(FullScreenVideoFragment fullScreenVideoFragment, MediaControllerCompat mediaControllerCompat, NetworkStatus networkStatus) {
        zq3.h(fullScreenVideoFragment, "videoFragment");
        zq3.h(mediaControllerCompat, "mediaControllerCompat");
        zq3.h(networkStatus, "networkStatus");
        this.a = fullScreenVideoFragment;
        this.b = mediaControllerCompat;
        this.c = networkStatus;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        if (this.c.g()) {
            return;
        }
        if (this.b.d().h() == 3) {
            zm8.e(context, em6.no_network_message);
        }
        this.b.g().b();
        FullScreenVideoFragment fullScreenVideoFragment = this.a;
        fullScreenVideoFragment.P1(FullScreenVideoFragment.Params.b(fullScreenVideoFragment.y1(), 0L, false, null, 5, null));
    }
}
