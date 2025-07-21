package com.nytimes.android.features.you.youtab;

import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.features.you.youtab.a$a, reason: collision with other inner class name */
    public static final class C0295a extends a {
        private final List a;
        private final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0295a(List list, int i) {
            super(null);
            zq3.h(list, "historyImageList");
            this.a = list;
            this.b = i;
        }

        public final List a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0295a)) {
                return false;
            }
            C0295a c0295a = (C0295a) obj;
            return zq3.c(this.a, c0295a.a) && this.b == c0295a.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Content(historyImageList=" + this.a + ", size=" + this.b + ")";
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
