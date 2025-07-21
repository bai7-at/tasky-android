package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.r48;
import java.io.IOException;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskAccessProvider implements AccessProvider {
    private static final String LOG_TAG = "ZendeskAccessProvider";
    private final AccessService accessService;
    private final IdentityManager identityManager;

    ZendeskAccessProvider(IdentityManager identityManager, AccessService accessService) {
        this.identityManager = identityManager;
        this.accessService = accessService;
    }

    @Override // zendesk.core.AccessProvider
    public Response<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        Logger.b(LOG_TAG, "Requesting an access token for anonymous identity.", new Object[0]);
        try {
            return this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).execute();
        } catch (IOException e) {
            Logger.c(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    @Override // zendesk.core.AccessProvider
    public Response<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        Logger.b(LOG_TAG, "Requesting an access token for jwt identity.", new Object[0]);
        if (r48.d(jwtIdentity.getJwtUserIdentifier())) {
            Logger.d(LOG_TAG, AccessProvider.NO_JWT_ERROR_MESSAGE, new Object[0]);
            return null;
        }
        try {
            return this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).execute();
        } catch (IOException e) {
            Logger.c(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }
}
