package com.nytimes.android.libs.messagingarchitecture.betasettings;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {
    public static final c Companion = new c(null);
    private final String a;
    private final String b;

    public static final class a extends b {
        public static final a c = new a();

        private a() {
            super("Actions History", "actions", null);
        }
    }

    /* renamed from: com.nytimes.android.libs.messagingarchitecture.betasettings.b$b, reason: collision with other inner class name */
    public static final class C0340b extends b {
        public static final C0340b c = new C0340b();

        private C0340b() {
            super("OMA Message History", "cache", null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str) {
            b bVar = d.c;
            if (!zq3.c(str, bVar.a())) {
                bVar = C0340b.c;
                if (!zq3.c(str, bVar.a())) {
                    bVar = a.c;
                    if (!zq3.c(str, bVar.a())) {
                        bVar = e.c;
                        if (!zq3.c(str, bVar.a())) {
                            bVar = f.c;
                            if (!zq3.c(str, bVar.a())) {
                                bVar = g.c;
                                if (!zq3.c(str, bVar.a())) {
                                    throw new IllegalStateException(("Unknown route: " + str + " - Please use MessagingBetaSettingsActivity.newIntent()").toString());
                                }
                            }
                        }
                    }
                }
            }
            return bVar;
        }

        private c() {
        }
    }

    public static final class d extends b {
        public static final d c = new d();

        private d() {
            super("Message History", "history", null);
        }
    }

    public static final class e extends b {
        public static final e c = new e();

        private e() {
            super("Message Queue", "queue", null);
        }
    }

    public static final class f extends b {
        public static final f c = new f();

        private f() {
            super("New Message", "new", null);
        }
    }

    public static final class g extends b {
        public static final g c = new g();

        private g() {
            super("Override Message Data", "override", null);
        }
    }

    public /* synthetic */ b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    private b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
