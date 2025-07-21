package kotlinx.coroutines;

import defpackage.b22;
import defpackage.by0;
import defpackage.ey0;
import defpackage.gt2;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CoroutineStart {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);

    @ExperimentalCoroutinesApi
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CoroutineStart[] $values() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        CoroutineStart[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CoroutineStart(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void isLazy$annotations() {
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }

    @InternalCoroutinesApi
    public final <R, T> void invoke(gt2 gt2Var, R r, by0<? super T> by0Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            CancellableKt.startCoroutineCancellable$default(gt2Var, r, by0Var, null, 4, null);
            return;
        }
        if (i == 2) {
            ey0.b(gt2Var, r, by0Var);
        } else if (i == 3) {
            UndispatchedKt.startCoroutineUndispatched(gt2Var, r, by0Var);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
