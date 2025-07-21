package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements ba2 {
    private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

    public static ActionHandlerRegistry actionHandlerRegistry() {
        return (ActionHandlerRegistry) g16.c(ZendeskProvidersModule.actionHandlerRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return INSTANCE;
    }

    @Override // defpackage.p76
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
