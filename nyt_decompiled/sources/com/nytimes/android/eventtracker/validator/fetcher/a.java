package com.nytimes.android.eventtracker.validator.fetcher;

import com.dropbox.android.external.store4.StoreKt;
import com.nytimes.android.eventtracker.model.Agent;
import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.State;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher;
import defpackage.by0;
import defpackage.du8;
import defpackage.lc7;
import defpackage.m28;
import defpackage.zq3;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a implements lc7 {
    public static final C0265a Companion = new C0265a(null);
    private static final Event b = new Event("undefined", "undefined", null, "undefined", "et2-v1.0", "newsreader-android-prd", "et2sdk", new Timestamp(0, false), new Agent("undefined", new Timestamp(0, false), null), new Session(1, new Timestamp(0, false)), "page", null, new State(true), t.f(du8.a("subject", "page")), "token", "secureDeviceId");
    private final m28 a;

    /* renamed from: com.nytimes.android.eventtracker.validator.fetcher.a$a, reason: collision with other inner class name */
    public static final class C0265a {
        public /* synthetic */ C0265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Event a() {
            return a.b;
        }

        private C0265a() {
        }
    }

    public a(m28 m28Var) {
        zq3.h(m28Var, "store");
        this.a = m28Var;
    }

    @Override // defpackage.lc7
    public Object a(by0 by0Var) {
        return StoreKt.b(this.a, EventTrackerScriptFetcher.Script.Companion.a(), by0Var);
    }
}
