package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.e;

/* loaded from: classes.dex */
public class wk extends e {
    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        return new vk(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.e
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof vk)) {
            super.setupDialog(dialog, i);
            return;
        }
        vk vkVar = (vk) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        vkVar.h(1);
    }
}
