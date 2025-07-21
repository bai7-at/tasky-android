package zendesk.core;

/* loaded from: classes5.dex */
interface Storage {
    void clear();

    SessionStorage getSessionStorage();

    boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration);

    void storeSdkHash(ApplicationConfiguration applicationConfiguration);
}
