package zendesk.support;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class SupportApplicationModule_ProvideMetadataFactory implements ba2 {
    private final p76 contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, p76 p76Var) {
        this.module = supportApplicationModule;
        this.contextProvider = p76Var;
    }

    public static SupportApplicationModule_ProvideMetadataFactory create(SupportApplicationModule supportApplicationModule, p76 p76Var) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, p76Var);
    }

    public static SupportSdkMetadata provideMetadata(SupportApplicationModule supportApplicationModule, Context context) {
        return (SupportSdkMetadata) g16.c(supportApplicationModule.provideMetadata(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public SupportSdkMetadata get() {
        return provideMetadata(this.module, (Context) this.contextProvider.get());
    }
}
