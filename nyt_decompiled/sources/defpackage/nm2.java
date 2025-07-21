package defpackage;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.TypefaceRequestCache;

/* loaded from: classes.dex */
public abstract class nm2 {
    private static final TypefaceRequestCache a = new TypefaceRequestCache();
    private static final AsyncTypefaceCache b = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache a() {
        return b;
    }

    public static final TypefaceRequestCache b() {
        return a;
    }
}
