package kotlinx.coroutines.channels;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BufferOverflow {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BufferOverflow[] $VALUES;
    public static final BufferOverflow SUSPEND = new BufferOverflow("SUSPEND", 0);
    public static final BufferOverflow DROP_OLDEST = new BufferOverflow("DROP_OLDEST", 1);
    public static final BufferOverflow DROP_LATEST = new BufferOverflow("DROP_LATEST", 2);

    private static final /* synthetic */ BufferOverflow[] $values() {
        return new BufferOverflow[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        BufferOverflow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BufferOverflow(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) $VALUES.clone();
    }
}
