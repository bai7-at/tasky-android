package com.nytimes.android.subauth.core.api.client;

import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import defpackage.b22;
import java.util.Date;
import java.util.List;
import kotlin.enums.a;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes4.dex */
public interface NYTUser {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StateChangeType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ StateChangeType[] $VALUES;
        public static final StateChangeType LOGIN_STATUS_CHANGED = new StateChangeType("LOGIN_STATUS_CHANGED", 0);
        public static final StateChangeType ENTITLEMENTS_CHANGED = new StateChangeType("ENTITLEMENTS_CHANGED", 1);
        public static final StateChangeType LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED = new StateChangeType("LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED", 2);

        private static final /* synthetic */ StateChangeType[] $values() {
            return new StateChangeType[]{LOGIN_STATUS_CHANGED, ENTITLEMENTS_CHANGED, LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED};
        }

        static {
            StateChangeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private StateChangeType(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static StateChangeType valueOf(String str) {
            return (StateChangeType) Enum.valueOf(StateChangeType.class, str);
        }

        public static StateChangeType[] values() {
            return (StateChangeType[]) $VALUES.clone();
        }
    }

    boolean a();

    boolean b();

    boolean c();

    String d();

    String e();

    String f();

    String g();

    String getName();

    String getUsername();

    SharedFlow h();

    List i();

    String j();

    boolean k();

    SubscriptionLevel l();

    String m();

    String n();

    UserSubscription o();

    String p();

    Date q();

    boolean r();

    boolean s();

    UserData t();

    String u();

    boolean v();

    boolean w();
}
