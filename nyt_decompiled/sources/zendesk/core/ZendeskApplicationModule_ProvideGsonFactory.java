package zendesk.core;

import com.google.gson.Gson;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideGsonFactory implements ba2 {
    private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return INSTANCE;
    }

    public static Gson provideGson() {
        return (Gson) g16.c(ZendeskApplicationModule.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Gson get() {
        return provideGson();
    }
}
