package defpackage;

import android.app.Activity;
import androidx.fragment.app.f;

/* loaded from: classes4.dex */
abstract class a5 {
    static f a(Activity activity) {
        try {
            return (f) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }
}
