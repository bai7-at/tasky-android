package defpackage;

import com.nytimes.android.internal.pushmessaging.model.a;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class oa6 implements ba2 {
    public static TagMetadataAPI a(ga6 ga6Var, Retrofit.Builder builder, a aVar) {
        return (TagMetadataAPI) g16.e(ga6Var.j(builder, aVar));
    }
}
