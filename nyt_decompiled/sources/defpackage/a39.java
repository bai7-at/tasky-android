package defpackage;

import com.dropbox.android.external.store4.SourceOfTruth;
import com.nytimes.android.eventtracker.di.ValidatorApiModule;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class a39 implements ba2 {
    public static SourceOfTruth a(xe2 xe2Var, File file) {
        return (SourceOfTruth) g16.e(ValidatorApiModule.a.b(xe2Var, file));
    }
}
