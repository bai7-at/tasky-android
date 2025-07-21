package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class kb0 {
    public static final kb0 a = new kb0();

    private kb0() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (i2 >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? jb0.a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2) : lb0.a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return jb0.a.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? jb0.b(charSequence, textPaint, textDirectionHeuristic) : lb0.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
