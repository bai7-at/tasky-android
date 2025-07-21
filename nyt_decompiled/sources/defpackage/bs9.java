package defpackage;

import android.view.Surface;

/* loaded from: classes3.dex */
abstract class bs9 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            ezd.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
