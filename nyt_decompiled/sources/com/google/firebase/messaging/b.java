package com.google.firebase.messaging;

import android.os.Bundle;
import defpackage.so;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class b {
    public static final long a = TimeUnit.MINUTES.toMillis(3);

    public static final class a {
        public static so a(Bundle bundle) {
            so soVar = new so();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        soVar.put(str, str2);
                    }
                }
            }
            return soVar;
        }
    }
}
