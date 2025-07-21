package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.interests.FeatureInterestsModule;
import com.nytimes.android.interests.InterestsCacheManager;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.interests.InterestsRepository;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public abstract class eb2 implements ba2 {
    public static InterestsManager a(InterestsRepository interestsRepository, InterestsCacheManager interestsCacheManager, CoroutineDispatcher coroutineDispatcher, File file, b05 b05Var, SharedPreferences sharedPreferences) {
        return (InterestsManager) g16.e(FeatureInterestsModule.a.b(interestsRepository, interestsCacheManager, coroutineDispatcher, file, b05Var, sharedPreferences));
    }
}
