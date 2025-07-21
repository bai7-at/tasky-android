package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;

/* loaded from: classes4.dex */
public final class d40 implements f99 {
    private final BalloonAnchorOverlayView a;
    public final BalloonAnchorOverlayView b;

    private d40(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.a = balloonAnchorOverlayView;
        this.b = balloonAnchorOverlayView2;
    }

    public static d40 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) view;
        return new d40(balloonAnchorOverlayView, balloonAnchorOverlayView);
    }

    public static d40 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ri6.balloon_layout_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BalloonAnchorOverlayView getRoot() {
        return this.a;
    }
}
