package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* loaded from: classes.dex */
public final class ye {
    public static final ye a = new ye();

    private ye() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }
}
