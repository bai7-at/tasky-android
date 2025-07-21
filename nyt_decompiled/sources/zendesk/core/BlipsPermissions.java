package zendesk.core;

/* loaded from: classes5.dex */
class BlipsPermissions {
    private boolean behavioural;
    private boolean pathfinder;
    private boolean required;

    /* renamed from: zendesk.core.BlipsPermissions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$BlipsGroup;

        static {
            int[] iArr = new int[BlipsGroup.values().length];
            $SwitchMap$zendesk$core$BlipsGroup = iArr;
            try {
                iArr[BlipsGroup.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.BEHAVIOURAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.PATHFINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    BlipsPermissions(boolean z, boolean z2, boolean z3) {
        this.required = z;
        this.behavioural = z2;
        this.pathfinder = z3;
    }

    boolean isEnabled(BlipsGroup blipsGroup) {
        int i = AnonymousClass1.$SwitchMap$zendesk$core$BlipsGroup[blipsGroup.ordinal()];
        if (i == 1) {
            return this.required;
        }
        if (i == 2) {
            return this.behavioural;
        }
        if (i != 3) {
            return false;
        }
        return this.pathfinder;
    }

    BlipsPermissions() {
        this(false, false, false);
    }
}
