package defpackage;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource;
import java.util.Date;

/* loaded from: classes4.dex */
public interface g88 {
    void I(Date date);

    void P(NYTUser nYTUser, NYTUserUpdateSource nYTUserUpdateSource);

    void b();

    void w();

    void z(NYTUser.StateChangeType stateChangeType, NYTUser nYTUser);
}
