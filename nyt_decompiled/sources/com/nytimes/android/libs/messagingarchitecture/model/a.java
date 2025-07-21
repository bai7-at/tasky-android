package com.nytimes.android.libs.messagingarchitecture.model;

import defpackage.du8;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public interface a {
    public static final C0357a Companion = C0357a.a;

    /* renamed from: com.nytimes.android.libs.messagingarchitecture.model.a$a, reason: collision with other inner class name */
    public static final class C0357a {
        static final /* synthetic */ C0357a a = new C0357a();
        private static final Map b = t.m(du8.a("play", "play"), du8.a("settings", "settingAccount"), du8.a("gift", "gift"), du8.a("bottomNav", "bottomNav"), du8.a("discovery", "discovery"), du8.a("you", "you"), du8.a("share", "share"));

        private C0357a() {
        }

        public final Map a() {
            return b;
        }
    }
}
