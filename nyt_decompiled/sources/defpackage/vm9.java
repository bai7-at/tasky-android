package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.feedback.zendesk.ZendeskSdk;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.secrets.Secrets;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.support.CreateRequest;
import zendesk.support.ProviderStore;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.Support;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;

/* loaded from: classes4.dex */
public final class vm9 implements ZendeskSdk {
    public static final a Companion = new a(null);
    private final boolean a;
    private final Application b;
    private final SharedPreferences c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Triple c(String str) {
            return new Triple("https://nytimes.zendesk.com", "c209a4e53d7308ef4cb67d9b684390d81c9138e20d4c0081", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Triple d(String str) {
            return new Triple("https://nytimes1538752544.zendesk.com", "4d8ffad070d25817ee31d3ac723bc7605f3994f94795c204", str);
        }

        private a() {
        }
    }

    public static final class b extends tm9 {
        final /* synthetic */ by0 a;

        b(by0 by0Var) {
            this.a = by0Var;
        }

        @Override // defpackage.tm9
        public void onError(y22 y22Var) {
            by0 by0Var = this.a;
            String a = y22Var != null ? y22Var.a() : null;
            if (a == null) {
                a = "an unknown reason";
            }
            RuntimeException runtimeException = new RuntimeException("CreateRequest failed due to " + a);
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(f.a(runtimeException)));
        }

        @Override // defpackage.tm9
        public void onSuccess(Request request) {
            this.a.resumeWith(Result.b(""));
        }
    }

    public static final class c extends tm9 {
        final /* synthetic */ by0 a;

        c(by0 by0Var) {
            this.a = by0Var;
        }

        @Override // defpackage.tm9
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(UploadResponse uploadResponse) {
            by0 by0Var = this.a;
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(uploadResponse != null ? uploadResponse.getToken() : null));
        }

        @Override // defpackage.tm9
        public void onError(y22 y22Var) {
            by0 by0Var = this.a;
            String a = y22Var != null ? y22Var.a() : null;
            if (a == null) {
                a = "an unknown reason";
            }
            RuntimeException runtimeException = new RuntimeException("CreateRequest failed due to " + a);
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(f.a(runtimeException)));
        }
    }

    public vm9(boolean z, Application application, SharedPreferences sharedPreferences) {
        zq3.h(application, "application");
        zq3.h(sharedPreferences, "prefs");
        this.a = z;
        this.b = application;
        this.c = sharedPreferences;
    }

    private final Identity g(String str) {
        if (str == null || str.length() == 0) {
            return new AnonymousIdentity();
        }
        Identity build = new AnonymousIdentity.Builder().withNameIdentifier(str).withEmailIdentifier(str).build();
        zq3.g(build, "build(...)");
        return build;
    }

    @Override // com.nytimes.android.feedback.zendesk.ZendeskSdk
    public boolean a() {
        return Zendesk.INSTANCE.isInitialized() && Support.INSTANCE.isInitialized();
    }

    @Override // com.nytimes.android.feedback.zendesk.ZendeskSdk
    public void b() {
        f(this.a ? this.c.getBoolean("com.nytimes.android.feedback.ZENDESK_ENV", false) : true);
    }

    @Override // com.nytimes.android.feedback.zendesk.ZendeskSdk
    public Object c(String str, File file, String str2, by0 by0Var) {
        UploadProvider uploadProvider;
        k77 k77Var = new k77(kotlin.coroutines.intrinsics.a.d(by0Var));
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null && (uploadProvider = provider.uploadProvider()) != null) {
            uploadProvider.uploadAttachment(str, file, str2, new c(k77Var));
        }
        Object a2 = k77Var.a();
        if (a2 == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return a2;
    }

    @Override // com.nytimes.android.feedback.zendesk.ZendeskSdk
    public Object d(String str, String str2, List list, List list2, by0 by0Var) {
        RequestProvider requestProvider;
        CreateRequest createRequest = new CreateRequest();
        createRequest.setSubject(str);
        createRequest.setDescription(str2);
        createRequest.setTags(list);
        createRequest.setAttachments(list2);
        k77 k77Var = new k77(kotlin.coroutines.intrinsics.a.d(by0Var));
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null && (requestProvider = provider.requestProvider()) != null) {
            requestProvider.createRequest(createRequest, new b(k77Var));
        }
        Object a2 = k77Var.a();
        if (a2 == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return a2;
    }

    @Override // com.nytimes.android.feedback.zendesk.ZendeskSdk
    public void e(String str) {
        zq3.h(str, "email");
        Zendesk.INSTANCE.setIdentity(g(str));
    }

    public final void f(boolean z) {
        Zendesk zendesk2 = Zendesk.INSTANCE;
        Triple c2 = z ? Companion.c(Secrets.ZENDESK_PROD.decode()) : Companion.d(Secrets.ZENDESK_STAGING.decode());
        NYTLogger.l("Init ZendeskProvider with url " + c2.d(), new Object[0]);
        zendesk2.init(this.b, (String) c2.d(), (String) c2.e(), (String) c2.f());
        Support.INSTANCE.init(zendesk2);
    }
}
