package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.video.sectionfront.ui.VideoCoverTimeTextView;
import com.nytimes.android.video.sectionfront.ui.VideoEndOverlay;
import com.nytimes.android.video.sectionfront.ui.VideoProgressIndicator;
import com.nytimes.android.video.views.VideoMuteControl;

/* loaded from: classes4.dex */
public final class d79 implements f99 {
    private final View a;
    public final VideoEndOverlay b;
    public final Guideline c;
    public final Guideline d;
    public final ConstraintLayout e;
    public final VideoProgressIndicator f;
    public final Guideline g;
    public final VideoCoverTimeTextView h;
    public final AspectRatioImageView i;
    public final VideoMuteControl j;
    public final ImageView k;
    public final TextView l;

    private d79(View view, VideoEndOverlay videoEndOverlay, Guideline guideline, Guideline guideline2, ConstraintLayout constraintLayout, VideoProgressIndicator videoProgressIndicator, Guideline guideline3, VideoCoverTimeTextView videoCoverTimeTextView, AspectRatioImageView aspectRatioImageView, VideoMuteControl videoMuteControl, ImageView imageView, TextView textView) {
        this.a = view;
        this.b = videoEndOverlay;
        this.c = guideline;
        this.d = guideline2;
        this.e = constraintLayout;
        this.f = videoProgressIndicator;
        this.g = guideline3;
        this.h = videoCoverTimeTextView;
        this.i = aspectRatioImageView;
        this.j = videoMuteControl;
        this.k = imageView;
        this.l = textView;
    }

    public static d79 a(View view) {
        int i = zg6.backCover;
        VideoEndOverlay videoEndOverlay = (VideoEndOverlay) g99.a(view, i);
        if (videoEndOverlay != null) {
            i = zg6.bottomButtonGuideline;
            Guideline guideline = (Guideline) g99.a(view, i);
            if (guideline != null) {
                i = zg6.endButtonGuideline;
                Guideline guideline2 = (Guideline) g99.a(view, i);
                if (guideline2 != null) {
                    i = zg6.frontCover;
                    ConstraintLayout constraintLayout = (ConstraintLayout) g99.a(view, i);
                    if (constraintLayout != null) {
                        i = zg6.progressIndicator;
                        VideoProgressIndicator videoProgressIndicator = (VideoProgressIndicator) g99.a(view, i);
                        if (videoProgressIndicator != null) {
                            i = zg6.topButtonGuideline;
                            Guideline guideline3 = (Guideline) g99.a(view, i);
                            if (guideline3 != null) {
                                i = zg6.videoDuration;
                                VideoCoverTimeTextView videoCoverTimeTextView = (VideoCoverTimeTextView) g99.a(view, i);
                                if (videoCoverTimeTextView != null) {
                                    i = zg6.videoImage;
                                    AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) g99.a(view, i);
                                    if (aspectRatioImageView != null) {
                                        i = zg6.videoMuteControl;
                                        VideoMuteControl videoMuteControl = (VideoMuteControl) g99.a(view, i);
                                        if (videoMuteControl != null) {
                                            i = zg6.videoPlayButton;
                                            ImageView imageView = (ImageView) g99.a(view, i);
                                            if (imageView != null) {
                                                i = zg6.videoTitle;
                                                TextView textView = (TextView) g99.a(view, i);
                                                if (textView != null) {
                                                    return new d79(view, videoEndOverlay, guideline, guideline2, constraintLayout, videoProgressIndicator, guideline3, videoCoverTimeTextView, aspectRatioImageView, videoMuteControl, imageView, textView);
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

    public static d79 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(oi6.video_cover_contents, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
