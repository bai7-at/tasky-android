package defpackage;

import android.content.Context;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import java.util.Map;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public interface h98 {
    void a(Context context);

    void b(SubauthEnvironment subauthEnvironment, Retrofit.Builder builder);

    Map c();
}
