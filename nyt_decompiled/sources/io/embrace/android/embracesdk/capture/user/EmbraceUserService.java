package io.embrace.android.embracesdk.capture.user;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.UserInfo;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceUserService implements UserService {
    public static final Companion Companion = new Companion(null);
    private static final UserInfo DEFAULT_USER;
    public static final int PERSONA_LIMIT = 10;
    private static final Pattern VALID_PERSONA;
    private final InternalEmbraceLogger logger;
    private final PreferencesService preferencesService;
    private final qs2 userInfoProvider;
    private final AtomicReference<UserInfo> userInfoReference;

    public static final class Companion {
        private Companion() {
        }

        public final Pattern getVALID_PERSONA() {
            return EmbraceUserService.VALID_PERSONA;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9_]{1,32}$");
        zq3.g(compile, "Pattern.compile(\"^[a-zA-Z0-9_]{1,32}$\")");
        VALID_PERSONA = compile;
        DEFAULT_USER = new UserInfo("", "", "", b0.e());
    }

    public EmbraceUserService(PreferencesService preferencesService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(preferencesService, "preferencesService");
        zq3.h(internalEmbraceLogger, "logger");
        this.preferencesService = preferencesService;
        this.logger = internalEmbraceLogger;
        this.userInfoReference = new AtomicReference<>(DEFAULT_USER);
        this.userInfoProvider = new qs2() { // from class: io.embrace.android.embracesdk.capture.user.EmbraceUserService$userInfoProvider$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final UserInfo mo865invoke() {
                PreferencesService preferencesService2;
                UserInfo.Companion companion = UserInfo.Companion;
                preferencesService2 = EmbraceUserService.this.preferencesService;
                return companion.ofStored(preferencesService2);
            }
        };
    }

    private final void modifyUserInfo(UserInfo userInfo) {
        synchronized (this.userInfoReference) {
            this.userInfoReference.set(userInfo);
            ww8 ww8Var = ww8.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final UserInfo userInfo() {
        UserInfo userInfo = this.userInfoReference.get();
        UserInfo userInfo2 = DEFAULT_USER;
        if (userInfo == userInfo2) {
            synchronized (this.userInfoReference) {
                try {
                    if (this.userInfoReference.get() == userInfo2) {
                        this.userInfoReference.set(this.userInfoProvider.mo865invoke());
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        UserInfo userInfo3 = this.userInfoReference.get();
        zq3.g(userInfo3, "userInfoReference.get()");
        return userInfo3;
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void addUserPersona(String str) {
        Set<String> h;
        if (str == null) {
            return;
        }
        Pattern pattern = VALID_PERSONA;
        if (!pattern.matcher(str).matches()) {
            this.logger.log("Ignoring persona " + str + " as it does not match " + pattern.pattern(), InternalEmbraceLogger.Severity.WARNING, null, false);
            return;
        }
        Set<String> personas = userInfo().getPersonas();
        if (personas != null) {
            if (personas.size() >= 10) {
                this.logger.log("Cannot set persona as the limit of 10 has been reached", InternalEmbraceLogger.Severity.WARNING, null, false);
                return;
            } else if (personas.contains(str)) {
                return;
            }
        }
        Set<String> personas2 = userInfo().getPersonas();
        if (personas2 == null || (h = b0.n(personas2, str)) == null) {
            h = b0.h(str);
        }
        modifyUserInfo(UserInfo.copy$default(userInfo(), null, null, null, h, 7, null));
        this.preferencesService.setUserPersonas(h);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearAllUserInfo() {
        clearUserIdentifier();
        clearUserEmail();
        clearUsername();
        clearAllUserPersonas();
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearAllUserPersonas() {
        Set<String> personas = userInfo().getPersonas();
        if (personas == null || !personas.isEmpty()) {
            HashSet hashSet = new HashSet();
            if (this.preferencesService.getUserPayer()) {
                hashSet.add(UserInfo.PERSONA_PAYER);
            }
            if (this.preferencesService.isUsersFirstDay()) {
                hashSet.add(UserInfo.PERSONA_FIRST_DAY_USER);
            }
            modifyUserInfo(UserInfo.copy$default(userInfo(), null, null, null, hashSet, 7, null));
            this.preferencesService.setUserPersonas(hashSet);
        }
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearUserAsPayer() {
        clearUserPersona(UserInfo.PERSONA_PAYER);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearUserEmail() {
        setUserEmail(null);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearUserIdentifier() {
        setUserIdentifier(null);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearUserPersona(String str) {
        Set<String> linkedHashSet;
        if (str == null) {
            return;
        }
        Set<String> personas = userInfo().getPersonas();
        if (personas == null || personas.contains(str)) {
            Set<String> personas2 = userInfo().getPersonas();
            if (personas2 == null || (linkedHashSet = b0.l(personas2, str)) == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            modifyUserInfo(UserInfo.copy$default(userInfo(), null, null, null, linkedHashSet, 7, null));
            this.preferencesService.setUserPersonas(linkedHashSet);
            return;
        }
        this.logger.log("Persona '" + str + "' is not set", InternalEmbraceLogger.Severity.WARNING, null, false);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void clearUsername() {
        setUsername(null);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public UserInfo getUserInfo() {
        return UserInfo.copy$default(userInfo(), null, null, null, null, 15, null);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public UserInfo loadUserInfoFromDisk() {
        try {
            return UserInfo.Companion.ofStored(this.preferencesService);
        } catch (Exception e) {
            this.logger.log("Failed to load user info from persistent storage.", InternalEmbraceLogger.Severity.ERROR, e, true);
            return null;
        }
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void setUserAsPayer() {
        addUserPersona(UserInfo.PERSONA_PAYER);
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void setUserEmail(String str) {
        String email = userInfo().getEmail();
        if (email == null || !zq3.c(email, str)) {
            modifyUserInfo(UserInfo.copy$default(userInfo(), null, str, null, null, 13, null));
            this.preferencesService.setUserEmailAddress(str);
        }
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void setUserIdentifier(String str) {
        String userId = userInfo().getUserId();
        if (userId == null || !zq3.c(userId, str)) {
            modifyUserInfo(UserInfo.copy$default(userInfo(), str, null, null, null, 14, null));
            this.preferencesService.setUserIdentifier(str);
        }
    }

    @Override // io.embrace.android.embracesdk.capture.user.UserService
    public void setUsername(String str) {
        String username = userInfo().getUsername();
        if (username == null || !zq3.c(username, str)) {
            modifyUserInfo(UserInfo.copy$default(userInfo(), null, null, str, null, 11, null));
            this.preferencesService.setUsername(str);
        }
    }
}
