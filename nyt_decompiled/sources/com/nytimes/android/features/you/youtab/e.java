package com.nytimes.android.features.you.youtab;

import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e {

    public static final class a extends e {
        private final List a;
        private final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, int i) {
            super(null);
            zq3.h(list, "savedImageList");
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Content(savedImageList=" + this.a + ", size=" + this.b + ")";
        }
    }

    public static final class b extends e {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends e {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
