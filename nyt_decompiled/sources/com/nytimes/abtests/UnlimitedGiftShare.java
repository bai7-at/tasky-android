package com.nytimes.abtests;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class UnlimitedGiftShare implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UnlimitedGiftShare[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final UnlimitedGiftShare CONTROL = new UnlimitedGiftShare("CONTROL", 0, "0_Control");
    public static final UnlimitedGiftShare UNLIMITED = new UnlimitedGiftShare("UNLIMITED", 1, "1_Unlimited");
    public static final UnlimitedGiftShare UNLIMITED_EMAIL = new UnlimitedGiftShare("UNLIMITED_EMAIL", 2, "2_UnlimitedEmail");

    public static final class a {

        /* renamed from: com.nytimes.abtests.UnlimitedGiftShare$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0225a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[UnlimitedGiftShare.values().length];
                try {
                    iArr[UnlimitedGiftShare.CONTROL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UnlimitedGiftShare.UNLIMITED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UnlimitedGiftShare.UNLIMITED_EMAIL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final UnlimitedGiftShare a(String str) {
            for (UnlimitedGiftShare unlimitedGiftShare : UnlimitedGiftShare.values()) {
                if (zq3.c(unlimitedGiftShare.getVariantName(), str)) {
                    return unlimitedGiftShare;
                }
            }
            return null;
        }

        public final String b(String str) {
            if (str == null) {
                return null;
            }
            UnlimitedGiftShare a = UnlimitedGiftShare.Companion.a(str);
            int i = a == null ? -1 : C0225a.a[a.ordinal()];
            if (i == 1) {
                return QueryKeys.TIME_ON_VIEW_IN_MINUTES;
            }
            if (i == 2) {
                return QueryKeys.USER_ID;
            }
            if (i != 3) {
                return null;
            }
            return QueryKeys.MAX_SCROLL_DEPTH;
        }

        public final ss7 c() {
            return UnlimitedGiftShare.testSpec;
        }

        public final Boolean d(String str) {
            if (str == null) {
                return null;
            }
            UnlimitedGiftShare a = UnlimitedGiftShare.Companion.a(str);
            int i = a == null ? -1 : C0225a.a[a.ordinal()];
            if (i == 1) {
                return Boolean.FALSE;
            }
            if (i == 2 || i == 3) {
                return Boolean.TRUE;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UnlimitedGiftShare[] $values() {
        return new UnlimitedGiftShare[]{CONTROL, UNLIMITED, UNLIMITED_EMAIL};
    }

    static {
        UnlimitedGiftShare[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("SHA_UnlimitedGift_0124", values(), null, false, 4, null);
    }

    private UnlimitedGiftShare(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UnlimitedGiftShare valueOf(String str) {
        return (UnlimitedGiftShare) Enum.valueOf(UnlimitedGiftShare.class, str);
    }

    public static UnlimitedGiftShare[] values() {
        return (UnlimitedGiftShare[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
