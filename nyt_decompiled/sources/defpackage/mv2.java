package defpackage;

import android.content.res.Resources;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressApi;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressModule;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class mv2 implements ba2 {
    public static GamesProgressApi a(Retrofit.Builder builder, Resources resources) {
        return (GamesProgressApi) g16.e(GamesProgressModule.a.c(builder, resources));
    }
}
