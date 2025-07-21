package defpackage;

import com.nytimes.android.fragment.fullscreen.FullScreenImageFragment;
import com.nytimes.android.utils.cropping.ImageCropper;
import com.nytimes.android.video.FullscreenToolsController;

/* loaded from: classes4.dex */
public abstract class pr2 implements op4 {
    public static void a(FullScreenImageFragment fullScreenImageFragment, ImageCropper imageCropper) {
        fullScreenImageFragment.imageCropper = imageCropper;
    }

    public static void b(FullScreenImageFragment fullScreenImageFragment, b04 b04Var) {
        fullScreenImageFragment.sharingManager = b04Var;
    }

    public static void c(FullScreenImageFragment fullScreenImageFragment, FullscreenToolsController fullscreenToolsController) {
        fullScreenImageFragment.toolsController = fullscreenToolsController;
    }
}
