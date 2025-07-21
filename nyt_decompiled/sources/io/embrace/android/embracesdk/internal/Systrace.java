package io.embrace.android.embracesdk.internal;

import android.os.Trace;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bk3;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.random.Random;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class Systrace {
    public static final Systrace INSTANCE = new Systrace();

    public static final class Instance {
        private final int id;
        private final String name;

        public Instance(String str, int i) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.name = str;
            this.id = i;
        }

        public static /* synthetic */ Instance copy$default(Instance instance, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = instance.name;
            }
            if ((i2 & 2) != 0) {
                i = instance.id;
            }
            return instance.copy(str, i);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.id;
        }

        public final Instance copy(String str, int i) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return new Instance(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Instance)) {
                return false;
            }
            Instance instance = (Instance) obj;
            return zq3.c(this.name, instance.name) && this.id == instance.id;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            return ((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "Instance(name=" + this.name + ", id=" + this.id + ")";
        }
    }

    private Systrace() {
    }

    private final boolean enabled() {
        return true;
    }

    public static final void end(Instance instance) {
        zq3.h(instance, "instance");
        if (INSTANCE.enabled()) {
            Trace.endAsyncSection(instance.getName(), instance.getId());
        }
    }

    public static final void endSynchronous() {
        if (INSTANCE.enabled()) {
            Trace.endSection();
        }
    }

    public static final Instance start(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (!INSTANCE.enabled()) {
            return null;
        }
        Instance instance = new Instance(h.l1("emb-" + str, 127), Random.a.e());
        Trace.beginAsyncSection(instance.getName(), instance.getId());
        return instance;
    }

    public static final void startSynchronous(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (INSTANCE.enabled()) {
            Trace.beginSection(h.l1("emb-" + str, 127));
        }
    }

    public static final <T> T trace(String str, qs2 qs2Var) {
        Instance instance;
        zq3.h(str, "sectionName");
        zq3.h(qs2Var, "code");
        try {
            instance = start(str);
        } catch (Throwable th) {
            th = th;
            instance = null;
        }
        try {
            return (T) qs2Var.mo865invoke();
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } finally {
                bk3.b(1);
                if (instance != null) {
                    end(instance);
                }
                bk3.a(1);
            }
        }
    }

    public static final <T> T traceSynchronous(String str, qs2 qs2Var) {
        zq3.h(str, "sectionName");
        zq3.h(qs2Var, "code");
        try {
            startSynchronous(str);
            return (T) qs2Var.mo865invoke();
        } finally {
        }
    }
}
