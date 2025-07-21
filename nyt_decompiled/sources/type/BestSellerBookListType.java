package type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BestSellerBookListType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BestSellerBookListType[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f122type;
    private final String rawValue;
    public static final BestSellerBookListType WEEKLY = new BestSellerBookListType("WEEKLY", 0, "WEEKLY");
    public static final BestSellerBookListType MONTHLY = new BestSellerBookListType("MONTHLY", 1, "MONTHLY");
    public static final BestSellerBookListType UNKNOWN__ = new BestSellerBookListType("UNKNOWN__", 2, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<BestSellerBookListType> getKnownEntries() {
            return i.o(BestSellerBookListType.WEEKLY, BestSellerBookListType.MONTHLY);
        }

        public final c22 getType() {
            return BestSellerBookListType.f122type;
        }

        public final BestSellerBookListType[] knownValues() {
            return (BestSellerBookListType[]) getKnownEntries().toArray(new BestSellerBookListType[0]);
        }

        public final BestSellerBookListType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = BestSellerBookListType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((BestSellerBookListType) obj).getRawValue(), str)) {
                    break;
                }
            }
            BestSellerBookListType bestSellerBookListType = (BestSellerBookListType) obj;
            return bestSellerBookListType == null ? BestSellerBookListType.UNKNOWN__ : bestSellerBookListType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BestSellerBookListType[] $values() {
        return new BestSellerBookListType[]{WEEKLY, MONTHLY, UNKNOWN__};
    }

    static {
        BestSellerBookListType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f122type = new c22("BestSellerBookListType", i.o("WEEKLY", "MONTHLY"));
    }

    private BestSellerBookListType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BestSellerBookListType valueOf(String str) {
        return (BestSellerBookListType) Enum.valueOf(BestSellerBookListType.class, str);
    }

    public static BestSellerBookListType[] values() {
        return (BestSellerBookListType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
