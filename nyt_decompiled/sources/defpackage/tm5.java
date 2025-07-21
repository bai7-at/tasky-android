package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;

/* loaded from: classes4.dex */
public abstract class tm5 {
    public static void a(TextView textView, TextView textView2, Asset asset, SectionFront sectionFront) {
        if (asset == null) {
            return;
        }
        String displayTitle = asset.getDisplayTitle();
        if (sectionFront.getLedePackage() == null || !sectionFront.getLedePackage().hasBanner() || TextUtils.isEmpty(displayTitle)) {
            textView.setVisibility(8);
            textView2.setText(displayTitle);
        } else {
            if (asset instanceof ArticleAsset) {
                textView2.setText(((ArticleAsset) asset).getArticleSubHeadline());
            } else {
                textView2.setText(asset.getSubHeadline());
            }
            textView.setText(asset.getDisplayTitle());
            textView.setVisibility(0);
        }
        textView2.setVisibility(TextUtils.isEmpty(textView2.getText()) ? 8 : 0);
    }
}
