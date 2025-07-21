package io.embrace.android.embracesdk.session;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;

/* loaded from: classes5.dex */
public final class ConfigGate<T> implements ConfigListener {
    private boolean configState;
    private final T impl;
    private final qs2 predicate;

    public ConfigGate(T t, qs2 qs2Var) {
        zq3.h(qs2Var, "predicate");
        this.impl = t;
        this.predicate = qs2Var;
        this.configState = ((Boolean) qs2Var.mo865invoke()).booleanValue();
    }

    public final T getService() {
        if (this.configState) {
            return this.impl;
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigListener
    public void onConfigChange(ConfigService configService) {
        zq3.h(configService, "configService");
        this.configState = ((Boolean) this.predicate.mo865invoke()).booleanValue();
    }
}
