package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.nytimes.android.video.sectionfront.ui.VideoCoverTimeTextView;

/* loaded from: classes4.dex */
public final class q79 implements f99 {
    private final ConstraintLayout a;
    public final AppCompatImageView b;
    public final View c;
    public final ImageView d;
    public final ImageView e;
    public final Guideline f;
    public final Guideline g;
    public final Guideline h;
    public final Guideline i;
    public final ImageView j;
    public final ImageView k;
    public final VideoCoverTimeTextView l;
    public final TextView m;
    public final View n;

    private q79(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ImageView imageView, ImageView imageView2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView3, ImageView imageView4, VideoCoverTimeTextView videoCoverTimeTextView, TextView textView, View view2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = view;
        this.d = imageView;
        this.e = imageView2;
        this.f = guideline;
        this.g = guideline2;
        this.h = guideline3;
        this.i = guideline4;
        this.j = imageView3;
        this.k = imageView4;
        this.l = videoCoverTimeTextView;
        this.m = textView;
        this.n = view2;
    }

    public static q79 a(View view) {
        View a;
        View a2;
        int i = zg6.defaultShareButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g99.a(view, i);
        if (appCompatImageView != null && (a = g99.a(view, (i = zg6.divider))) != null) {
            i = zg6.emailShareButton;
            ImageView imageView = (ImageView) g99.a(view, i);
            if (imageView != null) {
                i = zg6.fbShareButton;
                ImageView imageView2 = (ImageView) g99.a(view, i);
                if (imageView2 != null) {
                    i = zg6.guidelineBottom;
                    Guideline guideline = (Guideline) g99.a(view, i);
                    if (guideline != null) {
                        i = zg6.guidelineEnd;
                        Guideline guideline2 = (Guideline) g99.a(view, i);
                        if (guideline2 != null) {
                            i = zg6.guidelineStart;
                            Guideline guideline3 = (Guideline) g99.a(view, i);
                            if (guideline3 != null) {
                                i = zg6.guidelineTop;
                                Guideline guideline4 = (Guideline) g99.a(view, i);
                                if (guideline4 != null) {
                                    i = zg6.replayButton;
                                    ImageView imageView3 = (ImageView) g99.a(view, i);
                                    if (imageView3 != null) {
                                        i = zg6.twitterShareButton;
                                        ImageView imageView4 = (ImageView) g99.a(view, i);
                                        if (imageView4 != null) {
                                            i = zg6.videoDuration;
                                            VideoCoverTimeTextView videoCoverTimeTextView = (VideoCoverTimeTextView) g99.a(view, i);
                                            if (videoCoverTimeTextView != null) {
                                                i = zg6.videoTitle;
                                                TextView textView = (TextView) g99.a(view, i);
                                                if (textView != null && (a2 = g99.a(view, (i = zg6.view))) != null) {
                                                    return new q79((ConstraintLayout) view, appCompatImageView, a, imageView, imageView2, guideline, guideline2, guideline3, guideline4, imageView3, imageView4, videoCoverTimeTextView, textView, a2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static q79 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(oi6.video_end_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
