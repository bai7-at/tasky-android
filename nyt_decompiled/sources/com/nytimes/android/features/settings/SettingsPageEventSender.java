package com.nytimes.android.features.settings;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.b22;
import defpackage.du8;
import defpackage.e52;
import defpackage.s42;
import defpackage.ue4;
import defpackage.zq3;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes4.dex */
public final class SettingsPageEventSender {
    private final ET2Scope a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NotificationPermissionEvent {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ NotificationPermissionEvent[] $VALUES;
        private final String eventName;
        private final String label;
        public static final NotificationPermissionEvent ON = new NotificationPermissionEvent("ON", 0, DebugKt.DEBUG_PROPERTY_VALUE_ON, JsonDocumentFields.EFFECT_VALUE_ALLOW);
        public static final NotificationPermissionEvent OFF = new NotificationPermissionEvent("OFF", 1, DebugKt.DEBUG_PROPERTY_VALUE_OFF, "Don't Allow");

        private static final /* synthetic */ NotificationPermissionEvent[] $values() {
            return new NotificationPermissionEvent[]{ON, OFF};
        }

        static {
            NotificationPermissionEvent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private NotificationPermissionEvent(String str, int i, String str2, String str3) {
            this.eventName = str2;
            this.label = str3;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static NotificationPermissionEvent valueOf(String str) {
            return (NotificationPermissionEvent) Enum.valueOf(NotificationPermissionEvent.class, str);
        }

        public static NotificationPermissionEvent[] values() {
            return (NotificationPermissionEvent[]) $VALUES.clone();
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    public static final class a extends ue4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ue4 ue4Var) {
            super(du8.a("event_data", ue4Var));
            zq3.h(ue4Var, "interaction");
        }
    }

    public static final class b extends ue4 {
        public b() {
            super(du8.a("pagetype", "settings"), du8.a(TransferTable.COLUMN_TYPE, "tap"));
        }
    }

    public SettingsPageEventSender(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a(NotificationPermissionEvent notificationPermissionEvent) {
        zq3.h(notificationPermissionEvent, "event");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(notificationPermissionEvent.getEventName(), notificationPermissionEvent.getLabel(), null, null, null, null, null, null, "system push notifications", 252, null), new a(new b()), null, 8, null);
    }
}
