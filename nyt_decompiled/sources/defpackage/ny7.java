package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.nytimes.android.logging.NYTLogger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ny7 {
    static void a(Spannable spannable, CharacterStyle characterStyle, int i, int i2, int i3) {
        int i4 = i2 - i;
        spannable.setSpan(characterStyle, i4, (i3 - i2) + i4, 33);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, List list) {
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            c(list, characterStyle, spannableStringBuilder.getSpanStart(characterStyle), spannableStringBuilder.getSpanEnd(characterStyle));
        }
    }

    static void c(List list, CharacterStyle characterStyle, int i, int i2) {
        if (i == i2 || i > i2) {
            return;
        }
        Iterator it2 = list.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            Spannable spannable = (Spannable) it2.next();
            try {
                i3 += spannable.length();
            } catch (Exception e) {
                NYTLogger.i(e, "Caught error while trying to set span on bulleted summary", new Object[0]);
            }
            if (d(i4, i3, i, i2)) {
                a(spannable, characterStyle, i4, i, i2);
                return;
            } else {
                i4 = i3 + 1;
                i3 = i4;
            }
        }
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        return i3 >= i && i4 <= i2;
    }
}
