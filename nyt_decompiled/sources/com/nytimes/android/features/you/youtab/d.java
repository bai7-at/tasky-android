package com.nytimes.android.features.you.youtab;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class d {
    private final String a;

    public static final class a extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(str, null);
            zq3.h(str, "selectedAnswerId");
        }
    }

    public static final class b extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null);
            zq3.h(str, "selectedAnswerId");
        }
    }

    public static final class c extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str, null);
            zq3.h(str, "selectedAnswerId");
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private d(String str) {
        this.a = str;
    }
}
