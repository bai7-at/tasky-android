package defpackage;

import android.app.Application;
import com.nytimes.games.spellingbee.di.GamesHybridDevSettingsModule;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class yu2 implements ba2 {
    public static Set a(Application application) {
        return (Set) g16.e(GamesHybridDevSettingsModule.a.a(application));
    }
}
