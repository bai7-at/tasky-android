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
public final class Sensitivity {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Sensitivity[] $VALUES;
    public static final Companion Companion;
    public static final Sensitivity SHOW_ADS = new Sensitivity("SHOW_ADS", 0, "SHOW_ADS");
    public static final Sensitivity TRAGEDY = new Sensitivity("TRAGEDY", 1, "TRAGEDY");
    public static final Sensitivity UNKNOWN__ = new Sensitivity("UNKNOWN__", 2, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f297type;
    private final String rawValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<Sensitivity> getKnownEntries() {
            return i.o(Sensitivity.SHOW_ADS, Sensitivity.TRAGEDY);
        }

        public final c22 getType() {
            return Sensitivity.f297type;
        }

        public final Sensitivity[] knownValues() {
            return (Sensitivity[]) getKnownEntries().toArray(new Sensitivity[0]);
        }

        public final Sensitivity safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = Sensitivity.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((Sensitivity) obj).getRawValue(), str)) {
                    break;
                }
            }
            Sensitivity sensitivity = (Sensitivity) obj;
            return sensitivity == null ? Sensitivity.UNKNOWN__ : sensitivity;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Sensitivity[] $values() {
        return new Sensitivity[]{SHOW_ADS, TRAGEDY, UNKNOWN__};
    }

    static {
        Sensitivity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f297type = new c22("Sensitivity", i.o("SHOW_ADS", "TRAGEDY"));
    }

    private Sensitivity(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Sensitivity valueOf(String str) {
        return (Sensitivity) Enum.valueOf(Sensitivity.class, str);
    }

    public static Sensitivity[] values() {
        return (Sensitivity[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
