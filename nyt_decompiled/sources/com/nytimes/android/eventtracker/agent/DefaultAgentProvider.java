package com.nytimes.android.eventtracker.agent;

import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.model.Timestamp;
import defpackage.ab;
import defpackage.ss2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DefaultAgentProvider implements ab {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final boolean b;
    private final ss2 c;
    private final AtomicReference d;
    private final Map e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DefaultAgentProvider(SharedPreferences sharedPreferences, boolean z, ss2 ss2Var, Map map) {
        Set<Map.Entry> entrySet;
        zq3.h(sharedPreferences, "preferences");
        zq3.h(ss2Var, "agentIdLambda");
        this.a = sharedPreferences;
        this.b = z;
        this.c = ss2Var;
        this.d = new AtomicReference();
        this.e = new LinkedHashMap();
        if (map == null || (entrySet = map.entrySet()) == null) {
            return;
        }
        for (Map.Entry entry : entrySet) {
            this.e.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.eventtracker.agent.DefaultAgentProvider$getAgentId$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider$getAgentId$1 r0 = (com.nytimes.android.eventtracker.agent.DefaultAgentProvider$getAgentId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider$getAgentId$1 r0 = new com.nytimes.android.eventtracker.agent.DefaultAgentProvider$getAgentId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider r4 = (com.nytimes.android.eventtracker.agent.DefaultAgentProvider) r4
            kotlin.f.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            java.util.concurrent.atomic.AtomicReference r5 = r4.d
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L56
            ss2 r5 = r4.c
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r5 = (java.lang.String) r5
            java.util.concurrent.atomic.AtomicReference r4 = r4.d
            r4.set(r5)
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.agent.DefaultAgentProvider.c(by0):java.lang.Object");
    }

    private final Timestamp d(Timestamp timestamp) {
        if (this.a.contains("com.nytimes.android.eventtracker.KEY_AGENT_TIME_VALUE")) {
            return new Timestamp(this.a.getLong("com.nytimes.android.eventtracker.KEY_AGENT_TIME_VALUE", timestamp.a()), this.a.getBoolean("com.nytimes.android.eventtracker.KEY_AGENT_TIME_TYPE", timestamp.b()));
        }
        if (!this.b) {
            return null;
        }
        e(timestamp);
        return timestamp;
    }

    private final void e(Timestamp timestamp) {
        this.a.edit().putLong("com.nytimes.android.eventtracker.KEY_AGENT_TIME_VALUE", timestamp.a()).putBoolean("com.nytimes.android.eventtracker.KEY_AGENT_TIME_TYPE", timestamp.b()).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.nytimes.android.eventtracker.model.Timestamp r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.eventtracker.agent.DefaultAgentProvider$get$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider$get$1 r0 = (com.nytimes.android.eventtracker.agent.DefaultAgentProvider$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider$get$1 r0 = new com.nytimes.android.eventtracker.agent.DefaultAgentProvider$get$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            com.nytimes.android.eventtracker.model.Timestamp r5 = (com.nytimes.android.eventtracker.model.Timestamp) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.eventtracker.agent.DefaultAgentProvider r4 = (com.nytimes.android.eventtracker.agent.DefaultAgentProvider) r4
            kotlin.f.b(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = (java.lang.String) r6
            com.nytimes.android.eventtracker.model.Timestamp r5 = r4.d(r5)
            java.util.Map r0 = r4.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5a
            r4 = 0
            goto L5c
        L5a:
            java.util.Map r4 = r4.e
        L5c:
            com.nytimes.android.eventtracker.model.Agent r0 = new com.nytimes.android.eventtracker.model.Agent
            r0.<init>(r6, r5, r4)
            ul8$b r4 = defpackage.ul8.a
            java.lang.String r5 = "ET2"
            ul8$c r4 = r4.z(r5)
            java.lang.String r5 = r0.b()
            com.nytimes.android.eventtracker.model.Timestamp r6 = r0.c()
            java.util.Map r1 = r0.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Agent ["
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r6)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "]"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.a(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.agent.DefaultAgentProvider.a(com.nytimes.android.eventtracker.model.Timestamp, by0):java.lang.Object");
    }
}
