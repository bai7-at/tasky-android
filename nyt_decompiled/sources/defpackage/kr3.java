package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public final class kr3 implements f99 {
    private final View a;

    private kr3(View view) {
        this.a = view;
    }

    public static kr3 a(View view) {
        if (view != null) {
            return new kr3(view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
