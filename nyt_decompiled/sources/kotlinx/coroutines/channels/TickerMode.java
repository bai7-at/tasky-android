package kotlinx.coroutines.channels;

import defpackage.b22;
import kotlin.enums.a;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ObsoleteCoroutinesApi
/* loaded from: classes5.dex */
public final class TickerMode {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ TickerMode[] $VALUES;
    public static final TickerMode FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
    public static final TickerMode FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    static {
        TickerMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TickerMode(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }
}
