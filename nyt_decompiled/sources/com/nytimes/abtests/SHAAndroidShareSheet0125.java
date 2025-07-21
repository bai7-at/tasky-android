package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SHAAndroidShareSheet0125 implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SHAAndroidShareSheet0125[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final SHAAndroidShareSheet0125 CONTROL = new SHAAndroidShareSheet0125("CONTROL", 0, "0_Control");
    public static final SHAAndroidShareSheet0125 MIN_PREVIEW = new SHAAndroidShareSheet0125("MIN_PREVIEW", 1, "1_MinPreview");

    public static final class a {

        /* renamed from: com.nytimes.abtests.SHAAndroidShareSheet0125$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0224a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[SHAAndroidShareSheet0125.values().length];
                try {
                    iArr[SHAAndroidShareSheet0125.MIN_PREVIEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SHAAndroidShareSheet0125 a(String str) {
            for (SHAAndroidShareSheet0125 sHAAndroidShareSheet0125 : SHAAndroidShareSheet0125.values()) {
                if (zq3.c(sHAAndroidShareSheet0125.getVariantName(), str)) {
                    return sHAAndroidShareSheet0125;
                }
            }
            return null;
        }

        public final ss7 b() {
            return SHAAndroidShareSheet0125.testSpec;
        }

        public final Boolean c(String str) {
            if (str == null) {
                return null;
            }
            SHAAndroidShareSheet0125 a = SHAAndroidShareSheet0125.Companion.a(str);
            if ((a == null ? -1 : C0224a.a[a.ordinal()]) == 1) {
                return Boolean.TRUE;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ SHAAndroidShareSheet0125[] $values() {
        return new SHAAndroidShareSheet0125[]{CONTROL, MIN_PREVIEW};
    }

    static {
        SHAAndroidShareSheet0125[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("SHA_AndroidShareSheet_0125", values(), null, false, 4, null);
    }

    private SHAAndroidShareSheet0125(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SHAAndroidShareSheet0125 valueOf(String str) {
        return (SHAAndroidShareSheet0125) Enum.valueOf(SHAAndroidShareSheet0125.class, str);
    }

    public static SHAAndroidShareSheet0125[] values() {
        return (SHAAndroidShareSheet0125[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
