package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;

/* loaded from: classes4.dex */
public final class b40 implements f99 {
    private final FrameLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final RadiusLayout d;
    public final FrameLayout e;
    public final VectorTextView f;
    public final FrameLayout g;

    private b40(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = imageView;
        this.d = radiusLayout;
        this.e = frameLayout3;
        this.f = vectorTextView;
        this.g = frameLayout4;
    }

    public static b40 a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = ch6.balloon_arrow;
        ImageView imageView = (ImageView) g99.a(view, i);
        if (imageView != null) {
            i = ch6.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) g99.a(view, i);
            if (radiusLayout != null) {
                i = ch6.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) g99.a(view, i);
                if (frameLayout2 != null) {
                    i = ch6.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) g99.a(view, i);
                    if (vectorTextView != null) {
                        i = ch6.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) g99.a(view, i);
                        if (frameLayout3 != null) {
                            return new b40(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static b40 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ri6.balloon_layout_body, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.a;
    }
}
