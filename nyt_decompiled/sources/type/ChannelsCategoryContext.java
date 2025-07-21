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
public final class ChannelsCategoryContext {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ChannelsCategoryContext[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f140type;
    private final String rawValue;
    public static final ChannelsCategoryContext ONBOARDING = new ChannelsCategoryContext("ONBOARDING", 0, "ONBOARDING");
    public static final ChannelsCategoryContext HOMEPAGE_PROMO = new ChannelsCategoryContext("HOMEPAGE_PROMO", 1, "HOMEPAGE_PROMO");
    public static final ChannelsCategoryContext UNKNOWN__ = new ChannelsCategoryContext("UNKNOWN__", 2, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<ChannelsCategoryContext> getKnownEntries() {
            return i.o(ChannelsCategoryContext.ONBOARDING, ChannelsCategoryContext.HOMEPAGE_PROMO);
        }

        public final c22 getType() {
            return ChannelsCategoryContext.f140type;
        }

        public final ChannelsCategoryContext[] knownValues() {
            return (ChannelsCategoryContext[]) getKnownEntries().toArray(new ChannelsCategoryContext[0]);
        }

        public final ChannelsCategoryContext safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = ChannelsCategoryContext.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((ChannelsCategoryContext) obj).getRawValue(), str)) {
                    break;
                }
            }
            ChannelsCategoryContext channelsCategoryContext = (ChannelsCategoryContext) obj;
            return channelsCategoryContext == null ? ChannelsCategoryContext.UNKNOWN__ : channelsCategoryContext;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ChannelsCategoryContext[] $values() {
        return new ChannelsCategoryContext[]{ONBOARDING, HOMEPAGE_PROMO, UNKNOWN__};
    }

    static {
        ChannelsCategoryContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f140type = new c22("ChannelsCategoryContext", i.o("ONBOARDING", "HOMEPAGE_PROMO"));
    }

    private ChannelsCategoryContext(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ChannelsCategoryContext valueOf(String str) {
        return (ChannelsCategoryContext) Enum.valueOf(ChannelsCategoryContext.class, str);
    }

    public static ChannelsCategoryContext[] values() {
        return (ChannelsCategoryContext[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
