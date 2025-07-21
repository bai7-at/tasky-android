package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.VideoAsset;

/* loaded from: classes4.dex */
public class al4 {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected ImageView f;
    protected ImageView g;
    protected View h;
    protected TextView i;
    protected TextView j;
    protected int k;
    protected int l;
    protected Space m;
    protected Context n;
    private final int o;
    private final int p;
    private final int q;
    private final boolean r;
    private final int s;

    public al4(View view, boolean z, int i) {
        this.h = view.findViewById(pg6.mediaOverlayContainer);
        this.r = z;
        this.n = view.getContext();
        this.s = i;
        this.b = view.getContext().getResources().getString(wk6.top_region_overlay_sep);
        this.m = (Space) view.findViewById(pg6.overlaySpace);
        this.c = view.getContext().getResources().getString(wk6.top_region_overlay_slideshow);
        this.d = view.getContext().getResources().getString(wk6.imageslideshow_overlay_prepend);
        this.e = view.getContext().getResources().getString(wk6.video_overlay_prepend);
        this.j = (TextView) view.findViewById(pg6.title);
        this.g = (ImageView) view.findViewById(pg6.embedded_large_media_overlay);
        View view2 = this.h;
        if (view2 != null) {
            this.f = (ImageView) view2.findViewById(pg6.overlay);
            this.i = (TextView) this.h.findViewById(pg6.kicker);
        }
        this.k = view.getContext().getResources().getDimensionPixelSize(ee6.media_overlay_left_margin);
        this.l = view.getContext().getResources().getDimensionPixelSize(ee6.media_overlay_bottom_margin);
        this.a = view.getContext().getString(wk6.fullscreen_video_byline);
        this.p = view.getContext().getResources().getDimensionPixelSize(ee6.media_overlay_left_margin);
        this.q = view.getContext().getResources().getDimensionPixelSize(ee6.media_overlay_left_margin_inset);
        this.o = view.getContext().getResources().getDimensionPixelSize(ee6.row_search_padding_left_right);
    }

    public void a(Asset asset, SectionFront sectionFront) {
        if (asset == null) {
            return;
        }
        if (j(asset, sectionFront)) {
            if (this.h == null) {
                d(asset, sectionFront, this.g);
                return;
            } else {
                b(asset, sectionFront);
                return;
            }
        }
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
            return;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    protected void b(Asset asset, SectionFront sectionFront) {
        this.h.setVisibility(0);
        c(asset, sectionFront, this.f);
        if (this.r) {
            e(asset, this.i);
        }
    }

    protected void c(Asset asset, SectionFront sectionFront, ImageView imageView) {
        int i;
        if (AssetUtils.isSlideshow(asset)) {
            i = oe6.ic_lede_media_overlay_slideshow_sm;
        } else if (AssetUtils.isVideo(asset) || l(asset, sectionFront)) {
            i = oe6.ic_lede_media_overlay_video_sm;
        } else if (AssetUtils.isInteractiveGraphic(asset)) {
            int i2 = oe6.ic_media_overlay_interactive_lg;
            this.h.setPadding(this.k, 0, 0, this.l);
            this.m.setVisibility(8);
            i = i2;
        } else {
            i = -1;
        }
        if (imageView == null || i <= -1) {
            return;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    protected void d(Asset asset, SectionFront sectionFront, ImageView imageView) {
        int i = AssetUtils.isSlideshow(asset) ? oe6.ic_media_overlay_slideshow_lg : (k(asset) || l(asset, sectionFront)) ? oe6.ic_media_overlay_video_lg : AssetUtils.isInteractiveGraphic(asset) ? ie6.ic_media_overlay_interactive_sm : -1;
        if (imageView == null || i <= -1) {
            return;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    protected void e(Asset asset, TextView textView) {
        if (AssetUtils.isVideo(asset)) {
            g((VideoAsset) asset, textView);
            this.j.setText(asset.getDisplayTitle());
        } else if (AssetUtils.isSlideshow(asset)) {
            f((SlideshowAsset) asset, textView);
            this.j.setText(asset.getDisplayTitle());
        }
    }

    protected void f(SlideshowAsset slideshowAsset, TextView textView) {
        String str = this.b + slideshowAsset.getSlideshow().getSlides().size() + this.c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        fp2.e(this.n, str, spannableStringBuilder, fp2.e(this.n, i(slideshowAsset), spannableStringBuilder, 0, um6.TextView_OverlayPrependAction, ""), um6.TextView_OverlayPrependInfo, "");
        textView.setText(spannableStringBuilder);
    }

    protected void g(VideoAsset videoAsset, TextView textView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int e = fp2.e(this.n, i(videoAsset), spannableStringBuilder, 0, um6.TextView_OverlayPrependAction, "");
        if (!TextUtils.isEmpty(videoAsset.getByline())) {
            e = fp2.e(this.n, String.format(this.a, videoAsset.getByline()), spannableStringBuilder, fp2.e(this.n, this.b, spannableStringBuilder, e, um6.TextView_Overlay_PhotoVideo, ""), um6.TextView_Overlay_PhotoVideo_Byline, "");
        }
        if (!videoAsset.isLive()) {
            String h = h(videoAsset.getVideoDuration());
            fp2.e(this.n, this.b + h, spannableStringBuilder, e, um6.TextView_Overlay_PhotoVideo, "");
        }
        textView.setText(spannableStringBuilder);
    }

    protected String h(long j) {
        Object valueOf;
        int a = (int) tb1.a(j);
        int i = a % 60;
        StringBuilder sb = new StringBuilder();
        sb.append(a / 60);
        sb.append(":");
        if (i < 10) {
            valueOf = "0" + i;
        } else {
            valueOf = Integer.valueOf(i);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    protected String i(Asset asset) {
        return AssetUtils.isSlideshow(asset) ? this.d : AssetUtils.isVideo(asset) ? this.e : "";
    }

    protected boolean j(Asset asset, SectionFront sectionFront) {
        return AssetUtils.isVideo(asset) || AssetUtils.isSlideshow(asset) || AssetUtils.isInteractiveGraphic(asset) || l(asset, sectionFront);
    }

    boolean k(Asset asset) {
        return AssetUtils.isVideo(asset) && this.s == 0;
    }

    public boolean l(Asset asset, SectionFront sectionFront) {
        if (sectionFront == null || asset == null) {
            return false;
        }
        Asset promotionalMediaOverride = sectionFront.getPromotionalMediaOverride(asset.getAssetId());
        return (promotionalMediaOverride == null ? asset.getPromotionalMedia() instanceof VideoAsset : promotionalMediaOverride instanceof VideoAsset) && this.s == 0;
    }
}
