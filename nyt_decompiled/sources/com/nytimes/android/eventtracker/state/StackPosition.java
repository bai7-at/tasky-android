package com.nytimes.android.eventtracker.state;

import defpackage.b22;
import defpackage.bt3;
import io.embrace.android.embracesdk.payload.Session;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class StackPosition {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ StackPosition[] $VALUES;

    @bt3(name = Session.APPLICATION_STATE_BACKGROUND)
    public static final StackPosition BACKGROUND = new StackPosition("BACKGROUND", 0);

    @bt3(name = Session.APPLICATION_STATE_FOREGROUND)
    public static final StackPosition FOREGROUND = new StackPosition("FOREGROUND", 1);

    private static final /* synthetic */ StackPosition[] $values() {
        return new StackPosition[]{BACKGROUND, FOREGROUND};
    }

    static {
        StackPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private StackPosition(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static StackPosition valueOf(String str) {
        return (StackPosition) Enum.valueOf(StackPosition.class, str);
    }

    public static StackPosition[] values() {
        return (StackPosition[]) $VALUES.clone();
    }
}
