package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.nytimes.android.designsystem.text.CustomTypefaceSpan;

/* loaded from: classes4.dex */
public final class a58 {
    public static final a58 a = new a58();

    private a58() {
    }

    public final SpannableString a(Context context, String str, int i, int i2, String str2, int i3, int i4) {
        String str3;
        zq3.h(context, "context");
        zq3.h(str, "text1");
        if (str2 != null) {
            str3 = str + " " + str2;
        } else {
            str3 = str;
        }
        SpannableString spannableString = new SpannableString(str3);
        b58.c(spannableString, new TextAppearanceSpan(context, i), 0, str.length(), 2, null);
        b58.c(spannableString, new CustomTypefaceSpan(context, i2), 0, str.length(), 2, null);
        if (str2 != null) {
            b58.b(spannableString, new TextAppearanceSpan(context, i3), str.length() + 1, str2.length());
            b58.b(spannableString, new CustomTypefaceSpan(context, i4), str.length() + 1, str2.length());
        }
        return spannableString;
    }
}
