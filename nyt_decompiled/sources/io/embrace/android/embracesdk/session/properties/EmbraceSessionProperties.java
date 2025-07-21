package io.embrace.android.embracesdk.session.properties;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceSessionProperties {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, String> NOT_LOADED = new LinkedHashMap();
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;
    private final qs2 permanentPropertiesProvider;
    private final AtomicReference<Map<String, String>> permanentPropertiesReference;
    private final PreferencesService preferencesService;
    private final Map<String, String> temporary;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceSessionProperties(PreferencesService preferencesService, ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(preferencesService, "preferencesService");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.preferencesService = preferencesService;
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        this.temporary = new HashMap();
        this.permanentPropertiesReference = new AtomicReference<>(NOT_LOADED);
        this.permanentPropertiesProvider = new qs2() { // from class: io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties$permanentPropertiesProvider$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map<String, String> mo865invoke() {
                PreferencesService preferencesService2;
                preferencesService2 = EmbraceSessionProperties.this.preferencesService;
                Map<String, String> permanentSessionProperties = preferencesService2.getPermanentSessionProperties();
                return permanentSessionProperties != null ? new HashMap(permanentSessionProperties) : new HashMap();
            }
        };
    }

    private final boolean haveKey(String str) {
        return permanentProperties().containsKey(str) || this.temporary.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, String> permanentProperties() {
        Map<String, String> map = this.permanentPropertiesReference.get();
        Map<String, String> map2 = NOT_LOADED;
        if (map == map2) {
            synchronized (this.permanentPropertiesReference) {
                try {
                    if (this.permanentPropertiesReference.get() == map2) {
                        this.permanentPropertiesReference.set(this.permanentPropertiesProvider.mo865invoke());
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Map<String, String> map3 = this.permanentPropertiesReference.get();
        zq3.g(map3, "permanentPropertiesReference.get()");
        return map3;
    }

    private final int size() {
        return permanentProperties().size() + this.temporary.size();
    }

    public final boolean add(String str, String str2, boolean z) {
        zq3.h(str, "sanitizedKey");
        zq3.h(str2, "sanitizedValue");
        synchronized (this.permanentPropertiesReference) {
            try {
                int maxSessionProperties = this.configService.getSessionBehavior().getMaxSessionProperties();
                if (size() <= maxSessionProperties && (size() != maxSessionProperties || haveKey(str))) {
                    if (z) {
                        permanentProperties().put(str, str2);
                        this.temporary.remove(str);
                        this.preferencesService.setPermanentSessionProperties(permanentProperties());
                    } else {
                        Map<String, String> permanentProperties = permanentProperties();
                        if (permanentProperties.remove(str) != null) {
                            this.permanentPropertiesReference.set(permanentProperties);
                            this.preferencesService.setPermanentSessionProperties(permanentProperties());
                        }
                        this.temporary.put(str, str2);
                    }
                    return true;
                }
                this.logger.log("Session property count is at its limit. Rejecting.", InternalEmbraceLogger.Severity.ERROR, null, false);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearTemporary() {
        this.temporary.clear();
    }

    public final Map<String, String> get() {
        Map<String, String> p;
        synchronized (this.permanentPropertiesReference) {
            p = t.p(permanentProperties(), this.temporary);
        }
        return p;
    }

    public final boolean remove(String str) {
        boolean z;
        zq3.h(str, "sanitizedKey");
        synchronized (this.permanentPropertiesReference) {
            z = true;
            boolean z2 = this.temporary.remove(str) != null;
            Map<String, String> permanentProperties = permanentProperties();
            if (permanentProperties.remove(str) != null) {
                this.permanentPropertiesReference.set(permanentProperties);
                this.preferencesService.setPermanentSessionProperties(permanentProperties());
            } else {
                z = z2;
            }
        }
        return z;
    }
}
