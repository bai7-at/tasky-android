package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.TextLayout;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.collections.d;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class zi8 {
    private static final lh8 a = new lh8();
    private static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return j59.a((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, v44[] v44VarArr) {
        StaticLayout a2;
        int l = textLayout.l() - 1;
        if (textLayout.h().getLineStart(l) != textLayout.h().getLineEnd(l)) {
            return null;
        }
        if (v44VarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        v44 v44Var = (v44) d.a0(v44VarArr);
        spannableString.setSpan(v44Var.b(0, spannableString.length(), (l == 0 || !v44Var.e()) ? v44Var.e() : false), 0, spannableString.length(), 33);
        a2 = n18.a.a(spannableString, textPaint, Integer.MAX_VALUE, (r47 & 8) != 0 ? 0 : 0, (r47 & 16) != 0 ? spannableString.length() : spannableString.length(), (r47 & 32) != 0 ? az3.a.b() : textDirectionHeuristic, (r47 & 64) != 0 ? az3.a.a() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0.0f : 0.0f, (r47 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : textLayout.g(), (r47 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : textLayout.d(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & Constants.MB) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = a2.getLineAscent(0);
        fontMetricsInt.descent = a2.getLineDescent(0);
        fontMetricsInt.top = a2.getLineTop(0);
        fontMetricsInt.bottom = a2.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(TextLayout textLayout, v44[] v44VarArr) {
        int i = 0;
        int i2 = 0;
        for (v44 v44Var : v44VarArr) {
            if (v44Var.c() < 0) {
                i = Math.max(i, Math.abs(v44Var.c()));
            }
            if (v44Var.d() < 0) {
                i2 = Math.max(i, Math.abs(v44Var.d()));
            }
        }
        return (i == 0 && i2 == 0) ? b : a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v44[] i(TextLayout textLayout) {
        if (!(textLayout.E() instanceof Spanned)) {
            return new v44[0];
        }
        CharSequence E = textLayout.E();
        zq3.f(E, "null cannot be cast to non-null type android.text.Spanned");
        v44[] v44VarArr = (v44[]) ((Spanned) E).getSpans(0, textLayout.E().length(), v44.class);
        return v44VarArr.length == 0 ? new v44[0] : v44VarArr;
    }

    public static final TextDirectionHeuristic j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(TextLayout textLayout) {
        if (textLayout.g() || textLayout.F()) {
            return b;
        }
        TextPaint paint = textLayout.h().getPaint();
        CharSequence text = textLayout.h().getText();
        Rect c = co5.c(paint, text, textLayout.h().getLineStart(0), textLayout.h().getLineEnd(0));
        int lineAscent = textLayout.h().getLineAscent(0);
        int i = c.top;
        int topPadding = i < lineAscent ? lineAscent - i : textLayout.h().getTopPadding();
        if (textLayout.l() != 1) {
            int l = textLayout.l() - 1;
            c = co5.c(paint, text, textLayout.h().getLineStart(l), textLayout.h().getLineEnd(l));
        }
        int lineDescent = textLayout.h().getLineDescent(textLayout.l() - 1);
        int i2 = c.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : textLayout.h().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? b : a(topPadding, bottomPadding);
    }

    public static final boolean l(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
