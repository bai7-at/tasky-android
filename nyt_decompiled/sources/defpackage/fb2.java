package defpackage;

import com.nytimes.android.interests.FeatureInterestsModule;
import com.nytimes.android.interests.InterestsOnboardingManager;
import com.nytimes.android.interests.InterestsRepository;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public abstract class fb2 implements ba2 {
    public static InterestsOnboardingManager a(InterestsRepository interestsRepository, AppPreferences appPreferences) {
        return (InterestsOnboardingManager) g16.e(FeatureInterestsModule.a.c(interestsRepository, appPreferences));
    }
}
