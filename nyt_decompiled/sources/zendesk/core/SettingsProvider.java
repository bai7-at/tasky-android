package zendesk.core;

import defpackage.tm9;

/* loaded from: classes5.dex */
public interface SettingsProvider {
    void getCoreSettings(tm9 tm9Var);

    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, tm9 tm9Var);
}
