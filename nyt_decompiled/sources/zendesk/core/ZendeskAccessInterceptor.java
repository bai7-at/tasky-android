package zendesk.core;

import com.comscore.streaming.WindowState;
import com.zendesk.logger.Logger;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
class ZendeskAccessInterceptor implements Interceptor {
    private static final String EMPTY_JSON = "{}";
    private static final String LOG_TAG = "ZendeskAccessIntercepto";
    private static final int RETRY_LIMIT = 3;
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private int retryCounter;
    private Storage storage;

    ZendeskAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        this.identityManager = identityManager;
        this.accessProvider = accessProvider;
        this.storage = storage;
        this.coreSettingsStorage = coreSettingsStorage;
    }

    private Response errorResponse(Interceptor.Chain chain, String str) {
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(WindowState.NORMAL).message(str).body(ResponseBody.create(MediaType.parse(Constants.TEXT_JSON), EMPTY_JSON)).build();
    }

    static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb = new StringBuilder(160);
        sb.append("The expected type of authentication is ");
        if (authenticationType == null) {
            sb.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            sb.append("jwt.");
        }
        sb.append('\n');
        sb.append("The local identity is");
        if (identity == null) {
            sb.append(" not");
        }
        sb.append(" present.\n");
        if (identity != null) {
            sb.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                sb.append("jwt.");
            } else {
                sb.append("unknown.");
            }
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        retrofit2.Response<AuthenticationResponse> authTokenViaJwt;
        Identity identity = this.identityManager.getIdentity();
        if (this.identityManager.getStoredAccessTokenAsBearerToken() != null) {
            Logger.b(LOG_TAG, "Access token present, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        }
        Logger.b(LOG_TAG, "Access token is required, intercepting.", new Object[0]);
        AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
        if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
            Logger.b(LOG_TAG, "Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
            authTokenViaJwt = this.accessProvider.getAuthTokenViaAnonymous((AnonymousIdentity) identity);
        } else {
            if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                Logger.d(LOG_TAG, errorLogMessage, new Object[0]);
                return errorResponse(chain, errorLogMessage);
            }
            Logger.b(LOG_TAG, "JWT Identity found. Requesting and storing auth token.", new Object[0]);
            authTokenViaJwt = this.accessProvider.getAuthTokenViaJwt((JwtIdentity) identity);
        }
        if (authTokenViaJwt == null) {
            return errorResponse(chain, "Response was null, failed to auth user.");
        }
        if (authTokenViaJwt.code() == 409) {
            int i = this.retryCounter;
            if (i >= 3) {
                return errorResponse(chain, "Response was 409, failed to auth user.");
            }
            this.retryCounter = i + 1;
            return intercept(chain);
        }
        if (authTokenViaJwt.body() == null) {
            return errorResponse(chain, "Response body was null, failed to auth user.");
        }
        AccessToken authentication2 = authTokenViaJwt.body().getAuthentication();
        if (authentication2 != null) {
            this.identityManager.storeAccessToken(authentication2);
        }
        this.retryCounter = 0;
        return chain.proceed(chain.request());
    }
}
