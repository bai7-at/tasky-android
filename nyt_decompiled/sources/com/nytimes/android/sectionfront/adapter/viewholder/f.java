package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Caption;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.SectionFront;
import defpackage.fp2;
import defpackage.um6;
import defpackage.yt;
import java.util.Locale;

/* loaded from: classes4.dex */
public class f {
    final TextView a;
    final TextView b;
    private final Context c;

    public f(Context context, TextView textView, TextView textView2) {
        this.c = context;
        this.a = textView;
        this.b = textView2;
    }

    private void b(Image image) {
        Caption caption = (!f() || image == null) ? null : image.getCaption();
        String full = caption != null ? caption.getFull() : null;
        String trim = TextUtils.isEmpty(full) ? "" : full.trim();
        String credit = image.getCredit();
        String trim2 = TextUtils.isEmpty(credit) ? "" : credit.trim();
        if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
            trim = trim + " ";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(trim + trim2);
        int length = trim.length();
        fp2.c(this.c, spannableStringBuilder, um6.TextView_Section_Lede_Photo_Caption, 0, length);
        fp2.c(this.c, spannableStringBuilder, um6.TextView_Section_Lede_Photo_Credit, length, trim2.length() + length);
        c(image, spannableStringBuilder);
    }

    private void c(Image image, SpannableStringBuilder spannableStringBuilder) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            if (image == null || spannableStringBuilder.length() == 0) {
                this.b.setVisibility(8);
            } else {
                this.b.setVisibility(0);
            }
        }
    }

    private void d(Image image) {
        if (this.a != null) {
            if (image == null || TextUtils.isEmpty(image.getCredit())) {
                this.a.setVisibility(8);
            } else {
                this.a.setText(image.getCredit().toUpperCase(Locale.getDefault()));
                this.a.setVisibility(0);
            }
        }
    }

    void a() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    void e(Asset asset, SectionFront sectionFront) {
        ImageAsset m = yt.m(asset, sectionFront);
        Image image = m == null ? null : m.getImage();
        if (this.a != null) {
            d(image);
        }
        if (this.b != null) {
            b(image);
        }
    }

    protected boolean f() {
        return true;
    }
}
