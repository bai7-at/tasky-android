package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class CoreModule_ActionHandlerRegistryFactory implements ba2 {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static ActionHandlerRegistry actionHandlerRegistry(CoreModule coreModule) {
        return (ActionHandlerRegistry) g16.c(coreModule.actionHandlerRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static CoreModule_ActionHandlerRegistryFactory create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    @Override // defpackage.p76
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry(this.module);
    }
}
