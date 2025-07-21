package defpackage;

import android.app.Application;
import com.nytimes.android.interests.FeatureInterestsModule;
import com.nytimes.android.interests.db.InterestsDatabase;

/* loaded from: classes4.dex */
public abstract class gb2 implements ba2 {
    public static InterestsDatabase a(Application application) {
        return (InterestsDatabase) g16.e(FeatureInterestsModule.a.d(application));
    }
}
