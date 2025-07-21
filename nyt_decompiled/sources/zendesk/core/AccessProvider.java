package zendesk.core;

import retrofit2.Response;

/* loaded from: classes5.dex */
interface AccessProvider {
    public static final String NO_JWT_ERROR_MESSAGE = "The jwt user identifier is null or empty. We cannot proceed to get an access token";

    Response<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity);

    Response<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity);
}
