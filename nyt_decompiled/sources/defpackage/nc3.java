package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.nytimes.xwords.hybrid.config.Environments;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class nc3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Environments c(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("GAMES_ENV_KEY", Environments.PROD.getBaseUrl());
        for (Environments environments : Environments.values()) {
            if (zq3.c(environments.getBaseUrl(), string)) {
                return environments;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(ec3 ec3Var, Context context) {
        return ec3Var.d(context);
    }
}
