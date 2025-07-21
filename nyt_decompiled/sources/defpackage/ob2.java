package defpackage;

import com.nytimes.android.features.you.youtab.FeaturesYouTabModule;
import com.nytimes.android.features.you.youtab.YouTabPreferencesStore;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public abstract class ob2 implements ba2 {
    public static wn1 a(AppPreferences appPreferences, YouTabPreferencesStore youTabPreferencesStore, InterestsManager interestsManager) {
        return (wn1) g16.e(FeaturesYouTabModule.a.a(appPreferences, youTabPreferencesStore, interestsManager));
    }
}
