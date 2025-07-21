package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.sectionfront.adapter.viewholder.a;
import com.nytimes.android.utils.DeviceUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class r1 extends a {
    protected int L;
    protected TextView M;
    protected TextView N;
    protected AspectRatioImageView Q;
    protected ImageView S;
    private final boolean X;

    public r1(View view) {
        super(view);
        this.X = DeviceUtils.G(this.y);
        this.Q = (AspectRatioImageView) this.a.findViewById(pg6.sf_photo_video);
        this.L = DeviceUtils.p(this.y);
        this.M = (TextView) this.a.findViewById(pg6.title);
        this.N = (TextView) this.a.findViewById(pg6.kicker);
        this.S = (ImageView) this.a.findViewById(pg6.overlay);
    }

    protected void h0(Asset asset) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (AssetUtils.isVideo(asset)) {
            i = oe6.ic_media_overlay_video_lg;
            VideoAsset videoAsset = (VideoAsset) asset;
            String show = videoAsset.getShow();
            if (!this.X || TextUtils.isEmpty(show)) {
                spannableStringBuilder.append((CharSequence) videoAsset.getChannel().toUpperCase(Locale.getDefault()));
                if (!videoAsset.isLive()) {
                    spannableStringBuilder.append((CharSequence) "  |  ");
                }
                fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Prefix, 0, spannableStringBuilder.length());
                if (!videoAsset.isLive()) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) videoAsset.getVideoDurationFormatted());
                    fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Duration, length, spannableStringBuilder.length());
                }
            } else {
                spannableStringBuilder.append((CharSequence) videoAsset.getChannel().toUpperCase(Locale.getDefault())).append((CharSequence) "  ");
                fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Prefix, 0, spannableStringBuilder.length());
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) show.toUpperCase(Locale.getDefault()));
                fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Show, length2, spannableStringBuilder.length());
                if (!videoAsset.isLive()) {
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "  |  ").append((CharSequence) videoAsset.getVideoDurationFormatted());
                    fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Duration, length3, spannableStringBuilder.length());
                }
            }
        } else if (AssetUtils.isSlideshow(asset)) {
            i = oe6.ic_media_overlay_slideshow_lg;
            spannableStringBuilder = new SpannableStringBuilder(asset.getSectionDisplayName().toUpperCase(Locale.getDefault()));
            fp2.c(this.y, spannableStringBuilder, um6.TextView_SFPhotoVideoCaption_Prefix, 0, spannableStringBuilder.length());
        } else {
            i = -1;
        }
        ImageView imageView = this.S;
        if (imageView != null && i != -1) {
            imageView.setImageResource(i);
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
    }
}
