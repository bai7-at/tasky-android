package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class zb1 {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
