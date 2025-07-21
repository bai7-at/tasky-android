package defpackage;

import android.view.View;
import defpackage.w63;

/* loaded from: classes.dex */
public final class iu5 implements u63 {
    private final View a;

    public iu5(View view) {
        this.a = view;
    }

    @Override // defpackage.u63
    public void a(int i) {
        w63.a aVar = w63.a;
        if (w63.b(i, aVar.a())) {
            this.a.performHapticFeedback(0);
        } else if (w63.b(i, aVar.b())) {
            this.a.performHapticFeedback(9);
        }
    }
}
