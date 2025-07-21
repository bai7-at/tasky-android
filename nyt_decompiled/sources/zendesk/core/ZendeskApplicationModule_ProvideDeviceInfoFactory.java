package zendesk.core;

import android.content.Context;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements ba2 {
    private final p76 contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(p76 p76Var) {
        this.contextProvider = p76Var;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(p76 p76Var) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(p76Var);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        return (DeviceInfo) g16.c(ZendeskApplicationModule.provideDeviceInfo(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public DeviceInfo get() {
        return provideDeviceInfo((Context) this.contextProvider.get());
    }
}
