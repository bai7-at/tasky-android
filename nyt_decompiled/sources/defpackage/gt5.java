package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import java.util.Locale;

/* loaded from: classes4.dex */
public class gt5 extends al4 {
    final TextView t;

    public gt5(View view) {
        super(view, true, 0);
        this.t = (TextView) view.findViewById(pg6.title);
    }

    @Override // defpackage.al4
    protected void d(Asset asset, SectionFront sectionFront, ImageView imageView) {
        this.t.setText(asset.getDisplayTitle());
    }

    @Override // defpackage.al4
    protected void g(VideoAsset videoAsset, TextView textView) {
        String channel = videoAsset.getChannel();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int e = fp2.e(this.n, channel.toUpperCase(Locale.getDefault()), spannableStringBuilder, 0, um6.TextView_Overlay_PhotoVideo, "");
        String upperCase = videoAsset.getShow().toUpperCase(Locale.getDefault());
        String str = TextUtils.isEmpty(upperCase) ? "" : "  ";
        int e2 = fp2.e(this.n, str + upperCase, spannableStringBuilder, e, um6.TextView_Overlay_PhotoVideo_Show, "");
        if (!TextUtils.isEmpty(videoAsset.getByline())) {
            e2 = fp2.e(this.n, String.format(this.a, videoAsset.getByline()), spannableStringBuilder, fp2.e(this.n, this.b, spannableStringBuilder, e2, um6.TextView_Overlay_PhotoVideo, ""), um6.TextView_Overlay_PhotoVideo_Byline, "");
        }
        if (!videoAsset.isLive()) {
            String h = h(videoAsset.getVideoDuration());
            fp2.e(this.n, this.b + h, spannableStringBuilder, e2, um6.TextView_Overlay_PhotoVideo, "");
        }
        textView.setText(spannableStringBuilder);
    }
}
