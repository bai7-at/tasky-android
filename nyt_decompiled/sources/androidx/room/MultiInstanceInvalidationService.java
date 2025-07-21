package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import co.datadome.sdk.ChallengeActivity;
import defpackage.ww8;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int a;
    private final Map b = new LinkedHashMap();
    private final RemoteCallbackList c = new b();
    private final c.a d = new a();

    public static final class a extends c.a {
        a() {
        }

        @Override // androidx.room.c
        public void l6(androidx.room.b bVar, int i) {
            zq3.h(bVar, "callback");
            RemoteCallbackList a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                multiInstanceInvalidationService.a().unregister(bVar);
            }
        }

        @Override // androidx.room.c
        public void o3(int i, String[] strArr) {
            zq3.h(strArr, "tables");
            RemoteCallbackList a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i2);
                        zq3.f(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(num);
                        if (i != intValue && zq3.c(str, str2)) {
                            try {
                                ((androidx.room.b) multiInstanceInvalidationService.a().getBroadcastItem(i2)).S0(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                ww8 ww8Var = ww8.a;
            }
        }

        @Override // androidx.room.c
        public int y4(androidx.room.b bVar, String str) {
            zq3.h(bVar, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(bVar, Integer.valueOf(c))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c), str);
                        i = c;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }
    }

    public static final class b extends RemoteCallbackList {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            zq3.h(bVar, "callback");
            zq3.h(obj, ChallengeActivity.ARG_COOKIE);
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.c;
    }

    public final Map b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int i) {
        this.a = i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        zq3.h(intent, "intent");
        return this.d;
    }
}
