package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.designsystem.text.CustomTypefaceSpan;

/* loaded from: classes4.dex */
public final class fp2 {
    public static final fp2 a = new fp2();

    private fp2() {
    }

    public static final void b(SpannableStringBuilder spannableStringBuilder, Drawable drawable) {
        zq3.h(spannableStringBuilder, "bldr");
        zq3.h(drawable, "drawable");
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.append(InstructionFileId.DOT);
        spannableStringBuilder.setSpan(new ah3(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    public static final void c(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        zq3.h(context, "context");
        zq3.h(spannableStringBuilder, "bldr");
        a.a(context, spannableStringBuilder, i, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, un6.CustomFontTextView);
        zq3.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes.hasValue(un6.CustomFontTextView_android_fontFamily)) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan(context, obtainStyledAttributes.getResourceId(un6.CustomFontTextView_android_fontFamily, -1)), i2, i3, 33);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(un6.CustomFontTextView_lineHeight, -1);
        if (dimensionPixelSize > 0) {
            spannableStringBuilder.setSpan(new s44(dimensionPixelSize), 0, spannableStringBuilder.length(), 33);
        }
        int color = obtainStyledAttributes.getColor(un6.CustomFontTextView_android_textColor, -1);
        if (color != -1) {
            spannableStringBuilder.setSpan(new uj8(obtainStyledAttributes.getFloat(un6.CustomFontTextView_android_shadowRadius, 0.0f), obtainStyledAttributes.getFloat(un6.CustomFontTextView_android_shadowDx, 0.0f), obtainStyledAttributes.getFloat(un6.CustomFontTextView_android_shadowDy, 0.0f), color), i2, i3, 33);
        }
        obtainStyledAttributes.recycle();
    }

    public static final void d(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4) {
        zq3.h(spannableStringBuilder, "bldr");
        a.a(context, spannableStringBuilder, i, i3, i4);
        zq3.e(context);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan(context, i2), i3, i4, 33);
    }

    public static final int e(Context context, String str, SpannableStringBuilder spannableStringBuilder, int i, int i2, String str2) {
        zq3.h(context, "context");
        zq3.h(spannableStringBuilder, "bldr");
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        c(context, spannableStringBuilder, i2, i, spannableStringBuilder.length());
        return spannableStringBuilder.length();
    }

    public final void a(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        zq3.h(spannableStringBuilder, "bldr");
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), i2, i3, 33);
    }
}
