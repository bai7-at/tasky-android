package com.nytimes.android.features.home.ui;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {
        private final Instant a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Instant instant) {
            super(null);
            zq3.h(instant, "fetchingDate");
            this.a = instant;
        }

        public final Instant a() {
            return this.a;
        }
    }

    /* renamed from: com.nytimes.android.features.home.ui.b$b, reason: collision with other inner class name */
    public static final class C0286b extends b {
        public static final C0286b a = new C0286b();

        private C0286b() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
