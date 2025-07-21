package com.facebook.internal;

import android.content.Intent;
import defpackage.w92;
import defpackage.zg0;
import defpackage.zq3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CallbackManagerImpl implements zg0 {
    public static final b b = new b(null);
    private static final Map c = new HashMap();
    private final Map a = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15);

        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            RequestCodeOffset[] valuesCustom = values();
            return (RequestCodeOffset[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int toRequestCode() {
            return w92.q() + this.offset;
        }
    }

    public interface a {
        boolean a(int i, Intent intent);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized a b(int i) {
            return (a) CallbackManagerImpl.c.get(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(int i, int i2, Intent intent) {
            a b = b(i);
            if (b == null) {
                return false;
            }
            return b.a(i2, intent);
        }

        public final synchronized void c(int i, a aVar) {
            zq3.h(aVar, "callback");
            if (CallbackManagerImpl.c.containsKey(Integer.valueOf(i))) {
                return;
            }
            CallbackManagerImpl.c.put(Integer.valueOf(i), aVar);
        }

        private b() {
        }
    }

    @Override // defpackage.zg0
    public boolean a(int i, int i2, Intent intent) {
        a aVar = (a) this.a.get(Integer.valueOf(i));
        return aVar == null ? b.d(i, i2, intent) : aVar.a(i2, intent);
    }
}
