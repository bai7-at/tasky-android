package defpackage;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class ck8 {
    public static final ck8 a = new ck8();

    private ck8() {
    }

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i) {
        return view.startActionMode(callback, i);
    }
}
