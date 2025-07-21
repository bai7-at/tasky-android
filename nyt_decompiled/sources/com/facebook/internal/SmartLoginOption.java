package com.facebook.internal;

import defpackage.zq3;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<SmartLoginOption> ALL;
    public static final a Companion = new a(null);
    private final long value;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet a(long j) {
            EnumSet noneOf = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it2 = SmartLoginOption.ALL.iterator();
            while (it2.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it2.next();
                if ((smartLoginOption.getValue() & j) != 0) {
                    noneOf.add(smartLoginOption);
                }
            }
            zq3.g(noneOf, "result");
            return noneOf;
        }

        private a() {
        }
    }

    static {
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        zq3.g(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        return Companion.a(j);
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        SmartLoginOption[] valuesCustom = values();
        return (SmartLoginOption[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long getValue() {
        return this.value;
    }
}
