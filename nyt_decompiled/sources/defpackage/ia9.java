package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public abstract class ia9 {
    public static final Fragment a(View view) {
        zq3.h(view, "<this>");
        Fragment i0 = FragmentManager.i0(view);
        zq3.g(i0, "findFragment(this)");
        return i0;
    }
}
