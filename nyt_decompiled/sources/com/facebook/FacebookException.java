package com.facebook;

import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import defpackage.w92;
import defpackage.x22;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class FacebookException extends RuntimeException {
    public static final a a = new a(null);
    public static final long serialVersionUID = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FacebookException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z) {
        if (z) {
            try {
                x22.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !w92.E() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.a;
        FeatureManager.a(FeatureManager.Feature.ErrorReport, new FeatureManager.a() { // from class: l92
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z) {
                FacebookException.b(str, z);
            }
        });
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
