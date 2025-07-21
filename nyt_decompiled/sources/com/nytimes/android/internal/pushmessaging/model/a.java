package com.nytimes.android.internal.pushmessaging.model;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {
    public static final C0333a Companion = new C0333a(null);
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: com.nytimes.android.internal.pushmessaging.model.a$a, reason: collision with other inner class name */
    public static final class C0333a {
        public /* synthetic */ C0333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            b bVar = b.d;
            if (zq3.c(str, bVar.c())) {
                return bVar;
            }
            d dVar = d.d;
            return zq3.c(str, dVar.c()) ? dVar : c.d;
        }

        private C0333a() {
        }
    }

    public static final class b extends a {
        public static final b d = new b();

        private b() {
            super("Development", "https://messaging-sub.api.dev.nytimes.com", "https://s1-stg-nyt-com.s3.amazonaws.com", null);
        }
    }

    public static final class c extends a {
        public static final c d = new c();

        private c() {
            super("Production", "https://messaging-sub.api.nytimes.com", "https://s1.nyt.com", null);
        }
    }

    public static final class d extends a {
        public static final d d = new d();

        private d() {
            super("Staging", "https://messaging-sub.api.stg.nytimes.com", "https://s1-stg-nyt-com.s3.amazonaws.com", null);
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    private a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
