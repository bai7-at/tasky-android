package defpackage;

import android.app.Application;
import com.nytimes.android.eventtracker.di.ValidatorApiModule;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class g39 implements ba2 {
    public static File a(Application application) {
        return (File) g16.e(ValidatorApiModule.a.i(application));
    }
}
