package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.firebase.FirebaseModule;

/* loaded from: classes4.dex */
public abstract class ui2 implements ba2 {
    public static f82 a(FirebaseModule firebaseModule, Application application, Resources resources, boolean z) {
        return (f82) g16.e(firebaseModule.e(application, resources, z));
    }
}
