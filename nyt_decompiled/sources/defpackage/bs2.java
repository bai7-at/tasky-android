package defpackage;

import com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.util.VideoUtil;
import com.nytimes.android.media.video.presenter.FullscreenVideoFetcher;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.video.FullscreenToolsController;

/* loaded from: classes4.dex */
public abstract class bs2 implements op4 {
    public static void a(FullScreenVideoFragment fullScreenVideoFragment, z4 z4Var) {
        fullScreenVideoFragment.activityMediaManager = z4Var;
    }

    public static void b(FullScreenVideoFragment fullScreenVideoFragment, AudioManager audioManager) {
        fullScreenVideoFragment.audioManager = audioManager;
    }

    public static void c(FullScreenVideoFragment fullScreenVideoFragment, hb5 hb5Var) {
        fullScreenVideoFragment.mediaControl = hb5Var;
    }

    public static void d(FullScreenVideoFragment fullScreenVideoFragment, zh4 zh4Var) {
        fullScreenVideoFragment.mediaEvents = zh4Var;
    }

    public static void e(FullScreenVideoFragment fullScreenVideoFragment, bo4 bo4Var) {
        fullScreenVideoFragment.mediaServiceConnection = bo4Var;
    }

    public static void f(FullScreenVideoFragment fullScreenVideoFragment, NetworkStatus networkStatus) {
        fullScreenVideoFragment.networkStatus = networkStatus;
    }

    public static void g(FullScreenVideoFragment fullScreenVideoFragment, FullscreenToolsController fullscreenToolsController) {
        fullScreenVideoFragment.toolsController = fullscreenToolsController;
    }

    public static void h(FullScreenVideoFragment fullScreenVideoFragment, x89 x89Var) {
        fullScreenVideoFragment.videoEventReporter = x89Var;
    }

    public static void i(FullScreenVideoFragment fullScreenVideoFragment, FullscreenVideoFetcher fullscreenVideoFetcher) {
        fullScreenVideoFragment.videoFetcher = fullscreenVideoFetcher;
    }

    public static void j(FullScreenVideoFragment fullScreenVideoFragment, VideoUtil videoUtil) {
        fullScreenVideoFragment.videoUtil = videoUtil;
    }
}
