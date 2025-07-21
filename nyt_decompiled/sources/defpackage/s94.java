package defpackage;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.logging.remote.stream.network.NetworkManager;
import com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class s94 {
    public final l52 a(Application application, String str) {
        zq3.h(application, "context");
        zq3.h(str, "sessionId");
        return new l52(Settings.Secure.getString(application.getContentResolver(), "android_id"), Build.MODEL, str);
    }

    public final r94 b(Application application, String str) {
        zq3.h(application, "context");
        zq3.h(str, "sessionId");
        return new r94(Settings.Secure.getString(application.getContentResolver(), "android_id"), Build.MODEL, str);
    }

    public final NetworkManager c(RemoteStreamSocket remoteStreamSocket) {
        zq3.h(remoteStreamSocket, "remoteStreamSocket");
        return new NetworkManager(remoteStreamSocket);
    }

    public final i55 d(Application application, String str) {
        zq3.h(application, "context");
        zq3.h(str, "sessionId");
        return new i55(Settings.Secure.getString(application.getContentResolver(), "android_id"), Build.MODEL, str);
    }

    public final fw6 e(r94 r94Var) {
        zq3.h(r94Var, "parser");
        return new fw6(r94Var);
    }

    public final LoggingRemoteStreamManager f(Application application, fw6 fw6Var, NetworkManager networkManager, RemoteStreamSocket remoteStreamSocket, l52 l52Var, i55 i55Var) {
        zq3.h(application, "context");
        zq3.h(fw6Var, "debuggerLog");
        zq3.h(networkManager, "networkManager");
        zq3.h(remoteStreamSocket, "remoteStreamSocket");
        zq3.h(l52Var, "eventTrackerParser");
        zq3.h(i55Var, "networkParser");
        return new LoggingRemoteStreamManager(ContextUtilsKt.a(application), fw6Var, networkManager, remoteStreamSocket, l52Var, i55Var);
    }

    public final RemoteStreamSocket g() {
        return new RemoteStreamSocket();
    }

    public final String h() {
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        return uuid;
    }
}
