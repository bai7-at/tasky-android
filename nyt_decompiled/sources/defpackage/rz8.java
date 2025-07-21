package defpackage;

import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;

/* loaded from: classes4.dex */
public abstract class rz8 {
    private static final UserData AnonUserDataNonSubscriber = new UserData(0, new RegiData(null, null, 3, null), new GooglePlayData(null, null, 3, null), 1, null);

    public static final UserData a() {
        return AnonUserDataNonSubscriber;
    }
}
