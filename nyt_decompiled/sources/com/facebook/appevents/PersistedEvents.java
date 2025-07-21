package com.facebook.appevents;

import defpackage.c11;
import defpackage.zq3;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PersistedEvents implements Serializable {
    public static final a a = new a(null);
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    public static final class SerializationProxyV1 implements Serializable {
        public static final a a = new a(null);
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public SerializationProxyV1(HashMap hashMap) {
            zq3.h(hashMap, "proxyEvents");
            this.proxyEvents = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (c11.d(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final void a(AccessTokenAppIdPair accessTokenAppIdPair, List list) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "accessTokenAppIdPair");
            zq3.h(list, "appEvents");
            if (!this.events.containsKey(accessTokenAppIdPair)) {
                this.events.put(accessTokenAppIdPair, i.a1(list));
                return;
            }
            List<AppEvent> list2 = this.events.get(accessTokenAppIdPair);
            if (list2 == null) {
                return;
            }
            list2.addAll(list);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final Set b() {
        if (c11.d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet = this.events.entrySet();
            zq3.g(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public PersistedEvents(HashMap hashMap) {
        zq3.h(hashMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap2 = new HashMap<>();
        this.events = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
