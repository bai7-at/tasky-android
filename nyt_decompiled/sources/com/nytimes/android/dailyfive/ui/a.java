package com.nytimes.android.dailyfive.ui;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.dailyfive.ui.a$a, reason: collision with other inner class name */
    public static final class C0253a extends a {
        private final Instant a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0253a(Instant instant) {
            super(null);
            zq3.h(instant, "fetchingDate");
            this.a = instant;
        }

        public final Instant a() {
            return this.a;
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends a {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends a {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
