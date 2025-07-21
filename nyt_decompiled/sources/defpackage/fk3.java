package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.views.ExoPlayerView;

/* loaded from: classes4.dex */
public final class fk3 implements f99 {
    private final View a;
    public final ExoPlayerView b;
    public final VideoCover c;

    private fk3(View view, ExoPlayerView exoPlayerView, VideoCover videoCover) {
        this.a = view;
        this.b = exoPlayerView;
        this.c = videoCover;
    }

    public static fk3 a(View view) {
        int i = zg6.exoPlayerView;
        ExoPlayerView exoPlayerView = (ExoPlayerView) g99.a(view, i);
        if (exoPlayerView != null) {
            i = zg6.videoCover;
            VideoCover videoCover = (VideoCover) g99.a(view, i);
            if (videoCover != null) {
                return new fk3(view, exoPlayerView, videoCover);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static fk3 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(oi6.inline_video_contents, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
