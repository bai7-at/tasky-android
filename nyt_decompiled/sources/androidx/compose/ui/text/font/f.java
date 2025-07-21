package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.e;
import defpackage.ff;

/* loaded from: classes.dex */
public abstract class f {
    public static final e.b a(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), ff.a(context), null, null, null, 28, null);
    }
}
