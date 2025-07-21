package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class xx0 {
    public static final void a(ClipboardManager clipboardManager, CharSequence charSequence, CharSequence charSequence2) {
        zq3.h(clipboardManager, "<this>");
        zq3.h(charSequence, "label");
        zq3.h(charSequence2, "text");
        clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }

    public static final ClipboardManager b(Context context, ss2 ss2Var) {
        zq3.h(context, "<this>");
        zq3.h(ss2Var, "block");
        ClipboardManager clipboardManager = (ClipboardManager) mx0.j(context, ClipboardManager.class);
        if (clipboardManager == null) {
            return null;
        }
        ss2Var.invoke(clipboardManager);
        return clipboardManager;
    }
}
