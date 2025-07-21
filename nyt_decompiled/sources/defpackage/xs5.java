package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.AssetConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class xs5 extends ContextWrapper {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Context a(Context context, zm2 zm2Var) {
            Context createConfigurationContext = context.createConfigurationContext(zm2Var.a(context));
            zq3.e(createConfigurationContext);
            createConfigurationContext.getResources().getConfiguration().fontScale = zm2Var.b(createConfigurationContext);
            return createConfigurationContext;
        }

        private final Context b(Context context, s74 s74Var) {
            return s74Var.b(context);
        }

        private final ContextWrapper c(Context context, s74 s74Var, zm2 zm2Var) {
            return new xs5(a(b(context, s74Var), zm2Var));
        }

        public final ContextWrapper d(Context context) {
            zq3.h(context, "base");
            ys5 ys5Var = (ys5) z12.b(context, ys5.class);
            return e(context, ys5Var.i(), ys5Var.o());
        }

        public final ContextWrapper e(Context context, s74 s74Var, zm2 zm2Var) {
            zq3.h(context, "base");
            zq3.h(s74Var, "localeUtils");
            zq3.h(zm2Var, "fontScaleManager");
            return c(context, s74Var, zm2Var);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs5(Context context) {
        super(context);
        zq3.h(context, "base");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return zq3.c(AssetConstants.AUDIO_TYPE, str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
