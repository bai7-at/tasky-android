package defpackage;

import android.app.Application;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.logging.remote.stream.network.NetworkManager;
import com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket;

/* loaded from: classes4.dex */
public abstract class y94 implements ba2 {
    public static LoggingRemoteStreamManager a(s94 s94Var, Application application, fw6 fw6Var, NetworkManager networkManager, RemoteStreamSocket remoteStreamSocket, l52 l52Var, i55 i55Var) {
        return (LoggingRemoteStreamManager) g16.e(s94Var.f(application, fw6Var, networkManager, remoteStreamSocket, l52Var, i55Var));
    }
}
