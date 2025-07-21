package com.nytimes.android.composeui.notice;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {
    public static final int a = 0;

    /* renamed from: com.nytimes.android.composeui.notice.a$a, reason: collision with other inner class name */
    public static final class C0250a extends a {
        public static final C0250a b = new C0250a();
        public static final int c = 0;

        private C0250a() {
            super(null);
        }
    }

    public static final class b extends a {
        public static final b b = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends a {
        private final int b;

        public c(int i) {
            super(null);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            return "ShowResId(resId=" + this.b + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
