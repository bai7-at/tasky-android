package defpackage;

import android.content.res.Resources;
import com.nytimes.android.meter.MeterServiceApi;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public abstract class wq implements ba2 {
    public static MeterServiceApi a(Retrofit.Builder builder, Resources resources) {
        return (MeterServiceApi) g16.e(uq.Companion.b(builder, resources));
    }
}
